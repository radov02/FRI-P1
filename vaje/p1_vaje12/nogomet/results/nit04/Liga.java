
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
        for(String klub : this.klubi){  // brez foreach (ustvarimo iterator)
            klubToTocke.shrani(klub, this.steviloTock(klub));
        }
        return klubToTocke;
    }

    private static class PrimerjalnikPoTockah implements Comparator<String>{

        private Slovar<String, Integer> slovarKlub2Tocke;

        public PrimerjalnikPoTockah(Slovar<String, Integer> klub2tocke){
            this.slovarKlub2Tocke = klub2tocke;
        }

        @Override
        public int compare(String klub1, String klub2){
            //System.out.println(slovar.vrni(klub1) + "; " + slovar.vrni(klub2));
            // padajoče urejamo po točkah; naraščajoče urejamo po imenih:
            int razlikaTock = slovarKlub2Tocke.vrni(klub2) - slovarKlub2Tocke.vrni(klub1);
            if(razlikaTock != 0) return razlikaTock;
            return klub1.compareTo(klub2);
        }
    }

    public List<String> lestvica() {
        List<String> lestvica = new ArrayList<>(this.klubi);

        lestvica.sort(new PrimerjalnikPoTockah(this.klub2tocke()));
        /* lestvica.sort(new Comparator<String>{
            @Override
            public int compare...
        }); */

        return lestvica;
    }

    public Iterator<Tekma> poTekmah(int minGR) {
        return new IteratorPoTekmah(this.tekme, minGR);
    }

    private static class IteratorPoTekmah implements Iterator<Tekma>{

        private int minGolRazlika;
        private Iterator<Tekma> iteratorPoTekmahOdCollection;  // obstoječi iterator po vseh tekmah
        private Tekma naslednjaTekma;

        public IteratorPoTekmah(Collection<Tekma> tekme, int minGR){
            this.minGolRazlika = minGR;
            this.iteratorPoTekmahOdCollection = tekme.iterator();
            this.naslednjaTekma = poisciNaslednjoTekmo();
        }

        private Tekma poisciNaslednjoTekmo(){
            // vrne naslednjo tekmo ki ustreza pogoju oz. null ce ne obstaja
            Tekma vrnjena = (Tekma) this.iteratorPoTekmahOdCollection.next();
            while(this.iteratorPoTekmahOdCollection.hasNext()){
                vrnjena = (Tekma) this.iteratorPoTekmahOdCollection.next();
                if(vrnjena.golRazlika() <= this.minGolRazlika){
                    return vrnjena;
                }
            }
            return null;
        }

        @Override
        public Tekma next(){
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            Tekma tekma = this.naslednjaTekma;
            this.naslednjaTekma = this.poisciNaslednjoTekmo();
            return tekma;
        }

        @Override
        public boolean hasNext(){
            return (this.poisciNaslednjoTekmo() != null);
        }
    }

    // iterator je objekt ki se sprehaja po collectionu, vrne ga metoda iterator() vmesnika Iterable
    // iterator se zavrže potem ko pridemo do konca collectiona
}
