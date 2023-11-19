import java.util.Scanner;

public class Metaprogram {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int presledki = 1;

        System.out.println("public class Nizi {\n    public static void main(String[] args) {");
        for(int i = 1; i <= n; i++){
            presledki++;
            for(int j = 0; j < presledki*4; j++){
                System.out.print(" ");
            }
            System.out.println("for (char c" + i + " = 'A';  c" + i + " <= 'Z';  c" + i + "++) {");
        }
        presledki++;
        for(int j = 0; j < presledki*4; j++){
            System.out.print(" ");
        }
        System.out.print("System.out.println(\"\"");
        for(int i = 1; i <= n; i++){
            System.out.print(" + c" + i);
        }
        System.out.println(");");
        presledki--;
        for(int i = 0; i < n + 2; i++){
            for(int j = 0; j < presledki*4; j++){
                System.out.print(" ");
            }
            System.out.println("}");
            presledki--;
        }

        sc.close();
    }
}