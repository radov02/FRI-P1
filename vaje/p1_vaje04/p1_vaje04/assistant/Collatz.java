import java.util.Scanner;

public class Collatz {
	
	/**
	 * Vrne dolzino Collatzovega zapopredja, ki izhaja iz 
	 * podanega stevila.
	 */
	
	private static int dolzinaZaporedja(int stevilo) {
		int dolzina = 1;
		while (stevilo > 1) {
			if (stevilo % 2 == 0)
				stevilo /= 2;
			else
				stevilo = 3 * stevilo + 1;
			dolzina++;
		}
		return dolzina;
	}
	
	// rekurzivna razlicica
	
	private static int collatz(int stevilo) {
		if (stevilo == 1)
			return 1;
		if (stevilo % 2 == 0) {
			System.out.print("-");
			int rezRek = collatz(stevilo / 2);
			System.out.print("." + stevilo);
			return 1 + rezRek;
		} else {
			System.out.print("-");
			int rezRek = collatz(3 * stevilo + 1);
			System.out.print("," + stevilo);
			return 1 + rezRek;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int spMeja = sc.nextInt();
		int zgMeja = sc.nextInt();
		
		int najDolzina = 0;
		int najStevilo = 0;
		
		// int value = collatz(10);
		// System.out.println(value);
		// if (0 == 0)
		// 	return;
		
		for (int stevilo = spMeja; stevilo <= zgMeja; stevilo++) {
			int dolzina = dolzinaZaporedja(stevilo);
			// int dolzina = collatz(stevilo);
			
			if (dolzina > najDolzina) {
				najDolzina = dolzina;
				najStevilo = stevilo;
			}
		}
		System.out.println(najStevilo);
		System.out.println(najDolzina);
		
	}
}