/**
 * Razred [Inverz], ki predstavlja inverz zaporedja na intervalu
 */
 
public class Inverz extends Zaporedje {
	
	private Zaporedje zaporedje;
	private Interval interval;
	
	public Inverz(Zaporedje zaporedje, Interval interval) {
		this.zaporedje = zaporedje;
		this.interval = interval;
	}
	
	@Override
	public Integer y(int x) {
		int zacetek = interval.vrniZacetek();
		int konec = interval.vrniKonec();

		for (int i = zacetek; i <= konec; i++) {
			Integer y = zaporedje.y(i);
			if (y != null) {
				if (y == x)
					return i;
			}
		}
		return null;
	}
}
