
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        Set<Par> mn = new HashSet<>();
        int veckotnikov = 0;
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            Par nov = new Par(a, b);
            if(mn.contains(nov)){
                veckotnikov++;
                mn.clear();
            }
            mn.add(nov);
        }
        System.out.println(veckotnikov);
        sc.close();
    }

    private static class Par {
        public int a, b;

        public Par(int a, int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object drugi){
            if(this == drugi) return true;
            if(!(drugi instanceof Par)){
                return false;
            }
            Par dr = (Par) drugi;
            return this.a == dr.a && this.b == dr.b;
        }

        @Override
        public int hashCode(){
            return 191*Integer.hashCode(this.a) + 113*Integer.hashCode(this.b);
        }
    }
}


