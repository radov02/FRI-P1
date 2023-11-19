import java.util.Scanner;

public class PravilniTrikotniki {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();
        int tocke[][] = new int[n][2];

        for(int i = 0; i < n; i++){
            tocke[i][0] = sc.nextInt();
            tocke[i][1] = sc.nextInt();
        }

        

        sc.close();
    }
}