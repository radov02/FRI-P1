public class Telegram extends Posiljka{
    private int cena;
    public static String tip = "T";

    public Telegram(String naslovnik, String vsebina){
        super(naslovnik, vsebina);
        izracunajCeno();
    }

    private void izracunajCeno(){
        this.cena = T * stCrkVsebine();
    }
    private int stCrkVsebine(){
        String vsebina = this.vsebina;
        int stevec = 0;
        for(int i = 0; i < vsebina.length(); i++){
            char znak = vsebina.charAt(i);
            if(Character.isLetter(znak) && !(znak == '_') && !Character.isDigit(znak)){
                stevec++;
            }
        }
        return stevec;
    }
    public int getCena(){
        return this.cena;
    }
    public String getTip(){
        return tip;
    }
}