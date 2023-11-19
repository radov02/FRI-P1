package zvezdica;
import java.util.Scanner;

public class AnzetoveLedeneSvece{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < Math.pow(2, n-1) + 1; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int i = 1; i < n; i++){
            for(int j = 0; j < Math.pow(2, n-1) + 1; j++){
                if(j % Math.pow(2, i) == 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}