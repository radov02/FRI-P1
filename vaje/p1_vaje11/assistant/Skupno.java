import java.util.*;

public class Skupno {

	/**
	 * Uredi podani vektor po narascajocem vrstnem redu glede na "naravno" 
	 * urejanje elementov (selection sort, stable).
	 * Vsi elementi (T) v vektorju morajo implementirati interface Comparable. 
	 */

	public static <T extends Comparable<T>> void uredi(Vektor<T> vektor) {
		int stElementov = vektor.steviloElementov();
		for (int i = 1; i < stElementov; i++) {
			T element = vektor.vrni(i);
			int j = i - 1;
			while (j >= 0 && vektor.vrni(j).compareTo(element) > 0) {
				vektor.nastavi(j + 1, vektor.vrni(j));
				j--;
			}
			vektor.nastavi(j + 1, element);
		}
	}
	
	/**
	 * Uredi podani vektor po vrstnem redu, ki ga doloca podani primerjalnik. 
	 */
	
	public static <T> void uredi(Vektor<T> vektor, Comparator<T> primerjalnik) {
		int stElementov = vektor.steviloElementov();
		for (int i = 1;  i < stElementov;  i++) {
			T element = vektor.vrni(i);
			int j = i - 1;
			while (j >= 0 && primerjalnik.compare(vektor.vrni(j), element) > 0) {
				vektor.nastavi(j + 1, vektor.vrni(j));
				j--;
			}
			vektor.nastavi(j + 1, element);
		}
	}
	
	/**
	 * Vrne maksimalni element podanega vektorja glede na "naravni" vrstni red urejanja elementov.
	 * Vsi elementi (T) v vektorju morajo implementirati interface Comparable. 
	 */
	
	public static <T extends Object & Comparable<? super T>> T max(Vektor<? extends T> vektor) {
		int stElementov = vektor.steviloElementov();
		if (stElementov == 0)
			return null;
		T maxElement = vektor.vrni(0);
		for (int i = 1; i < stElementov; i++) {
			T element = vektor.vrni(i);
			// element - maxElement = + --> element je vecji
			if (element.compareTo(maxElement) > 0)
				maxElement = element;
		}
		return maxElement;
	}
	
	/**
	 * Vrne maksimalni element podanega vektorja glede na vrstni red, ki ga doloca podani primerjalnik.
	 *
	 * @param vektor zbirka elementov
	 * @param primerjalnik primerjalnik elementov
	 * @return maksimalni element glede na podan primerjalnik.
	 */	
	
	public static <T> T max(Vektor<? extends T> vektor, Comparator<? super T> primerjalnik) {
		int stElementov = vektor.steviloElementov();
		if (stElementov == 0)
			return null;
		T maxElement = vektor.vrni(0);
		for (int i = 1; i < stElementov; i++) {
			T element = vektor.vrni(i);
			// element - maxElement = + --> element je vecji
			if (primerjalnik.compare(element, maxElement) > 0)
				maxElement = element;
		}
		return maxElement;		
	}	
	
	
	// 3
	
	public static <T> Comparator<T> kompozitum(Comparator<T> prim1, Comparator<T> prim2) {

		// return new SestavljenPrimerjalnik(prim1, prim2);
		return new SestavljenPrimerjalnik<T>(prim1, prim2);	// bolj razumljiv zapis generika kot v prejšnji vrstici
		/* return new Comparator<T>(){
			@Override
			public int compare(T a, T b) {
				int primerj1 = prim1.compare(a, b);
				return (primerj1 == 0) ? prim2.compare(a, b) : primerj1;
			}
		}; */
		/* return (prvi, drugi) -> {
			int primerj1 = prim1.compare(prvi, drugi);
			return (primerj1 == 0) ? prim2.compare(prvi, drugi) : primerj1;
		}; */
	}
	
	/**
	 * Primerjalniki (nested static)
	 */

	private static class SestavljenPrimerjalnik<T> implements Comparator<T> {
		
		private Comparator<T> prvi;
		private Comparator<T> drugi;
		
		public SestavljenPrimerjalnik(Comparator<T> prvi, Comparator<T> drugi) {
			this.prvi = prvi;
			this.drugi = drugi;
		}
		
		@Override
		public int compare(T a, T b) {
			int prim1 = this.prvi.compare(a, b);
			return (prim1 == 0) ? this.drugi.compare(a, b) : prim1;
		}
	}

	
	
	
	
	public static <T> Comparator<T> obratno(Comparator<T> primerjalnik) {
		return new Obrat<T>(primerjalnik);
	}
	
	/** 
	 * Primerjalnik za obrat obstojecega primerjalnika 
	 */
	
	private static class Obrat<T> implements Comparator<T> {
	
		private Comparator<T> original;

		public Obrat(Comparator<T> original) {
			this.original = original;
		}
		
		@Override
		public int compare(T a, T b) {
			return - this.original.compare(a, b);
		}
	}	
}
