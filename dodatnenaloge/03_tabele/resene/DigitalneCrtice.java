import java.util.Scanner;

public class DigitalneCrtice {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int crtice[] = new int[] {6,2,5,5,4,5,6,3,7,6};
        int iskani = 1, najvecjaVsota = 0;

        for(int i = 0; i < n; i++){
            int vsotaCrtic = 0;
            int stevilo = sc.nextInt();
            int tmp = stevilo;
            while(tmp > 0){
                int stevka = tmp % 10;
                vsotaCrtic += crtice[stevka];
                tmp /= 10;
            }

            if(vsotaCrtic > najvecjaVsota){
                najvecjaVsota = vsotaCrtic;
                iskani = stevilo;
            }
        }

        System.out.println(iskani);

        sc.close();
    }
}