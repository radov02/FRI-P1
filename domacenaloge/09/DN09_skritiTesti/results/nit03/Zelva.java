import java.util.Arrays;

public class Zelva extends Plazilec {

    protected static final Zival OBJEKT = new Zelva();
    
    @Override
    public int indeks(){
        return 7;
    }

    @Override
    public Zival nadobjekt(){
        return super.OBJEKT;
    }
}
