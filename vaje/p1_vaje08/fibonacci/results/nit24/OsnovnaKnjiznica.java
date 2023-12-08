import java.util.Arrays;

public class OsnovnaKnjiznica {
    private int stIzvodovNaNaslov;
    private int[][] clani;
    private int[] knjige;
    private int[] frekvencaIzposoj;

    public OsnovnaKnjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov){
        this.stIzvodovNaNaslov = stIzvodovNaNaslov;
        this.clani = new int[stClanov][stNaslovov];
        this.frekvencaIzposoj = new int[stNaslovov];
        this.knjige = new int[stNaslovov];
        Arrays.fill(knjige, stIzvodovNaNaslov);
    }

    public boolean posodi(int clan, int naslov){
        if(this.knjige[naslov] > 0){
            if(this.clani[clan][naslov] != 1){
                this.clani[clan][naslov] = 1;
                this.knjige[naslov]--;
                this.frekvencaIzposoj[naslov]++;
                return true;
            }
        }
        return false;
    }

    public void clanVrne(int clan){
        for(int i = 0; i < this.clani[clan].length; i++){
            if(this.clani[clan][i] > 0){
                this.knjige[i]++;
                this.clani[clan][i]--;
            }
        }
    }

    public int posojeni(int naslov){
        return (this.stIzvodovNaNaslov - this.knjige[naslov]);
    }

    public int priClanu(int clan){
        int stevilo = 0;
        for(int naslov : this.clani[clan]){
            if(naslov == 1) stevilo++;
        }
        return stevilo;
    }

    public int najNaslov(){
        int naj = 0;
        for(int i = 1; i < this.frekvencaIzposoj.length; i++){
            if(this.frekvencaIzposoj[naj] < this.frekvencaIzposoj[i]){
                naj = i;
            }
        }
        return naj;
    }

}
