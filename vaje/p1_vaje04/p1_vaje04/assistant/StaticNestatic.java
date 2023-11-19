public class StaticNestatic {
	
	private int a; 
	
	private static void doIt() {
		System.out.println("staticna");
	}
	
	private void izpisi() {
		System.out.printf("vrednost: %d%n", a);
	}
	
	public static void main(String[] args) {
		doIt();
		StaticNestatic primer = new StaticNestatic();
		primer.izpisi();
	}
}