public class Oseba {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva,
        Oseba oce, Oseba mati){
            this.ime = ime;
            this.priimek = priimek;
            this.spol = spol;
            this.letoRojstva = letoRojstva;
            this.oce = oce;
            this.mati = mati;
    }

    public String vrniIme(){
        return this.ime;
    }

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
        return (this.oce == os.oce && this.mati == os.mati && this.spol == 'Z');
    }

    public boolean jeTetaOd(Oseba os){
        return (this.jeSestraOd(os.oce) || this.jeSestraOd(os.mati));
        //return (this.spol == 'Z' && (this.oce == os.oce.oce && this.mati == os.oce.mati || this.oce == os.mati.oce && this.mati == os.mati.mati));
    }

    public boolean jeOcetovskiPrednikOd(Oseba os){
        Oseba oce = os.oce;
        boolean thisJeOce = false;

        while(oce != null){
            if(oce == this){
                thisJeOce = true;
            }
            oce = oce.oce;
        }

        return thisJeOce;
    }
}
