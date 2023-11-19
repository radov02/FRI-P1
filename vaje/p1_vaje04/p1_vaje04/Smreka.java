import java.util.Scanner;

public class Smreka {
    
    private static void znaki(int stevilo, char znak) {
        for(int i = 0; i < stevilo; i++){
            System.out.print(znak);
        }
    }
    
    // Izpise piramido, zamaknjeno za odmik od leve.
    // @param n     visina piramide
    // @param zamik     odmik od levega roba
    private static void piramida(int n, int zamik) 
    {
        //int tmp = 1;
        //int odmiki = n - 1;

        for(int i = 0; i < n; i++){

            znaki(zamik, ' ');
            // int odmiki SE VSAKIČ ZMANJŠA ZA 1 (lahko implementiramo z i, ki se poveca za 1):
            // znaki(odmiki, ' ');
            znaki(n - 1 - i, ' ');
            // int tmp SE VSAKIČ POVEČA ZA 2 (lahko implementiramo z i, ki se poveca za 1):
            // znaki(tmp, '*');
            znaki(2 * n + 1, '*');

            //tmp += 2;
            //odmiki--;
            System.out.println();
        }
    }

    // Izrise smreko, ki ima 'stPiramid' vej.
    // @param stPiramid     stevilo piramid
    private static void smreka(int stPiramid) {
        for(int i = 1; i <= stPiramid; i++){
            piramida(i, stPiramid - i);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int visina = sc.nextInt();
        smreka(visina);

        sc.close();
    }
}