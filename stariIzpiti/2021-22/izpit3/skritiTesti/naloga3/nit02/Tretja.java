
import java.util.*;

public class Tretja {

    public static class Oddajnik {
        private List<Sprejemnik> sprejemniki;

        public Oddajnik(){
            this.sprejemniki = new ArrayList<>();
        }

        public void dodajSprejemnika(Sprejemnik nov){
            this.sprejemniki.add(nov);
        }
        
        public void oddaj(char znak){
            for(Sprejemnik s : this.sprejemniki){
                s.dodajZnak(znak);
            }
        }
    }

    public static class Sprejemnik {
        private int stZnakov;
        private ArrayList<Character> znaki;
        private Oddajnik oddajnik;
        private int zadnjic;

        public Sprejemnik(Oddajnik oddajnik){
            this.znaki = new ArrayList<>();
            this.oddajnik = oddajnik;
            oddajnik.dodajSprejemnika(this);
            this.stZnakov = this.zadnjic = 0;
        }

        public void dodajZnak(char znak){
            this.znaki.add(znak);
            this.stZnakov++;
        }

        public int koliko(){
            return this.stZnakov;
        }

        public String odZadnjic(){
            String vrni = "";
            for(int i = this.zadnjic; i < znaki.size(); i++){
                vrni += znaki.get(i);
            }
            this.zadnjic = znaki.size();
            return vrni;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
