import java.util.Arrays;

public class Blok {
    private Stanovanje[][] nacrtBloka;
    private char[][] nb;

    public Blok(Stanovanje stanovanje) {
        int y = stanovanje.oddaljenostOdStanovanjaVsmeri(0);
        int x = stanovanje.oddaljenostOdStanovanjaVsmeri(3);
        
        //System.out.println("\n" + Arrays.toString(this.najdiSirinoInVisinoBloka(stanovanje, null, x, y, x, y, new Stanovanje[1000], 0)) + "\n");   // najvecje stevilo stanovanj je 1000
        int[] sirinaVisina = this.najdiSirinoInVisinoBloka(stanovanje, stanovanje, x, y, x, y, new Stanovanje[1000], 0);
        //System.out.println("\n" + Arrays.toString(sirinaVisina) + "\n");   // najvecje stevilo stanovanj je 1000


        //nacrtBloka = new Stanovanje[stanovanje.najdiSirinoInVisinoBloka(null, x, y, x, y)[0]][stanovanje.najdiSirinoInVisinoBloka(null, x, y, x, y)[1]];
        this.nacrtBloka = new Stanovanje[sirinaVisina[1] + 1][sirinaVisina[0] + 1];
        nb = new char[sirinaVisina[1] + 1][sirinaVisina[0] + 1];
        for(int i = 0; i < nb.length; i++){
            Arrays.fill(nb[i], '_');
        }
        this.nacrtBloka[this.nacrtBloka.length - 1 - y][x] = stanovanje;

        this.najdiNacrtBloka(stanovanje, stanovanje, x, y, new Stanovanje[1000], 0);
        // System.out.println("Izpis: ");
        // for(int i = 0; i < nb.length; i++){
        //     for(int j = 0; j < nb[i].length; j++){
        //         System.out.print(nb[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
    }

    public Oseba starosta() {
        Oseba najstarejsa = new Oseba(-1);
        for(int i = 0; i < nacrtBloka.length; i++){
            for(int j = 0; j < nacrtBloka[i].length; j++){
                if(nacrtBloka[i][j] != null && nacrtBloka[i][j].starosta() != null && nacrtBloka[i][j].starosta().jeStarejsaOd(najstarejsa)){
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

    public int[] najdiSirinoInVisinoBloka(Stanovanje trenutno, Stanovanje prejsnje, int x, int y, int maxX, int maxY, Stanovanje[] zePreverjena, int indexZePreverjena){
        // neke vrste search algoritem

        if(prejsnje == trenutno){   // ce smo na zacetnem stanovanju
            zePreverjena[indexZePreverjena++] = trenutno;
        }

        // IZPIS
        // System.out.println("Trenutno na " + trenutno.crka);
        // System.out.print("\n[");
        // for(int i = 0; i < indexZePreverjena; i++){
        //     System.out.print(zePreverjena[i].crka + " ");
        // }
        // System.out.println("]");
        // IZPIS
        
        for(int i = 0; i <= 3; i++){    // v vse smeri
            if(trenutno.getSosednjaStanovanja()[i] != null && !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[i], zePreverjena)){
                //System.out.println("Izvede se " + i);
                zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[i];

                int novaX = x, novaY = y;
                switch(i){
                    case 0: novaY = y-1; break;
                    case 1: novaX = x+1; break;
                    case 2: novaY = y+1; break;
                    case 3: novaX = x-1; break;
                }

                int[] noveKoord = this.najdiSirinoInVisinoBloka(trenutno.getSosednjaStanovanja()[i], null, novaX, novaY, maxX, maxY, zePreverjena, indexZePreverjena);
                //System.out.println("nove koordinate: " + noveKoord[0] + "," + noveKoord[1]);
                if(noveKoord[0] > maxX) maxX = noveKoord[0];
                if(noveKoord[1] > maxY) maxY = noveKoord[1];
            }
        }

        if(x > maxX) maxX = x;
        if(y > maxY) maxY = y;

        //System.out.println("-----------return array----------------");
        return new int[] {maxX, maxY};
    }

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

                if(this.nacrtBloka.length - 1 - novaY >= 0 && novaX >= 0){
                    this.nacrtBloka[this.nacrtBloka.length - 1 - novaY][novaX] = najdiNacrtBloka(trenutno.getSosednjaStanovanja()[i], null, novaX, novaY, zePreverjena, indexZePreverjena);
                    this.nb[novaY][novaX] = this.nacrtBloka[this.nacrtBloka.length - 1 - novaY][novaX].crka;
                    //System.out.println("tukj: " + novaX + ", " + novaY + "; " + this.nacrtBloka[novaY][novaX].crka);
                }
            }
        }
        return trenutno;
    }
}
