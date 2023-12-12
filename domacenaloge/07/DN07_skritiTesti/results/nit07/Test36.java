
import java.util.Arrays;
import java.util.Comparator;

public class Test36 {
    
    public static void main(String[] args) {
        
        Oseba[][] os = new Oseba[18][];
        os[0] = new Oseba[2];
        os[0][0] = new Oseba("a b", 'M', 9915);
        os[0][1] = new Oseba("a b", 'Z', 6963);
        os[1] = new Oseba[2];
        os[1][0] = new Oseba("a b", 'M', 6368);
        os[1][1] = new Oseba("a b", 'Z', 8169);
        os[2] = new Oseba[5];
        os[2][0] = new Oseba("a b", 'M', 2942);
        os[2][1] = new Oseba("a b", 'Z', 8189);
        os[2][2] = new Oseba("a b", 'M', 3913);
        os[2][3] = new Oseba("a b", 'Z', 2472);
        os[2][4] = new Oseba("a b", 'M', 3134);
        os[3] = new Oseba[2];
        os[3][0] = new Oseba("a b", 'M', 4485);
        os[3][1] = new Oseba("a b", 'Z', 7584);
        os[4] = new Oseba[7];
        os[4][0] = new Oseba("a b", 'M', 950);
        os[4][1] = new Oseba("a b", 'M', 426);
        os[4][2] = new Oseba("a b", 'M', 2138);
        os[4][3] = new Oseba("a b", 'M', 4375);
        os[4][4] = new Oseba("a b", 'M', 2295);
        os[4][5] = new Oseba("a b", 'M', 7630);
        os[4][6] = new Oseba("a b", 'Z', 3856);
        os[5] = new Oseba[1];
        os[5][0] = new Oseba("a b", 'M', 4137);
        os[6] = new Oseba[1];
        os[6][0] = new Oseba("a b", 'Z', 2338);
        os[7] = new Oseba[0];
        os[8] = new Oseba[6];
        os[8][0] = new Oseba("a b", 'M', 2740);
        os[8][1] = new Oseba("a b", 'M', 8820);
        os[8][2] = new Oseba("a b", 'M', 4597);
        os[8][3] = new Oseba("a b", 'Z', 2219);
        os[8][4] = new Oseba("a b", 'Z', 1248);
        os[8][5] = new Oseba("a b", 'M', 3595);
        os[9] = new Oseba[6];
        os[9][0] = new Oseba("a b", 'M', 3871);
        os[9][1] = new Oseba("a b", 'Z', 5234);
        os[9][2] = new Oseba("a b", 'M', 6834);
        os[9][3] = new Oseba("a b", 'Z', 8036);
        os[9][4] = new Oseba("a b", 'Z', 6931);
        os[9][5] = new Oseba("a b", 'Z', 2819);
        os[10] = new Oseba[0];
        os[11] = new Oseba[5];
        os[11][0] = new Oseba("a b", 'M', 7227);
        os[11][1] = new Oseba("a b", 'M', 3193);
        os[11][2] = new Oseba("a b", 'M', 7358);
        os[11][3] = new Oseba("a b", 'M', 2902);
        os[11][4] = new Oseba("a b", 'Z', 9353);
        os[12] = new Oseba[7];
        os[12][0] = new Oseba("a b", 'Z', 6571);
        os[12][1] = new Oseba("a b", 'M', 6871);
        os[12][2] = new Oseba("a b", 'M', 4242);
        os[12][3] = new Oseba("a b", 'Z', 4894);
        os[12][4] = new Oseba("a b", 'Z', 788);
        os[12][5] = new Oseba("a b", 'Z', 1709);
        os[12][6] = new Oseba("a b", 'M', 4953);
        os[13] = new Oseba[2];
        os[13][0] = new Oseba("a b", 'M', 6061);
        os[13][1] = new Oseba("a b", 'M', 610);
        os[14] = new Oseba[1];
        os[14][0] = new Oseba("a b", 'M', 4659);
        os[15] = new Oseba[4];
        os[15][0] = new Oseba("a b", 'Z', 7062);
        os[15][1] = new Oseba("a b", 'Z', 652);
        os[15][2] = new Oseba("a b", 'M', 2618);
        os[15][3] = new Oseba("a b", 'M', 1153);
        os[16] = new Oseba[2];
        os[16][0] = new Oseba("a b", 'M', 7345);
        os[16][1] = new Oseba("a b", 'Z', 6134);
        os[17] = new Oseba[0];
        
        Stanovanje[] st = new Stanovanje[18];
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
        st[0].nastaviSosede(null, st[7], st[14], null);
        st[1].nastaviSosede(st[13], st[8], null, null);
        st[2].nastaviSosede(st[14], st[5], st[11], st[8]);
        st[3].nastaviSosede(st[9], null, st[4], st[12]);
        st[4].nastaviSosede(st[3], null, null, st[5]);
        st[5].nastaviSosede(st[12], st[4], st[16], st[2]);
        st[6].nastaviSosede(st[8], st[11], null, null);
        st[7].nastaviSosede(null, st[9], st[12], st[0]);
        st[8].nastaviSosede(st[15], st[2], st[6], st[1]);
        st[9].nastaviSosede(st[17], null, st[3], st[7]);
        st[10].nastaviSosede(st[11], null, null, null);
        st[11].nastaviSosede(st[2], st[16], st[10], st[6]);
        st[12].nastaviSosede(st[7], st[3], st[5], st[14]);
        st[13].nastaviSosede(null, st[15], st[1], null);
        st[14].nastaviSosede(st[0], st[12], st[2], st[15]);
        st[15].nastaviSosede(null, st[14], st[8], st[13]);
        st[16].nastaviSosede(st[5], null, null, st[11]);
        st[17].nastaviSosede(null, null, st[9], null);
        
        Oseba[] oss = new Oseba[25];
        oss[0] = os[0][0];
        oss[1] = os[0][1];
        oss[2] = os[1][0];
        oss[3] = os[1][1];
        oss[4] = os[4][0];
        oss[5] = os[4][1];
        oss[6] = os[4][2];
        oss[7] = os[4][3];
        oss[8] = os[4][4];
        oss[9] = os[4][5];
        oss[10] = os[4][6];
        oss[11] = os[6][0];
        oss[12] = os[12][0];
        oss[13] = os[12][1];
        oss[14] = os[12][2];
        oss[15] = os[12][3];
        oss[16] = os[12][4];
        oss[17] = os[12][5];
        oss[18] = os[12][6];
        oss[19] = os[15][0];
        oss[20] = os[15][1];
        oss[21] = os[15][2];
        oss[22] = os[15][3];
        oss[23] = os[16][0];
        oss[24] = os[16][1];
        Comparator<Oseba> comp = new Comparator<Oseba>() { public int compare(Oseba a, Oseba b) { return a.hashCode() - b.hashCode(); } };
        Arrays.sort(oss, comp);
        Oseba[] rezultat = st[2].sosedjeSosedov();
        Arrays.sort(rezultat, comp);
        TestSkupno.preveri(Arrays.equals(oss, rezultat));
    }
}