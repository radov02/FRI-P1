import java.util.Arrays;

public class StiriVVrsto {
    private int[][] polje;  // obratna tabela (indeks 0 je za spodnjo vrstico)
    private boolean naVrsti;

    public StiriVVrsto(int stVrstic, int stStolpcev){
        this.polje = new int[stVrstic][stStolpcev];
        for(int i = 0; i < polje.length; i++){
            Arrays.fill(polje[i], 2);
        }
        this.naVrsti = false;
    }

    public int vrniSteviloVrstic(){
        return this.polje.length;
    }

    public int vrniSteviloStolpcev(){
        return this.polje[0].length;
    }

    public boolean vrzi(int stolpec){
        if(this.polje[this.polje.length - 1][stolpec] != 1){
            for(int i = 0; i < this.polje.length; i++){
                if(this.polje[i][stolpec] != 1){
                    this.polje[i][stolpec] = (naVrsti ? 1:0);
                    naVrsti = !naVrsti;
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public int naPotezi(){
        return (naVrsti ? 1:0);
    }

    public int vsebina(int vrstica, int stolpec){
        if(this.polje[vrstica][stolpec] == 2) return -1;
        return this.polje[vrstica][stolpec];
    }

    public int najdaljseZaporedje(int igralec)
    {
        int najdaljse = 0;
        // vrstice
        for(int i = 0; i < this.polje.length; i++){
            for(int j = 0; j < this.polje[i].length; j++){
                if(this.polje[i][j] == igralec){
                    int k = j;
                    while(this.polje[i][k] == igralec){
                        k++;
                    }

                    if(najdaljse < k)
                        najdaljse = (k - j - 1);

                    j += (k - j - 1);
                }
            }
        }

        // stolpci
        for(int i = 0; i < this.polje[i].length; i++){
            for(int j = 0; j < this.polje.length; j++){
                if(this.polje[j][i] == igralec){
                    int k = i;
                    while(this.polje[j][k] == igralec){
                        k++;
                    }

                    if(najdaljse < k)
                        najdaljse = (k - i - 1);

                    i += (k - i - 1);
                }
            }
        }

        // diagonale na desno
        for(int i = 0; i < this.polje.length; i++){
            for(int j = 0; j < this.polje[i].length; j++){
                if(this.polje[i][j] == igralec){
                    int k = i;
                    int l = j;
                    while(k < this.polje.length && l < this.polje[i].length && this.polje[k][l] == igralec){
                        k++;
                        l++;
                    }

                    if(najdaljse < k)
                        najdaljse = (k - j - 1);

                    j += (k - j - 1);
                }
            }
        }

        // diagonale na levo
        for(int i = 0; i < this.polje.length; i++){
            for(int j = 0; j < this.polje[i].length; j++){
                if(this.polje[i][j] == igralec){
                    int k = i;
                    int l = j;
                    while(k >= 0 && l >= 0 && this.polje[k][l] == igralec){
                        k--;
                        l--;
                    }

                    if(najdaljse < k)
                        najdaljse = (k - j - 1);

                    j += (k - j - 1);
                }
            }
        }

        return najdaljse;
    }

    public int izid(){
        int prvi = najdaljseZaporedje(0);
        int drugi = najdaljseZaporedje(1);

        if(prvi == 4 && drugi < 4) return 0;
        else if(drugi == 4 && prvi < 4) return 1;
        else return -1;
    }
}
