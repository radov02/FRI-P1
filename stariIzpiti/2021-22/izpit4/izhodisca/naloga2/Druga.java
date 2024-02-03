
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02, 03: manj"sa la"zja primera (vsaka navpi"cna premica seka natanko eno polico)
 * 04..06: ve"cji la"zji primeri
 * 07: manj"si splo"sni primer
 * 08..10: ve"cji splo"sni primeri
 *
 * Skriti testni primeri:
 * 01..25: la"zji
 * 26..50: splo"sni
 *
 * Za vsako polico velja x >= 0, d >= 1, x + d <= m, y >= 1 in y <= m
 * (d je dol"zina police).  Police se med seboj ne prekrivajo.
 */

import java.util.*;

public class Druga {

    public static int najGlobina(int m, int[][] p) {
        int najGlobina = 0;
        for(double x = 0.5; x < m; x++){
            padanje:
            for(int y = 0; y < m; y++){
                //System.out.printf("(%f,%d)", x, y);
                for(int i = 0; i < p.length; i++){  // gremo cez police in gledamo ce je kaksna na koordianti y
                    if(p[i][1] == y && x >= p[i][0] && x <= p[i][0]+p[i][2]){
                        int globina = y;
                        //System.out.println("globina na x = " + x + ": " + globina);
                        if(globina > najGlobina){
                            najGlobina = globina;
                        }
                        break padanje;
                    }
                    
                }
                if(y == m-1){
                    return m;
                }
            }
        }
        return najGlobina;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }

}
