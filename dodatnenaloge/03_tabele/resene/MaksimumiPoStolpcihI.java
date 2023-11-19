package resene;
import java.util.Arrays;
import java.util.Scanner;

public class MaksimumiPoStolpcihI {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int s = sc.nextInt();

        int maksimalni[] = new int[s];
        for(int i = 0; i < v; i++){
            for(int j = 0; j < s; j++){
                int el = sc.nextInt();
                if(i == 0) {
                    maksimalni[j] = el;
                }
                else if(el > maksimalni[j]){
                    maksimalni[j] = el;
                }
            }
        }

        System.out.println(Arrays.toString(maksimalni));

        sc.close();
    }
}