import java.util.Scanner;

public class DN01_63230273 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int kvadratov = 0;
        int manjsi = Math.min(a, b);

        for(int i = 1; i < manjsi; i++){
            kvadratov += (a - i) * (b - i);
        }

        System.out.println(kvadratov);

        sc.close();
    }
}