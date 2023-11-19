import java.util.Scanner;

public class MedianaTrojiceI {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b){
            if(a > c){
                if(b > c){
                    System.out.println(b);
                }
                else{
                    System.out.println(c);
                }
            }
            else{
                System.out.println(a);
            }
        }
        else{   // b >= a
            if(a > c){
                System.out.println(a);
            }
            else if(c > b){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

        sc.close();
    }
}