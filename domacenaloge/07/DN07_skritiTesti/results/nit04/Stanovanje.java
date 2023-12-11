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
            if(stanovanje != null && stanovanje.steviloStanovalcev() > 0 && (najstarejsa == null || stanovanje.starosta().getStarost() > najstarejsa.getStarost())){
                najstarejsa = stanovanje.starosta();
            }
        }
        if(this.steviloStanovalcev() > 0 && (najstarejsa == null || this.starosta().getStarost() > najstarejsa.getStarost())){
            najstarejsa = this.starosta();
        }
        return najstarejsa;
    }
    public Oseba[] sosedjeSosedov() {
        int stSosedovSosedov = steviloSosedovSosedov();
        Oseba[] sosedjeSosedov = new Oseba[stSosedovSosedov];
        Stanovanje[] zePreverjena = new Stanovanje[8];
        int i = 0, j = 0;
        
        for(Stanovanje sosednjeStanovanje : sosednjaStanovanja){
            if(sosednjeStanovanje != null){
                for(Stanovanje sosdenjeStanovanjesosednjegaStanovanja : sosednjeStanovanje.sosednjaStanovanja){
                    if(sosdenjeStanovanjesosednjegaStanovanja != null && sosdenjeStanovanjesosednjegaStanovanja != this && !sosdenjeStanovanjesosednjegaStanovanja.zePreverjenoStanovanje(zePreverjena, sosednjeStanovanje)){
                        for(Oseba stanovalec : sosdenjeStanovanjesosednjegaStanovanja.stanovalci){
                            sosedjeSosedov[j++] = stanovalec;
                        }
                        zePreverjena[i++] = sosdenjeStanovanjesosednjegaStanovanja;
                    }
                }
            }
        }
        return sosedjeSosedov;
    }
    private int steviloSosedovSosedov(){
        int stevilo = 0;
        Stanovanje[] zePreverjena = new Stanovanje[9];
        int i = 0;
        for(Stanovanje sosednjeStanovanje : sosednjaStanovanja){
            if(sosednjeStanovanje != null){
                for(Stanovanje sosdenjeStanovanjesosednjegaStanovanja : sosednjeStanovanje.sosednjaStanovanja){
                    if(sosdenjeStanovanjesosednjegaStanovanja != null && sosdenjeStanovanjesosednjegaStanovanja != this && !sosdenjeStanovanjesosednjegaStanovanja.zePreverjenoStanovanje(zePreverjena, sosednjeStanovanje)){
                        stevilo += sosdenjeStanovanjesosednjegaStanovanja.steviloStanovalcev();
                        zePreverjena[i++] = sosdenjeStanovanjesosednjegaStanovanja;
                    }
                }
            }
        }
        return stevilo;
    }
    private boolean zePreverjenoStanovanje(Stanovanje[] zePreverjena, Stanovanje stanovanje){
        for(Stanovanje zePreverjeno : zePreverjena){
            if(stanovanje == zePreverjeno){
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

    // public Stanovanje[][] sosednja(Stanovanje prejsnje, int x, int y, Stanovanje[][] nacrtBloka){
    //     // for(int i = 0; i < 4; i++){
    //     //     if(prejsnje == null || this.sosednjaStanovanja[i] != prejsnje){
    //     //         if(this.sosednjaStanovanja[i] != null){
    //     //             switch(i){
    //     //                 case 0: return this.sosednjaStanovanja[i].sosednja(this, x, y-1, nacrtBloka);
    //     //                 case 1: return this.sosednjaStanovanja[i].sosednja(this, x+1, y, nacrtBloka);
    //     //                 case 2: return this.sosednjaStanovanja[i].sosednja(this, x, y+1, nacrtBloka);
    //     //                 case 3: return this.sosednjaStanovanja[i].sosednja(this, x-1, y, nacrtBloka);
    //     //             }
    //     //         }
    //     //     }
    //     // }
    //     // if(y < nacrtBloka.length && x < nacrtBloka[y].length && nacrtBloka[y][x] == null)
    //     //     nacrtBloka[y][x] = this;
    //     return nacrtBloka;
    // }
}
