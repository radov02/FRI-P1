import java.util.Arrays;

public class Stanovanje {
    public char crka;
    private Stanovanje[] sosednjaStanovanja;    // 0 spodnji, 1 desni, 2 zgornji, 3 levi
    private Oseba[] stanovalci;

    public Stanovanje(Oseba[] stanovalci) {
        this.stanovalci = stanovalci;
        this.sosednjaStanovanja = new Stanovanje[4];
        this.crka = '*';
    }
    public Stanovanje(Oseba[] stanovalci, char crka) {
        this.stanovalci = stanovalci;
        this.sosednjaStanovanja = new Stanovanje[4];
        this.crka = crka;
    }
    public int steviloStanovalcev() {
        return this.stanovalci.length;
    }
    public int steviloStarejsihOd(Oseba os) {
        int steviloStarejsih = 0;
        for(Oseba stanovalec : this.stanovalci){
            if(stanovalec.getStarost() > os.getStarost()){
                steviloStarejsih++;
            }
        }
        return steviloStarejsih;
    }
    public int[] mz() {
        int[] moskiZenske = new int[2];
        for(Oseba stanovalec : stanovalci){
            if(stanovalec.getSpol() == 'M'){
                moskiZenske[0]++;
            }
            else if(stanovalec.getSpol() == 'Z'){
                moskiZenske[1]++;
            }
        }
        return moskiZenske;
    }
    public Oseba starosta() {
        if(this.steviloStanovalcev() == 0){
            return null;
        }
        Oseba najstarejsa = new Oseba(-1);
        for(Oseba stanovalec : stanovalci){
            if(this.steviloStarejsihOd(stanovalec) < this.steviloStarejsihOd(najstarejsa)){
                najstarejsa = stanovalec;
            }
        }
        return najstarejsa;
    }
    public void nastaviSosede(Stanovanje levi, Stanovanje zgornji,
            Stanovanje desni, Stanovanje spodnji) {
        this.sosednjaStanovanja[3] = levi;
        this.sosednjaStanovanja[2] = zgornji;
        this.sosednjaStanovanja[1] = desni;
        this.sosednjaStanovanja[0] = spodnji;
    }
    public Oseba starostaSosescine() {
        Oseba najstarejsa = new Oseba(-1);
        for(Stanovanje stanovanje : this.sosednjaStanovanja){
            if(stanovanje != null && stanovanje.steviloStanovalcev() > 0 && stanovanje.starosta().getStarost() > najstarejsa.getStarost()){
                najstarejsa = stanovanje.starosta();
            }
        }
        if(this.steviloStanovalcev() > 0 && this.starosta().getStarost() > najstarejsa.getStarost()){
            najstarejsa = this.starosta();
        }
        return (najstarejsa.getStarost() == -1 ? null:najstarejsa);
    }
    public Oseba[] sosedjeSosedov() {
        Oseba[] sosedjeSosedov = new Oseba[10000];
        Stanovanje[] zePreverjena = new Stanovanje[8];
        int i = 0, j = 0;
        
        for(Stanovanje sosednjeStanovanje : sosednjaStanovanja){
            if(sosednjeStanovanje != null){
                for(Stanovanje sosdenjeStanovanjesosednjegaStanovanja : sosednjeStanovanje.sosednjaStanovanja){
                    if(sosdenjeStanovanjesosednjegaStanovanja != null && sosdenjeStanovanjesosednjegaStanovanja != this && !this.zePreverjenoStanovanje(zePreverjena, sosdenjeStanovanjesosednjegaStanovanja)){
                        for(Oseba stanovalec : sosdenjeStanovanjesosednjegaStanovanja.stanovalci){
                            if(!this.zePreverjenaOseba(sosedjeSosedov, stanovalec)){
                                sosedjeSosedov[j++] = stanovalec;
                            }
                        }
                        zePreverjena[i++] = sosdenjeStanovanjesosednjegaStanovanja;
                    }
                }
            }
        }
        
        Oseba[] samoSosedjeSosedov = new Oseba[this.steviloSosedovSosedov(sosedjeSosedov)];   // brez vrednosti null
        for(int k = 0; k < samoSosedjeSosedov.length; k++){
            samoSosedjeSosedov[k] = sosedjeSosedov[k];
        }
        return samoSosedjeSosedov;
    }
    private int steviloSosedovSosedov(Oseba[] sosedjeSosedov){
        int stevec = 0;
        for(int i = 0; i < sosedjeSosedov.length; i++){
            if(sosedjeSosedov[i] != null)
                stevec++;
        }
        return stevec;
    }
    private boolean zePreverjenoStanovanje(Stanovanje[] zePreverjena, Stanovanje stanovanje){
        for(Stanovanje zePreverjeno : zePreverjena){
            if(stanovanje == zePreverjeno){
                return true;
            }
        }
        return false;
    }
    private boolean zePreverjenaOseba(Oseba[] zePreverjene, Oseba oseba){
        for(Oseba zePreverjena : zePreverjene){
            if(oseba == zePreverjena){
                return true;
            }
        }
        return false;
    }
    public Stanovanje[] getSosednjaStanovanja(){
        return this.sosednjaStanovanja;
    }
    public int oddaljenostOdStanovanjaVsmeri(int smer){
        if(this.sosednjaStanovanja[smer] == null){
            return 0;
        }
        return 1 + this.sosednjaStanovanja[smer].oddaljenostOdStanovanjaVsmeri(smer);
    }
}
