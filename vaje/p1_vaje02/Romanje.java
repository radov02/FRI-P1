import java.util.Scanner;

public class Romanje {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pot = sc.nextInt();
        int prehodiPrviDan = sc.nextInt();
        int zmanjsanje = sc.nextInt();
		int i = 1;
        
        while(pot > 0 && prehodiPrviDan > 0) {
			
			System.out.print(i + ": " + pot);
			
			if(pot - prehodiPrviDan < 0) {
				pot = 0;
			}
			else{
				pot -= prehodiPrviDan;
			}
			
			prehodiPrviDan -= zmanjsanje;
			
			System.out.printf(" -> %d\n", pot);
			i++;
		}
        
		sc.close();
    }
}