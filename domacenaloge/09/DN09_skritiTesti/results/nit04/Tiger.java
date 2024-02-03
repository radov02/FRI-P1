import java.util.ArrayList;
import java.util.Arrays;

public class Tiger extends Macka {

    protected static final Zival OBJEKT = new Tiger();
    
    @Override
    public int indeks(){
        return 3;
    }

    @Override
    public Zival nadobjekt(){
        return super.OBJEKT;
    }
}
