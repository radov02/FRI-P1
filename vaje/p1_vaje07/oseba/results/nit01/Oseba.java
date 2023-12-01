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
        return (this.letoRojstva < os.letoRojstva);
    }

    public static Oseba starejsa(Oseba a, Oseba b){
        if(a.letoRojstva == b.letoRojstva){
            return null;
        }
        else if(a.letoRojstva < b.letoRojstva)
            return a;
        else 
            return b;
    }

    public String imeOceta(){
        if(this.oce == null){
            return null;
        }
        return this.oce.ime;
    }

    public boolean jeBratAliSestraOd(Oseba os){
        return (this.oce == os.oce && this.mati == os.mati && this != os);
    }

    public boolean jeSestraOd(Oseba os){
        return (this.jeBratAliSestraOd(os) && this.spol == 'Z');
    }

    public boolean jeTetaOd(Oseba os){
        return (this.jeSestraOd(os.oce) || this.jeSestraOd(os.mati));
    }

    public boolean jeOcetovskiPrednikOd(Oseba os){
        Oseba oce = os.oce;

        while(oce != null){
            if(oce == this){
                return true;
            }
            oce = oce.oce;
        }

        if(this.mati != null){
            oce = os.oce;
            while(oce != null){
                if(oce == this){
                    return true;
                }
                oce = mati.oce;
            }
        }

        return false;
    }

    public boolean jeMaterinskiPrednikOd(Oseba os){
        Oseba mati = os.mati;

        while(mati != null){
            if(mati == this){
                return true;
            }
            mati = mati.mati;
        }

        if(this.oce != null){
            mati = os.mati;
            while(mati != null){
                if(mati == this){
                    return true;
                }
                mati = oce.mati;
            }
        }

        return false;
    }

    public boolean jePrednikOd(Oseba os) {
        return (this.jeOcetovskiPrednikOd(os) || this.jeMaterinskiPrednikOd(os));
    }
    
    public boolean staVSorodu(Oseba os) {
        return (this.jeOcetovskiPrednikOd(os) || this.jeMaterinskiPrednikOd(os) || os.jeOcetovskiPrednikOd(this) || os.jeMaterinskiPrednikOd(this));
    }
    
    public String druzinskaImena() {
        
        // navzgor
        if(this.oce == null){
            return this.ime;
        }
        
        return (this.oce.druzinskaImena() + this.mati.druzinskaImena());

        
    }

}
