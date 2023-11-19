import java.util.Scanner;

public class Stevke {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		long st = sc.nextLong();
		
		//odDesne(st);
		//odLeve1(st);
		odLeve2(st);
		
		sc.close();
        
    }
	
	public static void odDesne(long s) {
		while(s > 0) {
			int stevka = 0;
			System.out.println(s % 10);
			s /= 10;
		}
	}
	
	public static void odLeve1(long s) {
		int exp = (int)Math.log10(s);
		
		while(exp >= 0) {
			int stevka = (int)(s / Math.pow(10, exp));
			System.out.println(stevka);
			s -= stevka * Math.pow(10, exp);
			exp--;
		}
		
	}
	
	public static void odLeve2(long s) {
		long novo = 0;
		
		while(s > 0) {
			int stevka = (int)(s % 10);
			novo = 10 * novo + stevka;
			s /= 10;
		}
		
		System.out.println(novo);
	}
}