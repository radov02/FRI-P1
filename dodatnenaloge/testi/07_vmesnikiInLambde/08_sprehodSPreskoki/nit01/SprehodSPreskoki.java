import java.util.*;

public class SprehodSPreskoki<T> implements Iterable {
    protected List<T> seznam;
    protected int korak;
    protected int indeks;
    protected int kratnik;

    public SprehodSPreskoki(List<T> seznam, int korak){
        this.seznam = seznam;
        this.korak = korak;
        if(this.korak > 0){
            this.indeks = 0;
        }
        else{
            this.indeks = seznam.size() - 1;
        }
        this.kratnik = 1;
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            
            @Override
            public boolean hasNext(){
                return (korak > 0 ? (indeks < seznam.size()-korak):(indeks > 0-korak));
            }

            @Override
            public T next(){
                if(this.hasNext()){
                    if(korak > 0){
                        return seznam.get(indeks + kratnik*korak);
                    }
                    else{
                        return seznam.get(indeks + kratnik*korak);
                    }
                }
                return null;
            }
        };
    }
}