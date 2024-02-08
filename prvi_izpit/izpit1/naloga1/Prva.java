
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--10: splošni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int st = sc.nextInt();
            int[] del = delitelji(st);
            boolean da = false;
            int j = 0;
            zun:
            while(del[j] != 0 && j < del.length){
                int k = 0;
                while(del[k] != 0 && k < del.length){
                    if(del[j] * del[k] == st && del[j] > del[k]/2 && del[k] > del[j]/2){
                        System.out.println("DA");
                        da = true;
                        break zun;
                    }
                    k++;
                }
                j++;
            }
            if(!da){
                System.out.println("NE");
            }
        }
        sc.close();
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
    private static int[] delitelji(int st){
        int[] del = new int[st+1];
        int index = 0;
        for(int i = 1; i <= st; i++){
            if(st % i == 0){
                del[index++] = i;
            }
        }
        return del;
    }
}
