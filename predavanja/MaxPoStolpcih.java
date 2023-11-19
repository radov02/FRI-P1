import java.util.Arrays;

public class MaxPoStolpcih {
    public static void main(String[] args){

        int[][] rezultati = {
            {60, 50, 10, 50, 10},
            {20, 40, 80, 20, 40},
            {70, 40, 70, 60, 50},
            {30, 20, 30, 90, 40}
        };

        int[] iMax = indeksiMaksimumovStolpcev(rezultati);
        System.out.println(Arrays.toString(iMax));
    }

    private static int[] indeksiMaksimumovStolpcev(int[][] t)
    {
        int[] iMax = new int[t[0].length];
        // predpostavimo t.length > 0
        // predpostavimio vse vrstice imajo enako število elementov

        for(int i = 0; i < t[0].length; i++){
            int maxStolpecIndex = 0;
            for(int j = 1; j < t.length; j++){
                if(t[j][i] > t[maxStolpecIndex][i]){
                    maxStolpecIndex = j;
                }
            }
            iMax[i] = maxStolpecIndex;
        }

        return iMax;
    }
}
