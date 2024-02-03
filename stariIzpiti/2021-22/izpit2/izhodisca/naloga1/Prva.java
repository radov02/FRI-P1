
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int k = sc.nextInt();
        int[] glav = new int[k];
        Arrays.fill(glav, s);
        int[] zahteve = new int[k];
        for(int i = 0; i < k; i++){
            zahteve[i] = sc.nextInt();
        }
        sc.close();

        int branjevka = 0;
        for(int i = 0; i < zahteve.length; i++){
            if(glav[branjevka] >= zahteve[i]){
                glav[branjevka] -= zahteve[i];
            }
            else{
                branjevka++;
                i--;
            }
        }
        System.out.println(branjevka+1);
    }
}
