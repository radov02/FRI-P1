public class Kocka extends Kvader{
    public Kocka(int a){
        super(a, a, a);
    }
    public int vol(){
        return (int)(this.a*this.a*this.a);
    }
    public int pov(){
        return (int)(6*this.a*this.a);
    }
    public void mreza(){
        mreza(this.a, this.a, this.a);
    }
    @Override
    public String toString(){
        return String.format("kocka%na = %d%nV = %d%nP = %d%n", this.a, this.vol(), this.pov());
    }
}