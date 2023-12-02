import java.util.Scanner;

public class DN05_63230273{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l, x;
        int[][][] liki = 
        {
            { // 0
                {1,1,1,1}
            },
            {
                {1},
                {1},
                {1},
                {1}
            },
            {
                {1,1},
                {1,1}
            },
            {
                {0,1,0},
                {1,1,1}
            },
            {
                {0,1},
                {1,1},
                {0,1}
            },
            {   // 5
                {1,1,1},
                {0,1,0}
            },
            {
                {1,0},
                {1,1},
                {1,0}
            },
            {
                {1,0},
                {1,0},
                {1,1}
            },
            {
                {0,0,1},
                {1,1,1}
            },
            {
                {1,1},
                {0,1},
                {0,1}
            },
            {   // 10
                {1,1,1},
                {1,0,0}
            },
            {
                {0,1},
                {0,1},
                {1,1}
            },
            {
                {1,1,1},
                {0,0,1}
            },
            {
                {1,1},
                {1,0},
                {1,0}
            },
            {
                {1,0,0},
                {1,1,1}
            },
            {   // 15
                {1,1,0},
                {0,1,1}
            },
            {
                {0,1},
                {1,1},
                {1,0}
            },
            {
                {0,1,1},
                {1,1,0}
            },
            {
                {1,0},
                {1,1},
                {0,1}
            }
        };

        int[] visineStolpcevPolja = new int[2004];

        for(int i = 0; i < n; i++){
            l = sc.nextInt();
            x = sc.nextInt();

            int sirinaLika = sirinaLika(liki[l]);
            int[] visineLika = visineLika(liki[l]);
            int[] spodnjeVisineLika = spodnjeVisineLika(liki[l]);   // visine praznin od spodaj glede na najnižjo točko v liku

            int maxVisinaIndex = najdiNajvisjiIndexNaObmočjuPadanjaLika(x, sirinaLika, visineStolpcevPolja);
            int trenutnaMaxVisinaNaObmočjuPadanjaLika = visineStolpcevPolja[maxVisinaIndex];
            
            // izračun novih višin po padcu lika
            for(int j = x + 1000; j < x + 1000 + sirinaLika; j++){
                visineStolpcevPolja[j] = trenutnaMaxVisinaNaObmočjuPadanjaLika + (visineLika[j - (1000 + x)] - (visineStolpcevPolja[maxVisinaIndex] > 0 ? spodnjeVisineLika[maxVisinaIndex - (1000 + x)] : 0));
            }
        }

        izpis(visineStolpcevPolja);

        sc.close();
    }

    private static int najdiNajvisjiIndexNaObmočjuPadanjaLika(int x, int sirinaLika, int[] visineStolpcevPolja){
        int maxVisinaIndex = 0;
        for(int j = x + 1000; j < x + 1000 + sirinaLika; j++){
            if(visineStolpcevPolja[j] > visineStolpcevPolja[maxVisinaIndex]){
                maxVisinaIndex = j;
            }
        }

        return maxVisinaIndex;
    }

    private static int[] visineLika(int[][] lik){
        int[] visine = new int[lik[0].length];

        for(int i = 0; i < lik[0].length; i++){
            for(int j = 0; j < lik.length; j++){
                if(lik[j][i] == 1){
                    visine[i] = lik.length - j;
                    break;
                }
            }
        }
        return visine;
    }

    private static int[] spodnjeVisineLika(int[][] lik){
        int[] visine = new int[lik[0].length];

        for(int i = 0; i < lik[0].length; i++){
            for(int j = lik.length - 1; j >= 0; j--){
                if(lik[j][i] == 1){
                    visine[i] = lik.length - j - 1;
                    break;
                }
            }
        }
        return visine;
    }

    private static int sirinaLika(int[][] lik){

        for(int i = lik[0].length - 1; i >= 0; i--){
            for(int j = 0; j < lik.length; j++){
                if(lik[j][i] == 1){
                    return i + 1;
                }
            }
        }

        return 0;
    }

    private static void izpis(int[] visineStolpcevPolja){
        for(int j = 0; j < visineStolpcevPolja.length; j++){
            if(visineStolpcevPolja[j] > 0){
                System.out.printf("%d: %d\n", (j - 1000), visineStolpcevPolja[j]);
            }
        }
    }
}