import java.util.Scanner;

public class Ocene {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] ocene = new int[6];
        int stOcen = 0, vsotaOcen = 0;

        while(sc.hasNextInt()){
            int nova = sc.nextInt();
            ocene[nova]++;
            vsotaOcen += nova;
            stOcen++;
        }

        for(int i = 1; i < ocene.length; i++){
            System.out.println("Število ocen " + i + ": " + ocene[i]);
        }

        System.out.printf("Povprečna ocena je %.2f", (double)vsotaOcen/stOcen);

        sc.close();
    }
}
