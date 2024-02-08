import java.util.Scanner;
import java.util.Arrays;

public abstract class GeoTelo{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        GeoTelo[] gt = new GeoTelo[n];
        int indeks = 0;
        for(int i = 0; i < n; i++){
            int vrsta = sc.nextInt();
            switch(vrsta){
                case 1: {
                    Kvader telo = new Kvader(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    gt[indeks++] = telo;
                }; break;
                case 2: {
                    Kocka telo = new Kocka(sc.nextInt());
                    gt[indeks++] = telo;
                }; break;
                case 3: {
                    Krogla telo = new Krogla(sc.nextInt());
                    gt[indeks++] = telo;
                }; break;
            }
        }

        Arrays.sort(gt);

        for(int i = 0; i < gt.length; i++){
            System.out.printf("%s%n", gt[i].toString());
            if(gt[i] instanceof Kvader){
                Kvader k = (Kvader)gt[i];
                Kvader.mreza(k.a, k.b, k.c);
            }
            else if(gt[i] instanceof Kocka){
                Kocka k = (Kocka)gt[i];
                Kocka.mreza(k.a, k.a, k.a);
            }
            System.out.printf("======%n");
        }
        sc.close();
    }

    //@Override
    public int compareTo(GeoTelo d){
        if(d instanceof GeoTelo){
            GeoTelo bb = (GeoTelo)d;
            return bb.vol() - this.vol();
        }
        return -1;
    }

    public abstract int vol();
    public abstract int pov();
}