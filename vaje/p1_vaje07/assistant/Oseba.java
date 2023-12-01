/**
 * Razred [Oseba]
 */

public class Oseba {
	
	
	

	/**
	 * Ustvari osebo s podanim imenom, priimekom, spolom, letom rojstva,
	 * ocetom in materjo.
	 */

	public Oseba(String ime, String priimek, char spol, int lr, Oseba oce, Oseba mati) { 
		
	}

	public Oseba(String ime, String priimek, char spol, int lr) {
		
	}

	/**
	 * Vrne ime osebe 'this'. getIme()
	 */

	public String vrniIme() {
		return null;
	}
	
	public void nastaviIme(String novoIme) {
		
	}
	
	/**
	 * Vrne predstavitev osebe 'this' v obliki niza.
	 */
	 
	@Override
	public String toString() {
		return ""; 
	}
 
	/**
	 * Vrne starost osebe v podanem letu.
	 */
	 
	 public int starost(int leto) {
		return -1;
	 }
	 
	/**
	 * Vrne <true> v primeru, ce je dana oseba 'this' starejsa od
	 * osebe 'os'.
	 */
	
	public boolean jeStarejsaOd(Oseba os) {
		return false;
	}
	
	public static Oseba starejsa(Oseba a, Oseba b) {
		return null;
	}
	
	/**
	 * Vrne ime oceta osebe 'this' oz. 'null', ce oce ni znan.
	 */
	 
	public String imeOceta() {
		return null;
	}
	
	/**
	 * Vrne <true> v primeru, ce je oseba 'this' brat ali sestra
	 * osebe 'os'.
	 */
	
	public boolean jeBratAliSestraOd(Oseba os) {
		return false;
	}
	
	/**
	 * Vrne <true> v primeru, ce je oseba 'this' sestra osebe 'os'.
	 */
	
	public boolean jeSestraOd(Oseba os) {
		return false;
	}
	
	/**
	 * Vrne <true> v primeru, ce je oseba 'this' teta osebe 'os'.
	 */
	
	public boolean jeTetaOd(Oseba os) {
		return false;
	}
	
	/**
	 * Vrne <true> v primeru, ce je oseba 'this' ocetovsi prednik
	 * osebe 'os'.
	 */
	
	public boolean jeOcetovskiPrednikOd(Oseba os) {
		return false;
	}
	
	/**
	 * Vrne <true> v primeru, ce je oseba 'this' prednik osebe 'os'.
	 */
	 
	// dodatne metode...
	
	
	public boolean jePrednikOd(Oseba os) {
		return false;
	}
	
	public boolean staVSorodu(Oseba os) {
		return false;
	}
	
	public String druzinskaImena() {
		return "";
	}
}