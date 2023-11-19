import java.util.Scanner;

public class VsiRazlicniI {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] pojavljenaStevila = new int[n];
        int p = 0;
        int[] podvojenaStevila = new int[n];
        int pd = 0;
        boolean razlicni = true;

        for(int i = 0; i < n; i++){
            int stevilo = sc.nextInt();


            boolean podvojeno = false;
            for(int j = 0; j < p; j++){
                if(pojavljenaStevila[j] == stevilo){
                    podvojenaStevila[pd++] = stevilo;
                    podvojeno = true;
                    razlicni = false;
                }
            }

            if(!podvojeno)
                pojavljenaStevila[p++] = stevilo;
        }

        if(razlicni){
            System.out.println("RAZLICNI");
        }
        else{
            int min = podvojenaStevila[0];
            for(int i = 0; i < pd; i++){
                if(podvojenaStevila[i] < min){
                    min = podvojenaStevila[i];
                }
            }

            System.out.println(min);
        }

        sc.close();
    }
}