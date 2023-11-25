public class Volitve {

    //  izidi[stevilo let][stevilo strank][stevilo volisc]
    // Arrays.toString(tabela)
    // Arrays.deepToString(tabela) za večdimenzionalne tabele
    
    /**
     * Vrne skupno stevilo glasov, ki jih je v podanem letu prejela 
     * stranka.
     */
    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int sum = 0;

        for(int i = 0; i < t[leto][stranka].length; i++){
            sum += t[leto][stranka][i];
        }

        return sum;
    }

    /** 
     * Za leto in stranko izracuna stevilo glasov, ki jih je stranka
     * prejela v tistem letu.
     *
     * @param t izidi volitev za vso butalsko zgodovino
     * @return  tabela[leto][stranka]
     */
    public static int[][] glasovi(int[][][] t) {

        int[][] ls = new int[t.length][];   // [leto, stranke]

        for(int i = 0; i < t.length; i++){  // leto
            int[] a = new int[t[i].length]; // tabela vsot za stranke
            for(int j = 0; j < t[i].length; j++){   // stranka
                for(int k = 0; k < t[i][j].length; k++){    // volisce
                    a[j] += t[i][j][k];
                }
            }

            ls[i] = a;
        }

        return ls;
    }
    
    /**
     * Vrne indeks volisca, na katerem je stranka v skupnem sestevku 
     * preko vseh let prejela najvec glasov.
     *
     * @param t izidi volitev za vso butalsko zgodovino
     * @param stranka   stranka, ki nas zanima
     * @return  indeks volisca
     */ 
    public static int najVolisce(int[][][] t, int stranka) {

        int[] vsoteVolisc = new int[t[0][stranka].length];

        for(int i = 0; i < t.length; i++){  // leto
            for(int k = 0; k < t[i][stranka].length; k++){  // volisce
                vsoteVolisc[k] += t[i][stranka][k];
            }
        }

        int maxVolisce = 0;
        for(int i = 1; i < vsoteVolisc.length; i++){
            if(vsoteVolisc[i] > vsoteVolisc[maxVolisce]){
                maxVolisce = i;
            }
        }

        return maxVolisce;
    }

    /**
     * Izracuna vsoto uvrstitev, ki jih je stranka dosegla na voliscu.
     *
     * @param t         izidi volitev za vso butalsko zgodovino
     * @param stranka   stranka, ki nas zanima
     * @param volisce   volisce, za katerega racunamo uvrstitev
     * @return          vsota uvrstitev
     */
    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        // volilni indeks, indeks uspesnosti stranke

        int[] uvrstitvePoLetih = new int[t.length];

        for(int i = 0; i < t.length; i++){
            // za vsako leto uvrstitev:
            
            // za volisce uvrstitev:
            int oddaljenostOdPrvega = 0;
            int vsotaNaVoliscuZaStranko = t[i][stranka][volisce];
            for(int j = 0; j < t[0].length; j++){
                if(t[i][j][volisce] > vsotaNaVoliscuZaStranko){
                    oddaljenostOdPrvega++;
                }
            }

            uvrstitvePoLetih[i] = oddaljenostOdPrvega + 1;
        }

        int vsota = 0;
        for(int i = 0; i < uvrstitvePoLetih.length; i++){
            vsota += uvrstitvePoLetih[i];
        }

        return vsota;
    }
    
    /*
    private static void izpisi(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%5d", t[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // za rocno testiranje ...
        
        int[][] t = new int[5][];
        for (int i = 0; i < t.length; i++) {
            t[i] = new int[i + 1];
            for (int j = 0; j < t[i].length; j++)
                t[i][j] = i + j + 1;
        }
        izpisi(t);
    }
    */
}