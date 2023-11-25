public class Volitve {

	//  izidi[stevilo let][stevilo strank][stevilo volisc]
	
	/**
	 * Vrne skupno stevilo glasov, ki jih je v podanem letu prejela 
	 * stranka.
	 */
	 
	public static int steviloGlasov(int[][][] t, int leto, int stranka) {
		int stGlasov = 0;
		for (int volisce = 0; volisce < t[leto][stranka].length; volisce++)
			stGlasov += t[leto][stranka][volisce];
		return stGlasov;
	}

	/**	
	 * Za leto in stranko izracuna stevilo glasov, ki jih je stranka
	 * prejela v tistem letu.
	 *
	 * @param t	izidi volitev za vso butalsko zgodovino
	 * @return	tabela[leto][stranka]
	 */

	public static int[][] glasovi(int[][][] t) {
		int[][] gls = new int[t.length][t[0].length];
		for (int leto = 0; leto < t.length; leto++) {
			for (int stranka = 0; stranka < t[leto].length; stranka++) {
				gls[leto][stranka] = steviloGlasov(t, leto, stranka);
			}
		}
		return gls;
	}
	
	/**
	 * Vrne indeks volisca, na katerem je stranka v skupnem sestevku 
	 * preko vseh let prejela najvec glasov.
	 *
	 * @param t	izidi volitev za vso butalsko zgodovino
	 * @param stranka	stranka, ki nas zanima
	 * @return	indeks volisca
	 */	

	public static int najVolisce(int[][][] t, int stranka) {
		int stVolisc = t[0][stranka].length;
		int vNajVolisce = 0;
		int iNajVolisce = 0;
		
		for (int volisce = 0; volisce < stVolisc; volisce++) {
			int sumVolisce = 0;
			for (int leto = 0; leto < t.length; leto++) {
				sumVolisce += t[leto][stranka][volisce];
			}
			if (sumVolisce > vNajVolisce) {
				vNajVolisce = sumVolisce;
				iNajVolisce = volisce;
			}
		}
		return iNajVolisce;
	}

	/**
	 * Izracuna vsoto uvrstitev, ki jih je stranka dosegla na voliscu.
	 *
	 * @param t			izidi volitev za vso butalsko zgodovino
	 * @param stranka	stranka, ki nas zanima
	 * @param volisce 	volisce, za katerega racunamo uvrstitev
	 * @return			vsota uvrstitev
	 */

	public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
		// volilni indeks, indeks uspesnosti stranke
		int volivniIndeks = 0;
		for (int leto = 0; leto < t.length; leto++) {
			int uvrstitevVLetu = 1;
			for (int s = 0; s < t[leto].length; s++) {
				if (t[leto][s][volisce] > t[leto][stranka][volisce])
					uvrstitevVLetu++;
			}
			volivniIndeks += uvrstitevVLetu;
		}
		return volivniIndeks;
	}
	
	/*
	private static void izpisi(int[][] t) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.printf("%5d", t[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// za rocno testiranje ...
		
		int[][] t = new int[5][];
		for (int i = 0; i < t.length; i++) {
			t[i] = new int[i + 1];
			for (int j = 0; j < t[i].length; j++)
				t[i][j] = i + j + 1;
		}
		izpisi(t);
	}
	*/
}
