public class Oseba {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva,
        Oseba oce, Oseba mati){
            this(ime, priimek, spol, letoRojstva);
            this.oce = oce;
            this.mati = mati;
    }

    public Oseba(String ime, String priimek, char spol, int lr) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = lr;
    }

    public String vrniIme(){
        return this.ime;
    }

    public void nastaviIme(String novoIme) {
        if(novoIme == null || novoIme.length() < 2){
            return;
        }
        this.ime = novoIme;
    }

    @Override
    public String toString(){
        return String.format("%s %s (%c), %d", this.ime, this.priimek, this.spol, this.letoRojstva);
    }

    public int starost(int leto){
        return (leto - this.letoRojstva);
    }

    public boolean jeStarejsaOd(Oseba os){
        // LAHKO DOSTOPAMO DO PRIVATNIH ATRIBUTOV ČE JE ISTI RAZRED
        return (this.letoRojstva < os.letoRojstva);
    }

    public static Oseba starejsa(Oseba a, Oseba b){
        if(b.jeStarejsaOd(a)){
            return b;
        }
        else if(a.jeStarejsaOd(b))
            return a;
        else 
            return null;
    }

    public String imeOceta(){
        if(this.oce == null){
            return null;
        }
        return this.oce.ime;
    }

    public boolean jeBratAliSestraOd(Oseba os){
        return (this.oce == os.oce && this.mati == os.mati && this != os && this.oce != null && this.mati != null);
    }

    public boolean jeSestraOd(Oseba os){
        return (this.jeBratAliSestraOd(os) && this.spol == 'Z');
    }

    public boolean jeTetaOd(Oseba os){
        return (this.jeSestraOd(os.oce) && os.oce != null || this.jeSestraOd(os.mati) && os.mati != null);
    }

    public boolean jeOcetovskiPrednikOd(Oseba os){
        Oseba o = os.oce;

        while(o != this && o != null){
            o = o.oce;
        }

        return o == this;
    }

    public boolean jePrednikOd(Oseba os) {
        
        if(os == null) return false;
        if(os == this) return true;
        
        return this.jePrednikOd(os.oce) || this.jePrednikOd(os.mati);
    }

    public boolean staVSorodu(Oseba os) {
        
        
    }
    
    public String druzinskaImena() {
        
        

        
    }

}
