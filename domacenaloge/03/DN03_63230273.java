import java.util.Scanner;

public class DN03_63230273 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();

        long porabljenih = 0l;

        // po visini:
        int ekspY = k;
        while(h > 0){

            // po sirini:
            int ww = w, ekspX = ekspY, faktor = 1;
            long ploscicVrstica = 0l;
            while(ww > 0){
                ploscicVrstica += (ww / (int)(Math.pow(2, ekspX)) * faktor);
                ww = ww % (int)(Math.pow(2, ekspX));
                ekspX--;
                faktor *= 2;
            }

            int vrstic = h / (int)(Math.pow(2, ekspY));
            porabljenih += (vrstic * ploscicVrstica);

            h = h % (int)(Math.pow(2, ekspY));
            ekspY--;
        }

        System.out.println(porabljenih);

        sc.close();
    }


}
