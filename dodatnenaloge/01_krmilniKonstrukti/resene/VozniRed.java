import java.util.Scanner;

public class VozniRed {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int hz, mz, hk, mk, d;
        hz = sc.nextInt();
        mz = sc.nextInt();
        hk = sc.nextInt();
        mk = sc.nextInt();
        d = sc.nextInt();

        int mmz = hz * 60 + mz;
        int mmk = hk * 60 + mk;

        for(int i = mmz; i <= mmk; i += d){
            int h = i / 60;
            int m = i % 60;
            System.out.println((h < 10 ? "0"+h : h) + ":" + (m < 10 ? "0"+m : m));
        }

        sc.close();
    }
}