import java.util.Scanner;

public class VrstaZbor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int vrsta[] = preberiVisine(n, sc);

        boolean nobeden = true;

        for(int j = 1; j < n; j++){
            if(lokalnoPravilno(vrsta, j)){
                nobeden = false;
                System.out.println(j);
            }
        }
        
        if(nobeden) System.out.println("NOBEDEN");

        sc.close();
        
    }

    private static int[] preberiVisine(int n, Scanner sc){
        int vrsta[] = new int[n];
        for(int i = 0; i < n; i++){
            vrsta[i] = sc.nextInt();
        }

        return vrsta;
    }

    public static boolean lokalnoPravilno(int[] vrsta, int j){

        return (j == 0 || vrsta[j - 1] <= vrsta[j]) && 
        (j == vrsta.length - 1 || vrsta[j] <= vrsta[j + 1]);

        // if(j == vrsta.length - 1){
        //     return (vrsta[j] > vrsta[j - 1]);
        // }
        // else if(j == 0){
        //     return (vrsta[j] < vrsta[j+1]);
        // }
        // else {
        //     return (vrsta[j] >= vrsta[j - 1] && vrsta[j] <= vrsta[j + 1]);
        // }
    }
}
