
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01, 02: primera iz besedila
01, 03--06: u = 1
02, 07--10: u = 2
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[][] ponudbe = new int[k][];

        for(int i = 0; i < k; i++){
            int[] vrstica = new int[3];
            vrstica[0] = sc.nextInt();
            vrstica[1] = sc.nextInt();
            vrstica[2] = sc.nextInt();
            ponudbe[i] = vrstica;
        }

        int[] ceneProdaja = new int[n];
        for(int i = 0; i < n; i++){
            int maxCena = 0;
            for(int j = 0; j < ponudbe.length; j++) {
                if(ponudbe[j][1] == i && ponudbe[j][2] > maxCena){
                    maxCena = ponudbe[j][2];
                }
            }
            ceneProdaja[i] = maxCena;
        }

        if(u == 1){
            System.out.println(Arrays.toString(ceneProdaja));
        }
        else{
            int[] izdelkovDrazitelj = new int[m];
            for(int j = 0; j < m; j++){
                for(int i = 0; i < ponudbe.length; i++){
                    if(ponudbe[i][0] == j && ceneProdaja[ponudbe[i][1]] == ponudbe[i][2]){
                        izdelkovDrazitelj[j]++;
                        ceneProdaja[ponudbe[i][1]] = 401;
                    }
                }
            }
            System.out.println(Arrays.toString(izdelkovDrazitelj));
        }
        sc.close();
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
