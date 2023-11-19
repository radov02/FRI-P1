package resene.zvezdica;
import java.util.Scanner;
import java.util.Random;

public class NajboljseSeme {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        long maxStevilo = 0;
        int najSeme = 0;

        for(int seme = b; seme >= a; seme--){
            Random rand = new Random(seme);
            String stevilo = "";
            for(int i = 0; i < n; i++){
                stevilo += rand.nextInt(10);
            }

            long st = Long.parseLong(stevilo);
            if(st >= maxStevilo){
                maxStevilo = st;
                najSeme = seme;
            }
        }
        
        System.out.println(najSeme);

        sc.close();
    }
}
