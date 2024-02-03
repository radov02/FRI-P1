
/*
Samodejno testiranje:
tj.exe Cetrta.java . .

Testni primeri:

01, 02: primera iz besedila
03..06: u = 1
07..10: u = 2
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {    // NE DELA
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        String a = null;
        if(u == 2){
            a = sc.next();
        }
        Map<Par, Integer> slovar = new HashMap<>();

        
        for(int i = 0; i < n; i++){
            Par par = new Par(sc.next(), sc.next());
            slovar.put(par, Integer.valueOf(sc.nextInt()));
        }

        sc.close();

        Set<String> mnozica = new HashSet<>();
        for(Par p : slovar.keySet()){
            if(u == 2 && p.b.equals(a)){ // glede na cene
                mnozica.add(p.a);
            }
            else if(u == 1){// po abecedi
                mnozica.add(p.a);
            }
        }

        List<String> s = new ArrayList<>();
        for(String str : mnozica){
            s.add(str);
        }
        
        if(u == 1){
            Collections.sort(s);
            //System.out.println(s.toString());
            for(int i = 0; i < s.size(); i++){
                System.out.println(s.get(i));
            }
        }
        else{
            Collections.sort(s, poCeni(slovar));
            System.out.println(s.toString());
            for(int i = 0; i < s.size(); i++){
                System.out.println(s.get(i));
            }
        }
    }

    private static Comparator<String> poCeni(Map<Par, Integer> slovar){
        return new Comparator<String>(){

            Map<Par, Integer> slov = slovar;

            @Override
            public int compare(String sa, String sb){
                System.out.println("sortiramo: " + sa + ", " + sb);
                Set<Par> pari = slov.keySet();
                int cenaa = -1, cenab = -1;
                for(Par p : pari){
                    if(p.a.equals(sa)){
                        cenaa = (int)slov.get(p);
                    }
                    else if(p.a.equals(sb)){
                        cenab = (int)slov.get(p);
                    }
                }
                System.out.println((cenaa<cenab ? (sa + " < " + sb):(sa + " > " + sb)));
                return cenaa - cenab;
            }
        };
    } 

    private static class Par{
        public String a, b;

        public Par(String a, String b){
            this.a = a;
            this.b = b;
        }
    }
}
