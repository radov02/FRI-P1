
//
// Program za testiranje stroja z eno samo besedo. Zagon:
// java TestirajEno <imeStroja> <beseda>
//

import java.util.*;
import java.lang.reflect.InvocationTargetException;

public class TestirajEno {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Zagon:");
            System.err.println("    java TestirajEno <imeStroja> <besedaIzSlovarja>");
            System.err.println();
            System.err.println("Na primer:");
            System.err.println("    java TestirajEno Tekm_12345678 znanka");
            System.exit(1);
        }

        String imeStroja = args[0];
        String iskanaBeseda = args[1];

        // Preberemo slovar iz datoteke TestSkupno.SLOVAR.
        Set<String> besede = TestSkupno.preberiSlovar(TestSkupno.SLOVAR);
        if (besede == null || besede.isEmpty()) {
            System.exit(1);
        }

        // Preverimo, ali je podana beseda v slovarju.
        if (!besede.contains(iskanaBeseda)) {
            System.err.printf("Besede %s ni v slovarju.%n", iskanaBeseda);
            System.exit(1);
        }


        // če obstaja razred z imenom <imeStroja> ...
        Class<?> razred = null;

        try {
            razred = Class.forName(imeStroja);
        } catch (ClassNotFoundException ex) {
            System.err.printf("Ne najdem razreda %s.%n", imeStroja);
            System.exit(1);
        }

        // ... ustvarimo objekt podanega stroja:
        Stroj stroj = null;

        try {
            stroj = (Stroj) razred.getDeclaredConstructor().newInstance();  // .getDeclaredConstructor() vrne objekt Constructor ce obstaja privzeti konstruktor?
        } catch (NoSuchMethodException ex) {
            System.err.printf("Razred %s nima privzetega konstruktorja.%n", imeStroja);
            System.exit(1);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            System.err.printf("Ne morem ustvariti objekta razreda %s.%n", imeStroja);
            System.exit(1);
        } catch (ClassCastException ex) {
            System.err.printf("Razred %s ne implementira vmesnika Stroj.%n", imeStroja);
            System.exit(1);
        }

        // Stroj inicializiramo - nastavimo mu mnozico izhodiscnih besed iz slovarja
        stroj.inicializiraj(besede);

        String izbira = null;
        String zadnjaIzbira = null;
        List<Character> odziv = null;
        int poskus = 1;

        // Kličemo strojevo metodo <poteza>, dokler stroj ne ugane besede oziroma preseže dovoljenega števila poskusov.
        while (poskus <= TestSkupno.MAKS_ST_POSKUSOV && (izbira = stroj.poteza(odziv)) != null) {
            if (poskus > 1) {
                System.out.println();
            }
            System.out.printf("Poskus %d:%n", poskus);
            System.out.printf("    Izbira: %s%n", izbira);

            try {
                odziv = TestSkupno.izracunajOdziv(iskanaBeseda, izbira);  // izbira je ugibanje
            } catch (TestSkupno.WordleIzjema ex) {
                System.err.println(ex);
                System.exit(1);
            }

            System.out.printf("    Odziv: %s%n", TestSkupno.lstchar2string(odziv));
            poskus++;
            zadnjaIzbira = izbira;
        }

        if (poskus > TestSkupno.MAKS_ST_POSKUSOV) {
            System.err.println("Stroj je presegel dovoljeno število poskusov.");
            System.exit(1);
        }

        if (!iskanaBeseda.equals(zadnjaIzbira)) {
            System.err.println("Nekaj je narobe: je metoda <poteza> predčasno vrnila <null>?");
            System.exit(1);
        }
    }
}
