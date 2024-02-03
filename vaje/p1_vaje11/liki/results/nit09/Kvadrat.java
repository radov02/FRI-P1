
public class Kvadrat extends Pravokotnik {

    public Kvadrat(int stranica) {
        super(stranica, stranica);
    }

    @Override
    public String vrsta() {
        return "kvadrat";
    }

    @Override
    public int tip(){
        return 2;
    }

    @Override
    public String podatki() {
        return String.format("stranica = %d", this.vrniSirino());
    }
}
