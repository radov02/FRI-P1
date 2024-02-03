
import java.util.*;

public class Druga {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] slika = new int[h][w];
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                slika[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int stMejnih = 0;
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(slika[i][j] == 1){
                    if(i == 0 || i == h-1 || j == 0 || j == w-1){
                        stMejnih++;
                    }
                    else{
                        if(mejna(slika, i, j)){
                            stMejnih++;
                        }
                    }
                }
            }
        }

        System.out.println(stMejnih);
    }

    public static boolean mejna(int[][] slika, int x, int y){
            for(int i = x-1; i <= x+1; i++){
                for(int j = y-1; j <= y+1; j++){
                    if(slika[i][j] == 0){
                        return true;
                    }
                }
            }
            return false;
        }
}
