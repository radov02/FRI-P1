import java.util.Iterator;
import java.util.NoSuchElementException;

public class Vektor<T> implements Iterable<T>
{
    // ...
    private static final int ZACETNA_KAPACITETA = 10;
    private T[] elementi;
    private int stElementov;

    public Vektor() {
        this(ZACETNA_KAPACITETA);
        // this.elementi = new int[ZACETNA_KAPACITETA];
        // this.stElementov = 0;   // ni potrebno
    }
    @SuppressWarnings("unchecked");
    public Vektor(int kapaciteta) {
        this.elementi = (T[]) new Object[kapaciteta];
        this.stElementov = 0;   // ni potrebno
    }

    public int steviloElementov(){
        return this.stElementov;
    }

    public Object vrni(int indeks){
        return this.elementi[indeks];
    }

    public void nastavi(int indeks, T vrednost){
        this.elementi[indeks] = vrednost;
    }

    public void dodaj(T vrednost){
        poPotrebiPovecaj();
        this.elementi[this.stElementov] = vrednost;
        this.stElementov++;
    }

    private void poPotrebiPovecaj(){
        if(this.stElementov == this.elementi.length){
            T[] stariElementi = this.elementi;
            this.elementi = (T[]) new Object[2* this.elementi.length];
            for(int i = 0; i < stElementov; i++){
                this.elementi[i] = stariElementi[i];
            }
        }
    }

    public void vstavi(int indeks, int vrednost){
        poPotrebiPovecaj();
        for(int i = this.stElementov + 1; i > indeks; i--){
            this.elementi[i] = this.elementi[i-1];
        }
        this.elementi[indeks] = vrednost;
        this.stElementov++;
    }

    public void zbrisi(int indeks){
        for(int i = indeks; i < this.stElementov; i++){
            this.elementi[i] = this.elementi[i+1];
        }
        this.stElementov--;
    }

    public String toString(){
        String v = "[";
        for(int i = 0; i < this.stElementov; i++){
            if(i < this.stElementov - 1){
                v += this.elementi[i] + "]";
            }
            v += this.elementi[i] + ", ";
        }

        return v;
    }

    public String toString2(){  // veliko hitreje ce dodajamo veliko elementov stringu
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.stElementov; i++){
            if(i > 0){
                sb.append(", ");
            }
            sb.append(this.elementi[i]);
        }
        sb.append("]");

        return sb.toString();
    }

    private static class IteratorCezVektor<T> implements Iterator<T>{

        private Vektor<T> vektor; // vektor po katerem se bo iterator this sprehajal
        private int indeks; // indeks elementa, na katerem trenutno smo

        public IteratorCezVektor(Vektor<T> vektor){
            this.vektor = vektor;
        }

        @Override
        public boolean hasNext(){
            return this.indeks < this.vektor.steviloElementov();
        }
        
        @Override
        public T next(){
            if(!this.hasNext()){
                throw new NoSuchElementException();
            }
            return this.vektor.vrni(this.indeks++);
        }
    }

    @Override
    public Iterator<T> iterator(){
        // direkten objekt vmesnika ne moremo narediti, zato naredimo razred ki implementira vmesnik
        return new IteratorCezVektor<T>(this);
    }

    public static void main(String[] args){
        VektorObject v = new VektorObject();
        v.dodaj(new Cas(10, 20));
        //v.dodaj(new Oseba("Janez", "Novak", 'M', 1980));
        v.dodaj(42);
        v.dodaj(true);
        v.dodaj(4.5);
        v.dodaj('c');

        Object obj0 = v.vrni(0);
        Object obj1 = v.vrni(1);
        Cas cas = (Cas)obj1;

        System.out.println(obj1);
        System.out.println(cas.plus(3, 10));
        // System.out.println(obj1.plus(3, 10));   // ne moremo ker je kazalec tipa Object in ta nima meotde plus()

        String str = (String) v.vrni(1);    // prevajalnik dovoli, vendar izvajalnik sproži izjemo (v.vrni(1) je tipa Cas in ga ne moremo castati v String)
        // zaznamo sele v casu izvajanja - generiki omogocajo da ze v casu prevajanja




        Vektor<String> imena;
        imena.dodaj("Ana");
        //...

        int n = imena.steviloElementov();
        for(int i = 0; i < n; i++){
            System.out.println(imena.vrni(i));
        }
        System.out.println();

        for(String ime: imena){ // prevede se v klic metode iterator() - v njej this kaže na isti kazalec kot imena
            System.out.println();
        }
        /*
         * v kaj se pretvori foreach:
         * Iterator<String> it = imena.iterator();
         * while(it.hasNext()){
         *      System.out.println(it.next());
         * }
         */
    }
}