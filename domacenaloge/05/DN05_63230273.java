import java.util.Arrays;
import java.util.Scanner;

public class DN05_63230273{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /*
         * array visin, dodajamo bloke tako da vedno preverjamo po vrsticah in polozimo blok ko pride do trka
         * 
         */

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

        int[] visineStolpcevPolja = new int[2001];

        for(int i = 0; i < n; i++){
            l = sc.nextInt();
            x = sc.nextInt();

            int sirinal = sirinaLika(liki[l]);
            int[] visineLika = visineLika(liki[l]);
            int[] spodnjeVisineLika = spodnjeVisineLika(liki[l]);

            int maxVisinaIndex = 1000;
            for(int j = x + 1000; j < x + 1000 + sirinal; j++){
                if(visineStolpcevPolja[j] > visineStolpcevPolja[maxVisinaIndex]){
                    maxVisinaIndex = j;
                }
            }
            
            for(int j = x + 1000; j < x + 1000 + sirinal; j++){
                System.out.printf("\n->%d, %d, %d\n", maxVisinaIndex, j, x);
                int visina1 = (visineStolpcevPolja[maxVisinaIndex] + (visineLika[j - (1000 + x)] - spodnjeVisineLika[maxVisinaIndex - 1000 + x]));
                int visina2 = -1;
                if(spodnjeVisineLika[j - 1000 - x] == 0){
                    visina2 = visineStolpcevPolja[j] + visineLika[j - 1000 - x];
                }
                visineStolpcevPolja[j] = Math.max(visina1, visina2);
            }
            














            
            
        }

            

        //     if(maxVisinaIndex == 0){
        //         for(int k = 0; k < liki[l][0].length; k++){
        //             for(int j = 0; j < liki[l].length; j++){
        //                 if(liki[l][j][k] == 1){
        //                     visineStolpcevPolja[x + 999 + k] = liki[l].length - j + 1;
        //                     break;
        //                 }
        //             }
        //         }
        //     }
        //     // KAJ ČE PADE LIK 9 NA DESNO OD LIKA 14 ali LIK 13 PADE NA LEVI DEL LIKA 16
            
            


        //     int odmikKoordinateTrka = Math.abs(maxVisinaIndex - x);
        //     int pozicijay = 0;
        //     for(int j = liki[l].length - 1; j >= 0; j--){
        //         System.out.printf("\n[%d, %d, %d]\n", l, j, odmikKoordinateTrka);
        //         if(liki[l][j][odmikKoordinateTrka] == 1){
        //             pozicijay = j;  // koordinata y dela lika ki se dotakne prejšnjih
        //             break;
        //         }
        //     }

        //     for(int j = 0; j < liki[l].length; j++){
        //         for(int k = 0; k < liki[l][j].length; k++){
        //             if(liki[l][j][k] == 1){
        //                 int visinskaRazlika = Math.abs(pozicijay - j);
        //                 int novaVisina = visineStolpcevPolja[maxVisinaIndex] + visinskaRazlika + 1;//(liki[l].length - 1 - pozicijay) + visinskaRazlika;
        //                 if(novaVisina > visineStolpcevPolja[x + 999 + k]){
        //                     visineStolpcevPolja[x + 999 + k] = novaVisina;
        //                 }
        //             }
        //         }
        //     }

        //     for(int j = pozicijay; j >= 0; j--){
        //         for(int k = 0; k < liki[l][j].length; k++){
        //             if(liki[l][j][k] == 1){
        //                 visineStolpcevPolja[x + 999 + k]++;
        //             }
        //         }
        //     }
        // }

        //izpis(visineStolpcevPolja);

        sc.close();
    }


    private static int[] visineLika(int[][] lik){
        int[] visine = new int[lik[0].length]; // [3,]

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

    private static void izpis(int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] > 0){
                System.out.printf("%2d: %d\n", i - 999, a[i]);
            }
        }
    }
}