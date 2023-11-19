import java.util.Arrays;
import java.util.Scanner;

public class ZlataSredina {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int tab[] = new int[2*k + 1];

        for(int i = 0; i < 2*k + 1; i++){
            tab[i] = sc.nextInt();
        }

        Arrays.sort(tab);

        System.out.println(tab[(2*k+1)/2]);

        sc.close();
    }
}