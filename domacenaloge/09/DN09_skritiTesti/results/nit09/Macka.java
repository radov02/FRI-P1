import java.util.ArrayList;
import java.util.Arrays;

public class Macka extends Sesalec {

    protected static final Zival OBJEKT = new Macka();
    
    @Override
    public int indeks(){
        return 2;
    }
    
    @Override
    public Zival nadobjekt(){
        return super.OBJEKT;
    }
}
