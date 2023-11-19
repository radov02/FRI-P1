package resene;
import java.util.Scanner;

public class MnozenjeZZaporednimSestevanjem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int vsota = 0;
        
        for(int i = 0; i < a; i++){
            vsota = sestej(vsota, b);
        }

        System.out.println(vsota);

        sc.close();
    }

    public static int sestej(int x, int y){
        return (x + y);
    }
}