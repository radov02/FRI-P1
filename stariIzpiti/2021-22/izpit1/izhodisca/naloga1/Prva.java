
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();

        int stevec = 0;
        for(int i = a; i <= b; i++){
            if(prastevilo(i) && deliteljev(i + 2) <= 4){
                stevec++;
            }
        }

        System.out.println(stevec);
    }

    public static boolean prastevilo(int a){
        for(int i = 2; i <= (int)Math.round(Math.sqrt(a)); i++){
            if(a % i == 0) return false;
        }
        return true;
    }

    public static int deliteljev(int a){
        int stevec = 2;
        for(int i = 2; i < a; i++){
            if(a % i == 0) stevec++;
        }
        return stevec;
    }
}
