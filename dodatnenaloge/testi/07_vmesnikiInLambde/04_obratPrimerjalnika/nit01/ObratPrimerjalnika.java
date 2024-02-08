import java.util.*;

public class ObratPrimerjalnika{

    public static <T> Comparator<T> obrni(Comparator<T> primerjalnik){
        return (a, b) -> {
            return -primerjalnik.compare(a, b);
        };
    }

    public static <T> void urediPadajoce(List<T> seznam, Comparator<T> primerjalnik){
        seznam.sort(obrni(primerjalnik));
    }
}