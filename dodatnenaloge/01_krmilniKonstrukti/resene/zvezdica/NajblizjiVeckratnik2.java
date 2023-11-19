package zvezdica;
import java.util.Scanner;

public class NajblizjiVeckratnik2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a, b;

            a = sc.nextInt();
            b = sc.nextInt();

            int c = b % a;
            int d = b / a;
            if (c <= a / 2)
                System.out.println(a * d);
            else
                System.out.println(a * (d + 1));

            sc.close();
        }
}