import java.util.Scanner;

public class FibonacciMemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] memo = new int[n + 1];
        // memo[i] == 0 za i >= 2 pomeni da f(i) še nismo izračunali
        // sicer memo že hrani izračunano vrednost za f(i)

        System.out.println(fibonacci(n, memo));

        sc.close();
    }

    public static int fibonacci(int n, int[] memo){

        if(n <= 1)
            return n;

        if(memo[n] > 0)
            return memo[n];
        
        int pp = fibonacci(n-2, memo);
        int p = fibonacci(n-1, memo);
        memo[n] = pp + p;
        return memo[n];
    }
}