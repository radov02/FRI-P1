import java.util.Scanner;

public class Determinanta {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int matrika[][] = new int[n+1][n+1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                matrika[i][j] = sc.nextInt();
            }
        }

        int determ = 0;
        for(int i = 1; i <= n; i++){
            determ += Math.pow(-1, i-1) * matrika[1][i] * determinanta(matrika, i);
        }

        sc.close();
    }

    public static int determinanta(int[][] matrika, int stolpec){
        for(int i = 1; i <= matrika.length; i++){
            for(int j = 1; j <= matrika[i].length; j++){
                if(j == stolpec){
                    break;
                }
            }
        }
    }
}