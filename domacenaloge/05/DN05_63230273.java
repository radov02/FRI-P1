import java.util.Arrays;
import java.util.Scanner;

public class DN05_63230273{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l, x;
        int[][] liki = 
        {   // visine po posameznih stolpcih za vse like
            {1, 1, 1, 1},
            {4},
            {2, 2},
            {1, 2, 1},
            {2, 3},
            {2, 2, 2},
            {3, 2},
            {3, 1},
            {1, 1, 2},
            {3, 3},
            {2, 2, 2},
            {1, 3},
            {2, 2, 2},
            {3, 3},
            {2, 1, 1},
            {2, 2, 1},
            {2, 3},
            {1, 2, 2},
            {3, 2}
        };
        int[] visineStolpcevPolja = new int[2000];

        for(int i = 0; i < n; i++){
            l = sc.nextInt();
            x = sc.nextInt();

            System.out.println(l);

            for(int j = 0; j < liki[l].length; j++){
                if(visineStolpcevPolja[x + j + 1000 - 1] == 0){
                    visineStolpcevPolja[x + j + 1000 - 1] += liki[l][j];
                }
                else{
                    
                }
                
            }

            for(int j = -5+ 1000 - 1; j < 6+ 1000 - 1; j++){
                System.out.print(visineStolpcevPolja[j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < visineStolpcevPolja.length; i++){
            if(visineStolpcevPolja[i] > 0){
                System.out.printf("%d: %d\n", i - 1000 + 1, visineStolpcevPolja[i]);
            }
        }

        sc.close();
    }
}