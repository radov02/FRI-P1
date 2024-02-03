import java.util.*;

public class Glavni {

	/**
	 * Seznam clankov uredi po padajocih letih objave, clanke, objavljene
	 * v istem letu, pa po naslovih.
	 *
	 * @param clanki	seznam clankov 
	 */

	// (1)

	public static void urediPoLetuInNaslovu(List<Clanek> clanki) {
		clanki.sort(Clanek.poLetuInNaslovu());
	}
	
	public static Set<Avtor> vsiAvtorji(Collection<Clanek> clanki) {
		Set<Avtor> avtorji = new HashSet<>();
		for(Clanek clanek : clanki){
			avtorji.addAll(clanek.vrniAvtorje());
		}
		return avtorji;
	}

	/**
	 * Vrne slovar, ki vsakemu avtorju dodeli seznam vseh clankov, pri 
	 * katerih ta avtor nastopa.
	 *
	 * @param clanki	zbirka clankov
	 * @return 			slovar avtor:pripadajoci clanki.
	 */

	public static Map<Avtor, List<Clanek>> clankiPoAvtorjih(Collection<Clanek> clanki) {
		
		Map<Avtor, List<Clanek>> avtor2clanek = new HashMap<>();

		Set<Avtor> avtorji = vsiAvtorji(clanki);
		for(Avtor avtor : avtorji){
			List<Clanek> clankiAvtorja = new ArrayList<>();
			for(Clanek clanek : clanki){
				if(clanek.vrniAvtorje().contains(avtor)){
					clankiAvtorja.add(clanek);
				}
			}
			clankiAvtorja.sort(Clanek.poLetuInNaslovu());
			avtor2clanek.put(avtor, clankiAvtorja);
		}
		
		return avtor2clanek;
	}
	
	public static Avtor najplodnejsiAvtor(Collection<Clanek> clanki) {

		Map<Avtor, List<Clanek>> avtor2clanki = clankiPoAvtorjih(clanki);

		// Set<Avtor> avtorji = Glavni.vsiAvtorji(clanki);
		Set<Avtor> avtorji = avtor2clanki.keySet();

		Avtor najboljsi = Collections.max(avtorji, (a, b) -> {
			return avtor2clanki.get(a).size() - avtor2clanki.get(b).size();
		});
		return najboljsi;
	}
	
	
	// klasika
	
	public static Avtor najplodnejsiAvtor1(Collection<Clanek> clanki) {
		return null;
	}
	
	
	/**
	 * [Primerjalnik]
	 */

	public static class PrimPoSteviluClankov implements Comparator<Avtor> {
		
		private Map<Avtor, List<Clanek>> avtor2clanki;
		
		public PrimPoSteviluClankov(Map<Avtor, List<Clanek>> avtor2clanki) {
			this.avtor2clanki = avtor2clanki;
		}
		
		@Override
		public int compare(Avtor a, Avtor b) {
			int stClankovPrvega = avtor2clanki.get(a).size();
			int stClankovDrugega = avtor2clanki.get(b).size();
			return stClankovPrvega - stClankovDrugega;
		}
	} 
	
	
}
