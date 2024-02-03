
/*
 * Samodejno testiranje:
 * tj.exe Prva.java . .
 *
 * Javni testni primeri:
 * 01, 02: primera iz besedila
 * 03..10: splo"sni primeri
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), d = sc.nextInt();
        sc.close();

        // h-1-i presledkov, ena *, i presledkov (v zadnji i zvezdic), d-2 presledkov (v zadnji d-2 zvezdic)

        for(int i = 0; i < h; i++){
            if(d == 1){
                if(i == h-1){
                    System.out.print("*".repeat(2*h + (d-2 >= 0 ? d-2:-1)));
                }
                else{
                    int presledkov = h - 1 - i;
                    System.out.print(" ".repeat(presledkov));
                    System.out.print("*");
                    if(i == 0){
                        System.out.println("*".repeat((d-2 >= 0 ? d-2:-1)+1));
                    }
                    else{
                        System.out.print(" ".repeat(i-1));
                        System.out.print(" ".repeat((d-2 >= 0 ? d-2:0)));
                        System.out.print(" ".repeat(i));
                        System.out.println("*");
                    }
                }
            }
            else if(i == h-1){
                System.out.println("*".repeat(2*h + (d-2 >= 0 ? d-2:0)));
            }
            else{
                int presledkov = h - 1 - i;
                System.out.print(" ".repeat(presledkov));
                System.out.print("*");
                if(i == 0){
                    System.out.println("*".repeat((d-2 >= 0 ? d-2:-1)+1));
                }
                else{
                    System.out.print(" ".repeat(i));
                    System.out.print(" ".repeat((d-2 >= 0 ? d-2:0)));
                    System.out.print(" ".repeat(i));
                    System.out.println("*");
                }
                
            }
        }
        
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
