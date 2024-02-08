import java.util.*;
import java.util.function.Function;

public class UrejanjePoFunkciji{
    
    public static <T, R extends Comparable<R>> void urediPoFunkciji(List<T> seznam, Function<T, R> funkcija){
        
        //R r = funkcija.apply(seznam.get(i));  // function.apply(T t) vrne tip R

        // Comparator ima metodo int compare(Object a, Object b)
        seznam.sort((a, b) -> {
            return funkcija.apply(a).compareTo(funkcija.apply(b));
        });
    }

    public static void urediPoAbsolutniVrednosti(List<Integer> stevila){
        urediPoFunkciji(stevila, (t) -> (Integer)Math.abs(t));
    }
    public static void urediPoDolzini(List<String> nizi){
        urediPoFunkciji(nizi, (s) -> s.length());
    }
    public static <T extends Comparable<T>> List<Integer> vrstniRed(List<T> seznam){
        ArrayList<T> urejenSeznam = al(seznam);
        Collections.sort(urejenSeznam);
        Integer[] nov = new Integer[seznam.size()];
        Arrays.fill(nov, -1);

        for(int i = 0; i < urejenSeznam.size(); i++) {
            T element = urejenSeznam.get(i);
            for(int j = 0; j < seznam.size(); j++){
                if(seznam.get(j).equals(element)){
                    nov[i] = Integer.valueOf(j);
                    break;
                }
            }
        }
        return Arrays.asList(nov);
    }
    private static <T> ArrayList<T> al(List<T> seznam){
        ArrayList<T> al = new ArrayList<>();
        for(T element : seznam){
            al.add(element);
        }
        return al;
    }
}