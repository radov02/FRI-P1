import java.util.*;
import java.util.function.BinaryOperator;

public class Kumulativa{

    public static <T> List<T> kumulativa(List<T> seznam, BinaryOperator<T> operator){
        List<T> sez = new ArrayList<>();
        sez.add(seznam.get(0));
        for(int i = 1; i < seznam.size(); i++){
            sez.addFirst(operator.apply(sez.get(i-1), seznam.get(i)));
        }
    }

    public static <T> List<T> doslejNajvecji(List<T> seznam, Comparator<T> primerjalnik){
        
    }
}