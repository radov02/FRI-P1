import java.util.Arrays;
import java.util.Scanner;

public class Tabele {
    public static void main(String[] args){

        //System.out.println(Arrays.toString(eratostenovoSito(25)));

        //System.out.println(dvojiskoNajdi(6, new int[]{2,5,2,5,1,6,7,8,4,3,7,3,6,7,2,6,5,0}));

        //System.out.println(Arrays.toString(urediZVstavljanjem(new int[]{2,5,2,5,1,6,7,8,4,3,7,3,6,7,2,6,5,0})));

        //System.out.println(fibo(50,25,new int[51]));

        //System.out.println(binomskiKoeficient(10, 2, new int[11][3]));

        //kazalciTabelInFunkcije();

        //pascalovTrikotnik(6);

        //kazalciTabel();

        /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] kolesarjiNaEtapahCasi = new int[n][k];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                kolesarjiNaEtapahCasi[i][j] = sc.nextInt();
            }
        }
        sc.close();
        izpisiLestvico(kolesarjiNaEtapahCasi); */

        /* int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,3,4},{2,4,3},{1,2,4}}; 
        zmnoziMatriki(a, b); */

        int[][] matrikaSosednosti = {
            {0,1,5,-1,-1,-1},
            {-1,0,2,12,-1,-1},
            {-1,-1,0,8,4,-1},
            {-1,-1,-1,0,-1,5},
            {-1,2,-1,3,0,9},
            {-1,-1,-1,-1,6,0}
        };
    }

    public static int[] eratostenovoSito(int n){
        int[] sito = new int[n+1];
        sito[0] = sito[1] = -1;

        for(int i = 2; i <= (int)(Math.round(Math.sqrt(n))); i++){
            if(sito[i] != -1){
                for(int j = 2*i; j <= n; j += i){
                    System.out.println(j);
                    sito[j] = -1;
                }
            }
        }
        return sito;
    }

    public static int dvojiskoNajdi(int stevilo, int[] tabela){ // vrne indeks stevila ce se to nahaja v tabeli, sicer -1
        Arrays.sort(tabela);
        //long zac = System.nanoTime();
        int leva = 0, desna = tabela.length-1;
        int trenutniIndeks = tabela.length / 2;

        while(tabela[trenutniIndeks] != stevilo || leva == desna){
            if(tabela[trenutniIndeks] > stevilo){
                desna = trenutniIndeks;
            }
            else{
                leva = trenutniIndeks;
            }
            trenutniIndeks = leva + (desna - leva) / 2;
        }
        //System.out.println(System.nanoTime() - zac);
        return (leva == desna ? -1:trenutniIndeks);
    }

    public static int[] urediZVstavljanjem(int[] tabela){
        
        for(int i = 1; i < tabela.length; i++){ // gremo cez neurejen del - prvi elementi
            int element = tabela[i];
            for(int j = i - 1; j >= 0; j--){
                if(tabela[j] < element){
                    tabela[j+1] = element;
                    break;
                }
                tabela[j+1] = tabela[j];
            }
        }

        return tabela;
    }

    public static int fibo(int n, int k, int[] memo){
        if(n < k-1){
            return 0;
        }
        if(n == k-1){
            return 1;
        }
        if(memo[n] > 0){    // ce imamo ze izracunano, ne bomo se enkrat racunali
            return memo[n];
        }
        // sicer racunamo:
        int tmp = 0;
        for(int i = n-k; i < n-1; i++){
            tmp += fibo(i, k, memo);
        }
        memo[n] = tmp;
        return memo[n];
    }

    public static int binomskiKoeficient(int n, int k, int[][] memo){
        if(k == 0 || n == k){
            return 1;
        }
        if(memo[n][k] > 0){
            return memo[n][k];
        }
        
        memo[n][k] = binomskiKoeficient(n-1, k, memo) + binomskiKoeficient(n-1, k-1, memo);
        return memo[n][k];
    }

    public static int primerjaj(int[] a, int[] b){
        if(a == b) return 1;
        
        boolean enaki = true;
        if(a.length != b.length) enaki = false;
        else {
            for(int i = 0; i < a.length; i++){
                if(a[i] != b[i]) enaki = false;
            }
        }

        return (enaki ? 2:0);
    }

    public static void kazalciTabelInFunkcije(){
        int[] t  = {1,1,1};
        int[] u = t;
        int[] v = f(u);
        int[] w = g(v);
        h(v);
        System.out.println(Arrays.toString(t));
        System.out.println(Arrays.toString(u));
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(w));
    }
    private static int[] f(int[] t){
        t[0]++;;
        return t;
    }
    private static int[] g(int[] t){
        t[0]++;
        return Arrays.copyOf(t, t.length);
    }
    private static void h(int[] t){
        t[0]++;
    }

    public static int[][] pascalovTrikotnik(int n){
        int[][] tr = new int[n][];
        for(int i = 0; i < tr.length; i++){
            int[] vrstica = new int[i+1];
            vrstica[0] = vrstica[vrstica.length-1] = 1;
            for(int j = 1; j < vrstica.length-1; j++){
                vrstica[j] = tr[i-1][j-1] + tr[i-1][j];
            }
            tr[i] = vrstica;
            System.out.println(Arrays.toString(vrstica));
        }
        return tr;
    }

    public static void kazalciTabel(){
        int[] a = {1, 2};
        int[] b = a;
        int[] c = {1, 2};
        int[][] t = {a, b, c, {1, 2}, a};
        a[0]--;
        b[1]++;
        t[2][0] -= 2;
        t[3][1] *= 3;
        t[4] = t[2];

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("c: " + Arrays.toString(c));
        System.out.println("t: ");
        for(int i = 0; i < t.length; i++){
            System.out.println(Arrays.toString(t[i]));
        }
    }

    public static int[] globalniMaksimum(int[][] t){
        int[] maks = {0,0};

        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                if(t[i][j] > t[maks[0]][maks[1]]){
                    maks[0] = i;
                    maks[1] = j;
                }
            }
        }

        return maks;
    }

    public static void izpisiLestvico(int[][] tab){ // ...
         // za vsako etapo:
        for(int i = 0; i < tab[0].length; i++){
            int[] lestvica = new int[tab.length];
            for(int j = 0; j < tab.length; j++){
                int element = tab[j][i];
                for(int k = 0; k < lestvica.length; k++){    // vzamemo element in ga vstavimo na ustrezno mesto
                    if(element < lestvica[k]){
                        for(int l = k; l < lestvica.length-1; l++){
                            lestvica[l+1] = lestvica[l];
                        }
                        lestvica[k] = element;
                    }
                }   
            }
            System.out.printf("Etapa %d: %s%n", i, Arrays.toString(lestvica));
        }

        // za celotno dirko:
        // najprej tabela vsot za kolesarje:
        int[] vsoteCasov = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                vsoteCasov[i] += tab[i][j];
            }
        }
        Arrays.sort(vsoteCasov);
        for(int i = 0; i < vsoteCasov.length; i++){
            for(int j = 0; j < tab.length; j++){
                //if(vsoteCasov[i] == tab[])
            }
        }
    }

    public static int[][] zmnoziMatriki(int[][] a, int[][] b){
        if(a[0].length != b.length) return null;

        int[][] rez = new int[a.length][b[0].length];
        for(int i = 0; i < rez.length; i++){  // po vrsticah rez
            for(int j = 0; j < rez[0].length; j++){  // po stolpcih rez
                for(int k = 0; k < a[0].length; k++){
                    rez[i][j] += a[i][k] * b[k][j];
                }
            }
            System.out.println(Arrays.toString(rez[i]));
        }
        return rez;
    }

    public static int[][] najcenejsePoti(int[][] graf){ // ...
        // skopirajmo graf v tabelo cene:
        int[][] cene = new int[graf.length][graf.length];
        for(int i = 0; i < graf.length; i++){
            for(int j = 0; j < graf.length; j++){
                cene[i][j] = graf[i][j];
            }
        }

        for(int i = 0; i < cene.length; i++){   // i je trenutno vozlisce
            for(int j = 0; j < cene[i].length; j++){
                if(i == j) continue;
                // j je trenutno ciljno vozlisce
                for(int k = 0; k < cene.length; k++){

                }
                
            }
        }

        return cene;    // tabela sedaj vsebuje samo cene najcenejsih poti med vozlisci
    }
}
