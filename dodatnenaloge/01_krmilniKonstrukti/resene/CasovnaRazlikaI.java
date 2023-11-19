import java.util.Scanner;

public class CasovnaRazlikaI {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int h1, m1, h2, m2;
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();

        int min1 = h1 * 60 + m1;
        int min2 = h2 * 60 + m2;

        System.out.println(min2 - min1);

        sc.close();
    }
}
