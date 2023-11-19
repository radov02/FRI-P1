import java.util.Scanner;

public class EratostenovoReseto {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        boolean[] sest = reseto(n);

        for(int i = 0; i < sest.length; i++){
            if(sest[i])
                System.out.print(sest[i]);
        }

        sc.close();

    }

    private static boolean[] reseto(int n)
    {
        boolean[] sestavljeno = new boolean[n + 1];

        for(int i = 2; i*i <= n; i++){
            for(int j = i*i; i <= n; j += i){
                sestavljeno[j] = true;
            }

            do{
                i++;
            } while(i*i <= n && sestavljeno[i]);
        }
        return sestavljeno;
    }
}
