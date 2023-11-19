import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibonacci(n));

        sc.close();
    }

    public static int fibonacci(int n){

        if(n <= 1)
            return n;
        
        return (fibonacci(n-2) + fibonacci(n-1));
    }
}
