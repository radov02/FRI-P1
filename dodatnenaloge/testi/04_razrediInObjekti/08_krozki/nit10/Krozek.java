public class Krozek{
    private String naziv;
    private int dan;
    private int ura;
    private int kvota;
    private Ucenec[] clani;
    private int indeks;

    public Krozek(String naziv, int dan, int ura, int kvota){
        this.naziv = naziv;
        this.dan = dan;
        this.ura = ura;
        this.kvota = kvota;
        clani = new Ucenec[kvota];
        indeks = 0;
    }
    public String vrniNaziv(){
        return this.naziv;
    }
    public int steviloClanov(){
        return indeks;
    }
    public int getKvota(){
        return this.kvota;
    }
    public int getDan(){
        return this.dan;
    }
    public int getUra(){
        return this.ura;
    }
    public boolean vclani(Ucenec u){
        if(this.indeks < this.clani.length-1){
            this.clani[indeks++] = u;
            return true;
        }
        return false;
    }
    public boolean izclani(Ucenec u){
        for(int i = 0; i < this.indeks; i++){
            if(this.clani[i] == u){
                for(int j = i; j < this.indeks-1; j++){
                    this.clani[j] = this.clani[j+1];
                }
                indeks--;
                return true;
            }
        }
        return false;
    }
}