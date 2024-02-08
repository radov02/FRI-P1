import java.util.*;

public class PogostostBesed{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> besede2pogostost = new HashMap<>();
        while(sc.hasNext()){
            String bes = sc.next();
            if(besede2pogostost.keySet().contains(bes)){
                besede2pogostost.put(bes, besede2pogostost.get(bes)+1);
            }
            else{
                besede2pogostost.put(bes, 1);
            }
        }
        
        List<String> out = new ArrayList<>();
        for(String key : besede2pogostost.keySet()){
            out.add(key);
        }

        Collections.sort(out, poPogostostiInLeksikografskem(besede2pogostost));

        for(int i = 0; i < out.size(); i++){
            System.out.printf("%s (%d)%n", out.get(i), besede2pogostost.get(out.get(i)));
        }

        sc.close();
    }

    private static Comparator<String> poPogostostiInLeksikografskem(Map<String, Integer> besede2pogostost){
        return (a, b) -> {
            if(besede2pogostost.get(a) == besede2pogostost.get(b)){
                return a.compareTo(b);
            } 
            return besede2pogostost.get(b) - besede2pogostost.get(a);
        };
    }
}