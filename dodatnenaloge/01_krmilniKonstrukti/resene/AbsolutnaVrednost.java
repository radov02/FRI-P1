import java.util.Scanner;

public class AbsolutnaVrednost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a < 0){
            System.out.println(-a);
        }
        else{
            System.out.println(a);
        }

        sc.close();
    }
}
