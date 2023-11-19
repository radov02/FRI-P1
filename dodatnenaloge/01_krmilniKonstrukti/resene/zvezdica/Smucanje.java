package zvezdica;
import java.util.Scanner;

public class Smucanje {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rez[] = new int[n];

        for(int i = 0; i < n; i++){
            int prvi = sc.nextInt(), drugi = 0;
            if(prvi != 0){
                drugi = sc.nextInt();
            }

            if(prvi == 0 || drugi == 0){
                rez[i] = -1;
            }
            else{
                rez[i] = prvi + drugi;
            }
        }

        int min = -1;
        for(int i = 0; i < n; i++){
            if(rez[i] != -1 && (min == -1 || rez[i] < rez[min])){
                min = i;
            }
        }

        if(min == -1){
            System.out.println("NIHCE");
        }
        else{
            System.out.println((min + 1) + "\n" + rez[min]);
        }

        sc.close();
    }
}