public class Slovar {
    // implementacija z zgoščeno tabelo (hash table)

    private static final int PRIVZETA_VELIKOST_TABELE = 97;

    private static class Vozlisce{  // samo za ta razred - interna implementacija, ni potrebno da je samostojen
        Object kljuc;
        Object vrednost;
        Vozlisce naslednje;

        public Vozlisce(Object kljuc, Object vrednost, Vozlisce naslednje){
            this.kljuc = kljuc;
            this.vrednost = vrednost;
            this.naslednje = naslednje;
        }
    }

    private Vozlisce[] tabela;

    public Slovar(int velikostTabele){
        this.tabela = new Vozlisce[velikostTabele];
    }
    public Slovar(){
        this(PRIVZETA_VELIKOST_TABELE);
    }

    private int indeks(Object kljuc){
        int n = this.tabela.length;
        int indeks = kljuc.hashCode() % n;  // lahko je negativno
        indeks = (indeks + n) % n;  // indeks na [0, n-1]
        return indeks;
    }

    private Vozlisce poisci(Object kljuc){
        int indeks = this.indeks(kljuc);

        Vozlisce vozlisce = this.tabela[indeks];
        while(vozlisce != null && !vozlisce.kljuc.equals(kljuc)){
            vozlisce = vozlisce.naslednje;
        }
        return vozlisce;
    }

    public Object vrni(Object kljuc){
        Vozlisce vozlisce = this.poisci(kljuc);
        if(vozlisce == null){
            return null;
        }
        return vozlisce.vrednost;
    }

    public void shrani(Object kljuc, Object vrednost){
        Vozlisce vozlisce = this.poisci(kljuc);
        if(vozlisce != null){
            vozlisce.vrednost = vrednost;
        }
        else {
            int indeks = this.indeks(kljuc);
            Vozlisce novo = new Vozlisce(kljuc, vrednost, this.tabela[indeks]);
            this.tabela[indeks] = novo;
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

    }
}
