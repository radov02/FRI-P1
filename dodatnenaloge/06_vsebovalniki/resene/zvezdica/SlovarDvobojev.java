import java.util.*;

public class SlovarDvobojev{

    public static NavigableMap<String, NavigableMap<String, Integer>> partije2slovar(List<Partija> partije){

        Set<String> igralci = new HashSet<>();
        for(int i = 0; i < partije.size(); i++){
            igralci.add(partije.get(i).vrniBelega());
            igralci.add(partije.get(i).vrniCrnega());
        }
        // System.out.println(igralci);
        
        NavigableMap<String, NavigableMap<String, Integer>> map = new TreeMap<>();  // TreeMap, da so kljuci leksikografsko urejeni
        Iterator<String> itIgralci = igralci.iterator();

        while(itIgralci.hasNext()){
            Iterator<String> it2 = igralci.iterator();
            String igralec = itIgralci.next();
            NavigableMap<String, Integer> m = new TreeMap<String, Integer>();
            while(it2.hasNext()){
                String igralecDrugi = it2.next();
                if(!igralec.equals(igralecDrugi)){
                    m.put(igralecDrugi, 0);
                }
            }
            map.put(igralec, (NavigableMap<String, Integer>)m);
        }

        for(int i = 0; i < partije.size(); i++){
            String beli = partije.get(i).vrniBelega();
            String crni = partije.get(i).vrniCrnega();
            int izid = partije.get(i).vrniIzid();

            // za belega:
            NavigableMap<String, Integer> tmp = map.get(beli);
            tmp.put(crni, map.get(beli).get(crni) + izid);
            map.put(beli, tmp);

            // za crnega:
            NavigableMap<String, Integer> tmp2 = map.get(crni);
            if(izid == 1){
                tmp2.put(beli, map.get(crni).get(beli) + 1);
            }
            else if(izid == 0){
                tmp2.put(beli, map.get(crni).get(beli) + 2);
            }
            map.put(crni, tmp2);
        }

        return map;
    }
}