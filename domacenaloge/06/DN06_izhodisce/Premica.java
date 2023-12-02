
public class Premica {
    private double k;
    private double n;

    public Premica(double k, double n) {
        this.k = k;
        this.n = n;
    }

    public double vrniK() {
        return this.k;
    }

    public double vrniN() {
        return this.n;
    }

    public String toString() {
        return String.format(java.util.Locale.US, "y = %.2f x + %.2f", this.k, this.n);
    }

    public Tocka tockaPriX(double x) {
        return new Tocka(x, this.k * x + n);
    }

    public static Premica skoziTocko(double k, Tocka t) {
        return new Premica(k, t.vrniY() - k * t.vrniX());
    }

    public Premica vzporednica(Tocka t) {
        return new Premica(this.k, t.vrniY() - this.k * t.vrniX());
    }

    public Premica pravokotnica(Tocka t) {
        return new Premica(-1/this.k, t.vrniY() + 1/this.k * t.vrniX());
    }

    public Tocka presecisce(Premica p, double epsilon) {
        if(Math.abs(this.k - p.k) < epsilon){
            return null;
        }
        double x = (this.n - p.n) / (p.k - this.k);
        double y = this.k * x + this.n;
        return new Tocka(x, y);
    }

    public Tocka projekcija(Tocka t) {
        Premica pravokotnica = pravokotnica(t);
        return this.presecisce(pravokotnica, 0.01);
    }

    public double razdalja(Tocka t) {
        Tocka p = this.projekcija(t);
        return t.razdalja(p);
    }

    public double razdaljaOdIzhodisca() {
        Tocka projekcija = this.projekcija(Tocka.izhodisce());
        return projekcija.razdalja(Tocka.izhodisce());
    }

    public double razdalja(double n) {
        Tocka naThis = this.tockaPriX(Math.random() * 10);
        Premica nova = new Premica(this.k, n);
        return nova.razdalja(naThis);
    }
}
