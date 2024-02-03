
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01-03: razdalja2
04-06: poPredpisih
07-10: najTip
01, 04, 07: ro"cno izdelani
*/

import java.util.*;

public class Tretja {

    //=========================================================================

    public static class Igrisce {
        private Igralo[] igrala;

        public Igrisce(Igralo[] igrala) {
            this.igrala = igrala;
        }

        public boolean poPredpisih() {
            boolean poPred = true;
            zunanja:
            for(int i = 0; i < igrala.length-1; i++){
                for(int j = i+1; j < igrala.length; j++){
                    int minRazdalja = (int)Math.max(this.igrala[i].minRazdalja2(), this.igrala[j].minRazdalja2());
                    int dejanska = this.igrala[i].razdalja2(this.igrala[j]);
                    if(dejanska < minRazdalja){
                        poPred = false;
                        break zunanja;
                    }
                }
            }
            return poPred;
        }

        public int najTip() {
            int[] pogostostTipov = new int[4];
            for(int i = 0; i < this.igrala.length; i++){
                if(this.igrala[i] instanceof Gugalnica) pogostostTipov[0]++;
                else if(this.igrala[i] instanceof Tobogan) pogostostTipov[1]++;
                else if(this.igrala[i] instanceof Plezalo) pogostostTipov[2]++;
                else if(this.igrala[i] instanceof Vzmetnik) pogostostTipov[3]++;
            }
            int najvec = 0;
            for(int i = 1; i < pogostostTipov.length; i++){
                if(pogostostTipov[i] > pogostostTipov[najvec]){
                    najvec = i;
                }
            }
            return najvec;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static abstract class Igralo {
        private int x;
        private int y;

        protected Igralo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return this.x;
        }

        public int getY(){
            return this.y;
        }

        public abstract int minRazdalja2();

        public int razdalja2(Igralo igr) {
            return ((int)Math.pow(this.getX() - igr.getX(), 2) + (int)Math.pow(this.getY() - igr.getY(), 2));
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Gugalnica extends Igralo {
        public Gugalnica(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 200 * 200;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Tobogan extends Igralo {
        public Tobogan(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 150 * 150;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Plezalo extends Igralo {
        public Plezalo(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 130 * 130;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Vzmetnik extends Igralo {
        public Vzmetnik(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 100 * 100;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
