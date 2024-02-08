public class Naslednik extends NaravnoStevilo{
    public Naslednik(NaravnoStevilo stevilo){
        this.stevilo = stevilo.stevilo + 1;
        this.predhodnik = stevilo;
    }
}