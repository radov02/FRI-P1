import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Slovarji {
    public static void main(String[] args){
        Map<Cas, String> opravki = new HashMap<>();
        opravki.put(new Cas(7, 0), "zajtrk");
        opravki.put(new Cas(8, 15), "predavanja");
        opravki.put(new Cas(12, 30), "kosilo");
        opravki.put(new Cas(16, 20), "domov");
        opravki.put(new Cas(17, 0), "tek");
        opravki.put(new Cas(19, 30), "vecerja");
        opravki.put(new Cas(22, 0), "spat");
        System.out.println(opravki); // ni urejen ker je HashMap
        opravki.put(new Cas(19, 30), "televizija");        // kljuci se primerjajo glede na equals ki ni redefinirana (casa sta iste vrednosti vendar razlicna objekta)


        Map<Cas, String> opr = new TreeMap<>();// put potrebuje da imamo implementiran Comparable ali v konstruktor dodamo Comparator
        opr.put(new Cas(7, 0), "zajtrk");
        opr.put(new Cas(8, 15), "predavanja");
        opr.put(new Cas(12, 30), "kosilo");
        opr.put(new Cas(16, 20), "domov");
        opr.put(new Cas(17, 0), "tek");
        opr.put(new Cas(19, 30), "vecerja");
        opr.put(new Cas(22, 0), "spat");
        System.out.println(opr);    // urejen slovar opr
        // ce je isti kljuc se povozi prejsnjo vrednost

    }
}
