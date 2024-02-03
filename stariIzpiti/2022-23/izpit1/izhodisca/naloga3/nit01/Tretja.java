
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01..03: toString
04..06: equals
07..10: hashCode

01, 04, 07: ročno izdelani; isti podatki v vseh treh razredih
*/

import java.util.*;

public class Tretja {

    public static class Tablica {
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;

        public Tablica(char[] kraj, int stevilo, boolean zacasna) {
            this.kraj = new char[]{kraj[0], kraj[1]};
            this.stevilo = stevilo;
            this.zacasna = zacasna;
        }

        public String getKraj(){
            return (this.kraj[0] + "" + this.kraj[1]);
        }

        public int getStevilo(){
            return this.stevilo;
        }
        
        public boolean getZacasna(){
            return this.zacasna;
        }

        @Override
        public String toString(){
            int desniStevki = this.stevilo % 100;
            int leviStevki = this.stevilo / 100;
            return String.format("%c%c %d-%d", this.kraj[0], this.kraj[1], leviStevki, desniStevki);
        }

        @Override
        public boolean equals(Object obj){
            if(!(obj instanceof Tablica)) return false;
            Tablica ob = (Tablica) obj;
            return ((this.getKraj().equals(ob.getKraj())) && (this.getStevilo() == ob.getStevilo()) && (this.getZacasna() == ob.getZacasna()));
        }

        @Override
        public int hashCode(){
            return 17*Integer.hashCode((int)this.kraj[0]) + 89*Integer.hashCode((int)this.kraj[1]) + 31*Integer.hashCode(this.stevilo) + 53*(this.zacasna ? 1:0);
        }
    }
}
