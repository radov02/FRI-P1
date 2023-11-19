import java.util.Scanner;

public class Prestopno {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int leto = sc.nextInt();

        if(leto % 4 == 0 && leto % 100 != 0 || leto % 400 == 0){
            System.out.println("Leto " + leto + " je prestopno.");
        }
        else{
            System.out.println("Leto " + leto + " ni prestopno.");
        }

        sc.close();
    }
}