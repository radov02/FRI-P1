import java.util.Arrays;

public class Lev extends Macka {

    protected static final Zival OBJEKT = new Lev();
    
    @Override
    public int indeks(){
        return 4;
    }

    @Override
    public Zival nadobjekt(){
        return super.OBJEKT;
    }
}
