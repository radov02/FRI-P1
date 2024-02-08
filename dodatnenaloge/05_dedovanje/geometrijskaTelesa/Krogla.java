public class Krogla extends GeoTelo{
    public int r;

    public Krogla(int r){
        this.r = r;
    }
    public int vol(){
        return (int)(Math.PI * this.r*this.r);
    }
    public int pov(){
        return (int)(2*Math.PI*this.r);
    }
    @Override
    public String toString(){
        return String.format("krogla%nr = %d%nV = %d%nP = %d%n", this.r, this.vol(), this.pov());
    }
}