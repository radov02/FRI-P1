public class Sesalec extends Zival {

    protected static final Zival OBJEKT = new Sesalec();

    @Override
    public int indeks(){
        return 1;
    }

    @Override
    public Zival nadobjekt(){
        return super.OBJEKT;
    }
}
