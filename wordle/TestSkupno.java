
//
// Konstante, metode in razredi, ki jih uporabljamo pri obeh načinih testiranja.
//

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class TestSkupno {

    public static final String SLOVAR = "slovar.txt"; // datoteka z besedami

    public static final int MAKS_ST_POSKUSOV = 100; // največje dovoljeno število poskusov

    public static String ABECEDA = "abcdefghijklmnoprstuvz"; // slovenska abeceda

    public static class WordleIzjema extends RuntimeException { // Razred za tvorbo lastnih izjem.
        public WordleIzjema(String sporocilo) {
            super(sporocilo);
        }
    }

    // Prebere slovar in vrne MNOŽICO BESED SLOVARJA.
    public static Set<String> preberiSlovar(String slovar) {
        Set<String> besede = new TreeSet<>();

        try (Scanner sc = new Scanner(new File(slovar))) {
            while (sc.hasNextLine()) {
                String beseda = sc.nextLine().strip();
                if (beseda.length() > 0) {
                    besede.add(beseda);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.printf("Datoteka %s ne obstaja.%n", slovar);
        }
        return besede;
    }

    // Vrne odziv za podani par besed: <prava> pravilna beseda; <izbrana> strojeva izbira
    public static List<Character> izracunajOdziv(String prava, String izbrana) {
        int n = prava.length();

        // Preverimo <null>, dolžino in sestavo (<izbrana> lahko vsebuje samo male črke slovenske abecede).
        if (izbrana == null) {
            throw new WordleIzjema("Metoda <poteza> je vrnila <null>, čeprav odziv ni bil enak ['+', '+', ..., '+'].");
        }
        if (n != izbrana.length()) {
            throw new WordleIzjema(String.format("Metoda <poteza> je vrnila besedo napačne dolžine (%d).", izbrana.length()));
        }
        for (int i = 0; i < n; i++) {
            char znak = izbrana.charAt(i);
            if (ABECEDA.indexOf(znak) < 0) {
                throw new WordleIzjema(String.format("Metoda <poteza> je vrnila besedo z neveljavnim znakom (%c).", znak));
            }
        }

        // najprej ustvarimo sezname:
        List<Character> odziv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            odziv.add('-');
        }
        List<Character> lstPrava = string2lstchar(prava);
        List<Character> lstIzbrana = string2lstchar(izbrana);

        // sledi preverjanje pravilnosti - oblikovanje odziva:
        // 1. poiščemo pravilne črke na pravilnih mestih:
        for (int i = 0; i < n; i++) {
            if (lstPrava.get(i) == lstIzbrana.get(i)) {
                odziv.set(i, '+');
                lstPrava.set(i, '#');
                lstIzbrana.set(i, '_');
            }
        }

        // 2. poiščemo pravilne črke na napačnih mestih:
        for (int ixIzbrana = 0; ixIzbrana < n; ixIzbrana++) {
            char crka = lstIzbrana.get(ixIzbrana);
            if (crka != '_') {  // ce crke v izbiri se nismo preverili
                int ixPrava = lstPrava.indexOf(crka);
                if (ixPrava >= 0) { // ce se crka iz ugibane (izbrane) besede nahaja tudi v pravi (tokrat ni na pravem mestu)
                    odziv.set(ixIzbrana, 'o');
                    lstPrava.set(ixPrava, '#');
                    lstIzbrana.set(ixIzbrana, '_');
                }
            }
        }

        // na ostalih mestih je odziv enak '-'
        return odziv;
    }

    // vrne seznam znakov podanega niza
    public static List<Character> string2lstchar(String niz) {
        List<Character> rezultat = new ArrayList<>();
        int n = niz.length();
        for (int i = 0; i < n; i++) {
            rezultat.add(niz.charAt(i));
        }
        return rezultat;
    }
    // vrne niz iz znakov iz seznama
    public static String lstchar2string(List<Character> seznam) {
        StringBuilder sb = new StringBuilder();
        for (char znak: seznam) {
            sb.append(znak);
        }
        return sb.toString();
    }
}
