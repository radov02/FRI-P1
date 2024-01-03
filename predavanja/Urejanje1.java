public class Urejanje1 {
    
    public static void main(String[] args){
        Vektor<Cas> casi = new Vektor<>();
        casi.dodaj(new Cas(10, 20));
        casi.dodaj(new Cas(20, 10));
        casi.dodaj(new Cas(10, 20));
        //...
    }

    public static <T extends Comparable<T>> void uredi(VektorGen<T> vektor){
        int stElementov = vektor.stElementov();
        for(int i = 1; i < vektor.length; i++){
            T trenutni = vektor.vrni(i);
            int j = i - 1;

            while(j >= 0 && vektor.vrni(j).compareTo(trenutni) > 0){
                vektor.nastavi(j+1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j+1, trenutni);
        }
    }
}
