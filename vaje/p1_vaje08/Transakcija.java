import java.util.Calendar;
import java.util.GregorianCalendar;

public class Transakcija {
    private int clan;
    private int naslov;
    private VrstaTransakcije vrstaTransakcije;
    private GregorianCalendar datum;
    private Status status;

    // privatni konstruktor, ki je klican iz drugih public metod:
    private Transakcija(int clan, int naslov, VrstaTransakcije vrstaTransakcije, GregorianCalendar gc, Status status){
        this.clan = clan;
        this.naslov = naslov;
        this.vrstaTransakcije = vrstaTransakcije;
        this.datum = gc;
        this.status = status;
    }

    // javna metoda za kreiranje transakcij (s tem omogocimo preverjanje vnosa):
    public static Transakcija ustvariTransakcijo(int clan, int naslov, VrstaTransakcije vrstaTransakcije, GregorianCalendar gc, Status status){
        if(clan < 0 || naslov < 0 || vrstaTransakcije == null || gc == null){
            return null;
        }
        return new Transakcija(clan, naslov, vrstaTransakcije, gc, status);
    }

    // getterji za privatne lastnosti:
    public int getClan(){
        return this.clan;
    }
    public int getNaslov(){
        return this.naslov;
    }
    public VrstaTransakcije getVrstaTransakcije(){
        return this.vrstaTransakcije;
    }
    public String getDatumString(){
        return String.format("%d.%d.%d", datum.get(Calendar.DAY_OF_MONTH), datum.get(Calendar.MONTH) + 1, datum.get(Calendar.YEAR));
    }
    public Status getStatus(){
        return this.status;
    }

    // vrne razliko v dnevih med transakcijama "this" in "transakcija"
    public int razlikaDni(Transakcija transakcija){
        long razlikaDni = (transakcija.datum.getTimeInMillis() - this.datum.getTimeInMillis()) / (1000L * 60 * 60 * 24);
        return (int)razlikaDni;
    }

    // izpis transakcije:
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("C = %d, K = %d, [", clan, naslov));
        sb.append(vrstaTransakcije.getOznaka());
        sb.append("], ");
        sb.append(this.getDatumString());
        sb.append(String.format("[%s]", this.status.getVrednost()));
        return sb.toString();
    }
}
