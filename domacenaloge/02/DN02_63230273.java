import java.util.Scanner;

public class DN02_63230273 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();   // oblika tipkovnice
        int d = sc.nextInt();   
        int n = sc.nextInt();   // število pritiskov tipk
        int tipke[] = new int[n];
        for(int i = 0; i < n; i++){
            tipke[i] = sc.nextInt();
        }

        int dolzinaPoti = 0;
        
        switch(b){
            case 1: // ravnovrstnica
                for(int i = 0; i < n-1; i++){
                    dolzinaPoti += Math.abs(tipke[i] - tipke[i+1]);
                }
            break;
            case 2: // kvadratnica
                for(int i = 0; i < n-1; i++){
                    // int vrsticaZacetna = tipke[i] / d;
                    // int stolpecZacetni = tipke[i] % d);
                    // int vrsticaKoncna = tipke[i+1] / d;
                    // int stolpecKoncni = tipke[i+1] % d;
                    // System.out.println("|" + vrsticaKoncna + "-" + vrsticaZacetna + "| + |" + stolpecKoncni + "-" + stolpecZacetni + "|");

                    dolzinaPoti += Math.abs(tipke[i+1] / d - tipke[i] / d) + Math.abs(tipke[i+1] % d - tipke[i] % d);
                }
            break;
            case 3: // piramidnica
                {
                    // d*d stevil
                    for(int i = 0; i < n-1; i++){
                        int vrsticaZacetna = (int)Math.sqrt(tipke[i]);
                        int odmikOdSredineZacetni = vrsticaZacetna * (vrsticaZacetna+1) - tipke[i];
                        int vrsticaKoncna = (int)Math.sqrt(tipke[i+1]);
                        int odmikOdSredineKoncni = vrsticaKoncna * (vrsticaKoncna+1) - tipke[i+1];

                        dolzinaPoti += Math.abs(vrsticaKoncna - vrsticaZacetna) + Math.abs(odmikOdSredineKoncni - odmikOdSredineZacetni);
                    }
                }
            break;
            case 4: // spiralnica
                {
                    int x_prejsnji = 0, y_prejsnji = 0, x, y;

                    for(int i = 0; i < n; i++){
                        
                        if(tipke[i] == 0){
                            x = (int)(d / 2);
                            y = (int)(d / 2);
                        }
                        else{
                            int kvadrat = 1;    // kvadrat (obroc) s stranico "kvadrat"

                            int zgornjaLeva = kvadrat*kvadrat;  // zgornja leva po kvadratih (od posamezne stevilke)
                            int xzl = (int)(d / 2), yzl = (int)(d / 2); // koordinate zgornje leve
                            
                            int tmp = zgornjaLeva;  // za preverjanje naslednjega kvadrata, ki ni nujno ustrezen
                            // poglejmo, kateri kvadrat bo zgornja leva zdajšnjega števila:
                            tmp = kvadrat*kvadrat;
                            while(tipke[i] >= tmp)
                            {
                                zgornjaLeva = tmp;
                                xzl--;
                                yzl--;
                                kvadrat += 2;
                                
                                tmp = kvadrat*kvadrat;
                            }
                            //System.out.printf("Za stevilko %d je zgornje levo izhodisce %d (%d, %d), nahaja se v kvadratu %d\n", tipke[i], zgornjaLeva, xzl, yzl, kvadrat);


                            int stranica = (tipke[i] - zgornjaLeva) / (kvadrat - 1);

                            if(stranica == 0){  // zgornja stranica
                                x = xzl + (tipke[i] - zgornjaLeva) % (kvadrat - 1);
                                y = yzl;
                            }
                            else if(stranica == 1){ // desna stranica
                                x = xzl + kvadrat - 1;
                                y = yzl + (tipke[i] - zgornjaLeva) % (kvadrat - 1);
                            }
                            else if(stranica == 2){ // spodnja stranica
                                x = xzl + kvadrat - 1 - ((tipke[i] - zgornjaLeva) % (kvadrat - 1));
                                y = yzl + kvadrat-1;
                            }
                            else {  // leva stranica
                                x = xzl;
                                y = yzl + kvadrat - 1 - ((tipke[i] - zgornjaLeva) % (kvadrat - 1));
                            }
                        }

                        if(i > 0){
                            dolzinaPoti += (Math.abs(x - x_prejsnji) + Math.abs(y - y_prejsnji));
                        }
                        
                        x_prejsnji = x;
                        y_prejsnji = y;
                    }
                }
            break;
        }

        System.out.println(dolzinaPoti);

        sc.close();
    }
}
