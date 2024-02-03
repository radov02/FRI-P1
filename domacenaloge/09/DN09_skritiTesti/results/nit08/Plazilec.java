import java.util.Arrays;

public class Plazilec extends Zival {

    protected static final Zival OBJEKT = new Plazilec();

    @Override
    public int indeks(){
        return 6;
    }

    @Override
    public Zival nadobjekt(){
        return super.OBJEKT;
    }
}
