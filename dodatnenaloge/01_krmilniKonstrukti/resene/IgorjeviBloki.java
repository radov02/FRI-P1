import java.util.Scanner;

public class IgorjeviBloki {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for(int i = 0; i < Math.max(a, Math.max(b, c)); i++){
            if(i < a){
                for(int j = 0; j < a; j++){
                    System.out.print(a);
                }
                if(i < b)
                    System.out.print(" ");
            }
            else{
                for(int j = 0; j < a; j++){
                    System.out.print(" ");
                }
                System.out.print(" ");
            }

            if(i < b){
                for(int j = 0; j < b; j++){
                    System.out.print(b);
                }
                if(i < c)
                    System.out.print(" ");
            }
            else if(b < c){
                for(int j = 0; j < b; j++){
                    System.out.print(" ");
                }
                System.out.print(" ");
            }

            if(i < c){
                for(int j = 0; j < c; j++){
                    System.out.print(c);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}