import java.util.Scanner;

public class NajblizjiElement {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int minrazlika = Math.abs(sc.nextInt() - k), index = 0;

        for(int i = 1; i < n; i++){
            int nov = sc.nextInt();
            int razlika = Math.abs(nov - k);

            if(razlika < minrazlika){
                minrazlika = razlika;
                index = i;
            }
        }

        System.out.println(index);

        sc.close();
    }
}