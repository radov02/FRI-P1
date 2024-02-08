
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02, 03: ro"cno izdelani (in manj"si)
04--10: samodejno izdelani (in ve"cji)

Primeri 01, 02 in 03 vsebujejo isti dnevnik, razlikujejo se le po klicih metod.

01, 04--05: steviloMalicarjev
02, 06--07: kolikoRekreacije
03, 08--10: prisotnost
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
    }

    public abstract static class Dogodek {
        private int oseba;
        private Cas cas;
        private boolean odhod;

        protected Dogodek(int oseba, Cas cas, boolean odhod) {
            this.oseba = oseba;
            this.cas = cas;
            this.odhod = odhod;
        }

        public int vrniOsebo() {
            return this.oseba;
        }

        public Cas vrniCas() {
            return this.cas;
        }

        public boolean jeOdhod() {
            return this.odhod;
        }
    }

    public static class Malica extends Dogodek {
        public Malica(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Rekreacija extends Dogodek {
        public Rekreacija(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class SluzbenaPot extends Dogodek {
        public SluzbenaPot(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Dnevnik {
        private int stZaposlenih;
        private Dogodek[] dogodki;

        public Dnevnik(int stZaposlenih, Dogodek[] dogodki) {
            this.stZaposlenih = stZaposlenih;
            this.dogodki = dogodki;
        }

        public int steviloMalicarjev() {
            int stevec = 0;
            for(int i = 0; i < dogodki.length; i++){
                if(dogodki[i].jeOdhod() && dogodki[i] instanceof Malica){
                    stevec++;
                }
            }
            return stevec;
        }

        public int kolikoRekreacije(int oseba) {
            int skupno = 0;
            for(int i = 0; i < dogodki.length; i++){
                if(dogodki[i].vrniOsebo() == oseba && dogodki[i].jeOdhod() && dogodki[i] instanceof Rekreacija){
                    for(int j = i; j < dogodki.length; j++){
                        if(dogodki[j].vrniOsebo() == oseba && !dogodki[j].jeOdhod() && dogodki[i] instanceof Rekreacija){
                            skupno += dogodki[j].vrniCas().razlikaVMin(dogodki[i].vrniCas());
                            i += (j-i);
                            break;
                        }
                    }
                }
            }
            return skupno;
        }

        public boolean[] prisotnost(Cas cas) {
            boolean[] prisoten = new boolean[stZaposlenih];
            for(int k = 0; k < stZaposlenih; k++){
                prisoten[k] = true;
                for(int i = 0; i < dogodki.length; i++){
                    if(dogodki[i].vrniOsebo() == k && dogodki[i].jeOdhod()){
                        for(int j = i; j < dogodki.length; j++){
                            if(dogodki[j].vrniOsebo() == k && !dogodki[j].jeOdhod()){
                                if((dogodki[i].vrniCas().vrniUro()*60 + dogodki[i].vrniCas().vrniMinuto()) <= (cas.vrniUro()*60 + cas.vrniMinuto()) && (cas.vrniUro()*60 + cas.vrniMinuto()) < (dogodki[j].vrniCas().vrniUro()*60 + dogodki[j].vrniCas().vrniMinuto())){
                                    prisoten[k] = false;
                                    i += (j-i);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            
            return prisoten;
        }
    }
}
