/**
 * Astroid
 *
 * -- x^(2/3) + y^(2/3) = a^(2/3)
 * -- a -> radij kroga, v katerem risemo astroid
 *
 */

public class DrawAstroid {
	
	private static final int VISINA_RISALNE_PLOSCE = 20;
	private static final int SIRINA_RISALNE_PLOSCE = 38;
	// razmerje med visino in sirino pisave v konzoli
	private static final double STRETCH = 1.9;
	
	private static boolean coordsInsideCircle(double x, double y, double a) {
		double leftSide = x * x  + y * y;
		double rightSide = a * a;
		return (leftSide - rightSide < 0);
	}
	
	private static boolean coordsInsideAstroid(double x, double y, double a) {
		double leftSide = Math.pow(x * x, 1.0 / 3) + Math.pow(y * y, 1.0 / 3);
		double rightSide = Math.pow(a * a, 1.0 / 3);
		return (leftSide - rightSide < 0);
	}
	
	private static void narisiAstroid(int panelHeight, int panelWidth, int a) {
		// vrstice (y)
		for (int y = panelHeight; y >= -panelHeight; y--) {
			// stolpci (x)
			for (int x = -panelWidth; x <= panelWidth; x++) { 
				double xm = x / STRETCH;
			
				boolean leftMinusRight = coordsInsideAstroid(xm, (double)y, a);
				// boolean leftMinusRight = coordsInsideCircle(xm, (double)y, a);
				
				// koordinatne osi
				char znak = '.';
				if (y == 0)
					znak = '-';
				else if (x == 0)
					znak = '|';
				if (x == 0 && y == 0)
					znak = '+';
				// astroid
				if (leftMinusRight)
					znak = '*';
				System.out.printf("%c", znak);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int panelHeight = VISINA_RISALNE_PLOSCE;
		int panelWidth = SIRINA_RISALNE_PLOSCE;
		int astroidA = 15;
		
		narisiAstroid(panelHeight, panelWidth, astroidA);
	}
}

