import java.util.Scanner;

public class Izstevanka {
     
    private static int kdoIzpade(int stOtrok, int stBesed) {

        int indeksIzpadlega = stBesed % stOtrok;

        if(indeksIzpadlega == 0)
            return stOtrok - 1;
        return indeksIzpadlega - 1;

    }
     
    private static void izloci(String[] t, int ix, int d) {
        
        for(int i = ix; i < d; i++){
            t[i] = t[i+1];
        }

    }
    
    private static String[] izloci(String[] t, int ix) {
        String[] nova = new String[t.length-1];
        int j = 0;

        for(int i = 0; i < t.length; i++){
            if(i == ix) continue;
            nova[j++] = t[i];
        }

        return nova;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stOtrok = sc.nextInt();
        int stBesed = sc.nextInt();

        // preberi imena otrok
        String[] otroci = new String[stOtrok];
        for (int i = 0; i < stOtrok; i++)
            otroci[i] = sc.next();

        while(stOtrok > 1){
            int izpadli = kdoIzpade(stOtrok, stBesed);

            System.out.println(otroci[izpadli]);

            // 1. možnost:
            //otroci = izloci(otroci, izpadli);

            // 2. možnost:
            izloci(otroci, izpadli, stOtrok-1);

            stOtrok--;
        }

        sc.close();
    }
}
