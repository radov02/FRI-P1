import java.util.Scanner;

public class TelefonskiImenik {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[][] imenik = new String[n][];

        sc.nextLine();
        for(int i = 0; i < n; i++){
            String vrstica = sc.nextLine();
            imenik[i] = vrstica.split(" ");
        }

        int k = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < k; i++){
            String ime = sc.nextLine();
            int index = -1;
            for(int j = imenik.length - 1; j >= 0; j--){
                // METODA EQUALS!!!
                if(imenik[j][0].equals(ime)){
                    System.out.println(imenik[j][1]);
                    index = j;
                    break;
                }
            }

            if(index == -1){
                System.out.println("NEZNANA");
            }
        }

        sc.close();
    }
}