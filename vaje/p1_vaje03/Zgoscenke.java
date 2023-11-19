import java.util.Scanner;

public class Zgoscenke {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int i = 0, podatkovNaZgoscenki = 0;
        while(i <= n && sc.hasNextInt()){

            int nalozi = sc.nextInt();

            if(podatkovNaZgoscenki + nalozi > k){
                i++;
                podatkovNaZgoscenki = nalozi;
            }
            else{
                podatkovNaZgoscenki += nalozi;
            }

            if(i <= n)
                System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", nalozi, i+1, podatkovNaZgoscenki);
        
        }
        
        /*int i = 0, podatkovNaZgoscenki = 0;
        while(sc.hasNextInt()){

            int nalozi = sc.nextInt();

            if(podatkovNaZgoscenki + nalozi > k){
                i++;
                podatkovNaZgoscenki = nalozi;
            }
            else{
                podatkovNaZgoscenki += nalozi;
            }

            if(i >= n) break;

            System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", nalozi, i+1, podatkovNaZgoscenki);
        
        }*/

        sc.close();
    }
}
