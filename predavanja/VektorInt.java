public class VektorInt 
{
    private static final int ZACETNA_KAPACITETA = 10;
    private int[] elementi;
    private int stElementov;

    public VektorInt() {
        this(ZACETNA_KAPACITETA);
        // this.elementi = new int[ZACETNA_KAPACITETA];
        // this.stElementov = 0;   // ni potrebno
    }
    public VektorInt(int kapaciteta) {
        this.elementi = new int[kapaciteta];
        this.stElementov = 0;   // ni potrebno
    }

    public int steviloElementov(){
        return this.stElementov;
    }

    public int vrni(int indeks){
        return this.elementi[indeks];
    }

    public void nastavi(int indeks, int vrednost){
        this.elementi[indeks] = vrednost;
    }

    public void dodaj(int vrednost){
        poPotrebiPovecaj();
        this.elementi[this.stElementov] = vrednost;
        this.stElementov++;
    }

    private void poPotrebiPovecaj(){
        if(this.stElementov == this.elementi.length){
            int[] stariElementi = this.elementi;
            this.elementi = new int[2* this.elementi.length];
            for(int i = 0; i < stElementov; i++){
                this.elementi[i] = stariElementi[i];
            }
        }
    }

    public void vstavi(int indeks, int vrednost){
        poPotrebiPovecaj();
        for(int i = this.stElementov + 1; i > indeks; i--){
            this.elementi[i] = this.elementi[i-1];
        }
        this.elementi[indeks] = vrednost;
        this.stElementov++;
    }

    public void zbrisi(int indeks){
        for(int i = indeks; i < this.stElementov; i++){
            this.elementi[i] = this.elementi[i+1];
        }
        this.stElementov--;
    }

    public String toString(){
        String v = "[";
        for(int i = 0; i < this.stElementov; i++){
            if(i < this.stElementov - 1){
                v += this.elementi[i] + "]";
            }
            v += this.elementi[i] + ", ";
        }

        return v;
    }

    public String toString2(){  // veliko hitreje ce dodajamo veliko elementov stringu
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.stElementov; i++){
            if(i > 0){
                sb.append(", ");
            }
            sb.append(this.elementi[i]);
        }
        sb.append("]");

        return sb.toString();
    }
}