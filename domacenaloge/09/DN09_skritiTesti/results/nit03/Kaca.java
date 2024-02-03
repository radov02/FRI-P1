import java.util.Arrays;

public class Kaca extends Plazilec {

    protected static final Zival OBJEKT = new Kaca();
    
    @Override
    public int indeks(){
        return 8;
    }

    @Override
    public Zival nadobjekt(){
        return super.OBJEKT;
    }
}
