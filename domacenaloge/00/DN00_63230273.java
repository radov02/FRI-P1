import java.util.Scanner;

public class DN00_63230273 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(b / p);
        System.out.println(b % p);

        sc.close();
    }
}