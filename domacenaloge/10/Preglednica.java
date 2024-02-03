import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Mnozica{
    private String podatek;

    public Mnozica(String podatek){
        this.podatek = podatek;
    }

    @Override
    public String toString(){
        return this.podatek;
    }
}

public class Preglednica {
    private Object[][] stolpci;
    private int[] tipiStolpcev;
    private int[] kriteriji;

    private int indeks = 0;

    public Preglednica(int vrstice, int stolpci, int[] tipiStolpcev){
        this.tipiStolpcev = tipiStolpcev;
        this.stolpci = new Object[stolpci][];
        for(int i = 0; i < tipiStolpcev.length; i++){
            this.stolpci[i] = new Object[vrstice];
        }
    }

    public Preglednica(int vrstice, int stolpci, int[] tipiStolpcev, int[] kriteriji){
        this(vrstice, stolpci, tipiStolpcev);
        this.kriteriji = kriteriji;
    }

    public void dodajVrstico(Object[] vrstica){

        for(int i = 0; i < vrstica.length; i++){
            switch(this.tipiStolpcev[i]){
                case 1: vrstica[i] = (Integer)vrstica[i]; break;
                case 2: vrstica[i] = (String)vrstica[i]; break;
                case 3: vrstica[i] = new Mnozica((String)vrstica[i]); break;
            }
        }
        
        vrstice[indeks++] = vrstica;
    }

    @Override
    public String toString(){
        String niz = "";
        for(int i = 0; i < this.indeks; i++){
            for(int j = 0; j < this.vrstice[i].length; j++){
                if(j < this.vrstice[i].length - 1){
                    niz += this.vrstice[i][j].toString() + "|";
                }
                else{
                    niz += this.vrstice[i][j].toString() + "\n";
                }
            }
        }
        return niz;
    }

    public void uredi(){





        for(int i = 0; i < this.kriteriji.length; i++){
            int stolpec = Math.abs(this.kriteriji[i]);
            Primerjalnik primerjalnik = new Primerjalnik();
            Arrays.sort(this.vrstice, primerjalnik);
        }
        
    }

    private static class Primerjalnik implements Comparator<Object>{
        @Override
        public int compare(Mnozica n1, Mnozica n2){
            return 0;
        }
    }
}
