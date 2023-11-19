package zvezdica;
import java.util.Scanner;

public class Sahovnica {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int v, s, d;
        v = sc.nextInt();
        s = sc.nextInt();
        d = sc.nextInt();

        for(int i = 0; i < 2 + v*d; i++){
            for(int j = 0; j < 2 + s*d; j++){
                if((i == j && i == 0) || 
                    (i == 2 + v*d-1 && j == 2 + s*d-1) ||
                    (i == 0 && j == 2 + s*d-1) ||
                    (j == 0 && i == 2 + v*d-1)){
                        if(j == 0){
                            System.out.print('+');
                        }
                        else{
                            System.out.print(" +");
                        }
                }
                else if(i == 0 || i == 2 + v*d-1){
                    System.out.print(" -");
                }
                else if(j == 0 || j == 2 + s*d-1){
                    if(j == 0){
                        System.out.print("|");
                    }
                    else{
                        System.out.print(" |");
                    }
                }
                else{
                    if(j == 2 + s*d-2 || i == 2 + v*d-2){

                    }
                    if((i-1) / d % 2 == 0){
                        if((j-1) / d % 2 == 0){
                            System.out.print("  ");
                        }
                        else{
                            System.out.print(" *");
                        }
                    }
                    else{
                        if((j-1) / d % 2 == 0){
                            System.out.print(" *");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}