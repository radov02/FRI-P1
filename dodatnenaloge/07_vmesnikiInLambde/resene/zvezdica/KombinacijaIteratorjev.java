import java.util.*;

public class KombinacijaIteratorjev<T> {

    public static <T> Iterator<T> kombinacija(List<Iterator<T>> iteratorji){
        
        return new Iterator<T>() {

            int indeks = 0;
            int n = iteratorji.size();

            @Override
            public boolean hasNext(){
                return (iteratorji.get(indeks % n).hasNext());
            }

            @Override
            public T next(){
                if(this.hasNext()){
                    T naslednji = iteratorji.get(indeks % n).next();
                    indeks++;
                    return naslednji;
                }
                else{
                    return null;
                }
            }
        };
    }
}