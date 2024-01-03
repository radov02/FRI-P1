import java.util.Arrays;

public class Tiger extends Macka {
    
    private static Zival[] preganjanja = new Zival[10];
    private static int indeksPreganjanja = 0;
    private static int stHranjenj = 0;

    public void seHrani(){
        super.seHrani();
        stHranjenj++;
    }

    public void preganja(Zival druga){
        super.preganja(druga);
        if(indeksPreganjanja < preganjanja.length - 1){
            preganjanja[indeksPreganjanja++] = druga;
        }
        else{
            preganjanja = Arrays.copyOf(preganjanja, 2*preganjanja.length);
            preganjanja[indeksPreganjanja++] = druga;
        }
    }

    public int steviloHranjenj(){
        super.steviloHranjenj();
        return stHranjenj;
    }

    public int steviloPreganjanj(Zival druga){
        super.steviloPreganjanj(druga);
        int st = 0;
        for(Zival zival : preganjanja){
            if(zival != null && druga instanceof Tiger){
                st++;
            }
        }

        return st;
    }
}
