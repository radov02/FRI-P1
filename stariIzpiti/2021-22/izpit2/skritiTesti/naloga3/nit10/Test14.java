
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[132];
        predavalnice[0] = new Tretja.Garaza("G1", 289, 162);
        predavalnice[1] = new Tretja.Garaza("G2", 281, 126);
        predavalnice[2] = new Tretja.Avditorna("A1", 288);
        predavalnice[3] = new Tretja.Racunalnica("R1", 10, 6);
        predavalnice[4] = new Tretja.Garaza("G3", 51, 122);
        predavalnice[5] = new Tretja.Garaza("G4", 271, 437);
        predavalnice[6] = new Tretja.Racunalnica("R2", 40, 17);
        predavalnice[7] = new Tretja.Garaza("G5", 181, 419);
        predavalnice[8] = new Tretja.Garaza("G6", 119, 490);
        predavalnice[9] = new Tretja.Avditorna("A2", 114);
        predavalnice[10] = new Tretja.Garaza("G7", 112, 253);
        predavalnice[11] = new Tretja.Avditorna("A3", 22);
        predavalnice[12] = new Tretja.Racunalnica("R3", 92, 79);
        predavalnice[13] = new Tretja.Racunalnica("R4", 66, 20);
        predavalnice[14] = new Tretja.Racunalnica("R5", 92, 17);
        predavalnice[15] = new Tretja.Racunalnica("R6", 72, 48);
        predavalnice[16] = new Tretja.Garaza("G8", 277, 113);
        predavalnice[17] = new Tretja.Racunalnica("R7", 31, 10);
        predavalnice[18] = new Tretja.Garaza("G9", 182, 468);
        predavalnice[19] = new Tretja.Garaza("G10", 223, 103);
        predavalnice[20] = new Tretja.Garaza("G11", 127, 184);
        predavalnice[21] = new Tretja.Garaza("G12", 74, 287);
        predavalnice[22] = new Tretja.Garaza("G13", 114, 109);
        predavalnice[23] = new Tretja.Racunalnica("R8", 63, 40);
        predavalnice[24] = new Tretja.Garaza("G14", 177, 409);
        predavalnice[25] = new Tretja.Racunalnica("R9", 68, 28);
        predavalnice[26] = new Tretja.Racunalnica("R10", 41, 2);
        predavalnice[27] = new Tretja.Avditorna("A4", 158);
        predavalnice[28] = new Tretja.Garaza("G15", 93, 171);
        predavalnice[29] = new Tretja.Racunalnica("R11", 97, 41);
        predavalnice[30] = new Tretja.Garaza("G16", 190, 171);
        predavalnice[31] = new Tretja.Garaza("G17", 195, 174);
        predavalnice[32] = new Tretja.Avditorna("A5", 179);
        predavalnice[33] = new Tretja.Avditorna("A6", 47);
        predavalnice[34] = new Tretja.Garaza("G18", 141, 489);
        predavalnice[35] = new Tretja.Racunalnica("R12", 58, 31);
        predavalnice[36] = new Tretja.Avditorna("A7", 40);
        predavalnice[37] = new Tretja.Racunalnica("R13", 81, 55);
        predavalnice[38] = new Tretja.Garaza("G19", 234, 119);
        predavalnice[39] = new Tretja.Avditorna("A8", 73);
        predavalnice[40] = new Tretja.Avditorna("A9", 156);
        predavalnice[41] = new Tretja.Garaza("G20", 158, 255);
        predavalnice[42] = new Tretja.Racunalnica("R14", 92, 38);
        predavalnice[43] = new Tretja.Avditorna("A10", 164);
        predavalnice[44] = new Tretja.Garaza("G21", 101, 153);
        predavalnice[45] = new Tretja.Garaza("G22", 128, 369);
        predavalnice[46] = new Tretja.Racunalnica("R15", 24, 6);
        predavalnice[47] = new Tretja.Garaza("G23", 175, 315);
        predavalnice[48] = new Tretja.Avditorna("A11", 74);
        predavalnice[49] = new Tretja.Avditorna("A12", 95);
        predavalnice[50] = new Tretja.Racunalnica("R16", 47, 36);
        predavalnice[51] = new Tretja.Garaza("G24", 62, 301);
        predavalnice[52] = new Tretja.Racunalnica("R17", 99, 78);
        predavalnice[53] = new Tretja.Garaza("G25", 203, 466);
        predavalnice[54] = new Tretja.Avditorna("A13", 116);
        predavalnice[55] = new Tretja.Garaza("G26", 199, 255);
        predavalnice[56] = new Tretja.Racunalnica("R18", 27, 26);
        predavalnice[57] = new Tretja.Avditorna("A14", 237);
        predavalnice[58] = new Tretja.Avditorna("A15", 127);
        predavalnice[59] = new Tretja.Racunalnica("R19", 61, 33);
        predavalnice[60] = new Tretja.Avditorna("A16", 120);
        predavalnice[61] = new Tretja.Garaza("G27", 82, 314);
        predavalnice[62] = new Tretja.Racunalnica("R20", 86, 5);
        predavalnice[63] = new Tretja.Avditorna("A17", 166);
        predavalnice[64] = new Tretja.Garaza("G28", 113, 104);
        predavalnice[65] = new Tretja.Racunalnica("R21", 92, 13);
        predavalnice[66] = new Tretja.Avditorna("A18", 275);
        predavalnice[67] = new Tretja.Garaza("G29", 60, 339);
        predavalnice[68] = new Tretja.Racunalnica("R22", 18, 11);
        predavalnice[69] = new Tretja.Avditorna("A19", 38);
        predavalnice[70] = new Tretja.Garaza("G30", 73, 185);
        predavalnice[71] = new Tretja.Garaza("G31", 212, 388);
        predavalnice[72] = new Tretja.Garaza("G32", 180, 108);
        predavalnice[73] = new Tretja.Avditorna("A20", 136);
        predavalnice[74] = new Tretja.Garaza("G33", 54, 317);
        predavalnice[75] = new Tretja.Garaza("G34", 214, 437);
        predavalnice[76] = new Tretja.Avditorna("A21", 137);
        predavalnice[77] = new Tretja.Racunalnica("R23", 53, 11);
        predavalnice[78] = new Tretja.Avditorna("A22", 234);
        predavalnice[79] = new Tretja.Garaza("G35", 101, 272);
        predavalnice[80] = new Tretja.Racunalnica("R24", 88, 81);
        predavalnice[81] = new Tretja.Racunalnica("R25", 16, 7);
        predavalnice[82] = new Tretja.Garaza("G36", 280, 380);
        predavalnice[83] = new Tretja.Garaza("G37", 90, 391);
        predavalnice[84] = new Tretja.Garaza("G38", 125, 426);
        predavalnice[85] = new Tretja.Avditorna("A23", 152);
        predavalnice[86] = new Tretja.Avditorna("A24", 267);
        predavalnice[87] = new Tretja.Racunalnica("R26", 73, 3);
        predavalnice[88] = new Tretja.Garaza("G39", 175, 253);
        predavalnice[89] = new Tretja.Racunalnica("R27", 45, 17);
        predavalnice[90] = new Tretja.Racunalnica("R28", 39, 11);
        predavalnice[91] = new Tretja.Racunalnica("R29", 85, 16);
        predavalnice[92] = new Tretja.Avditorna("A25", 264);
        predavalnice[93] = new Tretja.Racunalnica("R30", 59, 11);
        predavalnice[94] = new Tretja.Avditorna("A26", 246);
        predavalnice[95] = new Tretja.Racunalnica("R31", 64, 46);
        predavalnice[96] = new Tretja.Garaza("G40", 270, 142);
        predavalnice[97] = new Tretja.Garaza("G41", 262, 448);
        predavalnice[98] = new Tretja.Garaza("G42", 294, 200);
        predavalnice[99] = new Tretja.Garaza("G43", 90, 283);
        predavalnice[100] = new Tretja.Garaza("G44", 74, 454);
        predavalnice[101] = new Tretja.Garaza("G45", 265, 173);
        predavalnice[102] = new Tretja.Racunalnica("R32", 50, 6);
        predavalnice[103] = new Tretja.Avditorna("A27", 295);
        predavalnice[104] = new Tretja.Racunalnica("R33", 88, 19);
        predavalnice[105] = new Tretja.Avditorna("A28", 44);
        predavalnice[106] = new Tretja.Avditorna("A29", 133);
        predavalnice[107] = new Tretja.Racunalnica("R34", 63, 33);
        predavalnice[108] = new Tretja.Racunalnica("R35", 15, 8);
        predavalnice[109] = new Tretja.Avditorna("A30", 169);
        predavalnice[110] = new Tretja.Avditorna("A31", 223);
        predavalnice[111] = new Tretja.Racunalnica("R36", 56, 29);
        predavalnice[112] = new Tretja.Garaza("G46", 63, 287);
        predavalnice[113] = new Tretja.Racunalnica("R37", 26, 9);
        predavalnice[114] = new Tretja.Avditorna("A32", 74);
        predavalnice[115] = new Tretja.Avditorna("A33", 282);
        predavalnice[116] = new Tretja.Racunalnica("R38", 71, 7);
        predavalnice[117] = new Tretja.Racunalnica("R39", 37, 29);
        predavalnice[118] = new Tretja.Avditorna("A34", 285);
        predavalnice[119] = new Tretja.Avditorna("A35", 156);
        predavalnice[120] = new Tretja.Garaza("G47", 274, 171);
        predavalnice[121] = new Tretja.Garaza("G48", 72, 319);
        predavalnice[122] = new Tretja.Avditorna("A36", 287);
        predavalnice[123] = new Tretja.Racunalnica("R40", 92, 2);
        predavalnice[124] = new Tretja.Racunalnica("R41", 63, 47);
        predavalnice[125] = new Tretja.Racunalnica("R42", 65, 20);
        predavalnice[126] = new Tretja.Avditorna("A37", 196);
        predavalnice[127] = new Tretja.Garaza("G49", 79, 320);
        predavalnice[128] = new Tretja.Avditorna("A38", 165);
        predavalnice[129] = new Tretja.Avditorna("A39", 270);
        predavalnice[130] = new Tretja.Garaza("G50", 239, 152);
        predavalnice[131] = new Tretja.Garaza("G51", 214, 368);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}