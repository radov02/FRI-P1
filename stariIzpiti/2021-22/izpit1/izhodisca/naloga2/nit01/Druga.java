
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        // razdalja bo strelec
        int x = strelec, y = igralci.length / 2;
        int minRazdalja = igralci[0].length, xIgralca;
        if(smer == 1){
            xIgralca = igralci[0].length - 1;
            for(int i = 0; i < igralci.length; i++){
                for(int j = x+1; j < igralci[0].length; j++){
                    if(igralci[i][j]){
                        int razdaljaPoY = (int) Math.abs(i - y);
                        int razdaljaPoX = (int) Math.abs(j - strelec);
                        //System.out.println("log1: " + razdaljaPoY + ", " + razdaljaPoX);
                        if(razdaljaPoY < minRazdalja && razdaljaPoX >= razdaljaPoY){
                            //System.out.println("log2: " + i + ", " + j);
                            minRazdalja = razdaljaPoY;
                            if(i == y) xIgralca = j;
                            else xIgralca = j-1;
                        }
                    }
                }
            }
        }
        else{
            xIgralca = 0;
            for(int i = 0; i < igralci.length; i++){
                for(int j = x-1; j >= 0; j--){
                    if(igralci[i][j]){
                        int razdaljaPoY = (int) Math.abs(i - y);
                        int razdaljaPoX = (int) Math.abs(j - strelec);
                        if(razdaljaPoY < minRazdalja && razdaljaPoX >= razdaljaPoY){
                            minRazdalja = razdaljaPoY;
                            xIgralca = j;
                        }
                    }
                }
            }
        }
        return (int) Math.abs(xIgralca - strelec);
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
