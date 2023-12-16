public class VektorObject 
{
    private static final int ZACETNA_KAPACITETA = 10;
    private Object[] elementi;
    private int stElementov;

    public VektorObject() {
        this(ZACETNA_KAPACITETA);
        // this.elementi = new int[ZACETNA_KAPACITETA];
        // this.stElementov = 0;   // ni potrebno
    }
    public VektorObject(int kapaciteta) {
        this.elementi = new Object[kapaciteta];
        this.stElementov = 0;   // ni potrebno
    }

    public int steviloElementov(){
        return this.stElementov;
    }

    public Object vrni(int indeks){
        return this.elementi[indeks];
    }

    public void nastavi(int indeks, int vrednost){
        this.elementi[indeks] = vrednost;
    }

    public void dodaj(Object vrednost){
        poPotrebiPovecaj();
        this.elementi[this.stElementov] = vrednost;
        this.stElementov++;
    }

    private void poPotrebiPovecaj(){
        if(this.stElementov == this.elementi.length){
            Object[] stariElementi = this.elementi;
            this.elementi = new Object[2* this.elementi.length];
            for(int i = 0; i < stElementov; i++){
                this.elementi[i] = stariElementi[i];
            }
        }
    }

    public void vstavi(int indeks, int vrednost){
        poPotrebiPovecaj();
        for(int i = this.stElementov + 1; i > indeks; i--){
            this.elementi[i] = this.elementi[i-1];
        }
        this.elementi[indeks] = vrednost;
        this.stElementov++;
    }

    public void zbrisi(int indeks){
        for(int i = indeks; i < this.stElementov; i++){
            this.elementi[i] = this.elementi[i+1];
        }
        this.stElementov--;
    }

    public String toString(){
        String v = "[";
        for(int i = 0; i < this.stElementov; i++){
            if(i < this.stElementov - 1){
                v += this.elementi[i] + "]";
            }
            v += this.elementi[i] + ", ";
        }

        return v;
    }

    public String toString2(){  // veliko hitreje ce dodajamo veliko elementov stringu
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.stElementov; i++){
            if(i > 0){
                sb.append(", ");
            }
            sb.append(this.elementi[i]);
        }
        sb.append("]");

        return sb.toString();
    }

    public static void main(String[] args){
        VektorObject v = new VektorObject();
        v.dodaj(new Cas(10, 20));
        //v.dodaj(new Oseba("Janez", "Novak", 'M', 1980));
        v.dodaj(42);
        v.dodaj(true);
        v.dodaj(4.5);
        v.dodaj('c');

        Object obj0 = v.vrni(0);
        Object obj1 = v.vrni(1);
        Cas cas = (Cas)obj1;

        System.out.println(obj1);
        System.out.println(cas.plus(3, 10));
        // System.out.println(obj1.plus(3, 10));   // ne moremo ker je kazalec tipa Object in ta nima meotde plus()

        String str = (String) v.vrni(1);    // prevajalnik dovoli, vendar izvajalnik sproži izjemo (v.vrni(1) je tipa Cas in ga ne moremo castati v String)
        // zaznamo sele v casu izvajanja - generiki omogocajo da ze v casu prevajanja
    }
}