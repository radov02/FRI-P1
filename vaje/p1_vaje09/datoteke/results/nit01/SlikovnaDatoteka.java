public class SlikovnaDatoteka extends Datoteka {

    public static final int METADATA = 54;  // velikost headerja

    private int sirina;
    private int visina;

    public SlikovnaDatoteka(String ime, int sirina, int visina){
        super(ime);
        this.sirina = sirina;
        this.visina = visina;
    }

    public boolean jeVelikaVsaj(int velikost){
        return (this.sirina >= velikost && this.visina >= velikost);
    }

    @Override
    public int velikost(){
        return (3 * this.sirina * this.visina + SlikovnaDatoteka.METADATA);
    }

    @Override
    public String opis(){
        return String.format("s %d x %d", this.sirina, this.visina);
    }
    
    @Override
    public String toString(){
        return String.format("%s [s %d x %d]", getIme(), this.sirina, this.visina);
    }
}