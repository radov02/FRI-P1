import java.util.Scanner;

public class Izstevanka {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stOtrok = sc.nextInt();
        int stBesed = sc.nextInt();

        VektorString otroci = new VektorString();
        for(int i = 0; i < stOtrok; i++){
            String otrok = sc.next();
            otroci.dodaj(otrok);
        }

        System.out.println(otroci);

        for(int i = 0; i < stOtrok - 1; i++){
            int ixIzpadlega = (stBesed - 1) % stOtrok;
            System.out.println("Izpade " + otroci.vrni(ixIzpadlega));
            otroci.zbrisi(ixIzpadlega);
            stOtrok--;
        }

        System.out.println("Ostane " + otroci.vrni(0));

        sc.close();
    }
}
