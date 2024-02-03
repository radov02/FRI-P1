import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Mnozice {
    public static void main(String[] args){

        Set<String> mnozica = new HashSet<>();
        mnozica.add("Ana");
        mnozica.add("Bojan");
        mnozica.add("Cvetka");

        System.out.println(mnozica);

        Set<Cas> casi = new HashSet<>();
        casi.add(new Cas(7, 50));
        casi.add(new Cas(10, 30));
        casi.add(new Cas(7, 50));
        casi.add(new Cas(11, 20));

        // so duplikati ker se uporabi equals() iz Object, ki primerja objekta na podlagi kazalcev (ce ustavarimo razlicna objekta) + razlicni hashcode (temelji na naslovu)
        System.out.println(casi.size());
        System.out.println(casi);
        
        Cas c = new Cas(15, 30);
        casi.add(c);
        casi.add(c);
        System.out.println(casi.size()); // 5 (15:30 se doda le enkrat - duplikatov ni)
        // lahko pa redefiniramo metodi equals() in hashCode() v razredu Cas
        // ce bi redefinirali le equals():  hashCode vrne enako - dobimo kvecjemu 5, lahko bi se oba 7:50 preslikala v isto tabelo ali razlicno odvisno od pomilniskega naslova (dobimi 4 ali 5)
        // v Casu bi lahko definirali hashcode da vrne le 0 in bo ustrezno (ce sta enaka casa bo enak hashcode); je pa to nezazeljeno ker se bo vse preslikalo v isto verigo v zgosceni tabeli in nebojo kljuci razprseni in bo iskanje pocasno
        

        Set<Cas> tcasi = new TreeSet<>();   // s privzetim konstruktorjem - predpostavka da je urejenost določena glede na Comparable (naravna)
        //tcasi.add(new Cas(10, 20)); // izjema ker Cas ne implementira Comparable
        tcasi.add(new Cas(15, 30));
        tcasi.add(new Cas(7, 50));
        tcasi.add(new Cas(7, 50));  // ne doda duplikatov
        // casi so urejeni z compareTo() iz Cas implements Comparable
        // ne uporablja se metoda equals()
        // dobro je da sta equals() in compareTo() usklajena
        
        Set<Cas> tc = new TreeSet<>(Oseba.poSpoluInStarosti());  // zunanji primerjalnik, mnozica bo urejena po kriteriju iz tega primerjalnika
        // duplikata sta lahko razlicna objekta ce sta po primerjalnem kriteriju enaka ohranimo le enega drugi se zgubi (znotraj primerjalnika klicemo se equlas ce je vse enako)

        NavigableSet<String> imena = new TreeSet<>(Set.of("Marjan", "Ivan", "Denis", "Eva", "Franci", "Olga", "Zoran", "Vasja", "Tina", "Branko"));
        imena.first();  // Branko
        imena.last(); // Zoran
        // to je doloceno s primerjalnikom/naravno urejenostjo (odvisno od konstruktorja)
        imena.floor("Janez");   // vrne najvecji element mnozice ki je manjsi od podanega - Ivan
        imena.ceiling("Janez"); // Marjan
        imena.headSet("Janez"); // vrne mnozico elementov ki so manjsi od Janez
        imena.tailSet("Janez", true); // vrne mnozico elementov ki so vecji ali enaki od Janez

        Set<String> manjsi = imena.headSet("Janez");
        manjsi.add("Cvetka");
        // Cvetka se doda v imena !!! - headSet ne ustvari nove mnozice, je le pogled na originalno mnozico
        System.out.println(imena);
        manjsi.remove("Franci");    // Franci se odstrani tudi iz originalne mnozice imena
        manjsi.add("Peter");    // izjema, ker Peter vecji od Janez in nemore biti dodan v manjsi

        NavigableSet<String> imena1 = new TreeSet<>(new PoDolzini());
        imena1.addAll(Set.of("Marjan", "Ivan", "Denis", "Eva", "Franci", "Olga", "Zoran", "Vasja", "Tina", "Branko"));
        System.out.println(imena1); // samo 4 elementi (enaki so tisti ki imajo enako dolzino)
        imena1.addAll(List.of("Marjan", "Ivan", "Denis", "Eva", "Franci", "Olga", "Zoran", "Vasja", "Tina", "Branko"));
        System.out.println(imena1); // po urejenosti dobimo 4 elemente

        
    }
}
