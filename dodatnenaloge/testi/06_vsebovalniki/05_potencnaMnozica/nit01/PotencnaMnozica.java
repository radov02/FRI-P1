import java.util.*;

public class PotencnaMnozica{

    public static <T> Set<Set<T>> potencna(Set<T> mnozica){
        Set<Set<T>> pot = new HashSet<>();
        pot.add(new HashSet<T>());
        Iterator<T> it = mnozica.iterator();
        List<T> elementi = new ArrayList<>();

        while(it.hasNext()){
            elementi.add(it.next());
        }
        System.out.println(elementi);

        for(int stElem = 1; stElem < elementi.size(); stElem++){   // velikosti mnozic
            for(int i = 0; i < elementi.size(); i++){   // za vsak element
                System.out.println(i + ", " + stElem + ", " + (stElem < elementi.size() - i));
                if(stElem < elementi.size() - i){
                    Set<T> tmp = For(i, stElem, elementi);
                    System.out.println(tmp);
                    pot.add(tmp);
                }
            }
        }

        return pot;
    }

    private static <T> Set<T> For(int z, int k, List<T> elementi){
        Set<T> nov = new HashSet<>();
        for(int i = z; i <= k; i++){
            nov.add(elementi.get(i));
        }
        return nov;
    }
}