
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[185];
        predavalnice[0] = new Tretja.Racunalnica("R1", 46, 29);
        predavalnice[1] = new Tretja.Avditorna("A1", 154);
        predavalnice[2] = new Tretja.Racunalnica("R2", 43, 43);
        predavalnice[3] = new Tretja.Avditorna("A2", 228);
        predavalnice[4] = new Tretja.Garaza("G1", 61, 119);
        predavalnice[5] = new Tretja.Garaza("G2", 54, 169);
        predavalnice[6] = new Tretja.Avditorna("A3", 75);
        predavalnice[7] = new Tretja.Garaza("G3", 193, 170);
        predavalnice[8] = new Tretja.Racunalnica("R3", 79, 7);
        predavalnice[9] = new Tretja.Garaza("G4", 71, 231);
        predavalnice[10] = new Tretja.Garaza("G5", 188, 115);
        predavalnice[11] = new Tretja.Garaza("G6", 135, 210);
        predavalnice[12] = new Tretja.Garaza("G7", 80, 101);
        predavalnice[13] = new Tretja.Avditorna("A4", 125);
        predavalnice[14] = new Tretja.Garaza("G8", 290, 415);
        predavalnice[15] = new Tretja.Racunalnica("R4", 60, 26);
        predavalnice[16] = new Tretja.Avditorna("A5", 163);
        predavalnice[17] = new Tretja.Racunalnica("R5", 92, 62);
        predavalnice[18] = new Tretja.Avditorna("A6", 238);
        predavalnice[19] = new Tretja.Racunalnica("R6", 72, 25);
        predavalnice[20] = new Tretja.Garaza("G9", 211, 441);
        predavalnice[21] = new Tretja.Racunalnica("R7", 87, 14);
        predavalnice[22] = new Tretja.Racunalnica("R8", 14, 1);
        predavalnice[23] = new Tretja.Avditorna("A7", 162);
        predavalnice[24] = new Tretja.Avditorna("A8", 260);
        predavalnice[25] = new Tretja.Avditorna("A9", 162);
        predavalnice[26] = new Tretja.Racunalnica("R9", 61, 56);
        predavalnice[27] = new Tretja.Avditorna("A10", 102);
        predavalnice[28] = new Tretja.Racunalnica("R10", 72, 13);
        predavalnice[29] = new Tretja.Racunalnica("R11", 55, 35);
        predavalnice[30] = new Tretja.Garaza("G10", 145, 340);
        predavalnice[31] = new Tretja.Garaza("G11", 185, 228);
        predavalnice[32] = new Tretja.Racunalnica("R12", 68, 62);
        predavalnice[33] = new Tretja.Garaza("G12", 219, 276);
        predavalnice[34] = new Tretja.Garaza("G13", 158, 411);
        predavalnice[35] = new Tretja.Garaza("G14", 297, 302);
        predavalnice[36] = new Tretja.Garaza("G15", 286, 166);
        predavalnice[37] = new Tretja.Avditorna("A11", 49);
        predavalnice[38] = new Tretja.Racunalnica("R13", 63, 52);
        predavalnice[39] = new Tretja.Garaza("G16", 78, 300);
        predavalnice[40] = new Tretja.Racunalnica("R14", 84, 40);
        predavalnice[41] = new Tretja.Avditorna("A12", 296);
        predavalnice[42] = new Tretja.Racunalnica("R15", 76, 52);
        predavalnice[43] = new Tretja.Garaza("G17", 172, 200);
        predavalnice[44] = new Tretja.Racunalnica("R16", 13, 3);
        predavalnice[45] = new Tretja.Garaza("G18", 85, 111);
        predavalnice[46] = new Tretja.Garaza("G19", 142, 203);
        predavalnice[47] = new Tretja.Garaza("G20", 237, 323);
        predavalnice[48] = new Tretja.Racunalnica("R17", 58, 21);
        predavalnice[49] = new Tretja.Avditorna("A13", 131);
        predavalnice[50] = new Tretja.Avditorna("A14", 45);
        predavalnice[51] = new Tretja.Garaza("G21", 204, 498);
        predavalnice[52] = new Tretja.Racunalnica("R18", 21, 8);
        predavalnice[53] = new Tretja.Racunalnica("R19", 20, 9);
        predavalnice[54] = new Tretja.Garaza("G22", 161, 288);
        predavalnice[55] = new Tretja.Garaza("G23", 156, 247);
        predavalnice[56] = new Tretja.Racunalnica("R20", 42, 42);
        predavalnice[57] = new Tretja.Racunalnica("R21", 80, 28);
        predavalnice[58] = new Tretja.Racunalnica("R22", 37, 32);
        predavalnice[59] = new Tretja.Racunalnica("R23", 74, 16);
        predavalnice[60] = new Tretja.Racunalnica("R24", 44, 2);
        predavalnice[61] = new Tretja.Garaza("G24", 68, 214);
        predavalnice[62] = new Tretja.Racunalnica("R25", 87, 42);
        predavalnice[63] = new Tretja.Avditorna("A15", 22);
        predavalnice[64] = new Tretja.Garaza("G25", 210, 414);
        predavalnice[65] = new Tretja.Garaza("G26", 211, 220);
        predavalnice[66] = new Tretja.Racunalnica("R26", 96, 43);
        predavalnice[67] = new Tretja.Racunalnica("R27", 33, 23);
        predavalnice[68] = new Tretja.Racunalnica("R28", 81, 65);
        predavalnice[69] = new Tretja.Racunalnica("R29", 81, 31);
        predavalnice[70] = new Tretja.Avditorna("A16", 290);
        predavalnice[71] = new Tretja.Avditorna("A17", 32);
        predavalnice[72] = new Tretja.Avditorna("A18", 251);
        predavalnice[73] = new Tretja.Racunalnica("R30", 62, 30);
        predavalnice[74] = new Tretja.Racunalnica("R31", 41, 15);
        predavalnice[75] = new Tretja.Racunalnica("R32", 26, 18);
        predavalnice[76] = new Tretja.Racunalnica("R33", 89, 19);
        predavalnice[77] = new Tretja.Avditorna("A19", 158);
        predavalnice[78] = new Tretja.Racunalnica("R34", 32, 32);
        predavalnice[79] = new Tretja.Garaza("G27", 238, 125);
        predavalnice[80] = new Tretja.Avditorna("A20", 57);
        predavalnice[81] = new Tretja.Avditorna("A21", 174);
        predavalnice[82] = new Tretja.Garaza("G28", 280, 454);
        predavalnice[83] = new Tretja.Garaza("G29", 224, 260);
        predavalnice[84] = new Tretja.Garaza("G30", 229, 290);
        predavalnice[85] = new Tretja.Racunalnica("R35", 42, 28);
        predavalnice[86] = new Tretja.Avditorna("A22", 280);
        predavalnice[87] = new Tretja.Avditorna("A23", 78);
        predavalnice[88] = new Tretja.Avditorna("A24", 281);
        predavalnice[89] = new Tretja.Garaza("G31", 218, 205);
        predavalnice[90] = new Tretja.Avditorna("A25", 228);
        predavalnice[91] = new Tretja.Garaza("G32", 69, 115);
        predavalnice[92] = new Tretja.Garaza("G33", 81, 222);
        predavalnice[93] = new Tretja.Avditorna("A26", 58);
        predavalnice[94] = new Tretja.Racunalnica("R36", 91, 40);
        predavalnice[95] = new Tretja.Racunalnica("R37", 58, 47);
        predavalnice[96] = new Tretja.Avditorna("A27", 86);
        predavalnice[97] = new Tretja.Garaza("G34", 123, 123);
        predavalnice[98] = new Tretja.Avditorna("A28", 61);
        predavalnice[99] = new Tretja.Avditorna("A29", 149);
        predavalnice[100] = new Tretja.Avditorna("A30", 236);
        predavalnice[101] = new Tretja.Racunalnica("R38", 23, 10);
        predavalnice[102] = new Tretja.Racunalnica("R39", 98, 18);
        predavalnice[103] = new Tretja.Garaza("G35", 286, 150);
        predavalnice[104] = new Tretja.Garaza("G36", 62, 443);
        predavalnice[105] = new Tretja.Avditorna("A31", 276);
        predavalnice[106] = new Tretja.Racunalnica("R40", 26, 18);
        predavalnice[107] = new Tretja.Racunalnica("R41", 67, 45);
        predavalnice[108] = new Tretja.Garaza("G37", 143, 453);
        predavalnice[109] = new Tretja.Avditorna("A32", 214);
        predavalnice[110] = new Tretja.Avditorna("A33", 84);
        predavalnice[111] = new Tretja.Racunalnica("R42", 90, 83);
        predavalnice[112] = new Tretja.Racunalnica("R43", 85, 31);
        predavalnice[113] = new Tretja.Avditorna("A34", 134);
        predavalnice[114] = new Tretja.Garaza("G38", 123, 247);
        predavalnice[115] = new Tretja.Avditorna("A35", 96);
        predavalnice[116] = new Tretja.Garaza("G39", 117, 382);
        predavalnice[117] = new Tretja.Garaza("G40", 115, 300);
        predavalnice[118] = new Tretja.Racunalnica("R44", 43, 36);
        predavalnice[119] = new Tretja.Avditorna("A36", 119);
        predavalnice[120] = new Tretja.Racunalnica("R45", 65, 43);
        predavalnice[121] = new Tretja.Garaza("G41", 146, 239);
        predavalnice[122] = new Tretja.Avditorna("A37", 131);
        predavalnice[123] = new Tretja.Garaza("G42", 154, 390);
        predavalnice[124] = new Tretja.Racunalnica("R46", 42, 12);
        predavalnice[125] = new Tretja.Garaza("G43", 196, 450);
        predavalnice[126] = new Tretja.Garaza("G44", 192, 220);
        predavalnice[127] = new Tretja.Avditorna("A38", 130);
        predavalnice[128] = new Tretja.Avditorna("A39", 41);
        predavalnice[129] = new Tretja.Avditorna("A40", 98);
        predavalnice[130] = new Tretja.Avditorna("A41", 224);
        predavalnice[131] = new Tretja.Racunalnica("R47", 82, 2);
        predavalnice[132] = new Tretja.Garaza("G45", 69, 488);
        predavalnice[133] = new Tretja.Garaza("G46", 128, 474);
        predavalnice[134] = new Tretja.Racunalnica("R48", 11, 6);
        predavalnice[135] = new Tretja.Garaza("G47", 179, 183);
        predavalnice[136] = new Tretja.Racunalnica("R49", 83, 14);
        predavalnice[137] = new Tretja.Avditorna("A42", 17);
        predavalnice[138] = new Tretja.Garaza("G48", 254, 175);
        predavalnice[139] = new Tretja.Racunalnica("R50", 86, 32);
        predavalnice[140] = new Tretja.Avditorna("A43", 249);
        predavalnice[141] = new Tretja.Garaza("G49", 123, 183);
        predavalnice[142] = new Tretja.Garaza("G50", 182, 236);
        predavalnice[143] = new Tretja.Avditorna("A44", 127);
        predavalnice[144] = new Tretja.Racunalnica("R51", 73, 14);
        predavalnice[145] = new Tretja.Avditorna("A45", 284);
        predavalnice[146] = new Tretja.Racunalnica("R52", 40, 26);
        predavalnice[147] = new Tretja.Racunalnica("R53", 51, 20);
        predavalnice[148] = new Tretja.Racunalnica("R54", 52, 27);
        predavalnice[149] = new Tretja.Garaza("G51", 217, 227);
        predavalnice[150] = new Tretja.Garaza("G52", 260, 204);
        predavalnice[151] = new Tretja.Racunalnica("R55", 65, 56);
        predavalnice[152] = new Tretja.Avditorna("A46", 19);
        predavalnice[153] = new Tretja.Avditorna("A47", 62);
        predavalnice[154] = new Tretja.Racunalnica("R56", 63, 42);
        predavalnice[155] = new Tretja.Racunalnica("R57", 62, 42);
        predavalnice[156] = new Tretja.Garaza("G53", 275, 500);
        predavalnice[157] = new Tretja.Avditorna("A48", 155);
        predavalnice[158] = new Tretja.Avditorna("A49", 62);
        predavalnice[159] = new Tretja.Avditorna("A50", 104);
        predavalnice[160] = new Tretja.Garaza("G54", 188, 496);
        predavalnice[161] = new Tretja.Garaza("G55", 56, 235);
        predavalnice[162] = new Tretja.Racunalnica("R58", 42, 19);
        predavalnice[163] = new Tretja.Avditorna("A51", 289);
        predavalnice[164] = new Tretja.Avditorna("A52", 84);
        predavalnice[165] = new Tretja.Racunalnica("R59", 11, 11);
        predavalnice[166] = new Tretja.Garaza("G56", 56, 298);
        predavalnice[167] = new Tretja.Garaza("G57", 138, 490);
        predavalnice[168] = new Tretja.Avditorna("A53", 217);
        predavalnice[169] = new Tretja.Avditorna("A54", 127);
        predavalnice[170] = new Tretja.Garaza("G58", 214, 178);
        predavalnice[171] = new Tretja.Racunalnica("R60", 35, 10);
        predavalnice[172] = new Tretja.Garaza("G59", 190, 470);
        predavalnice[173] = new Tretja.Racunalnica("R61", 38, 20);
        predavalnice[174] = new Tretja.Garaza("G60", 188, 396);
        predavalnice[175] = new Tretja.Racunalnica("R62", 11, 8);
        predavalnice[176] = new Tretja.Racunalnica("R63", 78, 44);
        predavalnice[177] = new Tretja.Avditorna("A55", 291);
        predavalnice[178] = new Tretja.Avditorna("A56", 60);
        predavalnice[179] = new Tretja.Racunalnica("R64", 25, 12);
        predavalnice[180] = new Tretja.Garaza("G61", 95, 406);
        predavalnice[181] = new Tretja.Racunalnica("R65", 33, 10);
        predavalnice[182] = new Tretja.Avditorna("A57", 90);
        predavalnice[183] = new Tretja.Avditorna("A58", 205);
        predavalnice[184] = new Tretja.Racunalnica("R66", 29, 9);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        System.out.println(stavba.casCiscenja());
    }
}