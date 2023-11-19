package resene;
import java.util.Scanner;

public class MedianaTrojiceII {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int max = max(a, max(b, c));
        int min = min(a, min(b, c));

        System.out.println(sum - max - min);

        sc.close();
    }

    public static int min(int a, int b){
        if(a > b){
            return b;
        }
        return a;
    }

    public static int max(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }
}
