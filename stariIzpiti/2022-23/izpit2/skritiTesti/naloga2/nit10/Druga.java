
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01: primer iz besedila
02-04: ni premikov levo in navzgor
01, 05-10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static int[] poLomljenki(boolean[][] matrika) {

        int[] prejsnjaTocka = new int[]{1, 1};
        int[] naslednjaTocka = naslednjiKorak(matrika, prejsnjaTocka[1], prejsnjaTocka[0]);
        int[] lgdd = new int[4];

        while(naslednjaTocka != null){
            // System.out.print(Arrays.toString(prejsnjaTocka) + " --> ");
            // System.out.println(Arrays.toString(naslednjaTocka));
            lgdd[0] += (prejsnjaTocka[0]-naslednjaTocka[0] > 0 ? prejsnjaTocka[0]-naslednjaTocka[0]:0);
            lgdd[1] += (prejsnjaTocka[1]-naslednjaTocka[1] > 0 ? prejsnjaTocka[1]-naslednjaTocka[1]:0);
            lgdd[2] += (naslednjaTocka[0]-prejsnjaTocka[0] > 0 ? naslednjaTocka[0]-prejsnjaTocka[0]:0);
            lgdd[3] += (naslednjaTocka[1]-prejsnjaTocka[1] > 0 ? naslednjaTocka[1]-prejsnjaTocka[1]:0);
            // System.out.println(Arrays.toString(lgdd));
            prejsnjaTocka = naslednjaTocka;
            naslednjaTocka = naslednjiKorak(matrika, prejsnjaTocka[1], prejsnjaTocka[0]);
        }
        
        return lgdd;
    }

    private static int[] naslednjiKorak(boolean[][] matrika, int y, int x){
        matrika[y][x] = false;
        for(int i = y-1; i <= y+1; i++){
            for(int j = x-1; j <= x+1; j++){
                if((i == y || j == x) && matrika[i][j]){
                    // System.out.println(j + ", " + i);
                    return new int[]{j, i};
                }
            }
        }
        return null;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
