import java.util.*;

public class ComparableVComparator{

    public static <T extends Comparable<T>> Comparator<T> pretvori(){
        return (a, b) -> a.compareTo(b);
    }
}