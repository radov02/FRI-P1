/**
 * Razred knjiznica, ki hrani opravljene transakcije
 */

import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Library {

	private int stClanov;
	private int stNaslovov;
	private int stIzvodovKnjige;
	private int[] zaloga;
	private int[] vsehIzposoj;
	private boolean[][] izposoje;
	
	/** *** */
	
	private static final int LOG_SIZE = 100;
	private Transakcija[] log;
	private int logSize;

	public Library(int stClanov, int stNaslovov, int stIzvodovNaNaslov, Transakcija[] log) {
		this(stClanov, stNaslovov, stIzvodovNaNaslov);
		this.log = log;
		this.logSize = this.log.length;
	}

    public Library(int stClanov, int stNaslovov, int stIzvodovNaNaslov) {
		this.stClanov = stClanov;
		this.stNaslovov = stNaslovov;
		this.stIzvodovKnjige = stIzvodovNaNaslov;
		this.zaloga = new int[this.stNaslovov];
		this.vsehIzposoj = new int[this.stNaslovov];
		for (int i = 0; i < zaloga.length; i++)
			this.zaloga[i] = stIzvodovNaNaslov;
		this.izposoje = new boolean[this.stClanov][this.stNaslovov];
		
		// [log]
		this.log = new Transakcija[Library.LOG_SIZE];
		this.logSize = 0;
    }

    public boolean posodi(int clan, int naslov) {
		if (this.izposoje[clan][naslov] || this.zaloga[naslov] <= 0) {
			// [log]
			writeToLog(clan, naslov, VrstaTransakcije.IZPOSOJA, Status.FAIL);
			return false;
		}
		this.zaloga[naslov]--;
		this.izposoje[clan][naslov] = true;
		this.vsehIzposoj[naslov]++;
		
		// [log]
		writeToLog(clan, naslov, VrstaTransakcije.IZPOSOJA);
        return true;
    }

    public void clanVrne(int clan) {
		for (int iNaslov = 0; iNaslov < izposoje[clan].length; iNaslov++) {
			if (izposoje[clan][iNaslov]) {
				this.zaloga[iNaslov]++;
				this.izposoje[clan][iNaslov] = false;
				
				// [log]
				writeToLog(clan, iNaslov, VrstaTransakcije.VRACILO);
			}
		}
    }

    public int posojeni(int naslov) {
		return (this.stIzvodovKnjige - this.zaloga[naslov]);
    }

    public int priClanu(int clan) {
		int stKnjig = 0;
		for (int iNaslov = 0; iNaslov < izposoje[clan].length; iNaslov++) {
			stKnjig += (izposoje[clan][iNaslov] ? 1 : 0);
		}
        return stKnjig;
    }

    public int najNaslov() {
		int iNajNaslov = 0;
		for (int iNaslov = 1; iNaslov < this.vsehIzposoj.length; iNaslov++) {
			if (vsehIzposoj[iNaslov] > vsehIzposoj[iNajNaslov]) {
				iNajNaslov = iNaslov;
			}	
		}
        return iNajNaslov;
    }
	
	/** *** */
	
	public int posojeniLog(int naslov) {
		int vsota = 0;
		for (int i = 0; i < this.logSize; i++) {
			if (log[i].getNaslov() == naslov && log[i].getStatus().getCode() == 0) {
				if (log[i].getVrsta().getOznaka().equals("I"))
					vsota++;
				else if (log[i].getVrsta().getOznaka().equals("V"))
					vsota--;
			}
		}
		return vsota;
    }
	
	/**
	 * Vrne clana, ki si je zadnji izposodil knjigo. Ce takega clana ni, vrne -1;
	 */
	
	public int zadnjaIzposoja() {
		for (int i = this.logSize - 1; i >= 0; i--) {
			Transakcija t = log[i];
			if (t.getStatus() == Status.OK && t.getVrsta() == VrstaTransakcije.IZPOSOJA) {
				return t.getClan();
			}
		}
		return -1;
	}
	
	/**
	 * Vrne podatke o prvi zakljuceni izposoji v knjiznici. Ce do take izposoje se
	 * ni prislo, vrne null;
	 *
	 * @return 	int[] status uspesnosti izposoje
	 */
	
	public int[] prvaZakljucenaIzposoja() {
		for (int i = 0; i < this.logSize; i++) {
			Transakcija t = log[i];
			if (t.getStatus() == Status.OK && t.getVrsta() == VrstaTransakcije.VRACILO) {
				return new int[] { t.getClan(), t.getNaslov() };
			}
		}
		return null;
	}
	
	/**
	 * Vrne pare zakljucenih izposoj.
	 */
	
	public Par[] vrniZakljuceneIzposoje() {
		List<Par> transakcije = new ArrayList<>();
		boolean[] complete = new boolean[this.logSize];
		for (int i = 0; i < this.logSize; i++) {
			if (complete[i])
				continue;
			Transakcija t1 = log[i];
			if (t1.getStatus() == Status.OK && t1.getVrsta() == VrstaTransakcije.IZPOSOJA) {
				for (int j = i + 1; j < this.logSize; j++) {
					if (complete[j])
						continue;
					Transakcija t2 = log[j];
					if (t1.getClan() == t2.getClan() && t1.getNaslov() == t2.getNaslov()) {
						if (t2.getStatus() == Status.OK && t2.getVrsta() == VrstaTransakcije.VRACILO) {
							Par par = new Par(t1, t2);
							transakcije.add(par);
							complete[i] = true;
							complete[j] = true;
						}
					}
				}
			}
		}
		return transakcije.toArray(new Par[0]);
	}
	
	/**
	 * Vrne podatke o se trajajocih (odprtih) izposojah.
	 */
	
	public Transakcija[] vrniOdprteIzposoje() {
		boolean[] complete = new boolean[this.logSize];
		
		// 1 - poisci in oznaci uspesno zakljucene izposoje
		for (int i = 0; i < this.logSize; i++) {
			if (complete[i])
				continue;
			Transakcija t1 = log[i];
			if (t1.getStatus() == Status.OK && t1.getVrsta() == VrstaTransakcije.IZPOSOJA) {
				for (int j = i + 1; j < this.logSize; j++) {
					if (complete[j])
						continue;
					Transakcija t2 = log[j];
					if (t1.getClan() == t2.getClan() && t1.getNaslov() == t2.getNaslov()) {
						if (t2.getStatus() == Status.OK && t2.getVrsta() == VrstaTransakcije.VRACILO) {
							complete[i] = true;
							complete[j] = true;
						}
					}
				}
			}
		}
		
		// 2 - dodaj nezakljucene, uspesno izvedene transakcije izposoje
		List<Transakcija> transakcije = new ArrayList<>();
		for (int i = 0; i < this.logSize; i++) {
			Transakcija t = log[i];
			if (!complete[i]) {
				if (t.getStatus() == Status.OK)
					transakcije.add(t);
			}
		}
		return transakcije.toArray(new Transakcija[0]);
	}	
	
	/**
	 * Vrne podatke o najdaljsi izposoji gradiva.
	 */	
	
	public String najdaljsaIzposoja() {
		Par[] pari = vrniZakljuceneIzposoje();
		
		int maxDni = -1;
		Transakcija tMaxIzposoja = null;
		Transakcija tMaxVracilo = null;
		
		for (int i = 0; i < pari.length; i++) {
			Par par = pari[i];
			Transakcija t1 = par.getA();
			Transakcija t2 = par.getB();
			
			int razlikaDni = t1.razlikaDni(t2);
			if (razlikaDni > maxDni) {
				maxDni = razlikaDni;
				tMaxIzposoja = t1;
				tMaxVracilo = t2;
			}
		}
		return String.format("C = %d, K = %d; %s -> %s (%d dni)", 
								tMaxIzposoja.getClan(), tMaxIzposoja.getNaslov(), tMaxIzposoja.datum(), tMaxVracilo.datum(), maxDni);
	}
	
	/**
	 * Vrne oznako najbolj strastnega bralca (ki si je izposodil najvec knjig).
	 */
	
	public int[] knjizniMolj() {
		Par[] pari = vrniZakljuceneIzposoje();
		
		int[] izposojClana = new int[stClanov];
		for (Par par : pari) {
			int clan = par.getA().getClan();
			izposojClana[clan - 1]++;
		}
		
		int iMax = 0;
		for (int i = 1; i < izposojClana.length; i++) {
			if (izposojClana[i] > izposojClana[iMax])
				iMax = i;
		}
		return new int[] { iMax, izposojClana[iMax] };
	}
	
	
	/** *** */
	
	private void writeToLog(int clan, int naslov, VrstaTransakcije vrsta) {
		writeToLog(clan, naslov, vrsta, Status.OK);
	}
	
	private void writeToLog(int clan, int naslov, VrstaTransakcije vrsta, Status status) {
		GregorianCalendar datum = new GregorianCalendar();
		Transakcija t = Transakcija.createTransakcija(clan, naslov, vrsta, datum, status);
		if (logSize >= this.log.length)
			this.log = Library.increaseLogSize(this.log);
		this.log[this.logSize++] = t;
	}
	
	public void printLog() {
		System.out.println("-----");
		for (int i = 0; i < this.logSize; i++) {
			System.out.println(this.log[i]);
		}
		System.out.println("-----");
	}
	
	private static Transakcija[] increaseLogSize(Transakcija[] t) {
		Transakcija[] copy = new Transakcija[2 * t.length + 1];
		for (int i = 0; i < t.length; i++)
			copy[i] = t[i];
		return copy;
	}
}
