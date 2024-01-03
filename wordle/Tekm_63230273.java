
import java.util.*;

//
// Primer stroja za igro Wordle. Stroj vzdržuje množico slovarskih besed, ki
// so združljive z vsemi dosedanjimi omejitvami, in vsakokrat izbere ``prvo''
// besedo iz množice (tj. tisto, ki jo vrne iterator ob prvem klicu metode
// next).
//

public class Tekm_63230273 implements Stroj {

    private Set<String> izhodiscneBesede;   // izhodiščna množica besed (nastavi se ob inicializaciji, potem pa se ne spreminja)
    private Set<String> besede; // množica besed, ki še ustreza omejitvam
    private String zadnjaIzbira; // nazadnje izbrana beseda 

    @Override
    public void inicializiraj(Set<String> besede) { // Nastavi izhodiščno množico besed.
        this.izhodiscneBesede = new TreeSet<>(besede);
    }

    @Override   // Na podlagi podanega odziva na prejšnjo izbiro vrne naslednjo izbiro.
    public String poteza(List<Character> odziv) {   // odziv seznam npr. ['+', 'o', '-']

        if (odziv == null) {
            // Prva ``poteza'': ponastavi množico besed.
            this.besede = new TreeSet<>(this.izhodiscneBesede);

        } else {
            if (vseEnako(odziv, '+')) { // Konec, naša zadnja izbira je bila pravilna!
                return null;
            }

            if (this.besede.isEmpty()) { // Množica besed je prazna, kljub temu da besede še nismo uganili.
                throw new RuntimeException("Nekaj močno smrdi!");
            }

            // Iz množice odstranimo vse besede, ki niso združljive z odzivom na zadnjo izbiro.
            Set<String> besedeZaOdstranitev = new TreeSet<>();
            for (String beseda: this.besede) {
                if (!jeZdruzljiva(beseda, this.zadnjaIzbira, odziv)) {
                    besedeZaOdstranitev.add(beseda);
                }
            }
            this.besede.removeAll(besedeZaOdstranitev);
        }

        if(odziv == null){   // Vsota: 69470 Povpre?je: 4,3517
            return this.zadnjaIzbira = "seoina";
        }
        return this.zadnjaIzbira = this.besede.iterator().next();   // vrne neko besedo iz mnozice se ustreznih besed (prvo, ki jo vrne iterator)
        // Vsota: 80856 Povpre?je: 5,0649
    }

    // <izbira> je neka nakljucna beseda iz prejsnje mnozice ustreznic, na katero smo ze dobili odziv
    // <izbira> je povezana z <odziv> saj slednji podaja pravilnost znakov v <izbira>
    // ce je <beseda> zdruzljiva z odzivom na <izbiro> vrnemo true
    // IZBIRA POTREBUJEMO ZA PRIMERJAVO ZNAKOV (v odzivu so le: +-o)
    private static boolean jeZdruzljiva(String beseda, String izbira, List<Character> odziv) {
        int n = odziv.size();

        List<Character> crkeBesede = new ArrayList<>(); // sezname lahko spreminjamo za razliko od Stringov
        List<Character> crkeIzbire = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            crkeBesede.add(beseda.charAt(i));
            crkeIzbire.add(izbira.charAt(i));
        }

        // odzivi '+'
        for (int i = 0; i < n; i++) {
            // ce je odziv pri i '+', se mora <beseda> pri i ujemati z <izbira> pri i
            if (odziv.get(i) == '+') {
                if (crkeBesede.get(i) != crkeIzbire.get(i)) {
                    return false;
                }

                // Označimo, da smo ta položaj že pregledali
                // (to je pomembno za pravilno obravnavo odzivov 'o').
                crkeBesede.set(i, '#');
                crkeIzbire.set(i, '_');
            }
        }

        // odzivi 'o'
        // Preverimo, ali za vse i-je, pri katerih je odziv[i] == 'o',
        // velja, da <beseda> vsebuje črko izbira[i], a ne na indeksu <i>.
        // Vsako tako črko beseda <izbira> je treba povezati z eno samo črko
        // besede <beseda>.
        for (int ixIzbira = 0; ixIzbira < n; ixIzbira++) {

            if (odziv.get(ixIzbira) == 'o') {
                char crka = crkeIzbire.get(ixIzbira);
                int ixBeseda = crkeBesede.indexOf(crka);    // vrne indeks zeljene crke
                if (ixBeseda < 0 || crkeBesede.get(ixIzbira) == crka) { // ta indeks ne sme biti enak kot v <izbira>
                    return false;
                }

                // Označimo, da smo pripadajoča položaja že pregledali.
                crkeBesede.set(ixBeseda, '#');
                crkeIzbire.set(ixIzbira, '_');
            }
        }

        // odzivi '-'
        for (int i = 0; i < n; i++) {
            // <beseda> ne sme vsebovati crk z odzivom '-'
            if (odziv.get(i) == '-' && crkeBesede.indexOf(crkeIzbire.get(i)) >= 0) {
                return false;
            }
        }

        return true;
    }

    // Vrne true natanko v primeru, če so vsi elementi v <seznam> enaki <element>
    private static <T> boolean vseEnako(List<T> seznam, T element) {
        return seznam.stream().allMatch(e -> e.equals(element));
    }
}



class Node<T> {
    private T podatki;
    private List<Node<T>> potomci = new ArrayList<Node<T>>();
    private Node<T> stars;

    public Node(T podatki){
        this.podatki = podatki;
    }

    public Node(Node<T> stars, T podatki){
        this(podatki);
        this.stars = stars;
    }

    public List<Node<T>> pridobiPotomce(){
        return potomci;
    }

    public void setStars(Node<T> stars){
        this.stars = stars;
        stars.dodajPotomca(this);
    }

    public void dodajPotomca(T podatki){
        Node<T> potomec = new Node<T>(this, podatki);
        this.potomci.add(potomec);
    }

    public void dodajPotomca(Node<T> potomec){
        potomec.setStars(this);
        this.potomci.add(potomec);
    }

    public T getPodatki(){
        return this.podatki;
    }

    public void setPodatki(T podatki){
        this.podatki = podatki;
    }

    public boolean jeKoren(){
        return this.stars == null;
    }

    public boolean jeList(){
        return this.potomci == null;
    }

    public void odstraniStarsa(){
        this.stars == null;
    }
}