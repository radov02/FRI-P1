
import java.util.*;

public class Liga {

    private Collection<String> klubi;
    private Collection<Tekma> tekme;

    public Liga(Collection<String> klubi, Collection<Tekma> tekme) {
        this.klubi = klubi;
        this.tekme = tekme;
    }

    public int steviloTock(String klub) {
        int tock = 0;
        for(Tekma tekma : this.tekme){
            if(tekma.getDomaci().equals(klub) || tekma.getGosti().equals(klub)){
                tock += tekma.steviloTock(klub);
            }
        }
        return tock;
    }

    public Slovar<String, Integer> klub2tocke() {
        Slovar<String, Integer> klubToTocke = new Slovar<String, Integer>();
        for(String klub : this.klubi){
            klubToTocke.shrani(klub, this.steviloTock(klub));
        }
        return klubToTocke;
    }

    private static class PrimerjalnikPoTockah implements Comparator<String>{

        private Slovar<String, Integer> slovar;

        public PrimerjalnikPoTockah(Slovar<String, Integer> slovar){
            this.slovar = slovar;
        }

        @Override
        public int compare(String klub1, String klub2){
            //System.out.println(slovar.vrni(klub1) + "; " + slovar.vrni(klub2));
            int razlikaTock = slovar.vrni(klub2) - slovar.vrni(klub1);
            if(razlikaTock != 0) return razlikaTock;
            return klub1.compareTo(klub2);
        }
    }

    public List<String> lestvica() {
        List<String> lestvica = new ArrayList<>(klubi);

        lestvica.sort(new PrimerjalnikPoTockah(this.klub2tocke()));

        return lestvica;
    }

    public Iterator<Tekma> poTekmah(int minGR) {
        
        return null;
    }

/*     private static class IteratorPoTekmah implements Iterator<Tekma>{
        @Override
        public Tekma next(){

        }
    }
 */
    // iterator je objekt ki se sprehaja po collectionu, vrne ga metoda iterator() vmesnika Iterable
    // iterator se zavrže potem ko pridemo do konca collectiona
}
