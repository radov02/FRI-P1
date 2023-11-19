public class Pismo {
    Posta izvorna;
    Posta ciljna;
    boolean priporoceno;
    int razdalja;
    public static int r, c, p;

    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja){
        this.izvorna = izvorna;
        this.ciljna = ciljna;
        this.priporoceno = jePriporoceno;
        this.razdalja = razdalja;
    }

    public String toString(){
        return (this.izvorna.postnaStevilka + " " + this.izvorna.naziv + " -> " + this.ciljna.postnaStevilka + " " + this.ciljna.naziv + " (" + this.razdalja + " km) [" + (this.priporoceno ? "P":"N") + "]");
    }

    public boolean izviraOd(Posta posta){
        return (posta == this.izvorna);
    }

    public boolean staIzvorInCiljIsta(){
        return (this.izvorna == this.ciljna);
    }

    public boolean imaIstiCiljKot(Pismo pismo){
        return (this.ciljna == pismo.ciljna);
    }

    public static boolean imataIstiCilj(Pismo p1, Pismo p2){
        return (p1.ciljna == p2.ciljna);
    }

    public int cena(){
        int cena = 0;

        int i = 1, tmprazdalja = this.razdalja;

        while(tmprazdalja > i*r-1){
            i++;
        }

        cena = i * c;

        if(this.priporoceno){
            cena += p;
        }

        return cena;
    }

    public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCene, int priporocnina){
        r = enotaRazdalje;
        c = enotaCene;
        p = priporocnina;
    }

    public boolean jeDrazjeOd(Pismo pismo){
        return (this.cena() > pismo.cena());
    }

    public static Pismo vrniDrazje(Pismo p1, Pismo p2){
        int c1 = p1.cena();
        int c2 = p2.cena();
        if(c1 > c2) return p1;
        else return p2;
    }

    public Pismo izdelajPovratno(){
        return new Pismo(this.ciljna, this.izvorna, this.priporoceno, this.razdalja);
    }
}
