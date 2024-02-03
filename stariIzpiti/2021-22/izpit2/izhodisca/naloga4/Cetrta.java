
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static class Tocka {
        private int x;
        private int y;

        public Tocka(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.x, this.y);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tocka)) {
                return false;
            }
            Tocka druga = (Tocka) obj;
            return this.x == druga.x && this.y == druga.y;
        }

        @Override
        public int hashCode() {
            return 17 * this.x + 31 * this.y;
        }

        public int getX(){
            return this.x;
        }

        public int getY(){
            return this.y;
        }

        public Map<Boolean, List<Tocka>> razdeli(Collection<Tocka> tocke) {

            Map<Boolean, List<Tocka>> slovar = new HashMap<>();
            slovar.put(true, new ArrayList<Tocka>());
            slovar.put(false, new ArrayList<Tocka>());

            for(Tocka t : tocke){
                if(this.x < t.x){
                    slovar.get(true).add(t);
                }
                else{
                    slovar.get(false).add(t);
                }
            }
            return slovar;
        }

        public static Comparator<Tocka> polarno() {
            return (a, b) -> {
                double oddA = Math.sqrt(a.getX()*a.getX() + a.getY()*a.getY());
                double oddB = Math.sqrt(b.getX()*b.getX() + b.getY()*b.getY());
                if(a.getX()*a.getX() + a.getY()*a.getY() != b.getX()*b.getX() + b.getY()*b.getY()) {
                    if(oddA - oddB != 0) return (int)((oddA-oddB)*1000);
                    return 0;
                }
                double pa = izracunajPolarniKot(a);
                double pb = izracunajPolarniKot(b);
                if(pa - pb != 0) return (int)((pa - pb)*1000);
                return 0;
            };
        }

        private static double izracunajPolarniKot(Tocka t){
            double x = t.getX();
            double y = t.getY();

            if(x >= 0){
                if(y >= 0){
                    return Math.atan(Math.abs(y/x));
                }
                else{
                    return 2*Math.PI - Math.atan(Math.abs(y/x));
                }
            }
            else{
                if(y >= 0){
                    return Math.PI - Math.atan(Math.abs(y/x));
                }
                else{
                    return Math.PI + Math.atan(Math.abs(y/x));
                }
            }
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
