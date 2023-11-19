package resene.zvezdica;
import java.util.Scanner;

public class StetjeKlicevI {

    static int stKlicev = 0, a, b;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        int n = sc.nextInt();
    
        f(n);

        System.out.println(StetjeKlicevI.stKlicev);

        sc.close();
    }

    public static int f(int n){
        StetjeKlicevI.stKlicev++;
        if(n == 0){
            return 1;
        }

        return (f((int)((double)n / a)) + f((int)((double)n / b)));
    }
}
