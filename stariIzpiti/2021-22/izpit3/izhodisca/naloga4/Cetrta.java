
import java.util.*;

public class Cetrta {

    public static class Avtomat {   // NE DELA
        private String zacetnoStanje;
        private Set<String> sprejemnaStanja;
        private Map<String, Map<Character, String>> prehodi;

        public Avtomat(String zacetnoStanje, Set<String> sprejemnaStanja,
                Map<String, Map<Character, String>> prehodi) {
            this.zacetnoStanje = zacetnoStanje;
            this.sprejemnaStanja = sprejemnaStanja;
            this.prehodi = prehodi;
        }

        public String vrniZacetnoStanje() {
            return this.zacetnoStanje;
        }

        public Set<String> vrniSprejemnaStanja() {
            return this.sprejemnaStanja;
        }

        public Map<String, Map<Character, String>> vrniPrehode() {
            return this.prehodi;
        }

        public boolean jeSprejemno(String stanje) {
            return this.sprejemnaStanja.contains(stanje);
        }

        public String kam(String beseda) {
            String stanje = this.zacetnoStanje;
            char crka = ' ';
            for(int i = 0; i < beseda.length(); i++){
                crka = beseda.charAt(i);
                stanje = this.prehodi.get(stanje).get(crka);
                if(stanje == null){
                    return null;
                }
            }
            return stanje;
        }

        public static Avtomat zaBesedo(String beseda) {
            String zacetnoStanje = "q0";
            Set<String> sprejemnaStanja = new HashSet<>();
            sprejemnaStanja.add(String.format("q%d", beseda.length()));  // samo zadnje
            List<String> stanja = new ArrayList<>();
            for(int i = 1; i < beseda.length(); i++){
                stanja.add(String.format("q%d", i));
            }
            Map<String, Map<Character, String>> prehodi = new HashMap<>();
            for(int i = 0; i < stanja.size()-1; i++){
                Map<Character, String> crka2stanje = new HashMap<>();
                crka2stanje.put(beseda.charAt(i), stanja.get(i+1));
                prehodi.put(stanja.get(i), crka2stanje);
            }
            prehodi.put(stanja.get(stanja.size()-1), null);
            
            return new Avtomat(zacetnoStanje, sprejemnaStanja, prehodi);
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
