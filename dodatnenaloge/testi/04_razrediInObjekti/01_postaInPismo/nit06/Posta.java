public class Posta {
    int postnaStevilka;
    String naziv;

    public Posta(int stevilka, String naziv){
        this.postnaStevilka = stevilka;
        this.naziv = naziv;
    }

    public int vrniStevilko(){
        return this.postnaStevilka;
    }

    public String vrniNaziv(){
        return this.naziv;
    }

    public String toString(){
        return this.postnaStevilka + " " + this.naziv;
    }
}
