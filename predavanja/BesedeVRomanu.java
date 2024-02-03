import java.util.*;

public class BesedeVRomanu {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Set<String> besede = new TreeSet<>();
        Map<String, Integer> beseda2pogostost = new TreeMap<>();

        while(sc.hasNext()){
            String beseda = sc.next();
            //besede.add(beseda);
            //int pogostost = beseda2pogostost.get(beseda);   // vrne null ce besede ni v slovarju
            int pogostost = beseda2pogostost.getOrDefault(beseda, 0); // ce kljuc obstaja, vrne vrednost, sicer vrne podano vrednost
            beseda2pogostost.put(beseda, pogostost);
            // metoda putIfAbsent()

        }

        // for(String beseda : besede){
        //     System.out.println(beseda);
        // }

        Set<String> besede1 = beseda2pogostost.keySet(); // keySet() vrne mnozico kljucev
        for(String beseda : besede1){
            System.out.printf("%s -> %d%n", beseda, beseda2pogostost.get(beseda));
        }

        // java BesedeVRomanu < roman.txt > besede.txt

        sc.close();
    }
}
