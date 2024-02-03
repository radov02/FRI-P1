
/*
Samodejno testiranje:
tj.exe Prva.java . .

Testni primeri:

01: primer iz besedila
02..04: na vhodu je 42 "stevil
01, 05..10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxVsota = 0;
        int a = sc.nextInt();
        while(sc.hasNextInt()){
            int b = sc.nextInt();
            if(maxVsota == 0) maxVsota = a + b;
            else{
                int vsota = a + b;
                if(vsota > maxVsota){
                    maxVsota = vsota;
                }
            }
            a = b;
        }
        sc.close();
        System.out.println(maxVsota);
    }
}
