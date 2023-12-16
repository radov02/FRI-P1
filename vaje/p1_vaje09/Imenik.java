import java.util.Arrays;

public class Imenik extends Datoteka{

    public static final int METADATA = 256;

    private Datoteka[] datoteke;
    
    public Imenik(String ime, Datoteka[] datoteke){
        super(ime);
        this.datoteke = datoteke;
    }
    public int steviloVecjihSlik(int prag){
        int stevec = 0;
        for(Datoteka d : datoteke){
            if(d instanceof SlikovnaDatoteka){
                SlikovnaDatoteka sd = (SlikovnaDatoteka) d;
                if(sd.jeVelikaVsaj(prag)){
                    stevec++;
                }
            }
        }
        return stevec;
    }

    // REKURZIVNA METODA ZA ISKANJE DATOTEK:
    public String poisci(String ime){
        return poisci(".", ime);
    }
    // iterate method, ki rekurzivno klice samo sebe (parametri za to da z metodo vemo kje smo):
    private String poisci(String trenutnaPot, String ime){
        for(Datoteka d : datoteke){
            if(d.getIme().equals(ime)){ // dodaj ime datoteke trenutni poti
                return trenutnaPot + "/" + d.getIme();
            }
            else if(d instanceof Imenik){   // poisci v podimenikih
                //Imenik podimenik = (Imenik)d;
                String p = ((Imenik)d).poisci(trenutnaPot + "/" + d.getIme(), ime);  // . veze mocneje kot cast
                if(p != null) return p;
            }
        }
        return null;
    }

    // REKURZIVNA METODA ZA IZPIS VSEBINE IMENIKA IN PODIMENIKOV:
    private static final int ODMIK = 4;
    public void izpisi(){    // izpise hierarhijo imenika
        izpisi(0, new char[] {'|'}, this);
    }
    public void izpisi(int odmik, char[] delimeters, Imenik im){
        System.out.println(im.getIme());

        for(int i = 0; i < im.datoteke.length; i++) {
            Datoteka trenutna = im.datoteke[i];

            // ali moram | zamenjati v presledek za trenutni delimeter (zadnji element?)
            if(i == im.datoteke.length - 1){
                delimeters[odmik] = ' ';
            }

            // izpisemo odmike
            for(int j = 0; j < delimeters.length - 1; j++){
                System.out.printf("%c%s", delimeters[j], " ".repeat(ODMIK));    // .repeat() ponovi (da nam ni treba pisati posebne metode)
            }

            System.out.printf("%c-- ", (i == im.datoteke.length - 1) ? '\\':'|');

            if(trenutna instanceof Imenik){
                char[] delims1 = Arrays.copyOf(delimeters, delimeters.length + 1);  // kopira array in vrne novega ki je povecan za drugi argument
                delims1[delimeters.length] = '|';
                izpisi(odmik+1, delims1, (Imenik)trenutna);
            }
            else{
                System.out.printf("%s%n", trenutna.toString());
            }
        }
    }

    @Override
    public int velikost(){
        int velikost = Imenik.METADATA;
        for(Datoteka dat : datoteke){
            velikost += dat.velikost();
        }
        return velikost;
    }

    @Override
    public String opis(){
        return String.format("i %d", this.datoteke.length);
    }

    @Override
    public String toString(){
        return String.format("%s [i %d]", getIme(), this.datoteke.length);
    }
}
