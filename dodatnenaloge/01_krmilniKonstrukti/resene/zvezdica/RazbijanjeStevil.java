package zvezdica;
import java.util.Scanner;

public class RazbijanjeStevil {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        // m:
        int summ = 0, stevkm = 0;
        long tmpm = m;
        while(tmpm > 0){
            summ += tmpm % 10;
            tmpm /= 10;
            stevkm++;
        }

        // n:
        int indexn = summ-1, stevkemja = stevkm;
        for(int i = 0; i < stevkemja; i++){
            long a = m / (long)Math.pow(10, stevkm-1);
                
            int j = indexn;
            long output;
            for(; j > indexn-a; j--){
                output = n / (long)Math.pow(10, j);
                n = n - (output * (long)Math.pow(10, j));
                System.out.print(output);
            }
            System.out.println();

            indexn -= a;
            stevkm--;
            m = m - a*(long)Math.pow(10, stevkm);
        }

        sc.close();
    }
}