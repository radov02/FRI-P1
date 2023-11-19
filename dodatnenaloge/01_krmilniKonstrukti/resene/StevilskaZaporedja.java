import java.util.Scanner;

public class StevilskaZaporedja {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, k;
        a = sc.nextInt();
        b = sc.nextInt();
        k = sc.nextInt();

        if(k != 0 && ((a <= b && k > 0) || (a >= b && k < 0))){

            if(a <= b && k > 0){
                for(int i = a; i <= b; i += k){
                    System.out.println(i);
                }
            }
            else{
                for(int i = a; i >= b; i += k){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("NAPAKA");
        }

        sc.close();
    }
}