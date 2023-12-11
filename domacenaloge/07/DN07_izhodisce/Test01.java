
import java.util.*;

public class Test01 {

    public static void main(String[] args) {

        Oseba a1 = new Oseba("Andrej Antlej", 'M', 67);
        Oseba a2 = new Oseba("Ana Antlej", 'Z', 58);
        Oseba d1 = new Oseba("Denis Debeljak", 'M', 43);
        Oseba d2 = new Oseba("Darja Debeljak", 'Z', 41);
        Oseba d3 = new Oseba("Dejan Debeljak", 'M', 14);
        Oseba d4 = new Oseba("Diana Debeljak", 'Z', 16);
        Oseba e1 = new Oseba("Eva Ertl", 'Z', 23);
        Oseba g1 = new Oseba("Gabrijel Golob", 'M', 72);
        Oseba g2 = new Oseba("Genovefa Golob", 'Z', 74);
        Oseba i1 = new Oseba("Ivan Ilovar", 'M', 52);
        Oseba i2 = new Oseba("Irena Ilovar", 'Z', 47);
        Oseba i3 = new Oseba("Iztok Ilovar", 'M', 21);
        Oseba j1 = new Oseba("Jasna Jarc", 'Z', 45);

        //preveri("Oseba/toString", primerjajNiza(a2.toString(), "Ana Antlej, Z, 58"));

        //preveri("Oseba/jeStarejsaOd", !a2.jeStarejsaOd(a1));

        Stanovanje sA = new Stanovanje(new Oseba[]{a1, a2}, 'a');
        Stanovanje sB = new Stanovanje(new Oseba[0], 'b');
        Stanovanje sC = new Stanovanje(new Oseba[0], 'c');
        Stanovanje sD = new Stanovanje(new Oseba[]{d1, d2, d3, d4}, 'd');
        Stanovanje sE = new Stanovanje(new Oseba[]{e1}, 'e');
        Stanovanje sF = new Stanovanje(new Oseba[0], 'f');
        Stanovanje sG = new Stanovanje(new Oseba[]{g1, g2}, 'g');
        Stanovanje sH = new Stanovanje(new Oseba[0], 'h');
        Stanovanje sI = new Stanovanje(new Oseba[]{i1, i2, i3}, 'i');
        Stanovanje sJ = new Stanovanje(new Oseba[]{j1}, 'j');

        //preveri("Stanovanje/steviloStanovalcev", sA.steviloStanovalcev() == 2);

        //preveri("Stanovanje/steviloStarejsihOd", sA.steviloStarejsihOd(a2) == 1);

        //preveri("Stanovanje/mz", Arrays.equals(sI.mz(), new int[]{2, 1}));

        //preveri("Stanovanje/starosta", sA.starosta() == a1);

        sA.nastaviSosede(null, null, null, sD);
        sB.nastaviSosede(null, null, sC, null);
        sC.nastaviSosede(sB, null, sD, sF);
        sD.nastaviSosede(sC, sA, sE, sG);
        sE.nastaviSosede(sD, null, null, null);
        sF.nastaviSosede(null, sC, sG, null);
        sG.nastaviSosede(sF, sD, null, sH);
        sH.nastaviSosede(null, sG, sI, null);
        sI.nastaviSosede(sH, null, sJ, null);
        sJ.nastaviSosede(sI, null, null, null);

        //preveri("Stanovanje/starostaSosescine", sJ.starostaSosescine() == i1);

        //preveri("Stanovanje/sosedjeSosedov", 
        //        primerjajTabeliOseb(sG.sosedjeSosedov(), new Oseba[]{a1, a2, e1, i1, i2, i3}));

        Blok blok = new Blok(sD);
        blok.izpisiRazporeditev();

        // preveri("Blok/starosta", blok.starosta() == g2);
        // System.out.println(blok.starosta() + ";;; " + g2);

        preveri("Blok/razporeditev",
                Arrays.deepEquals(
                    blok.razporeditev(),
                    new int[][]{
                        {-1, -1, 2, -1, -1},
                        { 0,  0, 4,  1, -1},
                        {-1,  0, 2, -1, -1},
                        {-1, -1, 0,  3,  1},
                    }));

        blok.izpisiRazporeditev();
    }

    private static void preveri(String besedilo, boolean pogoj) {
        System.out.printf("%-29s --> %s%n", besedilo, (pogoj ? "OK" : "napaka"));
    }

    private static boolean primerjajNiza(String a, String b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.equals(b);
    }

    private static boolean primerjajTabeliOseb(Oseba[] a, Oseba[] b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        List<Oseba> prvi = new ArrayList<>(Arrays.asList(a));
        List<Oseba> drugi = new ArrayList<>(Arrays.asList(b));
        Comparator<Oseba> primerjalnik = 
            (p, q) -> Integer.compare(p.hashCode(), q.hashCode());
        prvi.sort(primerjalnik);
        drugi.sort(primerjalnik);
        return prvi.equals(drugi);
    }
}
