
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

            public Integer trenutni = zacetek;
            public List<Integer> stevila = new ArrayList<Integer>();
            public Iterator<Integer> iter = it;

            @Override
            public boolean hasNext(){
                return true;
            }

            @Override
            public Integer next(){
                
                while(stevila.size() == 0){
                    int novi = it.next();
                    if(trenutni == zacetek && novi > zacetek){
                        stevila.add(zacetek);
                    }
                    else{
                        for(int i = trenutni+1; i < novi; i++){
                            stevila.addLast(i);
                        }
                    }
                }
                System.out.println(stevila.toString());
                
                trenutni = stevila.getFirst();
                stevila.remove(0);
                
                return trenutni;
            }
        };
    }

    public static void main(String[] args) {
        
        List<String> seznam = List.of(
        "Ana", "Bojan", "Cvetko", "Denis", "Eva", "Franci", "Gabrijela", "Hinko", "Iva", "Janez", "Karel", "Lea", "Mojca", "Nina"
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 2, 7));
        
    }
}
