import java.util.*;

public class ZrcalnaSlikaSeznama{

    public static <T> List<T> zrcalnaSlika(List<T> seznam){
        ArrayList<T> a = new ArrayList<>();
        for(T element : seznam){
            a.addFirst(element);
        }
        return a; //(List<T>)a;
    }
}