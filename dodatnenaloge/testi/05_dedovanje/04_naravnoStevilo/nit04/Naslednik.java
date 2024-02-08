public class Naslednik extends NaravnoStevilo{
    public Naslednik(NaravnoStevilo stevilo){
        this.stevilo = stevilo.stevilo + 1;
        this.predhodnik = stevilo;
    }
    public NaravnoStevilo naslednik(){
        return new Naslednik(this);
    }
    public static NaravnoStevilo naslednik(int st, int KtiNaslednik){
        int k = KtiNaslednik;
        NaravnoStevilo n = new Naslednik(st-1);
        for(int i = 0; i < k; i++){
            n = new Naslednik(n);
        }
        return n;
    }
    public NaravnoStevilo predhodnik(){
        if(this.jeEna()){
            throw new java.util.NoSuchElementException();
        }
        return new Naslednik(this.predhodnik-1);
    }
    public NaravnoStevilo zmnozek(NaravnoStevilo stevilo){
        int zmnozek = this.stevilo * stevilo.stevilo;
        return new Naslednik(zmnozek-1);
    }
    public NaravnoStevilo razlika(NaravnoStevilo stevilo){
        int razlika = this.stevilo - stevilo.stevilo;
        if(razlika < 1){
            throw new java.util.NoSuchElementException();
        }
        return new Naslednik(razlika-1, 0);
    }
    public String niz(NaravnoStevilo n){
        if(this.jeEna()) return "1";
        return "s(" + niz(new Naslednik(this.predhodnik-1)) + ")";
    }
}