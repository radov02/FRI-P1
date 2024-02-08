public class Ucenec{
    private String ime;
    private String priimek;
    public static int m;
    private Krozek[] vclanjenV;
    private int indeks = 0;

    public static void nastaviMaksObremenitev(int maksObremenitev){
        m = maksObremenitev;
    }
    public Ucenec(String ime, String priimek){
        this.ime = ime;
        this.priimek = priimek;
        this.vclanjenV = new Krozek[m];
        this.indeks = 0;
    }
    public String vrniIP(){
        return String.format("%s %s", this.ime, this.priimek);
    }
    public boolean vclani(Krozek krozek){
        for(Krozek k : this.vclanjenV){
            if(k == krozek){
                return true;    // ze vpisan
            }
        }
        if(this.indeks < m-1 && krozek.steviloClanov() < krozek.getKvota()-1 && this.OKtermin(krozek)){
            this.vclanjenV[indeks++] = krozek;
            return krozek.vclani(this);
        }
        return false;
    }
    private boolean OKtermin(Krozek k){
        for(int i = 0; i < this.indeks; i++){
            if(!(this.vclanjenV[i].getDan() != k.getDan() || (this.vclanjenV[i].getDan() == k.getDan() && (this.vclanjenV[i].getUra() >= k.getUra()+2 || this.vclanjenV[i].getUra()+2 <= k.getUra())))){
                return false;
            }
        }
        return true;
    }
    public void izclani(Krozek krozek){
        for(int i = 0; i < this.indeks; i++){
            if(this.vclanjenV[i] == krozek){
                for(int j = i; j < this.indeks-1; j++){
                    this.vclanjenV[j] = this.vclanjenV[j+1];
                }
                this.indeks--;
                krozek.izclani(this);
            }
        }
    }
    public int steviloKrozkov(){
        int stevec = 0;
        for(int i = 0; i < this.vclanjenV.length; i++){
            if(this.vclanjenV[i] != null){
                stevec++;
            }
        }
        return stevec;
    }
}