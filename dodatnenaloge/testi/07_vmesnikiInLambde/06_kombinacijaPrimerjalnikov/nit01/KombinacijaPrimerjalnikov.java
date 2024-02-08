import java.util.*;

public class KombinacijaPrimerjalnikov{

    public static <T> Comparator<T> kombinacija(List<Comparator<T>> primerjalniki){
        return (a, b) -> {
            Iterator<Comparator<T>> it = primerjalniki.iterator();
            int razlika = 0;
            while(it.hasNext() && razlika == 0){
                Comparator<T> prim = it.next();
                razlika = prim.compare(a, b);
            }
            return razlika;
        };
    }
}