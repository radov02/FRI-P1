package resene;
import java.util.Random;
import java.util.Scanner;

public class SahovskiPopoldnevi {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int z = sc.nextInt();
        int d = sc.nextInt();

        Random rand = new Random(s);

        for(int i = 1; i <= d; i++){
            System.out.printf("%d. dan: ", i);
            int partij = 0, zmageAndrej = 0, zmageBranka = 0;
            
            while(partij < p && zmageAndrej < z && zmageBranka < z){
                int rezultat = rand.nextInt(100);

                if(rezultat < a){
                    zmageAndrej++;
                    System.out.print("A");
                }
                else if(rezultat < a+b){
                    zmageBranka++;
                    System.out.print("B");
                }
                else {
                    System.out.print("r");
                }
                partij++;
            }
            System.out.printf(" (%d)\n", partij);
        }

        sc.close();
    }
}
