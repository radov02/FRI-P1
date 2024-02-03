
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:
01: primer iz besedila
02--04: natanko dva elementa true
05--07: H = 1
01, 08--10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static int[] manhattan(boolean[][] t) {
        int[] tab = new int[(t.length + (t[0].length-1))];
        List<Par> tocke = new ArrayList<>();

        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                if(t[i][j]){
                    tocke.add(new Par(i, j));
                }
            }
        }

        for(int i = 0; i < tocke.size()-1; i++){
            for(int j = i+1; j < tocke.size(); j++){
                int razdalja = (int)Math.abs(tocke.get(i).a - tocke.get(j).a) + (int)Math.abs(tocke.get(i).b - tocke.get(j).b);
                tab[razdalja]++;
            }
        }

        return tab;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    private static class Par{
        public int a, b;

        public Par(int a, int b){
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
