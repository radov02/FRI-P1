package resene;
import java.util.Arrays;
import java.util.Scanner;

public class MaksimumiPoStolpcihII {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int matrika[][] = new int[n][];
        int najdaljsa = 0;
        
        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            int vrstica[] = new int[d];
            for(int j = 0; j < d; j++){
                vrstica[j] = sc.nextInt();
            }
            matrika[i] = vrstica;
            if(d > najdaljsa){
                najdaljsa = d;
            }
        }

        int maksimumi[] = new int[najdaljsa];
        for(int i = 0; i < maksimumi.length; i++){
            maksimumi[i] = -(int)Math.pow(10, 9);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < matrika[i].length; j++){
                if(matrika[i][j] > maksimumi[j]){
                    maksimumi[j] = matrika[i][j];
                }
            }
        }

        System.out.println(Arrays.toString(maksimumi));

        sc.close();
    }
}