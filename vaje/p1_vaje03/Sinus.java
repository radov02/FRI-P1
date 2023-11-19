import java.util.Scanner;

public class Sinus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int amplituda = sc.nextInt();
        
        for(int i = 0; i < 2*(2*amplituda - 1); i++){
            if(i < 2*amplituda - 1){
                for(int j = 0; j < amplituda; j++){
                    System.out.print(" ");
                }
                if(i+1 <= amplituda){
                    for(int j = 0; j < i+1; j++){
                        System.out.print("*");
                    }
                }
                else{
                    for(int j = i; j >= 0; j--){
                        System.out.print("o");
                    }
                }
                
                System.out.println();
            }
            else{
                
            }
        }
        
        
        
        sc.close();
    }
}