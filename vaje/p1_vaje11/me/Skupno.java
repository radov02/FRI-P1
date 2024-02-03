
import java.util.*;

public class Skupno {

    public static <T extends Comparable<T>> void uredi(Vektor<T> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1;  i < stElementov;  i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && vektor.vrni(j).compareTo(element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    public static <T> void uredi(Vektor<T> vektor, Comparator<T> primerjalnik) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1;  i < stElementov;  i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && primerjalnik.compare(vektor.vrni(j), element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    // 4. 
    public static <T> Comparator<T> kompozitum(Comparator<T> primerjalnik1, Comparator<T> primerjalnik2){
        return (obj1, obj2) -> {
            int rezultat1 = primerjalnik1.compare(obj1, obj2);
            return (rezultat1 != 0) ? rezultat1 : primerjalnik2.compare(obj1, obj2);
        };
    }
}
