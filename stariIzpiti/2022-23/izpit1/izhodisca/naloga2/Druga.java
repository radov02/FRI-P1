
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01: primer iz besedila
02..04: vsaka beseda je sestavljena iz ene same "crke
01, 05..10: splo"sni primeri

01, 02, 05, 06: ro"cno izdelani
*/

import java.util.*;

public class Druga {

    public static boolean krizankaOK(char[][] besede, char[][] polozaji) {
        int[][] polje = new int[1000][1000];
        
        for(int i = 0; i < besede.length; i++){
            char[] beseda = besede[i];
            char[] polozaj = polozaji[i];

            if(polozaj[2] == 'v'){
                int y = polozaj[0] - '0', x = polozaj[1] - '0';
                int a = 0;
                for(int j = x; j < x+beseda.length; j++){
                    //System.out.printf("%d, %d, %b\n", a, beseda.length, a >= beseda.length);
                    if(polje[y][j] != 0 && (a >= beseda.length || polje[y][j] != (int)beseda[a])){
                        return false;
                    }
                    polje[y][j] = (int)beseda[a++];
                }
            }
            else{
                int y = polozaj[0] - '0', x = polozaj[1] - '0';
                int a = 0;
                for(int j = y; j < y + beseda.length; j++){
                    //System.out.printf("%d, %d, %b\n", a, beseda.length, a >= beseda.length);
                    if(polje[j][x] != 0 && (a >= beseda.length || polje[j][x] != (int)beseda[a])){
                        return false;
                    }
                    polje[j][x] = (int)beseda[a++];
                }
            }
            //izpis(polje);
        }
        return true;
    }

    private static void izpis(int[][] polje){
        char def = '\u0000';
        for(int i = 0; i < polje.length; i++){
            for(int j = 0; j < polje[0].length; j++){
                if((char)polje[i][j] == def){
                    System.out.print("_");
                }
                else{
                    System.out.print(((char)polje[i][j]));
                }
            }
            System.out.println();
        }
    }
}
