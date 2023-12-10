import java.util.Arrays;

public class Blok {
    private Stanovanje[][] nacrtBloka;
    private int visina; 
    private int sirina;

    public Blok(Stanovanje stanovanje) {
        int y = stanovanje.oddaljenostOdStanovanjaVsmeri(0);
        int x = stanovanje.oddaljenostOdStanovanjaVsmeri(3);
        System.out.println("----------");
        //nacrtBloka = new Stanovanje[stanovanje.najdiVisinoInSirinoBloka(null, x, y, x, y)[0]][stanovanje.najdiVisinoInSirinoBloka(null, x, y, x, y)[1]];
        
        System.out.println(Arrays.toString(this.najdiVisinoInSirinoBloka(stanovanje, null, x, y, x, y, new Stanovanje[1000], 0)));   // najvecje stevilo stanovanj je 1000
        System.out.println("^^^^^^^^");
        nacrtBloka[y][x] = stanovanje;

        stanovanje.sosednja(null, x, y, nacrtBloka);
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






    public int[] najdiVisinoInSirinoBloka(Stanovanje trenutno, Stanovanje prejsnje, int x, int y, int maxX, int maxY, Stanovanje[] zePreverjena, int indexZePreverjena){
        // neke vrste search algoritem
        if(prejsnje == null){
            zePreverjena[indexZePreverjena++] = trenutno;
        }

        System.out.println("Klic metode na stanovanju " + trenutno.crka + "... (prejsnji je bil " + (prejsnje == null?null:prejsnje.crka) + ")");
        System.out.print("[ ");
        for(int i = 0; i < indexZePreverjena; i++){
            System.out.print(zePreverjena[i].crka + " ");
        }
        System.out.println("]");
        System.out.println("[" + maxX + "," + maxY + "]");

        if(trenutno != null){
            if(x > maxX) maxX = x;
            if(y > maxY) maxY = y;
        }

        // s for zanko??
        // ce ni null
        if(trenutno.getSosednjaStanovanja()[0] != null && (prejsnje == null || !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[0], zePreverjena))){
            System.out.println("Izvede se 0");
            zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[0];
            int[] noveKoord = this.najdiVisinoInSirinoBloka(trenutno.getSosednjaStanovanja()[0], prejsnje, x, y-1, maxX, maxY, zePreverjena, indexZePreverjena);
            System.out.println("nove koordinate: " + noveKoord[0] + "," + noveKoord[1]);
            if(noveKoord[0] > maxX) maxX = noveKoord[0];
            if(noveKoord[1] > maxY) maxY = noveKoord[1];
        }
            
        // zamenjaj max
        if(trenutno.getSosednjaStanovanja()[1] != null && (prejsnje == null || !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[1], zePreverjena))){
            System.out.println("Izvede se 1");
            zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[1];
            int[] noveKoord = this.najdiVisinoInSirinoBloka(trenutno.getSosednjaStanovanja()[1], prejsnje, x+1, y, maxX, maxY, zePreverjena, indexZePreverjena);
            System.out.println("nove koordinate: " + noveKoord[0] + "," + noveKoord[1]);
            if(noveKoord[0] > maxX) maxX = noveKoord[0];
            if(noveKoord[1] > maxY) maxY = noveKoord[1];
        }
        // zamenjaj max
        if(trenutno.getSosednjaStanovanja()[2] != null && (prejsnje == null || !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[2], zePreverjena))){
            System.out.println("Izvede se 2");
            zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[2];
            int[] noveKoord = this.najdiVisinoInSirinoBloka(trenutno.getSosednjaStanovanja()[2], prejsnje, x, y+1, maxX, maxY, zePreverjena, indexZePreverjena);
            System.out.println("nove koordinate: " + noveKoord[0] + "," + noveKoord[1]);
            if(noveKoord[0] > maxX) maxX = noveKoord[0];
            if(noveKoord[1] > maxY) maxY = noveKoord[1];
        }
        // zamenjaj max
        if(trenutno.getSosednjaStanovanja()[3] != null && (prejsnje == null || !this.jeZeBiloPreverjeno(trenutno.getSosednjaStanovanja()[3], zePreverjena))){
            System.out.println("Izvede se 3");
            zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[3];
            int[] noveKoord = this.najdiVisinoInSirinoBloka(trenutno.getSosednjaStanovanja()[3], prejsnje, x-1, y, maxX, maxY, zePreverjena, indexZePreverjena);
            System.out.println("nove koordinate: " + noveKoord[0] + "," + noveKoord[1]);
            if(noveKoord[0] > maxX) maxX = noveKoord[0];
            if(noveKoord[1] > maxY) maxY = noveKoord[1];
        }
        // zamenjaj max
        // vrni tabelo max
        System.out.println("-----------return array----------------");
        return new int[] {maxX, maxY};
        

        
    }

    private boolean jeZeBiloPreverjeno(Stanovanje trenutno, Stanovanje[] zePreverjena){
        for(Stanovanje stanovanje : zePreverjena){
            if(trenutno == stanovanje) return true;
        }
        return false;
    }
}
