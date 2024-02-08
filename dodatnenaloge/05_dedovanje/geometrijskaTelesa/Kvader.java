public class Kvader extends GeoTelo {
    public int a;// 2,3,4
    public int b;
    public int c;

    public Kvader(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int vol(){
        return (int)(this.a * this.b * this.c);
    }
    public int pov(){
        return (int)(2*this.a*this.b + 2*this.a*this.c + 2*this.b*this.c);
    }
    public void mreza(){
        mreza(this.a, this.b, this.c);
    }
    public static void mreza(int a, int b, int c){
        for(int i = 0; i < c; i++){
            System.out.println(" ".repeat(2*c) + "* ".repeat(b-1) + "*");
        }
        for(int i = 0; i < a; i++){
            System.out.println("+ ".repeat(c) + "o ".repeat(b) + "+ ".repeat(c));
        }
        for(int i = 0; i < c; i++){
            System.out.println(" ".repeat(2*c) + "* ".repeat(b-1) + "*");
        }
        for(int i = 0; i < a; i++){
            System.out.println(" ".repeat(2*c) + "o ".repeat(b));
        }
    }
    @Override
    public String toString(){
        return String.format("kvader%na = %d%nb = %d%nc = %d%nV = %d%nP = %d%n", this.a, this.b, this.c, this.vol(), this.pov());
    }
}