import java.util.*;

public class CollectionsPrimer {

    public static void main(String[] args){
        Collection<String> zbirka = new HashSet<>();
        zbirka.add("Ana");
        zbirka.add("Bojan");
        zbirka.add("Cvetka");
        zbirka.add("Denis");
        zbirka.add("Eva");

        System.out.println(zbirka);

        for(String element : zbirka ){
            System.out.println(element);
        }

        // metode za Collection niso pa nujno v vseh podrazredih implementirane in lahko sprozijo izjemo NotImplementedException
        zbirka.addAll(List.of("Franci", "Gabriel", "Hinko"));
        System.out.println(zbirka.contains("Bojan"));
        System.out.println(zbirka.containsAll(List.of("Cvetka", "Ana", "Eva")));
        System.out.println(zbirka.remove("Bojan"));
        System.out.println(zbirka.removeAll(List.of("Ivan", "Franci", "Eva")));
        System.out.println(zbirka.retainAll(List.of("Bojan", "Janez", "Hinko", "Ana", "Karla")));  // presek
        System.out.println(zbirka.size());
        System.out.println(zbirka.isEmpty());
        zbirka.clear();
    }
    

}
