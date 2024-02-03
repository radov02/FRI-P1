
import java.util.*;

public abstract class Lik implements Comparable<Lik> {

    public abstract int ploscina();

    public abstract int obseg();

    public String toString() {
        return String.format("%s [%s]", this.vrsta(), this.podatki());
    }

    public abstract String vrsta();

    public abstract String podatki();

    public static void izpisi(Vektor<Lik> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 0;  i < stElementov;  i++) {
            Lik lik = vektor.vrni(i);
            System.out.printf("%s | p = %d | o = %d%n",
                    lik.toString(), lik.ploscina(), lik.obseg());
        }
    }

    // 1.
    // abstract class zato NI NUJNO da implementira compareTo()!!
    public int compareTo(Lik drugi){
        return this.ploscina() - drugi.ploscina();
    }

    // 2.
    private static class PrimerjalnikPoObsegu implements Comparator<Lik> {
        @Override
        public int compare(Lik a, Lik b){
            return a.obseg() - b.obseg();
        }
    }
    public static Comparator<Lik> poObsegu(){
        return new PrimerjalnikPoObsegu();
    }
    // RAJE Z ANONIMNIM NOTRANJIM RAZREDOM (gl. asistentovo datoteko) - rabimo razred le na enem mestu -> pokličemo konstruktor in ga sproti definiramo

    // 3. 
    public abstract int tip();
    private static class PrimerjalnikPoTipu implements Comparator<Lik>{
        @Override
        public int compare(Lik a, Lik b){
            return a.tip() - b.tip();
        }
    }
    public static Comparator<Lik> poTipu(){
        return new PrimerjalnikPoTipu();
    }

    // 5. 
    public static void urediPoTipuInObsegu(Vektor<Lik> vektor){
        Skupno.uredi(vektor, Skupno.kompozitum(poTipu(), poObsegu()));
    }
}
