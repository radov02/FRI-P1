
import java.util.Arrays;
import java.util.Comparator;

public class Test44 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[54][];
        os[0] = new Oseba[6];
        os[0][0] = new Oseba("a b", 'M', 4871);
        os[0][1] = new Oseba("a b", 'Z', 3853);
        os[0][2] = new Oseba("a b", 'M', 7441);
        os[0][3] = new Oseba("a b", 'M', 3700);
        os[0][4] = new Oseba("a b", 'Z', 2945);
        os[0][5] = new Oseba("a b", 'M', 3049);
        os[1] = new Oseba[6];
        os[1][0] = new Oseba("a b", 'Z', 3937);
        os[1][1] = new Oseba("a b", 'Z', 6738);
        os[1][2] = new Oseba("a b", 'M', 6617);
        os[1][3] = new Oseba("a b", 'M', 7156);
        os[1][4] = new Oseba("a b", 'M', 7609);
        os[1][5] = new Oseba("a b", 'M', 5442);
        os[2] = new Oseba[3];
        os[2][0] = new Oseba("a b", 'M', 1835);
        os[2][1] = new Oseba("a b", 'M', 6564);
        os[2][2] = new Oseba("a b", 'M', 1418);
        os[3] = new Oseba[1];
        os[3][0] = new Oseba("a b", 'M', 8930);
        os[4] = new Oseba[3];
        os[4][0] = new Oseba("a b", 'Z', 4761);
        os[4][1] = new Oseba("a b", 'M', 5243);
        os[4][2] = new Oseba("a b", 'M', 7078);
        os[5] = new Oseba[7];
        os[5][0] = new Oseba("a b", 'Z', 8681);
        os[5][1] = new Oseba("a b", 'M', 7160);
        os[5][2] = new Oseba("a b", 'M', 2711);
        os[5][3] = new Oseba("a b", 'Z', 2371);
        os[5][4] = new Oseba("a b", 'Z', 9772);
        os[5][5] = new Oseba("a b", 'M', 7159);
        os[5][6] = new Oseba("a b", 'M', 3840);
        os[6] = new Oseba[2];
        os[6][0] = new Oseba("a b", 'M', 4813);
        os[6][1] = new Oseba("a b", 'Z', 9803);
        os[7] = new Oseba[7];
        os[7][0] = new Oseba("a b", 'M', 9298);
        os[7][1] = new Oseba("a b", 'M', 7549);
        os[7][2] = new Oseba("a b", 'Z', 4340);
        os[7][3] = new Oseba("a b", 'Z', 6599);
        os[7][4] = new Oseba("a b", 'Z', 1935);
        os[7][5] = new Oseba("a b", 'Z', 7858);
        os[7][6] = new Oseba("a b", 'M', 5669);
        os[8] = new Oseba[3];
        os[8][0] = new Oseba("a b", 'M', 4874);
        os[8][1] = new Oseba("a b", 'Z', 9618);
        os[8][2] = new Oseba("a b", 'Z', 8587);
        os[9] = new Oseba[1];
        os[9][0] = new Oseba("a b", 'Z', 858);
        os[10] = new Oseba[2];
        os[10][0] = new Oseba("a b", 'M', 6417);
        os[10][1] = new Oseba("a b", 'Z', 1619);
        os[11] = new Oseba[7];
        os[11][0] = new Oseba("a b", 'M', 6508);
        os[11][1] = new Oseba("a b", 'Z', 7418);
        os[11][2] = new Oseba("a b", 'M', 4302);
        os[11][3] = new Oseba("a b", 'M', 1415);
        os[11][4] = new Oseba("a b", 'Z', 6195);
        os[11][5] = new Oseba("a b", 'M', 3829);
        os[11][6] = new Oseba("a b", 'Z', 9014);
        os[12] = new Oseba[0];
        os[13] = new Oseba[2];
        os[13][0] = new Oseba("a b", 'Z', 9411);
        os[13][1] = new Oseba("a b", 'M', 5511);
        os[14] = new Oseba[6];
        os[14][0] = new Oseba("a b", 'M', 7561);
        os[14][1] = new Oseba("a b", 'Z', 980);
        os[14][2] = new Oseba("a b", 'Z', 2434);
        os[14][3] = new Oseba("a b", 'M', 812);
        os[14][4] = new Oseba("a b", 'M', 7066);
        os[14][5] = new Oseba("a b", 'M', 2589);
        os[15] = new Oseba[7];
        os[15][0] = new Oseba("a b", 'Z', 8136);
        os[15][1] = new Oseba("a b", 'M', 2223);
        os[15][2] = new Oseba("a b", 'M', 9873);
        os[15][3] = new Oseba("a b", 'M', 4322);
        os[15][4] = new Oseba("a b", 'M', 897);
        os[15][5] = new Oseba("a b", 'M', 1366);
        os[15][6] = new Oseba("a b", 'Z', 5928);
        os[16] = new Oseba[4];
        os[16][0] = new Oseba("a b", 'Z', 8896);
        os[16][1] = new Oseba("a b", 'M', 736);
        os[16][2] = new Oseba("a b", 'Z', 4003);
        os[16][3] = new Oseba("a b", 'M', 1933);
        os[17] = new Oseba[2];
        os[17][0] = new Oseba("a b", 'M', 8829);
        os[17][1] = new Oseba("a b", 'M', 6327);
        os[18] = new Oseba[0];
        os[19] = new Oseba[1];
        os[19][0] = new Oseba("a b", 'M', 5698);
        os[20] = new Oseba[4];
        os[20][0] = new Oseba("a b", 'Z', 3947);
        os[20][1] = new Oseba("a b", 'M', 4229);
        os[20][2] = new Oseba("a b", 'Z', 4351);
        os[20][3] = new Oseba("a b", 'M', 2116);
        os[21] = new Oseba[4];
        os[21][0] = new Oseba("a b", 'Z', 3573);
        os[21][1] = new Oseba("a b", 'M', 8455);
        os[21][2] = new Oseba("a b", 'M', 167);
        os[21][3] = new Oseba("a b", 'M', 3388);
        os[22] = new Oseba[0];
        os[23] = new Oseba[2];
        os[23][0] = new Oseba("a b", 'M', 6800);
        os[23][1] = new Oseba("a b", 'Z', 9542);
        os[24] = new Oseba[4];
        os[24][0] = new Oseba("a b", 'M', 6347);
        os[24][1] = new Oseba("a b", 'M', 1778);
        os[24][2] = new Oseba("a b", 'M', 159);
        os[24][3] = new Oseba("a b", 'Z', 4541);
        os[25] = new Oseba[7];
        os[25][0] = new Oseba("a b", 'Z', 675);
        os[25][1] = new Oseba("a b", 'Z', 7944);
        os[25][2] = new Oseba("a b", 'Z', 4863);
        os[25][3] = new Oseba("a b", 'M', 1746);
        os[25][4] = new Oseba("a b", 'Z', 6139);
        os[25][5] = new Oseba("a b", 'M', 3281);
        os[25][6] = new Oseba("a b", 'M', 2545);
        os[26] = new Oseba[4];
        os[26][0] = new Oseba("a b", 'Z', 8433);
        os[26][1] = new Oseba("a b", 'Z', 8601);
        os[26][2] = new Oseba("a b", 'M', 9818);
        os[26][3] = new Oseba("a b", 'Z', 3603);
        os[27] = new Oseba[4];
        os[27][0] = new Oseba("a b", 'M', 3244);
        os[27][1] = new Oseba("a b", 'M', 1592);
        os[27][2] = new Oseba("a b", 'Z', 1867);
        os[27][3] = new Oseba("a b", 'Z', 1276);
        os[28] = new Oseba[4];
        os[28][0] = new Oseba("a b", 'Z', 3099);
        os[28][1] = new Oseba("a b", 'M', 7618);
        os[28][2] = new Oseba("a b", 'M', 5538);
        os[28][3] = new Oseba("a b", 'M', 1271);
        os[29] = new Oseba[4];
        os[29][0] = new Oseba("a b", 'Z', 144);
        os[29][1] = new Oseba("a b", 'M', 6545);
        os[29][2] = new Oseba("a b", 'M', 1046);
        os[29][3] = new Oseba("a b", 'Z', 6430);
        os[30] = new Oseba[7];
        os[30][0] = new Oseba("a b", 'M', 3211);
        os[30][1] = new Oseba("a b", 'M', 8989);
        os[30][2] = new Oseba("a b", 'Z', 244);
        os[30][3] = new Oseba("a b", 'Z', 7065);
        os[30][4] = new Oseba("a b", 'Z', 2364);
        os[30][5] = new Oseba("a b", 'Z', 5535);
        os[30][6] = new Oseba("a b", 'Z', 8528);
        os[31] = new Oseba[5];
        os[31][0] = new Oseba("a b", 'Z', 4479);
        os[31][1] = new Oseba("a b", 'M', 8301);
        os[31][2] = new Oseba("a b", 'Z', 7288);
        os[31][3] = new Oseba("a b", 'M', 3241);
        os[31][4] = new Oseba("a b", 'Z', 4772);
        os[32] = new Oseba[2];
        os[32][0] = new Oseba("a b", 'M', 9802);
        os[32][1] = new Oseba("a b", 'M', 3995);
        os[33] = new Oseba[5];
        os[33][0] = new Oseba("a b", 'M', 1260);
        os[33][1] = new Oseba("a b", 'M', 6080);
        os[33][2] = new Oseba("a b", 'Z', 4031);
        os[33][3] = new Oseba("a b", 'Z', 4753);
        os[33][4] = new Oseba("a b", 'M', 1811);
        os[34] = new Oseba[0];
        os[35] = new Oseba[4];
        os[35][0] = new Oseba("a b", 'Z', 296);
        os[35][1] = new Oseba("a b", 'Z', 6842);
        os[35][2] = new Oseba("a b", 'Z', 7806);
        os[35][3] = new Oseba("a b", 'M', 8310);
        os[36] = new Oseba[3];
        os[36][0] = new Oseba("a b", 'Z', 1928);
        os[36][1] = new Oseba("a b", 'Z', 5888);
        os[36][2] = new Oseba("a b", 'Z', 6121);
        os[37] = new Oseba[6];
        os[37][0] = new Oseba("a b", 'M', 2499);
        os[37][1] = new Oseba("a b", 'M', 4193);
        os[37][2] = new Oseba("a b", 'M', 773);
        os[37][3] = new Oseba("a b", 'Z', 1817);
        os[37][4] = new Oseba("a b", 'Z', 1863);
        os[37][5] = new Oseba("a b", 'M', 3545);
        os[38] = new Oseba[7];
        os[38][0] = new Oseba("a b", 'M', 8787);
        os[38][1] = new Oseba("a b", 'M', 7195);
        os[38][2] = new Oseba("a b", 'Z', 8080);
        os[38][3] = new Oseba("a b", 'M', 9575);
        os[38][4] = new Oseba("a b", 'M', 8761);
        os[38][5] = new Oseba("a b", 'M', 3633);
        os[38][6] = new Oseba("a b", 'M', 6036);
        os[39] = new Oseba[1];
        os[39][0] = new Oseba("a b", 'Z', 7752);
        os[40] = new Oseba[0];
        os[41] = new Oseba[1];
        os[41][0] = new Oseba("a b", 'M', 1480);
        os[42] = new Oseba[1];
        os[42][0] = new Oseba("a b", 'Z', 9927);
        os[43] = new Oseba[4];
        os[43][0] = new Oseba("a b", 'Z', 6434);
        os[43][1] = new Oseba("a b", 'Z', 9977);
        os[43][2] = new Oseba("a b", 'Z', 660);
        os[43][3] = new Oseba("a b", 'Z', 8833);
        os[44] = new Oseba[4];
        os[44][0] = new Oseba("a b", 'M', 9947);
        os[44][1] = new Oseba("a b", 'Z', 8333);
        os[44][2] = new Oseba("a b", 'M', 2210);
        os[44][3] = new Oseba("a b", 'Z', 1628);
        os[45] = new Oseba[5];
        os[45][0] = new Oseba("a b", 'Z', 4980);
        os[45][1] = new Oseba("a b", 'Z', 80);
        os[45][2] = new Oseba("a b", 'M', 3070);
        os[45][3] = new Oseba("a b", 'M', 5315);
        os[45][4] = new Oseba("a b", 'Z', 7398);
        os[46] = new Oseba[3];
        os[46][0] = new Oseba("a b", 'M', 3961);
        os[46][1] = new Oseba("a b", 'M', 7275);
        os[46][2] = new Oseba("a b", 'M', 8487);
        os[47] = new Oseba[6];
        os[47][0] = new Oseba("a b", 'M', 5633);
        os[47][1] = new Oseba("a b", 'M', 6086);
        os[47][2] = new Oseba("a b", 'M', 6931);
        os[47][3] = new Oseba("a b", 'Z', 4592);
        os[47][4] = new Oseba("a b", 'M', 6182);
        os[47][5] = new Oseba("a b", 'Z', 1666);
        os[48] = new Oseba[4];
        os[48][0] = new Oseba("a b", 'Z', 7784);
        os[48][1] = new Oseba("a b", 'M', 2409);
        os[48][2] = new Oseba("a b", 'Z', 9310);
        os[48][3] = new Oseba("a b", 'Z', 6262);
        os[49] = new Oseba[2];
        os[49][0] = new Oseba("a b", 'Z', 6200);
        os[49][1] = new Oseba("a b", 'M', 7283);
        os[50] = new Oseba[3];
        os[50][0] = new Oseba("a b", 'M', 7004);
        os[50][1] = new Oseba("a b", 'M', 7890);
        os[50][2] = new Oseba("a b", 'Z', 1965);
        os[51] = new Oseba[3];
        os[51][0] = new Oseba("a b", 'Z', 8562);
        os[51][1] = new Oseba("a b", 'Z', 8892);
        os[51][2] = new Oseba("a b", 'M', 5824);
        os[52] = new Oseba[0];
        os[53] = new Oseba[1];
        os[53][0] = new Oseba("a b", 'Z', 2561);
        
        Stanovanje[] st = new Stanovanje[54];
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
        st[45] = new Stanovanje(os[45]);
        st[46] = new Stanovanje(os[46]);
        st[47] = new Stanovanje(os[47]);
        st[48] = new Stanovanje(os[48]);
        st[49] = new Stanovanje(os[49]);
        st[50] = new Stanovanje(os[50]);
        st[51] = new Stanovanje(os[51]);
        st[52] = new Stanovanje(os[52]);
        st[53] = new Stanovanje(os[53]);
        st[0].nastaviSosede(null, st[21], st[8], null);
        st[1].nastaviSosede(st[24], st[14], st[48], st[43]);
        st[2].nastaviSosede(st[47], st[29], st[39], st[5]);
        st[3].nastaviSosede(st[6], st[19], st[22], st[9]);
        st[4].nastaviSosede(null, null, st[53], st[45]);
        st[5].nastaviSosede(st[8], st[2], null, st[34]);
        st[6].nastaviSosede(st[45], st[53], st[3], st[14]);
        st[7].nastaviSosede(null, st[8], st[34], null);
        st[8].nastaviSosede(st[0], st[47], st[5], st[7]);
        st[9].nastaviSosede(st[14], st[3], st[32], st[48]);
        st[10].nastaviSosede(null, st[42], st[49], null);
        st[11].nastaviSosede(null, null, null, st[53]);
        st[12].nastaviSosede(st[30], st[16], st[52], st[27]);
        st[13].nastaviSosede(st[35], st[38], null, null);
        st[14].nastaviSosede(st[23], st[6], st[9], st[1]);
        st[15].nastaviSosede(null, null, st[46], st[51]);
        st[16].nastaviSosede(st[51], st[46], st[26], st[12]);
        st[17].nastaviSosede(st[41], st[31], null, st[25]);
        st[18].nastaviSosede(st[42], st[24], st[43], st[49]);
        st[19].nastaviSosede(st[53], null, st[30], st[3]);
        st[20].nastaviSosede(st[29], st[35], null, st[39]);
        st[21].nastaviSosede(null, st[49], st[47], st[0]);
        st[22].nastaviSosede(st[3], st[30], st[27], st[32]);
        st[23].nastaviSosede(st[44], st[45], st[14], st[24]);
        st[24].nastaviSosede(st[40], st[23], st[1], st[18]);
        st[25].nastaviSosede(st[38], st[17], null, null);
        st[26].nastaviSosede(st[16], null, null, st[52]);
        st[27].nastaviSosede(st[22], st[12], st[31], st[41]);
        st[28].nastaviSosede(st[52], null, null, st[36]);
        st[29].nastaviSosede(st[37], st[33], st[20], st[2]);
        st[30].nastaviSosede(st[19], st[51], st[12], st[22]);
        st[31].nastaviSosede(st[27], st[52], st[36], st[17]);
        st[32].nastaviSosede(st[9], st[22], st[41], st[50]);
        st[33].nastaviSosede(st[43], st[48], st[35], st[29]);
        st[34].nastaviSosede(st[7], st[5], null, null);
        st[35].nastaviSosede(st[33], st[50], st[13], st[20]);
        st[36].nastaviSosede(st[31], st[28], null, null);
        st[37].nastaviSosede(st[49], st[43], st[29], st[47]);
        st[38].nastaviSosede(st[50], st[41], st[25], st[13]);
        st[39].nastaviSosede(st[2], st[20], null, null);
        st[40].nastaviSosede(null, st[44], st[24], st[42]);
        st[41].nastaviSosede(st[32], st[27], st[17], st[38]);
        st[42].nastaviSosede(null, st[40], st[18], st[10]);
        st[43].nastaviSosede(st[18], st[1], st[33], st[37]);
        st[44].nastaviSosede(null, null, st[23], st[40]);
        st[45].nastaviSosede(null, st[4], st[6], st[23]);
        st[46].nastaviSosede(st[15], null, null, st[16]);
        st[47].nastaviSosede(st[21], st[37], st[2], st[8]);
        st[48].nastaviSosede(st[1], st[9], st[50], st[33]);
        st[49].nastaviSosede(st[10], st[18], st[37], st[21]);
        st[50].nastaviSosede(st[48], st[32], st[38], st[35]);
        st[51].nastaviSosede(null, st[15], st[16], st[30]);
        st[52].nastaviSosede(st[12], st[26], st[28], st[31]);
        st[53].nastaviSosede(st[4], st[11], st[19], st[6]);
        
        Blok blok = new Blok(st[30]);
        TestSkupno.preveri(blok.starosta() == os[43][1]);
    }
}
