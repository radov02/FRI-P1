import java.util.Scanner;

public class KrogAstroid {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();

        // narisiKrog(r);
        narisiAstroid(r);
        
        sc.close();
    }

    public static void narisiAstroid(int r){
        for(int i = -r-1; i < r+2; i++){
            for(int j = -2*r; j < 2*r; j++){
                if(i == 0 && j == 0){
                    System.out.print("+");
                }
                else if(i == 0){
                    System.out.print("-");
                }
                else if(j == 0){
                    System.out.print("|");
                }
                
                else if(Math.pow(i * i, 1.0 / 3) + Math.pow(j/1.9 * j/1.9, 1.0 / 3) < Math.pow(r * r, 1.0 / 3)){
                    System.out.print("o");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void narisiKrog(int r){
        for(int i = -r-1; i < r+2; i++){
            for(int j = -2*r; j < 2*r; j++){
                if(i == 0 && j == 0){
                    System.out.print("+");
                }
                else if(i == 0){
                    System.out.print("-");
                }
                else if(j == 0){
                    System.out.print("|");
                }
                else if(i*i + (j/1.9)*(j/1.9) < r*r){
                    System.out.print("o");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}