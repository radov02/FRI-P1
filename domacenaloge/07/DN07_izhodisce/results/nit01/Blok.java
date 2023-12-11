import java.util.Arrays;

public class Blok {
    private Stanovanje[][] nacrtBloka;

    public Blok(Stanovanje stanovanje) {
        int y = stanovanje.oddaljenostOdStanovanjaVsmeri(0);
        int x = stanovanje.oddaljenostOdStanovanjaVsmeri(3);
        
        //System.out.println("\n" + Arrays.toString(this.najdiSirinoInVisinoBloka(stanovanje, null, x, y, x, y, new Stanovanje[1000], 0)) + "\n");   // najvecje stevilo stanovanj je 1000
        int[] sirinaVisina = this.najdiSirinoInVisinoBloka(stanovanje, stanovanje, x, y, x, y, new Stanovanje[1000], 0);
        System.out.println("\n" + Arrays.toString(sirinaVisina) + "\n");   // najvecje stevilo stanovanj je 1000


        //nacrtBloka = new Stanovanje[stanovanje.najdiSirinoInVisinoBloka(null, x, y, x, y)[0]][stanovanje.najdiSirinoInVisinoBloka(null, x, y, x, y)[1]];
        nacrtBloka = new Stanovanje[sirinaVisina[1] + 1][sirinaVisina[0] + 1];
        nacrtBloka[y][x] = stanovanje;

        //stanovanje.sosednja(null, x, y, nacrtBloka);
    }

    public Oseba starosta() {
        Oseba najstarejsa = new Oseba(-1);
        for(int i = 0; i < nacrtBloka.length; i++){
            for(int j = 0; j < nacrtBloka[i].length; j++){
                if(nacrtBloka[i][j] != null && nacrtBloka[i][j].starosta().jeStarejsaOd(najstarejsa)){
                    najstarejsa = nacrtBloka[i][j].starosta();
                }
            }
        }
        return (najstarejsa.getStarost() > -1 ? najstarejsa:null);
    }

    public int[][] razporeditev() {
        int[][] stOsebVStanovanjih = new int[nacrtBloka.length][];
        for(int i = 0; i < nacrtBloka.length; i++){
            int[] nadstropjeBloka = new int[nacrtBloka[i].length];
            for(int j = 0; j < nacrtBloka[i].length; j++){
                if(nacrtBloka[i][j] != null){
                    nadstropjeBloka[j] = nacrtBloka[i][j].steviloStanovalcev();
                }
                else{
                    nadstropjeBloka[j] = -1;
                }
            }
            stOsebVStanovanjih[i] = nadstropjeBloka;
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
    }




    public int[] najdiSirinoInVisinoBloka(Stanovanje trenutno, int x, int y, int maxX, int maxY, Stanovanje[] zePreverjena, int indexZePreverjena){
        // na koncu za poenostavitev klicov metode
        return null;
    }

    public int[] najdiSirinoInVisinoBloka(Stanovanje trenutno, Stanovanje prejsnje, int x, int y, int maxX, int maxY, Stanovanje[] zePreverjena, int indexZePreverjena){
        // neke vrste search algoritem

        if(prejsnje == trenutno){   // ce smo na zacetnem stanovanju
            zePreverjena[indexZePreverjena++] = trenutno;
        }

                                                                            System.out.println("Trenutno na " + trenutno.crka);
                                                                            System.out.print("\n[");
                                                                            for(int i = 0; i < indexZePreverjena; i++){
                                                                                System.out.print(zePreverjena[i].crka + " ");
                                                                            }
                                                                            System.out.println("]");

        

        //        if(trenutno.getSosednjaStanovanja()[0] != null && (prejsnje == null || !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[0], zePreverjena))){
        if(trenutno.getSosednjaStanovanja()[0] != null && !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[0], zePreverjena)){
            System.out.println("Izvede se 0");
            zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[0];
            int[] noveKoord = this.najdiSirinoInVisinoBloka(trenutno.getSosednjaStanovanja()[0], null, x, y-1, maxX, maxY, zePreverjena, indexZePreverjena);
            System.out.println("nove koordinate: " + noveKoord[0] + "," + noveKoord[1]);
            if(noveKoord[0] > maxX) maxX = noveKoord[0];
            if(noveKoord[1] > maxY) maxY = noveKoord[1];
        }
        if(trenutno.getSosednjaStanovanja()[1] != null && !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[1], zePreverjena)){
            System.out.println("Izvede se 1");
            zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[1];
            int[] noveKoord = this.najdiSirinoInVisinoBloka(trenutno.getSosednjaStanovanja()[1], null, x+1, y, maxX, maxY, zePreverjena, indexZePreverjena);
            System.out.println("nove koordinate: " + noveKoord[0] + "," + noveKoord[1]);
            if(noveKoord[0] > maxX) maxX = noveKoord[0];
            if(noveKoord[1] > maxY) maxY = noveKoord[1];
        }
        if(trenutno.getSosednjaStanovanja()[2] != null && !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[2], zePreverjena)){
            System.out.println("Izvede se 2");
            zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[2];
            int[] noveKoord = this.najdiSirinoInVisinoBloka(trenutno.getSosednjaStanovanja()[2], null, x, y+1, maxX, maxY, zePreverjena, indexZePreverjena);
            System.out.println("nove koordinate: " + noveKoord[0] + "," + noveKoord[1]);
            if(noveKoord[0] > maxX) maxX = noveKoord[0];
            if(noveKoord[1] > maxY) maxY = noveKoord[1];
        }
        if(trenutno.getSosednjaStanovanja()[3] != null && !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[3], zePreverjena)){
            System.out.println("Izvede se 3");
            zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[3];
            int[] noveKoord = this.najdiSirinoInVisinoBloka(trenutno.getSosednjaStanovanja()[3], null, x-1, y, maxX, maxY, zePreverjena, indexZePreverjena);
            System.out.println("nove koordinate: " + noveKoord[0] + "," + noveKoord[1]);
            if(noveKoord[0] > maxX) maxX = noveKoord[0];
            if(noveKoord[1] > maxY) maxY = noveKoord[1];
        }

        // if(x > maxX) maxX = x;
        // if(y > maxY) maxY = y;

        System.out.println("-----------return array----------------");
        return new int[] {maxX, maxY};
    }

    private boolean jeZeBiloPreverjeno(Stanovanje trenutno, Stanovanje[] zePreverjena){
        for(Stanovanje stanovanje : zePreverjena){
            if(trenutno == stanovanje) return true;
        }
        return false;
    }





    private Stanovanje[][] najdiNacrtBloka(Stanovanje trenutno, Stanovanje prejsnje, int x, int y, Stanovanje[] zePreverjena, int indexZePreverjena){
        // rekurzivna metoda ki klice vse sosede trenutnega stanovanja dokler ne najde vseh
        // metoda spusti stanovanja ki so null in ne gre veckrat po isti poti iskanja

        if(prejsnje == null){
            // smo na zacetnem stanovanju - damo ga na listo ze preverjenih 
            zePreverjena[indexZePreverjena++] = trenutno;
        }
        prejsnje = trenutno;

        for(int i = 0; i < 4; i++){
            if(trenutno.getSosednjaStanovanja()[i] != null && !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[i], zePreverjena)){
                zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[i];

            }
        }
        return null;
    }
}
