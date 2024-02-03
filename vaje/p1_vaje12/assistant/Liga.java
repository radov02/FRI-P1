import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Liga {

	private Collection<String> klubi;
	private Collection<Tekma> tekme;

	public Liga(Collection<String> klubi, Collection<Tekma> tekme) {
		this.klubi = klubi;
		this.tekme = tekme;
	}
	
	/**
	 * Vrne stevilo tock podanega kluba.
	 * @param klub ime kluba
	 */
	 
	public int steviloTock(String klub) {
		int stTock = 0;
		/*
		for (Tekma tekma : this.tekme)
			stTock += tekma.steviloTock(klub);
		*/
		/*
		Iterator<Tekma> it = tekme.iterator();
		while (it.hasNext())
			stTock += it.next().steviloTock(klub);
		*/
		for (Iterator<Tekma> it = tekme.iterator(); it.hasNext(); )
			stTock += it.next().steviloTock(klub);
		return stTock;
	}

	/**
	 * Vrne slovar, ki preslika ime kluba v stevilo njegovih tock v tej ligi.
	 * @return slovar { key:klub, value:tocke } 
	 */

	public Slovar<String, Integer> klub2tocke() {
		Slovar<String, Integer> k2t = new Slovar<>();
		for (String klub : this.klubi) {
			// <K, V>
			k2t.shrani(klub,  steviloTock(klub));
		}
		return k2t;
	}

	/**
	 * Vrne seznam klubov, padajoce urejen po dosezenih tockah 
	 * (klubi z istim stevilom tock so urejeni leksikografsko).
	 * @return seznam klubov 
	 */
	 
	public List<String> lestvica() {
		Slovar<String, Integer> k2t = klub2tocke();
		// uporabimo konstrukor ArrayList(Collection<? extends E>)
		List<String> seznamKlubov = new ArrayList<>(this.klubi);
		// v.1
		seznamKlubov.sort(new PrimerjalnikPoTockah(k2t));
		/*
		seznamKlubov.sort(new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				int diffTocke = k2t.vrni(b) - k2t.vrni(a);
				return (diffTocke == 0) ? a.compareTo(b) : diffTocke;
			}
		});
		*/
		/*
		seznamKlubov.sort( (a, b) ->  (k2t.vrni(b) - k2t.vrni(a) == 0) ? 
									a.compareTo(b) : k2t.vrni(b) - k2t.vrni(a)
		);
		*/
		// v.2
		// Collections.sort(seznamKlubov, new PrimerjalnikPoTockah(k2t));
		return seznamKlubov;
	}
	
	/**
	 * Vrne iterator po tekmah, pri katerih je razlika v golih >= minGR.
	 * @param minGR 	minimalna razlika v golih
	 * @return 		iterator po tekmah
	 */
	
	public Iterator<Tekma> poTekmah(int minGR) {
		return new IteratorPoTekmah(this.tekme, minGR);
	}
	
	/**
	 * [Comparator] po tockah
	 *
	 * kluba najprej primerja po tockah, nato pa se po imenih
	 */
	
	private static class PrimerjalnikPoTockah implements Comparator<String> {
		
		private Slovar<String, Integer> klub2tocke;
		
		public PrimerjalnikPoTockah(Slovar<String, Integer> klub2tocke) {
			this.klub2tocke = klub2tocke;
		}
		
		@Override
		public int compare(String a, String b) {
			// DESC: tocke, ASC: imena
			int diffTocke = klub2tocke.vrni(b) - klub2tocke.vrni(a);
			return (diffTocke == 0) ? a.compareTo(b) : diffTocke;
		}
	}
	
	
	/**
	 * [Iterator] po tekmah
	 *
	 * Objekt tega razreda je iterator, ki se sprehodi po tekmah, pri katerih je  
	 * razlika v golih najmanj enaka podani spodnji meji.
	 */
	
	private static class IteratorPoTekmah implements Iterator<Tekma> {
		
		// obstojeci iterator po vseh tekmah
		private Iterator<Tekma> iterator;
		private int minGolRazlika;
		private Tekma nextMatch;
		
		public IteratorPoTekmah(Collection<Tekma> tekme, int minGR) {
			this.iterator = tekme.iterator();
			this.minGolRazlika = minGR;
			this.nextMatch = poisciNaslednjoTekmo();
		}
		
		// vrne naslednjo tekmo, ki ustreza pogoju, oz. null, ce ne obstaja
		
		private Tekma poisciNaslednjoTekmo() {
			while (iterator.hasNext()) {
				Tekma tekma = iterator.next();
				if (tekma.golRazlika() >= this.minGolRazlika)
					return tekma;
			}
			return null;
		}
		
		@Override
		public boolean hasNext() {
			return this.nextMatch != null;
		}
		
		@Override
		public Tekma next() {
			// 1 - ce ni elementa, vrnemo izjemo
			if (!hasNext())
				throw new NoSuchElementException();
			// 2 - pripravimo novo tekmo in vrni sedanjo...
			Tekma tekma = nextMatch;
			this.nextMatch = poisciNaslednjoTekmo();
			return tekma;
		}
	}
}