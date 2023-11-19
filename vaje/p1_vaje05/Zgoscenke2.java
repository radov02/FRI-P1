import java.util.Arrays;
import java.util.Scanner;

public class Zgoscenke2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int velikostDatoteke = 0;
        int[] zgoscenke = new int[n];

        while(sc.hasNextInt()){
            velikostDatoteke = sc.nextInt();

            int minCD = indeksMinimuma(zgoscenke);

            if(zgoscenke[minCD] + velikostDatoteke > k){
                break;
            }

            zgoscenke[minCD] += velikostDatoteke;
            System.out.printf("%d EP -> zgoscenka %d %s\n", velikostDatoteke, minCD+1, Arrays.toString(zgoscenke));
        }
        
        sc.close();

    }

    private static int indeksMinimuma(int[] zgoscenke){
        int minCD = 0;
        for(int i = 1; i < zgoscenke.length; i++){
            if(zgoscenke[i] < zgoscenke[minCD]){
                minCD = i;
            }
        }

        return minCD;
    }

}
