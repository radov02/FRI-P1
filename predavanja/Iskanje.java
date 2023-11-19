import java.util.Arrays;

public class Iskanje{
    public static void main(String[] args){

            int[] tabela = new int[] {7, 10, 15, 21, 27, 30, 31, 34, 37, 39, 42, 50, 58, 61, 75};

            // System.out.println(poisci(tabela, 42));
            // System.out.println(poisci(tabela, 29));
            
            Arrays.sort(tabela);
            // System.out.println(binarySearchRecursive(tabela, 7, 0, tabela.length-1));
            // System.out.println(binarySearchRecursive(tabela, 61, 0, tabela.length-1));
            // System.out.println(binarySearchRecursive(tabela, 99, 0, tabela.length-1));
            System.out.println(dvojiskoIskanje(tabela, 27));        
            System.out.println(dvojiskoIskanje(tabela, 99));        
        }
    

    public static int poisci(int[] t, int x){
        for(int i = 0; i < t.length; i++){
            if(t[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void linearnoIskanje(){
        // cez elemente dokler so manjsi od iskanega
    }

    public static int dvojiskoIskanje(int[] t, int x){
        int lm = 0;
        int dm = t.length -1;
        while(lm <= dm){
            int s = (lm + dm) / 2;

            if(t[s] == x) 
                return s;
            
            if(t[s] > x)
                dm = s-1;
            else
                lm = s+1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] t, int x, int zac, int kon){
        int half = zac + (kon - zac) / 2;
        System.out.println(half);
        if(t[half] == x){
            return half;
        }
        if(half == zac || half == kon)
            return -1;
        
        if(t[half] > x){
            return binarySearchRecursive(t, x, zac, half);
        }
        else{
            return binarySearchRecursive(t, x, half, kon);
        }
    }
}
