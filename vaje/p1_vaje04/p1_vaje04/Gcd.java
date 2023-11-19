import java.util.Scanner;

public class Gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int g = sc.nextInt();

        // lahko gremo le po večkratnikih g:
        for(int p = g; p <= n; p += g){
            for(int q = p; q <= n; q += g){
                if(gcd(p, q) == g){
                    System.out.printf("(%d, %d)\n", p, q);
                }
            }
        }

        sc.close();
    }

    // rekurzivno evklidov algoritem:
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    // evklidov algoritem:
    private static int GCD(int a, int b)
    {
        while(b > 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }

        return a;
    }
}

/*
 * import java.util.*;

public class NajvecjiSkupniDelitelj {
    
    Vrne najvecji skupni delitelj stevil.
    @param a prvo stevilo
    @param b drugo stevilo
    
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    
    private static int gcd(int a, int b) {
        while (b > 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ciljniGCD = sc.nextInt();
        
        // 8: 100000 --> 10.000.000.000      ||   1000
        
        for (int i = ciljniGCD; i <= n; i += ciljniGCD) {
            for (int j = i; j <= n; j += ciljniGCD) {
                if (gcd(i, j) == ciljniGCD)
                    System.out.printf("(%d, %d)%n", i, j);
            }
        }
    
    }
}
 */