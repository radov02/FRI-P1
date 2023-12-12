import java.util.Arrays;

public class Blok {
    private Stanovanje[][] nacrtBloka;
    private char[][] nb;

    public Blok(Stanovanje stanovanje) {
        int y = stanovanje.oddaljenostOdStanovanjaVsmeri(0);
        int x = stanovanje.oddaljenostOdStanovanjaVsmeri(3);
        // System.out.println("Zacetne koordinate: " + x + ", " + y);
        
        //System.out.println("\n" + Arrays.toString(this.najdiSirinoInVisinoBloka(stanovanje, null, x, y, x, y, new Stanovanje[1000], 0)) + "\n");   // najvecje stevilo stanovanj je 1000
        int[] sirinaVisina = this.najdiSirinoInVisinoBloka(stanovanje, x, y);
        //System.out.println("\n" + Arrays.toString(sirinaVisina) + "\n");   // najvecje stevilo stanovanj je 1000

        //nacrtBloka = new Stanovanje[stanovanje.najdiSirinoInVisinoBloka(null, x, y, x, y)[0]][stanovanje.najdiSirinoInVisinoBloka(null, x, y, x, y)[1]];
        this.nacrtBloka = new Stanovanje[sirinaVisina[1]][sirinaVisina[0]];
        nb = new char[sirinaVisina[1]][sirinaVisina[0]];
        for(int i = 0; i < nb.length; i++){
            Arrays.fill(nb[i], '_');
        }
        this.nacrtBloka[this.nacrtBloka.length - 1 - y][x] = stanovanje;

        int koordinataXzacetnegaStanovanjaVbloku = x + Math.abs(sirinaVisina[2]);
        int koordinataYzacetnegaStanovanjaVbloku = y + Math.abs(sirinaVisina[3]);
        this.najdiNacrtBloka(stanovanje, stanovanje, koordinataXzacetnegaStanovanjaVbloku, koordinataYzacetnegaStanovanjaVbloku, new Stanovanje[1000], 0);
    }

    public Oseba starosta() {
        Oseba najstarejsa = new Oseba(-1);
        for(int i = 0; i < nacrtBloka.length; i++){
            for(int j = 0; j < nacrtBloka[i].length; j++){
                //System.out.println(i + ", " + j);
                // if(nacrtBloka[i][j] == null){
                //     System.out.println("nacrtBloka[i][j] == null");
                // }
                // else if(nacrtBloka[i][j].starosta() == null){
                //     System.out.println("nacrtBloka[i][j].starosta() == null");
                // }
                // else if(!nacrtBloka[i][j].starosta().jeStarejsaOd(najstarejsa)){
                //     System.out.println("nacrtBloka[i][j].starosta().NIStarejsaOd(najstarejsa)");
                //     System.out.println(najstarejsa.getStarost() + " >= " + nacrtBloka[i][j].starosta().getStarost());
                // }
                if(nacrtBloka[i][j] != null && nacrtBloka[i][j].starosta() != null && nacrtBloka[i][j].starosta().jeStarejsaOd(najstarejsa)){
                    // System.out.println(nacrtBloka[i][j].steviloStanovalcev());
                    // System.out.println(najstarejsa.getStarost() + " < " + nacrtBloka[i][j].starosta().getStarost());
                    najstarejsa = nacrtBloka[i][j].starosta();
                }
            }
        }
        return (najstarejsa.getStarost() > -1 ? najstarejsa:null);
    }

    public int[][] razporeditev() {
        int[][] stOsebVStanovanjih = new int[nacrtBloka.length][nacrtBloka[0].length];

        for(int i = 0; i < nacrtBloka.length; i++){
            for(int j = 0; j < nacrtBloka[i].length; j++){
                if(nacrtBloka[i][j] != null){
                    stOsebVStanovanjih[i][j] = nacrtBloka[i][j].steviloStanovalcev();
                }
                else{
                    stOsebVStanovanjih[i][j] = -1;
                }
            }
        }
        return stOsebVStanovanjih;
    }   

    public void izpisiRazporeditev(){
        int[][] raz = razporeditev();
        for(int i = 0; i < raz.length; i++){
            for(int j = 0; j < raz[i].length; j++){
                System.out.print(raz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void izpisiCrkeStanovanj(){
        for(int i = 0; i < nb.length; i++){
            for(int j = 0; j < nb[i].length; j++){
                System.out.print(nb[i][j]);
            }
            System.out.println();
        }
    }

    public int[] najdiSirinoInVisinoBloka(Stanovanje trenutno, int x, int y){
        int[] maksimumiMinimumi = this.najdiOdstopanjaOdZacetnihKoordiant(trenutno, trenutno, x, y, x, y, x, y, 0, new Stanovanje[1000], 0);
        
        
        int sirina = maksimumiMinimumi[0] + Math.abs(maksimumiMinimumi[2]) + 1;
        int visina = maksimumiMinimumi[1] + Math.abs(maksimumiMinimumi[3]) + 1;
        int minX = maksimumiMinimumi[2];
        int minY = maksimumiMinimumi[3];
        //System.out.println("Max in mins:");
        //System.out.println(maksimumiMinimumi[0] + ", " + maksimumiMinimumi[2]);
        //System.out.println(maksimumiMinimumi[1] + ", " + maksimumiMinimumi[3]);

        return new int[] {sirina, visina, minX, minY};
    }

    public int[] najdiOdstopanjaOdZacetnihKoordiant(Stanovanje trenutno, Stanovanje prejsnje, int x, int y, int maxX, int maxY, int minX, int minY, int premik, Stanovanje[] zePreverjena, int indexZePreverjena){
        // vrne najvecje koordinate in najmanjse koordiante glede na zacetne 

        if(prejsnje == trenutno){   // ce smo na zacetnem stanovanju
            zePreverjena[indexZePreverjena++] = trenutno;
        }

        // IZPIS
        // System.out.println("Trenutno na " + trenutno.crka + " KI IMA KOORD: " + x + ", " + y);
        // System.out.print("[");
        // for(int i = 0; i < indexZePreverjena; i++){
        //     System.out.print(zePreverjena[i].crka + " ");
        // }
        // System.out.println("]");
        // IZPIS

        // zapomnimo si najman in najvecm koord

        // klic preden se gre v podrekurzijo ali pa se returna (ce niso izpolnjeni pogoji - smo na koncu)
        if(x > maxX) {
            //System.out.printf("spremenimo maxX iz %d v %d\n", maxX, x);
            maxX = x;
        }
        if(y > maxY) {
            //System.out.printf("spremenimo maxY iz %d v %d\n", maxY, y);
            maxY = y;
        }
        if(x < minX) {
            //System.out.printf("spremenimo minX iz %d v %d\n", minX, x);
            minX = x;
        }
        if(y < minY) {
            //System.out.printf("spremenimo minY iz %d v %d\n", minY, y);
            minY = y;
        }
        //System.out.println("maxMinKoordinate: " + maxX + ", " + maxY + " _ " + minX + ", " + minY);

        
        for(int i = 0; i <= 3; i++){    // v vse smeri
            if(trenutno.getSosednjaStanovanja()[i] != null && !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[i], zePreverjena)){
                //System.out.println("Izvede se " + i);
                int novaX = x, novaY = y;
                zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[i];

                switch(i){
                    case 0: novaY = y-1; break;
                    case 1: novaX = x+1; break;
                    case 2: novaY = y+1; break;
                    case 3: novaX = x-1; break;
                }

                int[] noveKoord = this.najdiOdstopanjaOdZacetnihKoordiant(trenutno.getSosednjaStanovanja()[i], null, novaX, novaY, maxX, maxY, minX, minY, i, zePreverjena, indexZePreverjena);
                //System.out.println("koordinate: " + noveKoord[0] + "," + noveKoord[1]);
                if(noveKoord[0] > maxX){
                    //System.out.printf("SPREMEMBE maxX iz %d v %d\n", maxX, noveKoord[0]);
                    maxX = noveKoord[0];
                } 
                if(noveKoord[1] > maxY) {
                    //System.out.printf("SPREMEMBE maxX iz %d v %d\n", maxX, noveKoord[1]);
                    maxY = noveKoord[1];
                }
                if(noveKoord[2] < minX) {
                    //System.out.printf("SPREMEMBE maxX iz %d v %d\n", maxX, noveKoord[2]);
                    minX = noveKoord[2];
                }
                if(noveKoord[3] < minY) {
                    //System.out.printf("SPREMEMBE maxX iz %d v %d\n", maxX, noveKoord[3]);
                    minY = noveKoord[3];
                }
            }
        }

        //System.out.println("-----------return array----------------");
        return new int[] {maxX, maxY, minX, minY};
    }

    // boljsa za v razred stanovanje kot objektna
    private boolean jeZeBiloPreverjeno(Stanovanje trenutno, Stanovanje[] zePreverjena){
        for(Stanovanje stanovanje : zePreverjena){
            if(trenutno == stanovanje) return true;
        }
        return false;
    }

    private Stanovanje najdiNacrtBloka(Stanovanje trenutno, Stanovanje prejsnje, int x, int y, Stanovanje[] zePreverjena, int indexZePreverjena){
        // rekurzivna metoda ki klice vse sosede trenutnega stanovanja dokler ne najde vseh
        // metoda spusti stanovanja ki so null in ne gre veckrat po isti poti iskanja

        if(prejsnje == trenutno){
            // smo na zacetnem stanovanju - damo ga na listo ze preverjenih 
            zePreverjena[indexZePreverjena++] = trenutno;
            this.nb[this.nb.length - y - 1][x] = trenutno.crka;
        }

        for(int i = 0; i < 4; i++){
            if(trenutno.getSosednjaStanovanja()[i] != null && !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[i], zePreverjena)){
                zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[i];

                int novaX = x, novaY = y;
                switch(i){
                    case 0: novaY = y-1; break;
                    case 1: novaX = x+1; break;
                    case 2: novaY = y+1; break;
                    case 3: novaX = x-1; break;
                }

                this.nacrtBloka[this.nacrtBloka.length - 1 - novaY][novaX] = najdiNacrtBloka(trenutno.getSosednjaStanovanja()[i], null, novaX, novaY, zePreverjena, indexZePreverjena);
                this.nb[this.nb.length - 1 - novaY][novaX] = this.nacrtBloka[this.nacrtBloka.length - 1 - novaY][novaX].crka;
                //System.out.println("tukj: " + novaX + ", " + novaY + "; " + this.nacrtBloka[novaY][novaX].crka);
            }
        }
        return trenutno;
    }
}
