import java.util.Scanner;
import java.util.Random;

public class Berac {

    private static String oznakaValute(int valuta) 
    {
        if(valuta == 0){
            return "EUR";
        }
        else if(valuta == 1){
            return "GBP";
        }
        else{
            return "USD";
        }
    }
    
    private static int preracunajVMilievre(int znesek, int valuta, int milievrovZaFunt, int milievrovZaDolar) 
    {
        if(valuta == 0){
            return znesek * 1000;
        }
        else if(valuta == 1){
            return znesek * milievrovZaFunt;
        }
        else {
            return znesek * milievrovZaDolar;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int seme = sc.nextInt();
        int tecajFunt = sc.nextInt();
        int tecajDolar = sc.nextInt();
        int k = sc.nextInt();   // naključni zneski do k
        int m = sc.nextInt();   // minimalni zaslužek
        Random r = new Random(seme);

        System.out.printf("%4sDarilo%10sKlobuk\n", " ", " ");   // za presledke: %20s, %-20s
        int trenutniZnesek = 0;

        while(trenutniZnesek < m){
            int valuta = r.nextInt(3);
            String oznakaValuta = oznakaValute(valuta);

            int darilo = r.nextInt(k);
            int dariloVmEUR = preracunajVMilievre(darilo, valuta, tecajFunt, tecajDolar);
            trenutniZnesek += dariloVmEUR;

            System.out.printf("%5s%d %s%11d mEUR\n", " ", darilo, oznakaValuta, trenutniZnesek);   // %5d - rezerviramo 5 mest za naše število (sicer presledki)
        }
        
        
        sc.close();
    }
}