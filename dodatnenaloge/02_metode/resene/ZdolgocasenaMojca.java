package resene;
import java.util.Random;
import java.util.Scanner;

public class ZdolgocasenaMojca {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int seme = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();
        Random rand = new Random(seme);

        for(int i = 1; i <= d; i++){
            System.out.printf("%d. dan:\n", i);
            int vsota;
            boolean prastevilo = false;

            int met = 1;
            while(!prastevilo){
                prastevilo = true;
                vsota = 0;
                
                System.out.printf("    %d. met: ", met);
                for(int j = 0; j < k; j++){
                    int pik = rand.nextInt(6) + 1;
                    vsota += pik;
                    System.out.print(pik + " ");
                }

                if(vsota < 2){
                    prastevilo = false;
                }
                else{
                    for(int j = 2; j*j <= vsota; j++){
                        if(vsota % j == 0){
                            prastevilo = false;
                            break;
                        }
                    }
                }
                System.out.printf("| vsota = %d\n", vsota);
                met++;
            }
        }

        sc.close();
    }
}