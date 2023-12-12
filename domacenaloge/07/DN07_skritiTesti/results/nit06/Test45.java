
import java.util.Arrays;
import java.util.Comparator;

public class Test45 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[45][];
        os[0] = new Oseba[5];
        os[0][0] = new Oseba("a b", 'M', 7565);
        os[0][1] = new Oseba("a b", 'M', 1701);
        os[0][2] = new Oseba("a b", 'Z', 8204);
        os[0][3] = new Oseba("a b", 'Z', 4375);
        os[0][4] = new Oseba("a b", 'M', 6085);
        os[1] = new Oseba[5];
        os[1][0] = new Oseba("a b", 'M', 586);
        os[1][1] = new Oseba("a b", 'M', 9850);
        os[1][2] = new Oseba("a b", 'Z', 2299);
        os[1][3] = new Oseba("a b", 'M', 5597);
        os[1][4] = new Oseba("a b", 'Z', 4885);
        os[2] = new Oseba[5];
        os[2][0] = new Oseba("a b", 'Z', 6967);
        os[2][1] = new Oseba("a b", 'M', 1937);
        os[2][2] = new Oseba("a b", 'Z', 3555);
        os[2][3] = new Oseba("a b", 'Z', 798);
        os[2][4] = new Oseba("a b", 'Z', 2054);
        os[3] = new Oseba[7];
        os[3][0] = new Oseba("a b", 'Z', 7256);
        os[3][1] = new Oseba("a b", 'M', 9584);
        os[3][2] = new Oseba("a b", 'M', 583);
        os[3][3] = new Oseba("a b", 'Z', 2906);
        os[3][4] = new Oseba("a b", 'M', 8752);
        os[3][5] = new Oseba("a b", 'Z', 7854);
        os[3][6] = new Oseba("a b", 'Z', 1745);
        os[4] = new Oseba[3];
        os[4][0] = new Oseba("a b", 'M', 9439);
        os[4][1] = new Oseba("a b", 'Z', 184);
        os[4][2] = new Oseba("a b", 'Z', 5511);
        os[5] = new Oseba[6];
        os[5][0] = new Oseba("a b", 'M', 5047);
        os[5][1] = new Oseba("a b", 'Z', 1438);
        os[5][2] = new Oseba("a b", 'M', 7508);
        os[5][3] = new Oseba("a b", 'Z', 4672);
        os[5][4] = new Oseba("a b", 'M', 5865);
        os[5][5] = new Oseba("a b", 'Z', 4624);
        os[6] = new Oseba[4];
        os[6][0] = new Oseba("a b", 'Z', 7892);
        os[6][1] = new Oseba("a b", 'M', 5907);
        os[6][2] = new Oseba("a b", 'M', 5369);
        os[6][3] = new Oseba("a b", 'M', 7411);
        os[7] = new Oseba[5];
        os[7][0] = new Oseba("a b", 'Z', 8288);
        os[7][1] = new Oseba("a b", 'M', 5877);
        os[7][2] = new Oseba("a b", 'M', 4571);
        os[7][3] = new Oseba("a b", 'Z', 1985);
        os[7][4] = new Oseba("a b", 'M', 8090);
        os[8] = new Oseba[7];
        os[8][0] = new Oseba("a b", 'M', 9326);
        os[8][1] = new Oseba("a b", 'M', 8984);
        os[8][2] = new Oseba("a b", 'M', 3068);
        os[8][3] = new Oseba("a b", 'Z', 7369);
        os[8][4] = new Oseba("a b", 'M', 8414);
        os[8][5] = new Oseba("a b", 'M', 9421);
        os[8][6] = new Oseba("a b", 'M', 5374);
        os[9] = new Oseba[3];
        os[9][0] = new Oseba("a b", 'M', 8516);
        os[9][1] = new Oseba("a b", 'Z', 2931);
        os[9][2] = new Oseba("a b", 'M', 3513);
        os[10] = new Oseba[6];
        os[10][0] = new Oseba("a b", 'M', 4810);
        os[10][1] = new Oseba("a b", 'M', 5182);
        os[10][2] = new Oseba("a b", 'Z', 7628);
        os[10][3] = new Oseba("a b", 'M', 1401);
        os[10][4] = new Oseba("a b", 'Z', 2016);
        os[10][5] = new Oseba("a b", 'Z', 2744);
        os[11] = new Oseba[2];
        os[11][0] = new Oseba("a b", 'Z', 1136);
        os[11][1] = new Oseba("a b", 'Z', 5544);
        os[12] = new Oseba[0];
        os[13] = new Oseba[7];
        os[13][0] = new Oseba("a b", 'M', 100);
        os[13][1] = new Oseba("a b", 'M', 7064);
        os[13][2] = new Oseba("a b", 'Z', 1125);
        os[13][3] = new Oseba("a b", 'M', 9978);
        os[13][4] = new Oseba("a b", 'Z', 7615);
        os[13][5] = new Oseba("a b", 'M', 3709);
        os[13][6] = new Oseba("a b", 'Z', 4310);
        os[14] = new Oseba[4];
        os[14][0] = new Oseba("a b", 'Z', 7962);
        os[14][1] = new Oseba("a b", 'M', 4352);
        os[14][2] = new Oseba("a b", 'M', 5781);
        os[14][3] = new Oseba("a b", 'M', 812);
        os[15] = new Oseba[4];
        os[15][0] = new Oseba("a b", 'M', 5057);
        os[15][1] = new Oseba("a b", 'Z', 2826);
        os[15][2] = new Oseba("a b", 'M', 6919);
        os[15][3] = new Oseba("a b", 'M', 7657);
        os[16] = new Oseba[1];
        os[16][0] = new Oseba("a b", 'Z', 6157);
        os[17] = new Oseba[5];
        os[17][0] = new Oseba("a b", 'Z', 8945);
        os[17][1] = new Oseba("a b", 'M', 2605);
        os[17][2] = new Oseba("a b", 'Z', 8561);
        os[17][3] = new Oseba("a b", 'M', 1753);
        os[17][4] = new Oseba("a b", 'M', 4213);
        os[18] = new Oseba[3];
        os[18][0] = new Oseba("a b", 'Z', 6363);
        os[18][1] = new Oseba("a b", 'Z', 1869);
        os[18][2] = new Oseba("a b", 'M', 8410);
        os[19] = new Oseba[0];
        os[20] = new Oseba[7];
        os[20][0] = new Oseba("a b", 'Z', 2513);
        os[20][1] = new Oseba("a b", 'Z', 9543);
        os[20][2] = new Oseba("a b", 'Z', 4309);
        os[20][3] = new Oseba("a b", 'M', 8343);
        os[20][4] = new Oseba("a b", 'M', 7229);
        os[20][5] = new Oseba("a b", 'M', 918);
        os[20][6] = new Oseba("a b", 'M', 8586);
        os[21] = new Oseba[0];
        os[22] = new Oseba[0];
        os[23] = new Oseba[2];
        os[23][0] = new Oseba("a b", 'Z', 6658);
        os[23][1] = new Oseba("a b", 'Z', 20);
        os[24] = new Oseba[8];
        os[24][0] = new Oseba("a b", 'Z', 899);
        os[24][1] = new Oseba("a b", 'Z', 8716);
        os[24][2] = new Oseba("a b", 'M', 6959);
        os[24][3] = new Oseba("a b", 'M', 9109);
        os[24][4] = new Oseba("a b", 'M', 4131);
        os[24][5] = new Oseba("a b", 'Z', 9402);
        os[24][6] = new Oseba("a b", 'Z', 8825);
        os[24][7] = new Oseba("a b", 'Z', 7280);
        os[25] = new Oseba[1];
        os[25][0] = new Oseba("a b", 'M', 7127);
        os[26] = new Oseba[2];
        os[26][0] = new Oseba("a b", 'M', 6483);
        os[26][1] = new Oseba("a b", 'M', 7008);
        os[27] = new Oseba[3];
        os[27][0] = new Oseba("a b", 'Z', 4397);
        os[27][1] = new Oseba("a b", 'M', 394);
        os[27][2] = new Oseba("a b", 'Z', 9723);
        os[28] = new Oseba[8];
        os[28][0] = new Oseba("a b", 'M', 2036);
        os[28][1] = new Oseba("a b", 'M', 4362);
        os[28][2] = new Oseba("a b", 'Z', 4627);
        os[28][3] = new Oseba("a b", 'Z', 3133);
        os[28][4] = new Oseba("a b", 'Z', 2151);
        os[28][5] = new Oseba("a b", 'M', 8452);
        os[28][6] = new Oseba("a b", 'M', 3932);
        os[28][7] = new Oseba("a b", 'Z', 1009);
        os[29] = new Oseba[8];
        os[29][0] = new Oseba("a b", 'Z', 7957);
        os[29][1] = new Oseba("a b", 'Z', 3883);
        os[29][2] = new Oseba("a b", 'M', 2293);
        os[29][3] = new Oseba("a b", 'M', 9971);
        os[29][4] = new Oseba("a b", 'M', 2574);
        os[29][5] = new Oseba("a b", 'Z', 7398);
        os[29][6] = new Oseba("a b", 'Z', 345);
        os[29][7] = new Oseba("a b", 'Z', 4636);
        os[30] = new Oseba[1];
        os[30][0] = new Oseba("a b", 'M', 9996);
        os[31] = new Oseba[0];
        os[32] = new Oseba[3];
        os[32][0] = new Oseba("a b", 'Z', 4001);
        os[32][1] = new Oseba("a b", 'M', 8173);
        os[32][2] = new Oseba("a b", 'M', 9570);
        os[33] = new Oseba[8];
        os[33][0] = new Oseba("a b", 'M', 6472);
        os[33][1] = new Oseba("a b", 'Z', 3717);
        os[33][2] = new Oseba("a b", 'M', 2794);
        os[33][3] = new Oseba("a b", 'Z', 4687);
        os[33][4] = new Oseba("a b", 'M', 9993);
        os[33][5] = new Oseba("a b", 'Z', 4388);
        os[33][6] = new Oseba("a b", 'Z', 814);
        os[33][7] = new Oseba("a b", 'Z', 1566);
        os[34] = new Oseba[8];
        os[34][0] = new Oseba("a b", 'M', 8802);
        os[34][1] = new Oseba("a b", 'M', 4649);
        os[34][2] = new Oseba("a b", 'Z', 1664);
        os[34][3] = new Oseba("a b", 'Z', 4439);
        os[34][4] = new Oseba("a b", 'Z', 6848);
        os[34][5] = new Oseba("a b", 'Z', 4471);
        os[34][6] = new Oseba("a b", 'M', 4184);
        os[34][7] = new Oseba("a b", 'Z', 1788);
        os[35] = new Oseba[6];
        os[35][0] = new Oseba("a b", 'M', 3342);
        os[35][1] = new Oseba("a b", 'Z', 8498);
        os[35][2] = new Oseba("a b", 'Z', 5726);
        os[35][3] = new Oseba("a b", 'M', 6502);
        os[35][4] = new Oseba("a b", 'Z', 8228);
        os[35][5] = new Oseba("a b", 'Z', 4577);
        os[36] = new Oseba[7];
        os[36][0] = new Oseba("a b", 'Z', 2939);
        os[36][1] = new Oseba("a b", 'M', 6570);
        os[36][2] = new Oseba("a b", 'Z', 789);
        os[36][3] = new Oseba("a b", 'Z', 4058);
        os[36][4] = new Oseba("a b", 'Z', 945);
        os[36][5] = new Oseba("a b", 'M', 2344);
        os[36][6] = new Oseba("a b", 'Z', 1736);
        os[37] = new Oseba[6];
        os[37][0] = new Oseba("a b", 'M', 6615);
        os[37][1] = new Oseba("a b", 'M', 8976);
        os[37][2] = new Oseba("a b", 'M', 2013);
        os[37][3] = new Oseba("a b", 'M', 6541);
        os[37][4] = new Oseba("a b", 'Z', 4513);
        os[37][5] = new Oseba("a b", 'Z', 3863);
        os[38] = new Oseba[7];
        os[38][0] = new Oseba("a b", 'M', 90);
        os[38][1] = new Oseba("a b", 'M', 4532);
        os[38][2] = new Oseba("a b", 'M', 8257);
        os[38][3] = new Oseba("a b", 'Z', 105);
        os[38][4] = new Oseba("a b", 'M', 5239);
        os[38][5] = new Oseba("a b", 'M', 3147);
        os[38][6] = new Oseba("a b", 'M', 5358);
        os[39] = new Oseba[7];
        os[39][0] = new Oseba("a b", 'M', 5081);
        os[39][1] = new Oseba("a b", 'Z', 7200);
        os[39][2] = new Oseba("a b", 'M', 6535);
        os[39][3] = new Oseba("a b", 'Z', 3221);
        os[39][4] = new Oseba("a b", 'M', 786);
        os[39][5] = new Oseba("a b", 'M', 3827);
        os[39][6] = new Oseba("a b", 'M', 6179);
        os[40] = new Oseba[6];
        os[40][0] = new Oseba("a b", 'M', 3367);
        os[40][1] = new Oseba("a b", 'M', 6069);
        os[40][2] = new Oseba("a b", 'Z', 507);
        os[40][3] = new Oseba("a b", 'M', 7686);
        os[40][4] = new Oseba("a b", 'Z', 680);
        os[40][5] = new Oseba("a b", 'Z', 2577);
        os[41] = new Oseba[1];
        os[41][0] = new Oseba("a b", 'Z', 9554);
        os[42] = new Oseba[7];
        os[42][0] = new Oseba("a b", 'M', 8675);
        os[42][1] = new Oseba("a b", 'Z', 3796);
        os[42][2] = new Oseba("a b", 'Z', 9794);
        os[42][3] = new Oseba("a b", 'Z', 1335);
        os[42][4] = new Oseba("a b", 'M', 2930);
        os[42][5] = new Oseba("a b", 'Z', 2075);
        os[42][6] = new Oseba("a b", 'M', 3140);
        os[43] = new Oseba[0];
        os[44] = new Oseba[6];
        os[44][0] = new Oseba("a b", 'Z', 2552);
        os[44][1] = new Oseba("a b", 'Z', 1502);
        os[44][2] = new Oseba("a b", 'M', 4282);
        os[44][3] = new Oseba("a b", 'M', 6670);
        os[44][4] = new Oseba("a b", 'M', 1277);
        os[44][5] = new Oseba("a b", 'M', 9440);
        
        Stanovanje[] st = new Stanovanje[45];
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
        st[34] = new Stanovanje(os[34]);
        st[35] = new Stanovanje(os[35]);
        st[36] = new Stanovanje(os[36]);
        st[37] = new Stanovanje(os[37]);
        st[38] = new Stanovanje(os[38]);
        st[39] = new Stanovanje(os[39]);
        st[40] = new Stanovanje(os[40]);
        st[41] = new Stanovanje(os[41]);
        st[42] = new Stanovanje(os[42]);
        st[43] = new Stanovanje(os[43]);
        st[44] = new Stanovanje(os[44]);
        st[0].nastaviSosede(st[30], null, st[12], st[38]);
        st[1].nastaviSosede(st[5], st[19], null, st[7]);
        st[2].nastaviSosede(st[20], st[24], st[31], st[42]);
        st[3].nastaviSosede(st[25], st[32], st[41], st[11]);
        st[4].nastaviSosede(st[38], st[12], st[35], st[14]);
        st[5].nastaviSosede(st[29], st[33], st[1], st[24]);
        st[6].nastaviSosede(st[11], st[41], null, null);
        st[7].nastaviSosede(st[24], st[1], null, st[31]);
        st[8].nastaviSosede(st[19], null, null, null);
        st[9].nastaviSosede(st[42], st[31], null, st[28]);
        st[10].nastaviSosede(st[12], st[18], st[29], st[35]);
        st[11].nastaviSosede(null, st[3], st[6], null);
        st[12].nastaviSosede(st[0], null, st[10], st[4]);
        st[13].nastaviSosede(null, null, null, st[44]);
        st[14].nastaviSosede(st[32], st[4], st[15], st[41]);
        st[15].nastaviSosede(st[14], st[35], st[20], st[17]);
        st[16].nastaviSosede(null, st[30], st[38], st[40]);
        st[17].nastaviSosede(st[41], st[15], st[37], null);
        st[18].nastaviSosede(null, null, st[23], st[10]);
        st[19].nastaviSosede(st[33], st[22], st[8], st[1]);
        st[20].nastaviSosede(st[15], st[36], st[2], st[37]);
        st[21].nastaviSosede(null, st[37], null, null);
        st[22].nastaviSosede(st[34], null, null, st[19]);
        st[23].nastaviSosede(st[18], st[44], st[33], st[29]);
        st[24].nastaviSosede(st[36], st[5], st[7], st[2]);
        st[25].nastaviSosede(null, st[40], st[3], null);
        st[26].nastaviSosede(st[43], st[27], null, st[30]);
        st[27].nastaviSosede(null, null, null, st[26]);
        st[28].nastaviSosede(null, st[9], st[39], null);
        st[29].nastaviSosede(st[10], st[23], st[5], st[36]);
        st[30].nastaviSosede(null, st[26], st[0], st[16]);
        st[31].nastaviSosede(st[2], st[7], null, st[9]);
        st[32].nastaviSosede(st[40], st[38], st[14], st[3]);
        st[33].nastaviSosede(st[23], st[34], st[19], st[5]);
        st[34].nastaviSosede(st[44], null, st[22], st[33]);
        st[35].nastaviSosede(st[4], st[10], st[36], st[15]);
        st[36].nastaviSosede(st[35], st[29], st[24], st[20]);
        st[37].nastaviSosede(st[17], st[20], st[42], st[21]);
        st[38].nastaviSosede(st[16], st[0], st[4], st[32]);
        st[39].nastaviSosede(st[28], null, null, null);
        st[40].nastaviSosede(null, st[16], st[32], st[25]);
        st[41].nastaviSosede(st[3], st[14], st[17], st[6]);
        st[42].nastaviSosede(st[37], st[2], st[9], null);
        st[43].nastaviSosede(null, null, st[26], null);
        st[44].nastaviSosede(null, st[13], st[34], st[23]);
        
        Blok blok = new Blok(st[10]);
        TestSkupno.preveri(blok.starosta() == os[30][0]);
    }
}