public abstract class NaravnoStevilo{
    public int stevilo;
    public int predhodnik;

    public boolean jeEna(){
        return this.stevilo == 1;
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
    //public abstract NaravnoStevilo naslednik();
    //public abstract NaravnoStevilo naslednik(int st, int KtiNaslednik);
    //public abstract NaravnoStevilo predhodnik();
    public NaravnoStevilo vsota(NaravnoStevilo stevilo){
        return this.naslednik(this.stevilo, stevilo.stevilo - this.stevilo);
    }
    //public abstract NaravnoStevilo razlika(NaravnoStevilo stevilo);
    //public abstract NaravnoStevilo zmnozek(NaravnoStevilo stevilo);
    public String toString(){
        return niz(this);
    }
    //public abstract String niz(NaravnoStevilo n);
    public int toInt(){
        return this.stevilo;
    }
    public static NaravnoStevilo ustvariIzInt(int n){
        return null;//naslednik(n, 0);
    }
}