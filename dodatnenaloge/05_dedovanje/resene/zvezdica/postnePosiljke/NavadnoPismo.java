public class NavadnoPismo extends Posiljka{
    private int razdaljaDoNaslovnika;
    private int cena;
    public static String tip = "NP";

    public NavadnoPismo(String naslovnik, String vsebina, int razdaljaDoNaslovnika){
        super(naslovnik, vsebina);
        this.razdaljaDoNaslovnika = razdaljaDoNaslovnika;
        izracunajCeno();
    }
    private void izracunajCeno(){
        this.cena = Z + (this.razdaljaDoNaslovnika / R) * D;
    }
    public int getRazdalja(){
        return this.razdaljaDoNaslovnika;
    }
    public int getCena(){
        return this.cena;
    }
    public String getTip(){
        return tip;
    }
}