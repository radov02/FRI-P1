public abstract class Posiljka{
    protected String naslovnik;
    protected String vsebina;
    protected static int Z;
    protected static int R;
    protected static int D;
    protected static int P;
    protected static int T;

    public Posiljka(String naslovnik, String vsebina){
        this.naslovnik = naslovnik;
        this.vsebina = vsebina;
    }
    public String getNaslovnik(){
        return this.naslovnik;
    }
    public String getVsebina(){
        return this.vsebina;
    }

    public abstract int getCena(); 
}