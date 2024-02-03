
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int stolpecZNajvecPrevladujoceZelenimi(int[][][] slika) {
        int[] stPrevladujoceZelenih = new int[slika[0].length];
        for(int i = 0; i < slika.length; i++){
            for(int j = 0; j < slika[0].length; j++){
                if(slika[i][j][1] > slika[i][j][0] && slika[i][j][1] > slika[i][j][2]){
                    stPrevladujoceZelenih[j]++;
                }
            }
        }
        //System.out.println(Arrays.toString(stPrevladujoceZelenih));
        int najvec = 0;
        for(int i = 1; i < stPrevladujoceZelenih.length; i++){
            if(stPrevladujoceZelenih[i] >= stPrevladujoceZelenih[najvec]){
                najvec = i;
            }
        }

        return najvec;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
