import java.util.Scanner;

public class DN10_63230273{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] tipiStolpcev = new int[n];
        for(int i = 0; i < tipiStolpcev.length; i++){
            tipiStolpcev[i] = sc.nextInt();
        }
        int stKriterijev = sc.nextInt();
        int[] kriteriji = new int[stKriterijev];
        for(int i = 0; i < kriteriji.length; i++){
            kriteriji[i] = sc.nextInt();
        }

        Preglednica p = new Preglednica(m, n, tipiStolpcev, kriteriji);

        Object[] a = {"Ana", "Vidmar", 3, "Kamnik", "ne"};
        p.dodajVrstico(a);
        Object[] b = {"Marija", "Krajnc", 3, "Koper", "da"};
        p.dodajVrstico(b);

        System.out.println(p);
        

        sc.close();
    }
}