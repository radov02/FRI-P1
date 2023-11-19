import java.util.Arrays;
import java.util.Scanner;

public class DN04_63230273 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] frekvenceOznak = new int[k];  // pojavitve posameznih oznak

        vnesiFrekvenceOznak(frekvenceOznak, n, sc);
        // oznake [., 0, 1, 0, 0, 0, 2, 1, 0, 0, 1, 0]
        //System.out.println("oznake: " + Arrays.toString(oznake));

        long parov = 0l;
        // gremo cez tabelo ponovitev oznak do polovice in gledamo 
        // koliko moznih parov je glede na stevilo ponovitev
        for(int i = 1; i <= frekvenceOznak.length / 2; i++){
            long a;
            if(i == k - i){ // ce smo na sredini (iščemo pare z isto oznako), dobimo da je število parov ravno pojavitve^2 (vsaka ponoviteev z vsako tvori par)
                a = frekvenceOznak[i] * frekvenceOznak[i];
            }
            else{   // sicer pa dobimo število parov enako dvakrtaniku pojavitev posameznih oznak
                a = 2 * frekvenceOznak[i] * frekvenceOznak[k - i];
            }
                
            parov += a;
        }

        System.out.println(parov);

        sc.close();
    }

    private static void vnesiFrekvenceOznak(int[] t, int vhodov, Scanner sc){
        for(int i = 0; i < vhodov; i++){
            int novaOznaka = sc.nextInt();
            if(novaOznaka < t.length){
                t[novaOznaka]++;
            }
        }
        return;
    }
}