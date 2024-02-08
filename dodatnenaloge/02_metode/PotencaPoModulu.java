import java.util.Scanner;

public class PotencaPoModulu {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // a^b % m = ?

        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int potenca = 1, bNovi = b;
        while(b / 2 >= 2){
            bNovi = bNovi / 2;
            potenca += 2;
        }

        int osnovniMod = a % m;
        System.out.println(osnovniMod);

        int rezultat = (int)Math.pow((b / potenca) * osnovniMod, potenca) % m;

        System.out.println(rezultat);
    }
}