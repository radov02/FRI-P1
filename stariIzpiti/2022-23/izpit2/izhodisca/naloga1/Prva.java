
/*
Samodejno testiranje:
tj.exe Prva.java . .

Javni testni primeri:
01: primer iz besedila
02-04: vsa "stevila so enomestna
01, 05-10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stevec = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] aa = vStevke(a);
            int[] bb = vStevke(b);
            boolean okPar = true;
            for(int j = 0; j < aa.length; j++){
                if(aa[j] >= bb[j]) {
                    okPar = false;
                    break;
                }
            }
            if(okPar) stevec++;
        }
        sc.close();

        System.out.println(stevec);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
    private static int[] vStevke(int a){
        int[] t = new int[((int)Math.log10(a)+1)];
        for(int i = t.length-1; i >= 0; i--){
            t[i] = a % 10;
            a /= 10;
        }
        return t;
    }
}
