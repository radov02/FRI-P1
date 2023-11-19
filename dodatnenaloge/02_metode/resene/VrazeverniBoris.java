package resene;
import java.util.Scanner;
import java.util.Random;

public class VrazeverniBoris {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        Random rand = new Random(s);

        for(int i = 1; i <= n; i++){
            int lihoZaporedje = 0, metov = 0;
            boolean nedelja = (i % 7 == 0 ? true:false);
            
            int presledkov = (i / 10 == 0 ? 3:(i / 100 == 0 ? 2:1));
            for(int j = 0; j < presledkov; j++){
                System.out.print(" ");
            }

            System.out.print(i + " (" + (nedelja ? "N":"D") + "): ");

            while(nedelja && lihoZaporedje < 5 || !nedelja && lihoZaporedje < 3){
                metov++;
                int pik = rand.nextInt(6) + 1;

                System.out.print(pik + " ");

                if(pik % 2 != 0){
                    lihoZaporedje++;
                }
            }

            System.out.println("[" + metov + "]");
        }

        sc.close();
    }
}