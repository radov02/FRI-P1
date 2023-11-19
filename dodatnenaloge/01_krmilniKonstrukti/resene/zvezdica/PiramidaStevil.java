package zvezdica;
import java.util.Scanner;

public class PiramidaStevil {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            int zacetna = i+1;
            for(int j = 0; j < (i+1) * 2 - 1; j++){
                System.out.print((zacetna) % 10);
                zacetna++;
            }
            System.out.println();
        }

        sc.close();
    }
}