import java.util.*;

public class Clanek {
	
	private List<Avtor> avtorji;
	private String naslov;
	private int leto;

	public Clanek(List<Avtor> avtorji, String naslov, int leto) {
		this.avtorji = avtorji;
		this.naslov = naslov;
		this.leto = leto;
	}

	public List<Avtor> vrniAvtorje() {
		return this.avtorji;
	}
	
	@Override
	public String toString() {
		String strAvtorji = this.avtorji.toString();
		return String.format("%s: %s (%d)",
					strAvtorji.substring(1, strAvtorji.length() - 1), this.naslov, this.leto);
	}

	
	/**
	 * Vrne primerjalnik, ki primerja podana clanka primarno po "letu objave" (DESC), 
	 * sekundarno pa po naslovu (leksikografsko)
	 */
	public static Comparator<Clanek> poLetuInNaslovu() {
		return (a, b) -> {
			if(a.leto == b.leto){
				return a.naslov.compareTo(b.naslov);
			}
			else{
				return b.leto - a.leto;
			}
		};
	}

	/* public static Comparator<Clanek> poLetuInNaslovu1() {
		// return new PrimerjalnikPoLetuInNaslovu();
		return null;
	} */
		
	/**
	 * Primerjalnik
	 */
	
	/*
	private static class PrimerjalnikPoLetuInNaslovu implements Comparator<Clanek> {
		prublic int compare(Clanek a, Clanek b) {
			if (a.leto != b.leto)
				return b.leto - a.leto;
			return a.naslov.compareTo(b.naslov);
		}
	}
	*/
}
