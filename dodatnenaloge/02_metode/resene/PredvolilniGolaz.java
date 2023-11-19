package resene;
import java.util.Scanner;

public class PredvolilniGolaz {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int denar = sc.nextInt();
        int pogostitev[] = new int[3];
        boolean input = true;

        while(denar > 0){
            for(int i = 0; i < 3; i++){
                if(!sc.hasNextInt()){
                    input = false;
                    break;
                }
                pogostitev[i] = sc.nextInt();
            }
            if(!input) break;
            
            int cena = cenaPogostitve(pogostitev[0], pogostitev[1], (pogostitev[2] == 1 ? true:false));
            denar -= cena;
            if(denar < 0){
                System.out.println(cena + " -");
                break;
            }
            else{
                System.out.println(cena + " " + denar);
            }
        }

        sc.close();
    }

    public static int cenaPogostitve(int cenaKosila, int stKosil, boolean vino){
        int cena = cenaKosila * stKosil;

        if(vino){
            cena += Math.ceil(cena / 2.0);
        }

        return cena;
    }
}