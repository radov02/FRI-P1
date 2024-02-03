import java.util.*;
import java.util.function.IntBinaryOperator;

public class Postevanka {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        /* postevanka(n, new Plus());

        postevanka(n, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int a, int b){
                return a + b;
            }            
        }); */

        postevanka(n, (a, b) -> a * b); // java ve da je lambda tipa IntBinaryOperator, ker se klice ta metoda postevanka

        sc.close();
    }

    private static class Plus implements IntBinaryOperator{
            @Override
            public int applyAsInt(int a, int b){
                return a + b;
            }
        }
    private static class Krat implements IntBinaryOperator{
            @Override
            public int applyAsInt(int a, int b){
                return a * b;
            }
        }

    private static void postevanka(int n, IntBinaryOperator operacija){
        System.out.println("binary");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.printf(" %3d", operacija.applyAsInt(i, j));
            }
            System.out.println();
        }
    }

    // ???
    /* private static void postevanka(int n, Class operacija){
        System.out.println("class");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

            }
        }
    } */
}
