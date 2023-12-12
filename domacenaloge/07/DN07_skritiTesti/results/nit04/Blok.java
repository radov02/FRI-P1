import java.util.Arrays;

public class Blok {
    private Stanovanje[][] nacrtBloka;
    private char[][] crkeStanovanj;    // debug - tabela je v obratnem vrstnem redu po vrsticah

    public Blok(Stanovanje stanovanje) {
        // zacnemo na nekih koordinatah ki jo kasneje popravljamo
        int y = stanovanje.oddaljenostOdStanovanjaVsmeri(0);
        int x = stanovanje.oddaljenostOdStanovanjaVsmeri(3);
        
        int[] sirinaVisinaBloka = this.najdiSirinoInVisinoBloka(stanovanje, x, y);  // [sirina, visina, minX, minY]
        int koordinataXzacetnegaStanovanjaVbloku = x + Math.abs(sirinaVisinaBloka[2]);
        int koordinataYzacetnegaStanovanjaVbloku = y + Math.abs(sirinaVisinaBloka[3]);
        this.crkeStanovanj = new char[sirinaVisinaBloka[1]][sirinaVisinaBloka[0]];

        // debug:
        for(int i = 0; i < crkeStanovanj.length; i++){
            Arrays.fill(crkeStanovanj[i], '_');
        }

        this.nacrtBloka = new Stanovanje[sirinaVisinaBloka[1]][sirinaVisinaBloka[0]];
        this.najdiNacrtBloka(stanovanje, koordinataXzacetnegaStanovanjaVbloku, koordinataYzacetnegaStanovanjaVbloku);
    }
    public Oseba starosta() {
        // gre cez nacrt bloka po vseh stanovanjih in najde najstarejso osebo
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
    public void izpisiCrkeStanovanj(){
        for(int i = crkeStanovanj.length - 1; i >= 0; i--){
            for(int j = 0; j < crkeStanovanj[i].length; j++){
                System.out.print(crkeStanovanj[i][j]);
            }
            System.out.println();
        }
    }
    public int[] najdiSirinoInVisinoBloka(Stanovanje trenutno, int x, int y){
        int[] maksMinIndeksi = this.najdiOdstopanjaOdZacetnihKoordiant(trenutno, trenutno, x, y, x, y, x, y, 0, new Stanovanje[1000], 0);
        // [maxX, maxY, minX, minY]
        int sirina = maksMinIndeksi[0] + Math.abs(maksMinIndeksi[2]) + 1;
        int visina = maksMinIndeksi[1] + Math.abs(maksMinIndeksi[3]) + 1;
        int minX = maksMinIndeksi[2];
        int minY = maksMinIndeksi[3];

        return new int[] {sirina, visina, minX, minY};
    }
    private int[] najdiOdstopanjaOdZacetnihKoordiant(Stanovanje trenutno, Stanovanje prejsnje, int x, int y, int maxX, int maxY, int minX, int minY, int premik, Stanovanje[] zePreverjena, int indexZePreverjena){
        // vrne najvecje koordinate in najmanjse koordiante glede na zacetni privzeti koordinatni sistem

        if(prejsnje == trenutno){
            // ce smo na zacetnem stanovanju
            zePreverjena[indexZePreverjena++] = trenutno;
        }

        if(x > maxX) maxX = x;
        if(x < minX) minX = x;
        if(y > maxY) maxY = y;
        if(y < minY) minY = y;
        
        for(int i = 0; i <= 3; i++)    // v vse smeri (dol, desno, gor, levo)
        {
            if(trenutno.getSosednjaStanovanja()[i] != null && !trenutno.getSosednjaStanovanja()[i].jeZeBiloPreverjeno(zePreverjena))
            {
                int novaX = x, novaY = y;
                zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[i];    // zapomnimo si ze preverjena stanovanja za nazaj - ne obravnavamo se enkrat

                switch(i){
                    case 0: novaY = y-1; break; // dol
                    case 1: novaX = x+1; break; // desno
                    case 2: novaY = y+1; break; // gor
                    case 3: novaX = x-1; break; // levo
                }

                // klicemo rekurzivno, dokler ne pridemo do stanovanja ki nima vec novih sosedov in sproti nazaj vracamo nove najvecje koordinate
                int[] noveNajvecjeKoordinate = this.najdiOdstopanjaOdZacetnihKoordiant(trenutno.getSosednjaStanovanja()[i], null, novaX, novaY, maxX, maxY, minX, minY, i, zePreverjena, indexZePreverjena);
                maxX = noveNajvecjeKoordinate[0];
                maxY = noveNajvecjeKoordinate[1];
                minX = noveNajvecjeKoordinate[2];
                minY = noveNajvecjeKoordinate[3];
            }
        }

        return new int[] {maxX, maxY, minX, minY};
    }
    private void najdiNacrtBloka(Stanovanje trenutno, int x, int y){
        // obrnemo vrstice da dobimo dejanski nacrt bloka (potrebno ker imamo koordinatni sistem v drugo smer)
        this.najdiObrnjenNacrtBloka(trenutno, trenutno, x, y, new Stanovanje[1000], 0);  // najvecje stevilo stanovanj je 1000

        Stanovanje[][] praviNacrt = new Stanovanje[this.nacrtBloka.length][this.nacrtBloka[0].length];

        for(int i = 0; i < this.nacrtBloka.length; i++){
            praviNacrt[praviNacrt.length - 1 - i] = nacrtBloka[i];
        }

        this.nacrtBloka = praviNacrt;
    }
    private Stanovanje najdiObrnjenNacrtBloka(Stanovanje trenutno, Stanovanje prejsnje, int x, int y, Stanovanje[] zePreverjena, int indexZePreverjena){
        // rekurzivna metoda ki klice vse sosede trenutnega stanovanja dokler ne najde vseh
        // metoda spusti stanovanja ki so null in tista, ki so bila predhodno ze obiskana (tezava ker pri zacetnih stanovanjih se nimamo zapolnjene tabele zePreverjena in je po vrnitvi metoda nazaj ta tabela bolj prazna, zato lahko pride do ponovitev)

        if(prejsnje == trenutno){
            // smo na zacetnem stanovanju
            zePreverjena[indexZePreverjena++] = trenutno;
            this.nacrtBloka[y][x] = trenutno;
            this.crkeStanovanj[y][x] = trenutno.crka;
        }

        int novaX = x, novaY = y;
        for(int i = 0; i <= 3; i++)
        {
            if(trenutno.getSosednjaStanovanja()[i] != null && !trenutno.getSosednjaStanovanja()[i].jeZeBiloPreverjeno(zePreverjena))
            {
                zePreverjena[indexZePreverjena++] = trenutno.getSosednjaStanovanja()[i];

                novaX = x; 
                novaY = y;
                switch(i){
                    case 0: novaY = y-1; break; // dol
                    case 1: novaX = x+1; break; // desno
                    case 2: novaY = y+1; break; // gor
                    case 3: novaX = x-1; break; // levo
                }

                this.nacrtBloka[novaY][novaX] = najdiObrnjenNacrtBloka(trenutno.getSosednjaStanovanja()[i], null, novaX, novaY, zePreverjena, indexZePreverjena);
                this.crkeStanovanj[novaY][novaX] = this.nacrtBloka[novaY][novaX].crka;
            }
        }
        return trenutno;
    }
}
