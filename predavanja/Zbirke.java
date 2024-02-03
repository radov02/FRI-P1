import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Zbirke {
    public static void main(String[] args){

        List<Integer> stevila = List.of(10, 7, 5, 9, 4, 14, 12, 10, 11);
        Set<String> imena = Set.of("Ana", "Bojan", "Cvetka", "Denis", "Eva", "Franci");

        // lahko uporabimo lambdo ker vemo da je Predicate funkcijski vmesnik z abstraktno funkcijo test(element)
        System.out.println(prestej(stevila, n -> n % 2 == 0));  // (Integer n) -> {return n % 2 == 0}

        // izpisemo zvezdice za vsako stevilo:
        zaVsak(stevila, n -> {
            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();
        });

        Map<String, Integer> ime2dolzina = new TreeMap<>();
        zaVsak(imena, ime -> {
            ime2dolzina.put(ime, ime.length());
        });
        System.out.println(ime2dolzina);

        System.out.println(zdruzi(stevila, (a, b) -> a + b, 0));
        // vrni najdeljse ime v imenih:
        System.out.println(zdruzi(imena, (dozdajsnjiMax, novo) -> (dozdajsnjiMax.length() > novo.length() ? dozdajsnjiMax : novo), ""));

        Map<Integer, List<Integer>> poOstanku = grupiraj(stevila, n -> n % 3);
        System.out.println(poOstanku);

        Map<Integer, List<String>> poDolzini = grupiraj(imena, ime -> ime.length());
        System.out.println(poDolzini);
    }

    // ŠTETJE ELEMENTOV KI IZPOLNJUJEJO POGOJ:
    public static <T> int prestej(Collection<T> zbirka, Predicate<T> pogoj){
        int stevec = 0;
        for(T element : zbirka){
            if(pogoj.test(element)){
                stevec++;
            }
        }
        return stevec;
    }

    // IZVEDBA OPRAVILA ZA VSAK ELEMENT ZBIRKE:
    public static <T> void zaVsak(Collection<T> zbirka, Consumer<T> opravilo){
        for(T element : zbirka){
            opravilo.accept(element);
        }
    }

    // ZDRUŽEVANJE ELEMENTOV ZBIRKE:
    public static <T> T zdruzi(Collection<T> zbirka, BinaryOperator<T> operator, T zacetek){
        T rezultat = zacetek;
        for(T element : zbirka){
            rezultat = operator.apply(rezultat, element);
        }
        return rezultat;
    }

    // GRUPIRANJE ELEMENTOV PO REZULTATIH FUNKCIJE:
    public static <T, R> Map<R, List<T>> grupiraj(Collection<T> zbirka, Function<T, R> funkcija){
        
        Map<R, List<T>> slovar = new HashMap<>();   // ne moremo uporabiti TreeMap, ker nimamo za T niti naravne urejenosti niti Comparatorja

        for(T element : zbirka){
            R rezultat = funkcija.apply(element);
            List<T> seznamZaRezultat = slovar.get(rezultat);
            if(seznamZaRezultat == null){
                seznamZaRezultat = new ArrayList<>();
                slovar.put(rezultat, seznamZaRezultat);
            }
            seznamZaRezultat.add(element);
        }

        return slovar;
    }
}
