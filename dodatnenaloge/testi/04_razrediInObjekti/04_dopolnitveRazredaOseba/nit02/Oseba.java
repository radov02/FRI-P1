
public class Oseba {

    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;
    private static int stUstvarjenih = 0;

    public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
        stUstvarjenih++;
    }
    public String vrniIme() {
        return this.ime;
    }
    public void nastaviIme(String novoIme) {
        this.ime = novoIme;
    }
    public String toString() {
        return String.format("%s %s (%c), %d", 
                this.ime, this.priimek, this.spol, this.letoRojstva);
    }
    public int starost(int leto) {
        return (leto - this.letoRojstva);
    }
    public boolean jeStarejsaOd(Oseba os) {
        if (this.letoRojstva < os.letoRojstva) {
            return true;
        } else {
            return false;
        }
        // kraj"se: return (this.letoRojstva < os.letoRojstva);
        // ali: return (this.starost(0) > os.starost(0));
    }
    public String imeOceta() {
        if (this.oce == null) {
            return null;
        }
        return this.oce.ime;
    }
    public boolean jeBratAliSestraOd(Oseba os) {
        return (this != os && this.oce != null && this.mati != null &&
                this.oce == os.oce && this.mati == os.mati);
    }
    public boolean jeSestraOd(Oseba os) {
        return (this.jeBratAliSestraOd(os) && this.spol == 'Z');
    }
    public boolean jeTetaOd(Oseba os) {
        return (os.oce != null && this.jeSestraOd(os.oce) || 
                os.mati != null && this.jeSestraOd(os.mati));
    }
    public boolean jeOcetovskiPrednikOd(Oseba os) {
        Oseba p = os.oce;
        while (p != null && p != this) {
            p = p.oce;
        }
        return (p == this);
    }
    public static int steviloUstvarjenih() {
        return stUstvarjenih;
    }
    private Oseba getOce(){
        return this.oce;
    }
    private Oseba getMati(){
        return this.mati;
    }
    public int ocetovskaGeneracijskaRazlika(Oseba os) {
        if(this == os) return 0;
        if(this.jeOcetovskiPrednikOd(os)){
            Oseba trenutna = os;
            int ocetov = 0;
            while(trenutna != this){
                trenutna = trenutna.getOce();
                ocetov++;
            }
            return ocetov;
        }
        if(os.jeOcetovskiPrednikOd(this)){
            return -os.ocetovskaGeneracijskaRazlika(this);
        }
        throw new IllegalArgumentException();
    }
    public boolean jePrednikOd(Oseba os) {
        if(this != null && os != null && this == os) return true;
        boolean b = false, c = false;
        if(os.getOce() != null){
            b = this.jePrednikOd(os.getOce());
        }
        if(os.getMati() != null){
            c = this.jePrednikOd(os.getMati());
        }
        return b || c;
    }
    public void nastejPrednike() {
        System.out.printf("this: %s%n", this.toString());
        nastejPr("this");
    }
    private String nastejPr(String veriga){
        if(this.getOce() != null){
            String out = veriga + ".oce";
            System.out.printf("%s: %s%n", out, this.getOce());
            this.getOce().nastejPr(out);
        }
        if(this.getMati() != null){
            String out = veriga + ".mati";
            System.out.printf("%s: %s%n", out, this.getMati());
            this.getMati().nastejPr(out);
        }
        return veriga;
    }
    public boolean jeSorodnikOd(Oseba os) {
        boolean a = false, b = false;
        if(this.getOce() != null){
            a = this.getOce().jeSorodnikOd(os);
        }
        if(this.getMati() != null){
            b = this.getMati().jeSorodnikOd(os);
        }
        return a || b || this.jePrednikOd(os);
    }
}
