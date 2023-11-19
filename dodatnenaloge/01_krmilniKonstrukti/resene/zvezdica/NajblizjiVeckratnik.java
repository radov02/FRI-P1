package zvezdica;
import java.util.Scanner;

public class NajblizjiVeckratnik {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int i = 0;
        boolean veckr = false;
        while(!veckr){
            int up = b + i;
            int down = b - i;

            if(down % a == 0){
                System.out.println(down);
                veckr = true;
            }
            else if(up % a == 0){
                System.out.println(up);
                veckr = true;
            }
            i++;
        }

        sc.close();
    }
}
