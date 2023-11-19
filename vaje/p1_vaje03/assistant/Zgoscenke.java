import java.util.Scanner;

public class Zgoscenke {
	
	// n - stevilo zgoscenk
	// capacity - velikost CD-ja v EP
	// fileSize - velikost datoteke v EP
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int capacity = sc.nextInt(); 
		
		int stCD = 1;
		int zasedenost = 0;
		
		while ((stCD <= n) && sc.hasNextInt()) {
			int fileSize = sc.nextInt();
			if (fileSize + zasedenost > capacity) {
				// ni dovolj prostora --> zamenjaj CD
				stCD++;
				zasedenost = fileSize;
			} else {
				// pisemo na obstojeci CD
				zasedenost += fileSize;
			}
			
			if (stCD <= n)
				System.out.printf("%d EP -> zgoscenka %d (%d EP)%n", 
								fileSize, stCD, zasedenost);
		}
		
		/*
		while (sc.hasNextInt()) {
			int fileSize = sc.nextInt();
			if (fileSize + zasedenost > capacity) {
				// ni dovolj prostora --> zamenjaj CD
				stCD++;
				zasedenost = fileSize;
			} else {
				// pisemo na obstojeci CD
				zasedenost += fileSize;
			}
			
			if (stCD > n)
				break;
			
			System.out.printf("%d EP -> zgoscenka %d (%d EP)%n", 
								fileSize, stCD, zasedenost);
		}
		*/
	}
}