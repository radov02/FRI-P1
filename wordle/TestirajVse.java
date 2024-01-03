
//
// Program za testiranje stroja z vsemi besedami iz slovarja (v nekem
// naključnem vrstnem redu). Zagon:
// java TestirajEno <imeStroja> <semeNaključnegaGeneratorja>
//

import java.util.*;
import java.lang.reflect.InvocationTargetException;

public class TestirajVse {

    // kazen za neveljavno izbiro ali prekoračitev števila poskusov
    private static final int KAZEN = 200;

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Zagon:");
            System.err.println("    java TestirajVse <imeStroja> <semeNaključnegaGeneratorja>");
            System.err.println();
            System.err.println("Na primer:");
            System.err.println("    java TestirajVse Tekm_12345678 12345");
            System.exit(1);
        }

        String imeStroja = args[0];
        int seme = Integer.parseInt(args[1]);

        // Preberemo slovar iz datoteke TestSkupno.SLOVAR.
        Set<String> besede = TestSkupno.preberiSlovar(TestSkupno.SLOVAR);
        if (besede == null || besede.isEmpty()) {
            System.exit(1);
        }

        // če obstaja razred z imenom <imeStroja> ...
        Class<?> razred = null;

        try {
            System.out.println(imeStroja);
            razred = Class.forName(imeStroja);
        } catch (ClassNotFoundException ex) {
            System.err.printf("Ne najdem razreda %s.%n", imeStroja);
            System.exit(1);
        }

        // ... ustvarimo objekt podanega stroja:
        Stroj stroj = null;

        try {
            stroj = (Stroj) razred.getDeclaredConstructor().newInstance();
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

        // Pripravimo premešan seznam vseh besed.
        List<String> lstBesede = new ArrayList<>(besede);
        Collections.shuffle(lstBesede, new Random(seme));

        // Stroj preizkusimo z vsemi besedami (v vrstnem redu, kot ga določa seme naključnega generatorja).
        int vsotaStPoskusov = 0;
        for (String beseda: lstBesede) {
            int stPoskusov = preizkusiEno(stroj, beseda);
            System.out.printf("%s -> %d%n", beseda, stPoskusov);
            vsotaStPoskusov += stPoskusov;
        }

        System.out.printf("Vsota: %d%nPovprečje: %.4f%n",
                vsotaStPoskusov,
                ((double) vsotaStPoskusov) / besede.size());
    }

    // <stroj> preizkusi <beseda>, vrne st. poskusov
    // ce besede ni uganil v dovoljenem st. poskusov, ali ce je izbral neveljavno besedo, vrne TestSkupno.KAZEN
    private static int preizkusiEno(Stroj stroj, String iskanaBeseda) {
        int stPoskusov = 0;
        String izbira = null;
        String zadnjaIzbira = null;
        List<Character> odziv = null;

        // Kličemo strojevo metodo <poteza>, dokler stroj ne ugane besede oziroma preseže dovoljenega števila poskusov.
        while ( stPoskusov < TestSkupno.MAKS_ST_POSKUSOV && (izbira = stroj.poteza(odziv)) != null ) {
            zadnjaIzbira = izbira;

            try {
                odziv = TestSkupno.izracunajOdziv(iskanaBeseda, izbira);
            } catch (TestSkupno.WordleIzjema ex) {
                odziv = null;
            }

            if (odziv == null) {    // ce izbral neveljavno besedo
                return KAZEN;
            }
            stPoskusov++;
        }

        // ali je zadnjaIzbira pravilna (enaka iskaniBesedi, ko je izbira null ali presezeno st. poskusov)
        return (iskanaBeseda.equals(zadnjaIzbira)) ? (stPoskusov) : (KAZEN);
    }
}
