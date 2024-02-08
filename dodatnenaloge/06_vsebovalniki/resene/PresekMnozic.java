import java.util.*;

public class PresekMnozic{

    public static <T> Set<T> presek(Collection<Set<T>> mnozice){
        Set<T> presek = new HashSet<>();
        Iterator<Set<T>> it = mnozice.iterator();
        Set<T> zacetna = it.next();

        for(T element : zacetna){   // za element iz zacetne mnozice
            boolean vsebovan = true;
            Set<T> tmp = null;
            it = mnozice.iterator();    // MORAMO PONASTAVITI ITERATOR
            while(it.hasNext()){    // gremo cez ostale mnozice
                tmp = it.next();
                if(tmp != zacetna){
                    if(!tmp.contains(element)){  // ce ena ne vsebuje elementa, ga ne dodamo v presek
                        vsebovan = false;
                        break;
                    }
                }
            }
            if(vsebovan){
                presek.add(element);
            }
        }
        return presek;
    }
}