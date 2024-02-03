
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode zamenjaj
06--10: preverjanje implementacije vmesnika Iterable<T>
01--03, 06--08: ro"cno izdelani
*/

import java.util.*;

public class Cetrta {   // NE DELA

    public static class Miks<T> implements Iterable<T>{
        private List<T> seznam;
        private Set<T> mnozica;

        public Miks(List<T> seznam, Set<T> mnozica) {
            this.seznam = seznam;
            this.mnozica = mnozica;
        }

        @Override
        public String toString() {
            return String.format("%s | %s", this.seznam, this.mnozica);
        }

        public List<T> vrniSeznam() {
            return this.seznam;
        }

        public Set<T> vrniMnozico() {
            return this.mnozica;
        }

        public void zamenjaj() {
            Set<T> tmp;
            if(this.mnozica instanceof HashSet)
                tmp = new HashSet<>();
            else
                tmp = new TreeSet<>();

            for(int i = 0; i < this.seznam.size(); i++){
                tmp.add(this.seznam.get(i));
            }

            T[] elementiMnozice = (T[]) new Object[this.mnozica.size()];
            int k = 0;
            for(T element : this.mnozica){
                elementiMnozice[k++] = element;
            }
            this.seznam.clear();
            for(int i = 0; i < elementiMnozice.length; i++){
                this.seznam.add(elementiMnozice[i]);
            }

            this.mnozica = tmp;
        }

        @Override
        public Iterator<T> iterator(){
            return new Iterator<T>(){
                @Override
                public boolean hasNext(){
                    return (seznam.iterator().hasNext() || mnozica.iterator().hasNext());
                }

                @Override
                public T next(){
                    if(seznam.iterator().hasNext()){
                        return seznam.iterator().next();
                    }
                    return mnozica.iterator().next();
                }
            };
        }
    }

    //=========================================================================

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
