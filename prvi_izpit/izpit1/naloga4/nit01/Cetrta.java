
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02--03: prva skupina
04--05: druga skupina
06--07: tretja skupina
08--11: "cetrta skupina

POZOR: uporabljate lahko samo primitivne tipe, tipni parameter T in tip
Iterator<T>.
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static <T extends Comparable<T>> Iterator<T> zlitje(Iterator<T> a, Iterator<T> b) {
        return new Iterator<T>(){

            public T naslednjiOdA = null;   // zapomniti si moramo kateri so naslednji elementi, da jih lahko primerjamo in vrnemo ustreznega
            public T naslednjiOdB = null;

            @Override
            public boolean hasNext(){
                if(naslednjiOdA != null || naslednjiOdB != null || a.hasNext() || b.hasNext()){
                    return true;
                }
                return false;
            }

            @Override
            public T next(){
                //System.out.println(naslednjiOdA + ", " + naslednjiOdB);
                if(naslednjiOdA == null){
                    naslednjiOdA = a.next();
                }
                if(naslednjiOdB == null){
                    naslednjiOdB = b.next();
                }

                if(naslednjiOdA == null){
                    if(naslednjiOdB == null){
                        throw new NoSuchElementException();
                    }
                    else{
                        return naslednjiOdB;
                    }
                }
                else{
                    if(naslednjiOdB == null){
                        return naslednjiOdA;
                    }
                    else{
                        if(naslednjiOdA.compareTo(naslednjiOdB) < 0){
                            return naslednjiOdA;
                        }
                        else{
                            return naslednjiOdB;
                        }
                    }
                }
            }
        };
    }
}
