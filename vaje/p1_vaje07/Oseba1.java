public class Oseba1 {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba1 oce;
    private Oseba1 mati;

    public Oseba1(String ime, String priimek, char spol, int letoRojstva,
        Oseba1 oce, Oseba1 mati){
            this(ime, priimek, spol, letoRojstva);
            this.oce = oce;
            this.mati = mati;
    }
    public Oseba1(String ime, String priimek, char spol, int lr) {
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
    public boolean jeStarejsaOd(Oseba1 os){
        // LAHKO DOSTOPAMO DO PRIVATNIH ATRIBUTOV ČE JE ISTI RAZRED
        return (this.letoRojstva < os.letoRojstva);
    }
    public static Oseba1 starejsa(Oseba1 a, Oseba1 b){
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
    public boolean jeBratAliSestraOd(Oseba1 os){
        return (this.oce == os.oce && this.mati == os.mati && this != os && this.oce != null && this.mati != null);
    }
    public boolean jeSestraOd(Oseba1 os){
        return (this.jeBratAliSestraOd(os) && this.spol == 'Z');
    }
    public boolean jeTetaOd(Oseba1 os){
        return (this.jeSestraOd(os.oce) && os.oce != null || this.jeSestraOd(os.mati) && os.mati != null);
    }
    public boolean jeOcetovskiPrednikOd(Oseba1 os){
        Oseba1 o = os.oce;

        while(o != this && o != null){
            o = o.oce;
        }

        return o == this;
    }
    
    // rekurzija:
    public boolean jePrednikOd(Oseba1 os) {
        
        if(os == null) return false;
        if(os == this) return true;
        
        return this.jePrednikOd(os.oce) || this.jePrednikOd(os.mati);
    }

    public Oseba1 oce(){
        return this.oce;
    }
    public Oseba1 mati(){
        return this.mati;
    }

    public boolean staVSorodu(Oseba1 os) {
        
        // if(this.oce().jePrednikOd(os)) return true;
        // if(this.mati().jePrednikOd(os)) return true;
        if(this.oce() == null && this.mati() == null) return false;

        return (this.oce().jePrednikOd(os) || this.mati().jePrednikOd(os));
    }
    
    // public String druzinskaImena() {
        
        

        
    // }

}
