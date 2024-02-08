import java.util.Arrays;

public class Prastevila{
    private int trenutno;
    private static int[] prastevila = new int[] {2};

    public Prastevila(){
        this.trenutno = 2;
        najdiPrastevila(1000000);
    }
    private void najdiPrastevila(int Do){
        int zacetek = 3, konec = 2*Do;
        if(this.prastevila != null){
            zacetek = this.prastevila[this.prastevila.length-1]+1;
        }
        if(zacetek >= konec) return;
        int[] nova = new int[(this.prastevila.length + (konec - zacetek + 1))];
        for(int i = 0; i < this.prastevila.length; i++){
            nova[i] = this.prastevila[i];
        }
        int j = this.prastevila.length;
        for(int k = zacetek; k <= konec; k++){
            if(jePrastevilo(k)){    
                nova[j++] = k;
            }
        }
        // System.out.println(Arrays.toString(this.prastevila));
        this.prastevila = nova;
        // System.out.println(Arrays.toString(nova));
        
    }
    public void nastaviTrenutno(int prastevilo){
        this.trenutno = prastevilo;
        najdiPrastevila(this.trenutno + 1000);
    }
    public int vrniTrenutno(){
        return this.trenutno;
    }
    public int naslednje(){
        //System.out.println("tren: " + this.trenutno);
        /* if(this.trenutno == this.prastevila[this.prastevila.length-1]){
            najdiPrastevila(2*this.trenutno);
        } */
        for(int i = 0; i < this.prastevila.length; i++){
            //System.out.println(this.prastevila[i] + "==?" + this.trenutno);
            if(this.prastevila[i] == this.trenutno){
                if(i == this.prastevila.length-1){
                    najdiPrastevila(2*this.trenutno);
                }
                this.trenutno = this.prastevila[i+1];
                return this.prastevila[i+1];
            }
        }
        return -1;
    }
    private static boolean jePrastevilo(int i){
        for(int j = 2; j <= (int)Math.round(Math.sqrt(i)); j++){
            if(i % j == 0) return false;
        }
        return true;
    }
    public int prejsnje(){
        for(int i = 0; i < this.prastevila.length; i++){
            if(this.prastevila[i] == this.trenutno){
                if(i == 0){
                    return 2;
                }
                this.trenutno = this.prastevila[i-1];
                return this.prastevila[i-1];
            }
        }
        return -1;
    }
}