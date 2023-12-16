public abstract class Datoteka {
    private String ime;

    public Datoteka(String ime){
        this.ime = ime;
    }

    public abstract int velikost(); // vsilimo vsem podrazredom da overridajo to metodo

    public abstract String opis();

    // toString() ne more biti abstraktna ker je ze del nadrazreda Object
    public String toString(){
        return String.format("%s [%s]", this.ime, opis());
    }

    public String getIme(){
        return this.ime;
    }
}
