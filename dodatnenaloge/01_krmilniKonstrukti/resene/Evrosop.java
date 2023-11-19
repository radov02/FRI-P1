import java.util.Scanner;

public class Evrosop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int blagajna = 0, en = 0, dva = 0;
        String zaporedje = sc.nextLine();
        boolean bankrot = false;
        
        for(int i = 0; i < zaporedje.length(); i++){
            if(zaporedje.charAt(i) != ' '){
                int placilo = (int)zaporedje.charAt(i) - (int)'0';
                if(placilo == 1){
                    en++;
                    blagajna++;
                }
                else{
                    if(blagajna == 0){
                        bankrot = true;
                        break;
                    }
                    else{
                        en--;
                        blagajna--;
                        dva++;
                    }
                }
            }
        }

        if(bankrot){
            System.out.println("BANKROT");
        }
        else{
            System.out.println(en + "\n" + dva);
        }

        sc.close();
    }
}