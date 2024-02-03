
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static class Tocka {
        private double x;
        private double y;

        public Tocka(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double vrniX() {
            return this.x;
        }

        public double vrniY() {
            return this.y;
        }
    }

    public static class Najdba {
        private String najditelj;
        private int cas;

        public Najdba(String najditelj, int cas) {
            this.najditelj = najditelj;
            this.cas = cas;
        }

        public String vrniNajditelja() {
            return this.najditelj;
        }

        public int vrniCas() {
            return this.cas;
        }
    }

    public static class Zaklad {
        private String id;
        private Tocka polozaj;
        private Najdba[] najdbe;

        public Zaklad(String id, Tocka polozaj, Najdba[] najdbe) {
            this.id = id;
            this.polozaj = polozaj;
            this.najdbe = najdbe;
        }

        public Tocka vrniPolozaj() {
            return this.polozaj;
        }

        public Najdba[] vrniNajdbe() {
            return this.najdbe;
        }

        public String[] najditelji() {
            String[] imena = new String[this.najdbe.length];
            for(int i = 0; i < this.najdbe.length; i++){
                imena[i] = najdbe[i].vrniNajditelja();
            }
            return imena;
        }

        public int vrniNajkasnejsoNajdbo(){
            if(this.najdbe.length == 0) return -1;
            int cas = this.najdbe[0].vrniCas();
            for(Najdba n : this.najdbe){
                if(n.vrniCas() < cas){
                    cas = n.vrniCas();
                }
            }
            return cas;
        }

        @Override
        public String toString() {
            return this.id;
        }
    }

    public static class Geolov {
        private Zaklad[] zakladi;

        public Geolov(Zaklad[] zakladi) {
            this.zakladi = zakladi;
        }

        public Zaklad[] vrniZaklade() {
            return this.zakladi;
        }

        public double pot(Tocka zacetna) {
            Tocka zac = zacetna;
            double razdalja = 0;
            for(int i = 0; i < this.zakladi.length; i++){
                Tocka naslednja = this.zakladi[i].vrniPolozaj();
                razdalja += Math.sqrt(Math.pow((zac.vrniX() - naslednja.vrniX()), 2) + Math.pow((zac.vrniY() - naslednja.vrniY()), 2));
                zac = naslednja;
            }
            return razdalja + Math.sqrt(Math.pow((zacetna.vrniX() - this.zakladi[this.zakladi.length-1].vrniPolozaj().vrniX()), 2) + Math.pow((zacetna.vrniY() - this.zakladi[this.zakladi.length-1].vrniPolozaj().vrniY()), 2));
        }

        public Zaklad nazadnjeOdkrit() {
            if(zakladi.length == 0) return null;
            Zaklad zadnji = this.zakladi[0];
            for(Zaklad z : this.zakladi){
                if(z.vrniNajkasnejsoNajdbo() != -1 && zadnji.vrniNajkasnejsoNajdbo() < z.vrniNajkasnejsoNajdbo()){
                    zadnji = z;
                }
            }
            return zadnji;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
