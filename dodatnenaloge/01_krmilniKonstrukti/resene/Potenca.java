import java.util.Scanner;

public class Potenca {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int rez = 1;
        for(int i = 0; i < b; i++){
            rez *= a;
        }

        System.out.println(rez);

        sc.close();
    }
}
