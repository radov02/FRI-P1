import java.util.Arrays;

public class Medved extends Sesalec {

    protected static final Zival OBJEKT = new Medved();

    @Override
    public int indeks(){
        return 5;
    }

    @Override
    public Zival nadobjekt(){
        return super.OBJEKT;
    }
}
