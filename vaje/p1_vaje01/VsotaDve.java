import java.util.Scanner;

public class VsotaDve {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
		int a = sc.nextInt();
		int b = sc.nextInt();

		int vsota = a + b;

		System.out.println(a + " + " + b + " = " + vsota);

		sc.close();
	}
}