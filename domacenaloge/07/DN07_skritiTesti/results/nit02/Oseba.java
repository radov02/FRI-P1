
public class Oseba {
    private String IP;
    private char spol;
    private int starost;

    public Oseba(String ip, char spol, int starost) {
        this.IP = ip;
        this.spol = spol;
        this.starost = starost;
    }
    
    public Oseba(int starost){
        this("", 'M', starost);
    }

    public String toString() {
        return String.format("%s, %c, %d", this.IP, this.spol, this.starost);
    }

    public boolean jeStarejsaOd(Oseba os) {
        return (this.starost > os.starost);
    }

    public int getStarost(){
        return this.starost;
    }

    public int getSpol(){
        return this.spol;
    }
}
