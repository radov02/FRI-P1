import java.util.Iterator;
import java.util.NoSuchElementException;

public class SlovarGen<K, V> implements Iterable<K> {
    // ... 

    // implementacija z zgoščeno tabelo (hash table)

    private static final int PRIVZETA_VELIKOST_TABELE = 97;

    private static class Vozlisce<K, V>{  // samo za ta razred - interna implementacija, ni potrebno da je samostojen
        Object kljuc;
        Object vrednost;
        Vozlisce<K, V> naslednje;

        public Vozlisce(Object kljuc, Object vrednost, Vozlisce<K, V> naslednje){
            this.kljuc = kljuc;
            this.vrednost = vrednost;
            this.naslednje = naslednje;
        }
    }

    private Vozlisce<K, V>[] tabela;
    private int stParov; // st parov kljuc-vrednost (enako stevilu kljucev)

    @SuppressWarnings("unchecked")
    public SlovarGen(int velikostTabele){
        this.tabela = (Vozlisce<K, V>[]) new Vozlisce[velikostTabele];
        this.stParov = 0;
    }
    public SlovarGen(){
        this(PRIVZETA_VELIKOST_TABELE);
    }

    private int indeks(Object kljuc){
        int n = this.tabela.length;
        int indeks = kljuc.hashCode() % n;  // lahko je negativno
        indeks = (indeks + n) % n;  // indeks na [0, n-1]
        return indeks;
    }

    private Vozlisce<K, V> poisci(Object kljuc){
        int indeks = this.indeks(kljuc);

        Vozlisce<K, V> vozlisce = this.tabela[indeks];
        while(vozlisce != null && !vozlisce.kljuc.equals(kljuc)){
            vozlisce = vozlisce.naslednje;
        }
        return vozlisce;
    }

    public V vrni(K kljuc){
        Vozlisce<K, V> vozlisce = this.poisci(kljuc);
        if(vozlisce == null){
            return null;
        }
        return vozlisce.vrednost;
    }

    public void shrani(Object kljuc, Object vrednost){
        Vozlisce<K, V> vozlisce = this.poisci(kljuc);
        if(vozlisce != null){
            vozlisce.vrednost = vrednost;
        }
        else {
            int indeks = this.indeks(kljuc);
            Vozlisce<K, V> novo = new Vozlisce<K, V>(kljuc, vrednost, this.tabela[indeks]);
            this.tabela[indeks] = novo;
            this.stParov++;
        }
    }

    // Implementacija metode iterator v vmesniku Iterable.
    @Override
    public Iterator<K> iterator() {
        return new IteratorPoKljucih<K, V>(this);  
        // this je tipa Slovar<K, V>, zato je tudi razred IteratorPoKljucih
        // odvisen od obeh parametričnih tipov (K in V)
    }

    // Iterator, ki ga vrne metoda iterator, je objekt tega razreda.

    private static class IteratorPoKljucih<Kl, Vr> implements Iterator<Kl> {

        private Slovar<Kl, Vr> slovar;  // zaradi tega potrebujem Kl in Vr že v glavi razreda
        private int indeks; // indeks trenutne celice tabele (verige)
        private Vozlisce<Kl, Vr> vozlisce;  // kazalec na treutno vozlisce znotraj trenutne verige
        private int stevec;    // globalni indeks trenutnega kljuca (para) v celotnem slovarju

        public IteratorPoKljucih(Slovar<Kl, Vr> slovar) {
            this.slovar = slovar;
            this.indeks = -1;
            this.stevec = 0;
            this.vozlisce = null;
        }

        @Override
        public boolean hasNext() {
            return this.stevec < this.slovar.stParov;
        }

        @Override
        public Kl next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.indeks < 0 || this.vozlisce.naslednje == null) {   // smo cisto na zacetku ali pa smo ravnokar prispeli na konec verige
                // poiscemo naslednjo verigo (celico ki ni null)
                do {
                    this.indeks++;
                } while (this.indeks < this.slovar.podatki.length &&
                         this.slovar.podatki[this.indeks] == null);
                this.vozlisce = this.slovar.podatki[this.indeks];
            } else {
                // premaknemo se na naslednje vozlišče v trenutnem povezanem seznamu
                this.vozlisce = this.vozlisce.naslednje;
            }
            this.stevec++;
            return this.vozlisce.kljuc;
        }
    }

    public static void main(String[] args){
        Slovar drzava2sosedje = new Slovar();
        drzava2sosedje.shrani("Nemčija", 9);
        drzava2sosedje.shrani("Avstrija", 8);
        drzava2sosedje.shrani("Slovenija", 4);
        drzava2sosedje.shrani("Češka", 4);

        System.out.println(drzava2sosedje.vrni("Avstrija"));


        Slovar opravki = new Slovar();
        opravki.shrani(new Cas(12, 30), "kosilo");

        System.out.println(opravki.vrni(new Cas(8, 15)));   // deluje ker smo redefinirali hashCode in equals, sicer ne bi


        //..
        for(String drzava : drzava2sosedje){
            System.out.println("%s -> %d%n", drzava, drzava2sosedje.vrni(drzava));
        }

    }
}
