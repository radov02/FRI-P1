import java.util.Collection;
import java.util.List;

public class CollectionsPrimer2 {
    public static void main(String[] args){
        Collection<Cas> casi = new ArrayList<>();
        casi.add(new Cas(10, 20));
        casi.add(new Cas(7, 50));
        casi.add(new Cas(15, 10));

        // contains uporabi equals()
        System.out.println(casi.contains(new Cas(15, 10))); // true, ce pa nebi redefinirali equals v Cas, pa bi bilo false, ker bi kazalca nista enaka

        List<Cas> seznamCasov = (List<Cas>) casi;
        Cas cas = seznamCasov.get(2);   // ker Collection nima metode .get() (sprejme indeks, zbirke v splošnem nimajo indeksov) - moramo castati v List
        System.out.println(seznamCasov.contains(cas));
    }
}
