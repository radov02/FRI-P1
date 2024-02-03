
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01-05: najMnozica
06-10: pogostost
01, 06: ro"cno izdelana
*/

import java.util.*;

public class Cetrta {    // NE DELA

    public static Set<String> najMnozica(Map<String, Set<String>> sopomenke) {
        int max = 0; Set<String> najv = null;
        for(String s : sopomenke.keySet()){
            int elementov = sopomenke.get(s).size();
            if(elementov > max){
                max = elementov;
                najv = sopomenke.get(s);
            }
        }
        return najv;
    }

    public static Map<Set<String>, Integer> pogostost(String besedilo, Map<String, Set<String>> sopomenke) {
        Map<String, Integer> beseda2frekvenca = new HashMap<String, Integer>();
        String[] besede = besedilo.split(" ");
        beseda2frekvenca.put(besede[0], 1);
        System.out.println(beseda2frekvenca.keySet().toString());

        for(int i = 0; i < besede.length; i++){
            if(besede[i] != null && beseda2frekvenca.keySet().contains(besede[i])){
                beseda2frekvenca.put(besede[i], beseda2frekvenca.get(besede[i])+1);
            }
            beseda2frekvenca.put(besede[i], 1);
        }

        for(Map.Entry<String, Integer> par : beseda2frekvenca.entrySet()){
            System.out.printf("%s -> %s%n", par.getKey(), par.getValue());
        }
        return null;
    }

    private static boolean istiMnozici(Set<String> a, Set<String> b){
        for(String s : a){
            if(!b.contains(s)){
                return false;
            }
        }
        return true;
    }
}
