import java.util.Scanner;

public class IzstopajociElement {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int stevila[] = new int[n];
        int vsota = 0;

        for(int i = 0; i < n; i++){
            stevila[i] = sc.nextInt();
            vsota += stevila[i];
        }

        

        sc.close();
    }
}