import java.util.Arrays;

public class Urejanje {
    // stabilen algoritem - ne meša med seboj elementov, ki so enakovredni po urejevalnem kriteriju
    public static void main(String[] args){
        int[] tabela = {80, 50, 75, 30, 45, 60, 95, 20};

        System.out.println(Arrays.toString(tabela));
        urejanjeZVstavljanjem(tabela);
        System.out.println(Arrays.toString(tabela));
    }

    public static void urejanjeZVstavljanjem(int[] t){
        int urejen = 0;
        while(urejen < t.length - 1){
            int vstavimo = t[urejen+1];
            int i = 0;
            while(t[i] < vstavimo){
                i++;
            }
            for(int j = urejen+1; j > i; j--){
                t[j] = t[j-1];
            }
            t[i] = vstavimo;
            urejen++;
        }
    }
}
