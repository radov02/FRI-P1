
import java.util.Arrays;

public class Test33 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[34][];
        os[0] = new Oseba[1];
        os[0][0] = new Oseba("a b", 'Z', 4567);
        os[1] = new Oseba[0];
        os[2] = new Oseba[3];
        os[2][0] = new Oseba("a b", 'Z', 9125);
        os[2][1] = new Oseba("a b", 'Z', 5214);
        os[2][2] = new Oseba("a b", 'Z', 3205);
        os[3] = new Oseba[6];
        os[3][0] = new Oseba("a b", 'M', 3090);
        os[3][1] = new Oseba("a b", 'M', 9895);
        os[3][2] = new Oseba("a b", 'Z', 7837);
        os[3][3] = new Oseba("a b", 'M', 13);
        os[3][4] = new Oseba("a b", 'M', 7946);
        os[3][5] = new Oseba("a b", 'Z', 8668);
        os[4] = new Oseba[0];
        os[5] = new Oseba[5];
        os[5][0] = new Oseba("a b", 'M', 4380);
        os[5][1] = new Oseba("a b", 'Z', 4379);
        os[5][2] = new Oseba("a b", 'Z', 4353);
        os[5][3] = new Oseba("a b", 'Z', 3455);
        os[5][4] = new Oseba("a b", 'M', 2472);
        os[6] = new Oseba[3];
        os[6][0] = new Oseba("a b", 'Z', 4012);
        os[6][1] = new Oseba("a b", 'Z', 3847);
        os[6][2] = new Oseba("a b", 'Z', 3929);
        os[7] = new Oseba[10];
        os[7][0] = new Oseba("a b", 'M', 9950);
        os[7][1] = new Oseba("a b", 'M', 2929);
        os[7][2] = new Oseba("a b", 'M', 8871);
        os[7][3] = new Oseba("a b", 'M', 4524);
        os[7][4] = new Oseba("a b", 'Z', 8660);
        os[7][5] = new Oseba("a b", 'Z', 4030);
        os[7][6] = new Oseba("a b", 'M', 1673);
        os[7][7] = new Oseba("a b", 'M', 9496);
        os[7][8] = new Oseba("a b", 'M', 2265);
        os[7][9] = new Oseba("a b", 'M', 3541);
        os[8] = new Oseba[2];
        os[8][0] = new Oseba("a b", 'Z', 7006);
        os[8][1] = new Oseba("a b", 'M', 9289);
        os[9] = new Oseba[9];
        os[9][0] = new Oseba("a b", 'Z', 1137);
        os[9][1] = new Oseba("a b", 'M', 3829);
        os[9][2] = new Oseba("a b", 'Z', 1633);
        os[9][3] = new Oseba("a b", 'M', 2254);
        os[9][4] = new Oseba("a b", 'M', 9883);
        os[9][5] = new Oseba("a b", 'Z', 9757);
        os[9][6] = new Oseba("a b", 'Z', 4702);
        os[9][7] = new Oseba("a b", 'M', 1713);
        os[9][8] = new Oseba("a b", 'M', 2263);
        os[10] = new Oseba[7];
        os[10][0] = new Oseba("a b", 'M', 8040);
        os[10][1] = new Oseba("a b", 'M', 5276);
        os[10][2] = new Oseba("a b", 'Z', 2673);
        os[10][3] = new Oseba("a b", 'Z', 1886);
        os[10][4] = new Oseba("a b", 'M', 8139);
        os[10][5] = new Oseba("a b", 'Z', 3297);
        os[10][6] = new Oseba("a b", 'M', 7037);
        os[11] = new Oseba[9];
        os[11][0] = new Oseba("a b", 'M', 9504);
        os[11][1] = new Oseba("a b", 'Z', 6511);
        os[11][2] = new Oseba("a b", 'M', 4223);
        os[11][3] = new Oseba("a b", 'M', 4059);
        os[11][4] = new Oseba("a b", 'Z', 3051);
        os[11][5] = new Oseba("a b", 'M', 4514);
        os[11][6] = new Oseba("a b", 'M', 4989);
        os[11][7] = new Oseba("a b", 'Z', 2101);
        os[11][8] = new Oseba("a b", 'Z', 7202);
        os[12] = new Oseba[10];
        os[12][0] = new Oseba("a b", 'M', 6652);
        os[12][1] = new Oseba("a b", 'Z', 9840);
        os[12][2] = new Oseba("a b", 'Z', 9037);
        os[12][3] = new Oseba("a b", 'Z', 8455);
        os[12][4] = new Oseba("a b", 'M', 8956);
        os[12][5] = new Oseba("a b", 'M', 5598);
        os[12][6] = new Oseba("a b", 'Z', 1822);
        os[12][7] = new Oseba("a b", 'M', 4118);
        os[12][8] = new Oseba("a b", 'M', 6222);
        os[12][9] = new Oseba("a b", 'Z', 7244);
        os[13] = new Oseba[6];
        os[13][0] = new Oseba("a b", 'Z', 1722);
        os[13][1] = new Oseba("a b", 'Z', 2141);
        os[13][2] = new Oseba("a b", 'M', 485);
        os[13][3] = new Oseba("a b", 'M', 1997);
        os[13][4] = new Oseba("a b", 'M', 3700);
        os[13][5] = new Oseba("a b", 'Z', 4213);
        os[14] = new Oseba[6];
        os[14][0] = new Oseba("a b", 'Z', 3176);
        os[14][1] = new Oseba("a b", 'M', 9430);
        os[14][2] = new Oseba("a b", 'M', 5858);
        os[14][3] = new Oseba("a b", 'M', 8795);
        os[14][4] = new Oseba("a b", 'Z', 8393);
        os[14][5] = new Oseba("a b", 'M', 6633);
        os[15] = new Oseba[3];
        os[15][0] = new Oseba("a b", 'Z', 128);
        os[15][1] = new Oseba("a b", 'M', 115);
        os[15][2] = new Oseba("a b", 'M', 3663);
        os[16] = new Oseba[8];
        os[16][0] = new Oseba("a b", 'Z', 2978);
        os[16][1] = new Oseba("a b", 'Z', 6567);
        os[16][2] = new Oseba("a b", 'M', 3535);
        os[16][3] = new Oseba("a b", 'Z', 4432);
        os[16][4] = new Oseba("a b", 'M', 8389);
        os[16][5] = new Oseba("a b", 'Z', 7200);
        os[16][6] = new Oseba("a b", 'M', 7169);
        os[16][7] = new Oseba("a b", 'M', 7374);
        os[17] = new Oseba[9];
        os[17][0] = new Oseba("a b", 'M', 5420);
        os[17][1] = new Oseba("a b", 'M', 1566);
        os[17][2] = new Oseba("a b", 'M', 9832);
        os[17][3] = new Oseba("a b", 'Z', 8404);
        os[17][4] = new Oseba("a b", 'M', 3679);
        os[17][5] = new Oseba("a b", 'Z', 1890);
        os[17][6] = new Oseba("a b", 'M', 8288);
        os[17][7] = new Oseba("a b", 'M', 2864);
        os[17][8] = new Oseba("a b", 'M', 1160);
        os[18] = new Oseba[7];
        os[18][0] = new Oseba("a b", 'M', 2348);
        os[18][1] = new Oseba("a b", 'M', 7152);
        os[18][2] = new Oseba("a b", 'Z', 3027);
        os[18][3] = new Oseba("a b", 'Z', 4275);
        os[18][4] = new Oseba("a b", 'M', 5233);
        os[18][5] = new Oseba("a b", 'Z', 1912);
        os[18][6] = new Oseba("a b", 'Z', 2592);
        os[19] = new Oseba[9];
        os[19][0] = new Oseba("a b", 'Z', 3597);
        os[19][1] = new Oseba("a b", 'M', 6919);
        os[19][2] = new Oseba("a b", 'M', 1414);
        os[19][3] = new Oseba("a b", 'Z', 60);
        os[19][4] = new Oseba("a b", 'M', 9595);
        os[19][5] = new Oseba("a b", 'Z', 9433);
        os[19][6] = new Oseba("a b", 'Z', 6355);
        os[19][7] = new Oseba("a b", 'M', 7211);
        os[19][8] = new Oseba("a b", 'M', 7251);
        os[20] = new Oseba[2];
        os[20][0] = new Oseba("a b", 'M', 1058);
        os[20][1] = new Oseba("a b", 'Z', 7084);
        os[21] = new Oseba[9];
        os[21][0] = new Oseba("a b", 'M', 505);
        os[21][1] = new Oseba("a b", 'Z', 6814);
        os[21][2] = new Oseba("a b", 'M', 5862);
        os[21][3] = new Oseba("a b", 'Z', 3336);
        os[21][4] = new Oseba("a b", 'Z', 4147);
        os[21][5] = new Oseba("a b", 'M', 181);
        os[21][6] = new Oseba("a b", 'Z', 4006);
        os[21][7] = new Oseba("a b", 'M', 9564);
        os[21][8] = new Oseba("a b", 'Z', 9828);
        os[22] = new Oseba[0];
        os[23] = new Oseba[3];
        os[23][0] = new Oseba("a b", 'M', 3786);
        os[23][1] = new Oseba("a b", 'Z', 2731);
        os[23][2] = new Oseba("a b", 'M', 2474);
        os[24] = new Oseba[10];
        os[24][0] = new Oseba("a b", 'M', 3318);
        os[24][1] = new Oseba("a b", 'Z', 1144);
        os[24][2] = new Oseba("a b", 'M', 8027);
        os[24][3] = new Oseba("a b", 'M', 4165);
        os[24][4] = new Oseba("a b", 'M', 4041);
        os[24][5] = new Oseba("a b", 'M', 1565);
        os[24][6] = new Oseba("a b", 'Z', 6004);
        os[24][7] = new Oseba("a b", 'M', 1549);
        os[24][8] = new Oseba("a b", 'Z', 3936);
        os[24][9] = new Oseba("a b", 'M', 4409);
        os[25] = new Oseba[0];
        os[26] = new Oseba[5];
        os[26][0] = new Oseba("a b", 'M', 4383);
        os[26][1] = new Oseba("a b", 'Z', 8539);
        os[26][2] = new Oseba("a b", 'M', 8948);
        os[26][3] = new Oseba("a b", 'M', 5453);
        os[26][4] = new Oseba("a b", 'M', 3913);
        os[27] = new Oseba[1];
        os[27][0] = new Oseba("a b", 'M', 395);
        os[28] = new Oseba[1];
        os[28][0] = new Oseba("a b", 'Z', 4830);
        os[29] = new Oseba[2];
        os[29][0] = new Oseba("a b", 'Z', 8420);
        os[29][1] = new Oseba("a b", 'Z', 4452);
        os[30] = new Oseba[8];
        os[30][0] = new Oseba("a b", 'Z', 9830);
        os[30][1] = new Oseba("a b", 'Z', 3529);
        os[30][2] = new Oseba("a b", 'M', 6598);
        os[30][3] = new Oseba("a b", 'M', 7796);
        os[30][4] = new Oseba("a b", 'Z', 6405);
        os[30][5] = new Oseba("a b", 'Z', 5272);
        os[30][6] = new Oseba("a b", 'Z', 213);
        os[30][7] = new Oseba("a b", 'M', 6682);
        os[31] = new Oseba[5];
        os[31][0] = new Oseba("a b", 'M', 3134);
        os[31][1] = new Oseba("a b", 'M', 9119);
        os[31][2] = new Oseba("a b", 'Z', 1172);
        os[31][3] = new Oseba("a b", 'M', 8538);
        os[31][4] = new Oseba("a b", 'M', 8480);
        os[32] = new Oseba[4];
        os[32][0] = new Oseba("a b", 'Z', 7550);
        os[32][1] = new Oseba("a b", 'Z', 3795);
        os[32][2] = new Oseba("a b", 'Z', 4250);
        os[32][3] = new Oseba("a b", 'Z', 468);
        os[33] = new Oseba[6];
        os[33][0] = new Oseba("a b", 'Z', 5460);
        os[33][1] = new Oseba("a b", 'Z', 9651);
        os[33][2] = new Oseba("a b", 'Z', 144);
        os[33][3] = new Oseba("a b", 'M', 6752);
        os[33][4] = new Oseba("a b", 'Z', 6305);
        os[33][5] = new Oseba("a b", 'Z', 4835);
        
        Stanovanje[] st = new Stanovanje[34];
        st[0] = new Stanovanje(os[0]);
        st[1] = new Stanovanje(os[1]);
        st[2] = new Stanovanje(os[2]);
        st[3] = new Stanovanje(os[3]);
        st[4] = new Stanovanje(os[4]);
        st[5] = new Stanovanje(os[5]);
        st[6] = new Stanovanje(os[6]);
        st[7] = new Stanovanje(os[7]);
        st[8] = new Stanovanje(os[8]);
        st[9] = new Stanovanje(os[9]);
        st[10] = new Stanovanje(os[10]);
        st[11] = new Stanovanje(os[11]);
        st[12] = new Stanovanje(os[12]);
        st[13] = new Stanovanje(os[13]);
        st[14] = new Stanovanje(os[14]);
        st[15] = new Stanovanje(os[15]);
        st[16] = new Stanovanje(os[16]);
        st[17] = new Stanovanje(os[17]);
        st[18] = new Stanovanje(os[18]);
        st[19] = new Stanovanje(os[19]);
        st[20] = new Stanovanje(os[20]);
        st[21] = new Stanovanje(os[21]);
        st[22] = new Stanovanje(os[22]);
        st[23] = new Stanovanje(os[23]);
        st[24] = new Stanovanje(os[24]);
        st[25] = new Stanovanje(os[25]);
        st[26] = new Stanovanje(os[26]);
        st[27] = new Stanovanje(os[27]);
        st[28] = new Stanovanje(os[28]);
        st[29] = new Stanovanje(os[29]);
        st[30] = new Stanovanje(os[30]);
        st[31] = new Stanovanje(os[31]);
        st[32] = new Stanovanje(os[32]);
        st[33] = new Stanovanje(os[33]);
        st[0].nastaviSosede(null, null, st[21], st[11]);
        st[1].nastaviSosede(st[3], st[24], st[4], st[7]);
        st[2].nastaviSosede(null, null, st[10], st[5]);
        st[3].nastaviSosede(st[27], st[8], st[1], st[17]);
        st[4].nastaviSosede(st[1], st[22], st[30], st[33]);
        st[5].nastaviSosede(null, st[2], st[31], null);
        st[6].nastaviSosede(st[14], st[7], st[23], st[29]);
        st[7].nastaviSosede(st[17], st[1], st[33], st[6]);
        st[8].nastaviSosede(st[25], st[13], st[24], st[3]);
        st[9].nastaviSosede(st[23], st[12], null, null);
        st[10].nastaviSosede(st[2], st[32], st[25], st[31]);
        st[11].nastaviSosede(st[32], st[0], st[13], st[25]);
        st[12].nastaviSosede(st[33], st[30], null, st[9]);
        st[13].nastaviSosede(st[11], st[21], st[15], st[8]);
        st[14].nastaviSosede(st[19], st[17], st[6], st[18]);
        st[15].nastaviSosede(st[13], null, null, st[24]);
        st[16].nastaviSosede(null, st[18], null, null);
        st[17].nastaviSosede(st[26], st[3], st[7], st[14]);
        st[18].nastaviSosede(null, st[14], st[29], st[16]);
        st[19].nastaviSosede(null, st[26], st[14], null);
        st[20].nastaviSosede(null, st[31], st[26], null);
        st[21].nastaviSosede(st[0], null, null, st[13]);
        st[22].nastaviSosede(st[24], null, null, st[4]);
        st[23].nastaviSosede(st[6], st[33], st[9], st[28]);
        st[24].nastaviSosede(st[8], st[15], st[22], st[1]);
        st[25].nastaviSosede(st[10], st[11], st[8], st[27]);
        st[26].nastaviSosede(st[20], st[27], st[17], st[19]);
        st[27].nastaviSosede(st[31], st[25], st[3], st[26]);
        st[28].nastaviSosede(st[29], st[23], null, null);
        st[29].nastaviSosede(st[18], st[6], st[28], null);
        st[30].nastaviSosede(st[4], null, null, st[12]);
        st[31].nastaviSosede(st[5], st[10], st[27], st[20]);
        st[32].nastaviSosede(null, null, st[11], st[10]);
        st[33].nastaviSosede(st[7], st[4], st[12], st[23]);
        
        TestSkupno.preveri(st[26].starostaSosescine() == os[17][2]);
    }
}
