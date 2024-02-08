import java.util.*;

public class ObratSlovarja{
    
    public static <K, V> Map<V, Set<K>> obrni(Map<K, V> slovar){
        
        Map<V, Set<K>> m = new HashMap<>();

        Iterator<K> it = slovar.keySet().iterator();

        while(it.hasNext()){
            K kljuc = it.next();
            V vrednost = slovar.get(kljuc);
            if(!m.keySet().contains(vrednost)){
                Set<K> set = new HashSet<K>();
                set.add(kljuc);
                m.put(vrednost, set);
            }
            else{
                m.get(vrednost).add(kljuc);
            }
        }

        return m;
    }
}