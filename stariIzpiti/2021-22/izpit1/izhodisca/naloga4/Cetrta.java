
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static <T> List<T> odsek(Iterator<T> it, int p, int q) {

        List<T> seznam = new ArrayList<>();
        int i = 0;
        while(it.hasNext()){
            if(i > q) break;
            if(i < p) {
                it.next();
            }
            else{
                T element = it.next();
                seznam.add(element);
            }
            i++;
        }
        return seznam;
    }

    public static Iterator<Integer> manjkajoci(Iterator<Integer> it, int zacetek) {
        return new Iterator(){

            public int stevec = zacetek;
            public Integer trenutno = it.next();

            @Override
            public boolean hasNext(){
                return true;
            }

            @Override
            public Integer next(){
                
                while(stevec == trenutnoStevilo.intValue()){
                    stevec++;
                    trenutnoStevilo = it.next();
                }
                return stevec++;
            }
        };
    }
}
