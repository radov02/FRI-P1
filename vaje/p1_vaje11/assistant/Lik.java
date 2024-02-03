import java.util.*;


// public abstract class Lik implements Comparable
public abstract class Lik implements Comparable<Lik> {

	public abstract int ploscina();

	public abstract int obseg();
	

	/** 
	 * Vrne vrsto lika <this> (npr. "pravokotnik").
	 */
	
	public abstract String vrsta();

    /**
	 * Vrne niz s podatki o liku <this> (npr. "sirina = 3.0, visina = 4.0").
	 */
	 
	public abstract String podatki();
	
	public abstract int tip();
	
	// 4
	
	public static void urediPoTipuInObsegu(Vektor<Lik> vektor) {
		Skupno.uredi(vektor, Skupno.kompozitum(poTipu(), poObsegu()));
		// Skupno.<Lik>uredi(vektor, Skupno.<Lik>kompozitum(poTipu(), poObsegu()));
	}
	
	
	// 5 - dodatno za studente, ki koncajo prej...
	
	public static Lik vrniKrogZMinimalnimObsegom(Vektor<Lik> vektor) {
		Comparator<Lik> primerjalnik = Skupno.kompozitum(poTipu(), Skupno.obratno(poObsegu()));
		return Skupno.max(vektor, primerjalnik);
	}	
	
	// 1
	
	/**
	 * interface Comparable<T> 
	 * int compareTo(T o)	 
	 * -- primerjava objekta z drugimi objekti istega tipa
	 * -- doloca "naravni" vrstni red urejanja
	 */
	 
	/* @Override
	public int compareTo(Object o) {
		if (o instanceof Lik) {
			Lik other = (Lik) o;
			return this.ploscina() - other.ploscina();
		}
		return -1;
	} */
	

	@Override
	public int compareTo(Lik other) {
		// ASC: prvi - drugi
		return this.ploscina() - other.ploscina();
	}
	
	

	/**
	 * Ce zelimo drugacen vrstni red urejanja, kreiramo ustrezen primerjalnik.
	 */

	// 2.1, 2.2

	public static Comparator<Lik> poObsegu() {
		return new PrimerjalnikPoObsegu();
		/*
		return new Comparator<Lik>() {
			@Override
			public int compare(Lik a, Lik b) {
				return a.obseg() - b.obseg();
			}
		};
		return (Lik a, Lik b) -> a.obseg() - b.obseg();
		*/
	}
	
	public static Comparator<Lik> poTipu() {
		return new PrimerjalnikPoTipu();
	}
	
	public static void izpisi(Vektor<Lik> vektor) {
		int stElementov = vektor.steviloElementov();
		for (int i = 0; i < stElementov; i++) {
			Lik lik = vektor.vrni(i);
			System.out.printf("%s | p = %d | o = %d%n", lik.toString(), lik.ploscina(), lik.obseg());
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s [%s]", this.vrsta(), this.podatki());
	}	
	
	/**
	 * Primerjalniki (nested static)
	 */
	
	public static class PrimerjalnikPoObsegu implements Comparator<Lik> {
		
		@Override
		public int compare(Lik a, Lik b) {
			return a.obseg() - b.obseg();
		}
	}
	
	public static class PrimerjalnikPoTipu implements Comparator<Lik> {
		
		@Override
		public int compare(Lik a, Lik b) {
			// pravokotnik (1) < kvadrat (2) < krog (3)
			return a.tip() - b.tip();
		}
	}
}
