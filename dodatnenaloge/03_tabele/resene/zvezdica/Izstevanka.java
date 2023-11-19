import java.util.Scanner;

public class Izstevanka {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        String imena[] = new String[n+1];
        String nova[];

        for (int i = 1; i <= n; i++) {
            imena[i] = sc.next();
        }

        int tmpn = n;

        while (tmpn > 1) {

            int izpadli;
            if(b % tmpn == 0){
                izpadli = tmpn;
            }
            else{
                izpadli = (b % tmpn);
            }
            
            System.out.println(imena[izpadli]);
            imena[izpadli] = "izpadel";

            nova = new String[tmpn];
            int j = 1;
            for(int i = 1; i <= tmpn; i++){
                if(imena[i] != "izpadel"){
                    nova[j++] = imena[i];
                }
            }

            imena = nova;
            tmpn--;
        }

        sc.close();
    }
}