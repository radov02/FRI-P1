public abstract class Lik {

    // metodo rabimo samo zato da prevajalnik prevede (da lahko potem uporabimo kazalec tipa Lik: lik.ploscina())
    // samo deklaracija (ni je smiselno definirati - ne moremo računati splošne ploščine likov):
    public abstract double ploscina();

    public abstract double obseg();
    // razed ki ima vsaj eno abstraktno metodo je tudi sam abstrakten

    // da bomo dobili podatke o liku za izpis
    public abstract String vrsta();
    public abstract String podatki();

    public String toString()
    {
        return String.format("%s [%s]", this.vrsta(), this.podatki());
    }

    public static void izpisiPodatke(Lik[] liki){
        for(Lik lik : liki){
            //System.out.printf();
        }
    }

    public static Lik likZNajvecjoPloscino(Lik[] liki){
        Lik najdiLik = null;
        double najPloscina = 0.0;

        for(Lik lik : liki){
            double ploscina = lik.ploscina();
            if(ploscina > najPloscina){
                najPloscina = ploscina;
                najdiLik = lik;
            }
        }

        return najdiLik;
    }

    public static Pravokotnik pravokotnikZNajvecjoSirino(Lik[] liki){
        Pravokotnik naj = null;

        for(Lik lik : liki){
            // if(lik.vrsta().equals("pravokotnik")  || lik.vrsta().equals("kvadrat")){
            //     // ...
            // }

            // p instanceof A (ali je tip objekta, na katerega kaže kazalec p, A ali podtip A)
            // (l instanceof Pravokotnik) <-- true
            if(lik instanceof Pravokotnik){
                // sem pridemo če kazalec lik kaže na objekt tipa Pravokotnik ali Kvadrat
                // if(naj == null || lik.vrniSirino() > naj.vrniSirino()){
                //     // lik.vrniSirino() se ne prevede ker je tip kazalca Lik in ne Pravokotnik
                //     naj = lik;
                //     // naj = lik ne moremo ker prevajalnik ne ve kam kažejo kazalci
                // }

                Pravokotnik p = (Pravokotnik) lik;  // s tem zagotovimo da bo kazalec tipa Pravokotnik (zagotovimo prevajalniku da je lik tipa Pravokotnik)
                // vemo zaradi instanceof, da bo lik vedno Pravokotnik in bo type casting deloval (ne bo ClassCastException)

                if(naj == null || p.vrniSirino() > naj.vrniSirino()){
                    naj = p;
                }
                
            }
        }

        return naj;
    }
    
    public static void main(String[] args){
        
        // Lik l = new Lik(); // ne deluje ker je Lik abstract class
        Lik l = new Pravokotnik(3.0,4.0);
        System.out.println(l.toString());   // kliče se metoda iz razreda PRAVOKOTNIK
        System.out.println(l.ploscina());   // kliče se metoda iz razreda PRAVOKOTNIK
        System.out.println(l.obseg());   // kliče se metoda iz razreda PRAVOKOTNIK

        // for(Lik lik : liki){
        //     System.out.println(lik.toString());
        //     System.out.printf("p = %.1f, o = %.1f", lik.ploscina(), lik.obseg());
        //     System.out.println();
        // }

        Pravokotnik p = new Pravokotnik(1.0, 2.0);
        Kvadrat1 kv = new Kvadrat1(3.0);
        Krog kr = new Krog(4.0);

        Lik li = p;
        Pravokotnik p2 = (Pravokotnik) li;  // pretvorba ima smisel ko je na levi podtip in desni nadtip

        Krog kr2 = (Krog) li;   // prevajalnik prevede (podtip = nadtip)
        // vendar izvajalnik sproži izjemo (ve kam kažejo kazalci), kazalec tipa Krog ne more kazati na Pravokotnik
        // enako za:
        Kvadrat1 kv2 = (Kvadrat1) l;

        // type casting (pretvorba tipa) - ustvari nov kazalec na isti objekt
        // pretvarjamo lahko v podtip ali nadtip kar se tiče prevajalnika, izvajalnik pa lahko sproži izjemo (ClassCastException)


    }
}

class Pravokotnik extends Lik {
    private double sirina;
    private double visina;

    public Pravokotnik(double sirina, double visina){
        this.sirina  = sirina;
        this.visina = visina;
    }

    @Override
    public double ploscina(){
        return this.sirina * this.visina;
    }

    @Override
    public double obseg(){
        return 2.0 * (this.sirina + this.visina);
    }

    @Override
    public String vrsta(){
        return "pravokotnik";
    }

    @Override
    public String podatki(){
        return String.format("širina = %.1f, višina = %.1f", this.sirina, this.visina);
    }

    public double vrniSirino(){
        return this.sirina;
    }
}

class Kvadrat1 extends Pravokotnik {
    // ne potrebujemo nobenih dodatnih atributov (se podedujeta)

    public Kvadrat1(double stranica){
        super(stranica, stranica);
    }

    // ploscina in obseg se dedujeta in ju nima smisla redefinirati, tudi vrniSirino

    @Override
    public String vrsta(){
        return "kvadrat";
    }

    @Override
    public String podatki(){
        return String.format("stranica = %.1f", this.vrniSirino());
    }
}

class Krog extends Lik {
    private double polmer;

    public Krog(double polmer){
        this.polmer = polmer;
    }

    @Override
    public double ploscina(){
        return Math.PI * this.polmer * this.polmer;
    }

    @Override
    public double obseg(){
        return 2.0 * Math.PI * this.polmer;
    }

    @Override
    public String vrsta(){
        return "krog";
    }

    @Override
    public String podatki(){
        return String.format("polmer = %.1f", this.polmer);
    }
}