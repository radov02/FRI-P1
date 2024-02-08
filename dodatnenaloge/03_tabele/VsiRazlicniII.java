import java.util.Scanner;
import java.util.Random;

public class VsiRazlicniII {

    private static final int MAKS_STEVILO = 10000;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        Random random = new Random(s);
        int n = sc.nextInt();

        int[] pojavitve = new int[2*(int)(Math.pow(10, 4)) + 1];

        for(int i = 0; i < n; i++){
            int clen = random.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
            pojavitve[clen + MAKS_STEVILO]++;
        }

        boolean razlicni = true;
        int max = 0;
        for(int i = 1; i < pojavitve.length; i++){
            if(pojavitve[max] < pojavitve[i]){
                max = i;
            }
            if(pojavitve[i] > 1){
                razlicni = false;
            }
        }

        if(!razlicni)
            System.out.println(pojavitve[max - (int)(Math.pow(10, 4))]);
        else
            System.out.println("RAZLICNI");

        sc.close();
    }
}