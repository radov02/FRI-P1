public class Zival{

    private static final int[] ST_HRANJENJ = new int[9];    // stejemo hranjenja za posamezno zival
    private static final int[][] ST_PREGANJANJ = new int[9][9]; // stejemo stevilo preganjanj zivali s strani druge zivali

    protected static final Zival OBJEKT = new Zival();

    public int indeks(){
        return 0;
    }

    public Zival nadobjekt(){
        return null;
    }

    public void seHrani(){      // poveca stevilo hranjenj
        Zival trenutna = this;
        while(trenutna != null){
            ST_HRANJENJ[trenutna.indeks()]++;
            trenutna = trenutna.nadobjekt();
        }
    }

    public void preganja(Zival druga){      // poveca stevilo preganjanj
        Zival trenutna = this;
        while(trenutna != null){
            Zival drugaTrenutna = druga;
            while(drugaTrenutna != null){
                ST_PREGANJANJ[trenutna.indeks()][drugaTrenutna.indeks()]++;
                drugaTrenutna = drugaTrenutna.nadobjekt();
            }
            trenutna = trenutna.nadobjekt();
        }
    }

    public int steviloHranjenj(){
        return ST_HRANJENJ[this.indeks()];
    }

    public int steviloPreganjanj(Zival druga){
        return ST_PREGANJANJ[this.indeks()][druga.indeks()];
    }
}
