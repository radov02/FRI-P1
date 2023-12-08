import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Knjiznica {

    private int stClanov;
    private int stNaslovov;
    private int stIzvodovKnjige;
    private int[] zalogaKnjig;
    private int[] stetjeVsehIzposoj;
    private boolean[][] izposoje;   // clani in katere knjige imajo izposojene
    // log:
    private static final int LOG_SIZE = 100;
    private Transakcija[] log;
    private int currentLogSize;


    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov){
        this.stClanov = stClanov;
        this.stNaslovov = stNaslovov;
        this.stIzvodovKnjige = stIzvodovNaNaslov;
        this.zalogaKnjig = new int[this.stNaslovov];
        Arrays.fill(zalogaKnjig, stIzvodovNaNaslov);
        this.stetjeVsehIzposoj = new int[this.stNaslovov];
        this.izposoje = new boolean[this.stClanov][this.stNaslovov];
    }
    
    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov, Transakcija[] log){
        this(stClanov, stNaslovov, stIzvodovNaNaslov);
        this.log = log;
        this.currentLogSize = this.log.length;
    }


    public boolean posodi(int clan, int naslov){
        if(this.zalogaKnjig[naslov] > 0 && !this.izposoje[clan][naslov]){
            this.zalogaKnjig[naslov]--;
            this.izposoje[clan][naslov] = true;
            this.stetjeVsehIzposoj[naslov]++;
        }
    }

    public void clanVrne(int clan){

    }

    public int posojeni(int naslov){

    }

    public int priClanu(int clan){

    }

    public int najNaslov(){

    }

    public int posojeniLog(int naslov){

    }

    public int zadnjaIzposoja(){

    }

    public int[] prvaZakljucenaIzposoja(){

    }

    public Par[] vrniZakljuceneIzposoje(){

    }

    public Transakcija[] vrniOdprteIzposoje(){

    }

    public String najdaljsaIzposoja(){

    }

    public int[] knjizniMolj(){

    }

    // metode za log:
    private static void writeToLog(int clan, int naslov, )
}


public enum VrstaTransakcije{
    NAKUP("+", "nakup");
}