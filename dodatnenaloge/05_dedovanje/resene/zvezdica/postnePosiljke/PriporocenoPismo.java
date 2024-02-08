public class PriporocenoPismo extends Posiljka {
    private int razdaljaDoNaslovnika;
    protected String posiljatelj;
    private int cena;
    public static String tip = "PP";

    public PriporocenoPismo(String naslovnik, String vsebina, int razdaljaDoNaslovnika, String posiljatelj){
        super(naslovnik, vsebina);
        this.razdaljaDoNaslovnika = razdaljaDoNaslovnika;
        this.posiljatelj = posiljatelj;
        izracunajCeno();
    }
    private void izracunajCeno(){
        this.cena = P * (Z + (this.razdaljaDoNaslovnika / R) * D);
    }
    public int getRazdalja(){
        return this.razdaljaDoNaslovnika;
    }
    public int getCena(){
        return this.cena;
    }
    public String getPosiljatelj(){
        return this.posiljatelj;
    }
    public String getTip(){
        return tip;
    }
}