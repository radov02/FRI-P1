
/**
 * Objekta tipa avtor nista enaka tudi, ce se ujemata v imenu in priimku.
 */

public class Avtor {
	
	private String ime;
	private String priimek;

	public Avtor(String ime, String priimek) {
		this.ime = ime;
		this.priimek = priimek;
	}
	
	/** ce bi avtorja enacili po enakosti imena in priimka */
	
	/*
	@Override
	public boolean equals(Object o) {
		if (o instanceof Avtor) {
			Avtor other = (Avtor) o;
			return this.ime.equals(other.ime) && 
					this.priimek.equals(other.priimek);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (ime == null ? 0 : ime.hashCode());
		hash = 31 * hash + (priimek == null ? 0 : priimek.hashCode());
		return hash;
	}
	*/	

	@Override
	public String toString() {
		return String.format("%s %s", this.ime, this.priimek);
	}
}
