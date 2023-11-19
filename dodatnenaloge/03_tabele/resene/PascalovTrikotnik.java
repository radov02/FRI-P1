import java.util.Scanner;

public class PascalovTrikotnik {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prejsnjaVrstica[] = {}, vrstica[];

        for(int i = 1; i <= n+1; i++){
            vrstica = new int[i];

            for(int j = 0; j < i; j++){
                if(j == i-1){
                    vrstica[j] = 1;
                }
                else if(j == 0){
                    vrstica[j] = 1;
                }
                else{
                    vrstica[j] = prejsnjaVrstica[j-1] + prejsnjaVrstica[j];
                }
            }
            for(int j = 0; j < vrstica.length; j++){
                if(j == vrstica.length - 1){
                    System.out.print(vrstica[j]);
                }
                else{
                    System.out.print(vrstica[j] + " ");
                }
            }
            System.out.println();
            prejsnjaVrstica = vrstica;
        }
        
        sc.close();
    }
}