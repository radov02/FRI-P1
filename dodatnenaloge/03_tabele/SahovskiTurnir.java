import java.util.Arrays;
import java.util.Scanner;

public class SahovskiTurnir {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tocke[][] = new int[n+1][2];   // zap st in tocke

        while(true){
            if(!sc.hasNextInt()) break;
            int beli = sc.nextInt();
            int crni = sc.nextInt();
            int izid = sc.nextInt();

            if(izid == 1){
                tocke[]
                tocke[beli][1] += 2;
            }
            else if(izid == -1){
                tocke[crni][1] += 2;
            }
            else{
                tocke[beli][1]++;
                tocke[crni][1]++;
            }
        }



        Arrays.sort(tocke);

        for(int i = 1; i < n+1; i++){
            System.out.println()
        }

        sc.close();
    }
}