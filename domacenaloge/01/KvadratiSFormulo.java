import java.util.Scanner;

public class KvadratiSFormulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a, b);
        int kvadratov = (min * a * b) - ((a + b) * (min * (min + 1) / 2)) + (min * (min + 1) * (2 * min + 1) / 6);

        System.out.println(kvadratov);

        sc.close();
    }
}