import java.util.*;

public class SploscitevSeznama{

    public static <T> List<T> splosci(List<List<T>> seznami){
        ArrayList<T> a = new ArrayList<>();
        for(int i = 0; i < seznami.size(); i++){
            for(int j = 0; j < seznami.get(i).size(); j++){
                a.add(seznami.get(i).get(j));
            }
        }
        return a;
    }
}