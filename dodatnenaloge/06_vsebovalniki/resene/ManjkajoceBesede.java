import java.util.*;

public class ManjkajoceBesede{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stVPrvi = sc.nextInt();
        Set<String> prva = new HashSet<>();
        for(int i = 0; i < stVPrvi; i++){
            prva.add(sc.next());
        }
        int stVDrugi = sc.nextInt();
        Set<String> druga = new HashSet<>();
        for(int i = 0; i < stVDrugi; i++){
            druga.add(sc.next());
        }

        List<String> sez = new ArrayList<>();
        Iterator<String> it = prva.iterator();
        Iterator<String> it2 = druga.iterator();

        while(it.hasNext()){
            String beseda1 = it.next();
            it2 = druga.iterator();
            boolean dodaj = true;
            while(it2.hasNext()){
                String beseda2 = it2.next();
                if(beseda1.equals(beseda2)){
                    dodaj = false;
                    break;
                }
            }
            if(dodaj){
                sez.add(beseda1);
            }
        }
        Collections.sort(sez);
        for(int i = 0; i < sez.size(); i++){
            System.out.println(sez.get(i));
        }

        sc.close();
    }
}