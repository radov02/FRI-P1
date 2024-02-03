
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--06: zamik = 0
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String piramida = "";
        while(sc.hasNextInt()){
            piramida += "" + sc.nextInt();
        }
        sc.close();

        String[] vrstice = piramida.split("2");
        int visina = vrstice.length;

        int nicelVprvi = 0;
        for(int i = 0; i < vrstice[0].length(); i++){
            if(vrstice[0].charAt(i) == '0') nicelVprvi++;
        }
        int zamik = nicelVprvi - (visina-1);
        System.out.printf("%d%n%d", visina, zamik);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
