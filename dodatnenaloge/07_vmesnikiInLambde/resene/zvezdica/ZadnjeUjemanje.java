import java.util.*;
import java.util.function.*;

public class ZadnjeUjemanje{

    public static <T> T zadnji(Collection<T> zbirka, Predicate<T> pogoj){
        T zadnji = null;
        Iterator<T> it = zbirka.iterator();
        while(it.hasNext()){
            T tmp = it.next();
            if(pogoj.test(tmp)){
                zadnji = tmp;
            }
        }
        return zadnji;
    }
}