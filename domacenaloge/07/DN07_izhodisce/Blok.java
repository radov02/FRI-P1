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
        
        System.out.println(Arrays.toString(stanovanje.najdiVisinoInSirinoBloka(null, x, y, x, y, new Stanovanje[1000], 0)));   // najvecje stevilo stanovanj je 1000
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
}
