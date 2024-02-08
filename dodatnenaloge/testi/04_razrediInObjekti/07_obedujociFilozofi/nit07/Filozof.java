public class Filozof {
    private String ime;
    private Filozof levi;
    private Filozof desni;
    private int drzi;
    private boolean levaPal;
    private boolean desnaPal;

    public Filozof(String ime) {
        this.ime = ime;
        this.levi = this.desni = null;
        this.drzi = 0;
        this.levaPal = this.desnaPal = false;
    }
    public String vrniIme(){
        return this.ime;
    }
    public void nastaviSoseda(Filozof levi, Filozof desni){
        this.levi = levi;
        this.desni = desni;
    }
    public boolean jeLeviSosedOd(Filozof f){
        return (f.levi == this);
    }
    public boolean jeDesniSosedOd(Filozof f){
        return (f.desni == this);
    }
    public Filozof[] vrniSoseda(){
        return new Filozof[] {this.levi, this.desni};
    }
    public int kolikoPalicicDrzi(){
        return this.drzi;
    }
    public boolean[] pal(){
        return new boolean[] {this.levaPal, this.desnaPal};
    }
    public boolean primiLevo(){
        if(this.levaPal){
            return true;
        }
        if(this.levi.pal()[1]){
            return false;
        }
        else{
            this.levaPal = true;
            this.drzi++;
            return true;
        }
    }
    public boolean primiDesno(){
        if(this.desnaPal){
            return true;
        }
        if(this.desni.pal()[0]){
            return false;
        }
        else{
            this.desnaPal = true;
            this.drzi++;
            return true;
        }
    }
    public void izpustiLevo(){
        this.levaPal = false;
        if(this.drzi > 0){
            this.drzi--;
        }
    }
    public void izpustiDesno(){
        this.desnaPal = false;
        if(this.drzi > 0){
            this.drzi--;
        }
    }
    public static int steviloJedcev(Filozof[] filozofi){
        int stevec = 0;
        for(Filozof f : filozofi){
            if(f.desnaPal && f.levaPal){
                stevec++;
            }
        }
        return stevec;
    }
    public int steviloFilozofov(){
        int stevec = 1;
        Filozof f = this.levi;
        while(f != this){
            stevec++;
            f = this.levi;
        }
        return stevec;
    }
}