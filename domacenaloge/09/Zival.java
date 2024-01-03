import java.util.Arrays;

public class Zival {

    private static Zival[] preganjanja = new Zival[10];
    private static int indeksPreganjanja = 0;
    private static int stHranjenj = 0;

    public void seHrani(){
        stHranjenj++;
    }

    public void preganja(Zival druga){
        if(indeksPreganjanja < preganjanja.length - 1){
            preganjanja[indeksPreganjanja++] = druga;
        }
        else{
            preganjanja = Arrays.copyOf(preganjanja, 2*preganjanja.length);
            preganjanja[indeksPreganjanja++] = druga;
        }   
    }

    public int steviloHranjenj(){
        return stHranjenj;
    }

    public int steviloPreganjanj(Zival druga){
        int st = 0;
        for(Zival zival : preganjanja){
            if(zival != null && druga instanceof Zival){
                st++;
            }
        }
        return st;
    }
}
