import java.util.Scanner;

public class UrejanjeTrojice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int ar[] = new int[3];
        if(a > b){
            if(a > c){
                ar[2] = a;
                if(b > c){
                    ar[0] = c;
                    ar[1] = b;
                }
                else{
                    ar[0] = b;
                    ar[1] = c;
                }
            }
            else{
                ar[2] = c;
                ar[1] = a;
                ar[0] = b;
            }
        }
        else{   // b > a
            if(b > c){
                ar[2] = b;
                if(a > c){
                    ar[1] = a;
                    ar[0] = c;
                }
                else{
                    ar[1] = c;
                    ar[0] = a;
                }
            }
            else{   // c > b > a
                ar[2] = c;
                ar[1] = b;
                ar[0] = a;
            }
        }

        System.out.print(ar[0]);
        for(int i = 1; i < ar.length; i++){
            System.out.print(" " + ar[i]);
        }
        System.out.println();

        sc.close();
    }
}