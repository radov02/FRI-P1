
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        Tretja.Predavalnica[] predavalnice = new Tretja.Predavalnica[148];
        predavalnice[0] = new Tretja.Racunalnica("R1", 62, 1);
        predavalnice[1] = new Tretja.Racunalnica("R2", 41, 40);
        predavalnice[2] = new Tretja.Garaza("G1", 231, 147);
        predavalnice[3] = new Tretja.Garaza("G2", 272, 105);
        predavalnice[4] = new Tretja.Avditorna("A1", 181);
        predavalnice[5] = new Tretja.Racunalnica("R3", 10, 4);
        predavalnice[6] = new Tretja.Racunalnica("R4", 89, 87);
        predavalnice[7] = new Tretja.Racunalnica("R5", 90, 28);
        predavalnice[8] = new Tretja.Racunalnica("R6", 94, 5);
        predavalnice[9] = new Tretja.Garaza("G3", 299, 312);
        predavalnice[10] = new Tretja.Racunalnica("R7", 72, 38);
        predavalnice[11] = new Tretja.Racunalnica("R8", 94, 39);
        predavalnice[12] = new Tretja.Garaza("G4", 161, 213);
        predavalnice[13] = new Tretja.Avditorna("A2", 57);
        predavalnice[14] = new Tretja.Racunalnica("R9", 26, 3);
        predavalnice[15] = new Tretja.Garaza("G5", 297, 356);
        predavalnice[16] = new Tretja.Racunalnica("R10", 24, 20);
        predavalnice[17] = new Tretja.Garaza("G6", 165, 415);
        predavalnice[18] = new Tretja.Racunalnica("R11", 92, 34);
        predavalnice[19] = new Tretja.Garaza("G7", 195, 106);
        predavalnice[20] = new Tretja.Racunalnica("R12", 77, 52);
        predavalnice[21] = new Tretja.Avditorna("A3", 227);
        predavalnice[22] = new Tretja.Avditorna("A4", 121);
        predavalnice[23] = new Tretja.Avditorna("A5", 135);
        predavalnice[24] = new Tretja.Racunalnica("R13", 29, 22);
        predavalnice[25] = new Tretja.Racunalnica("R14", 27, 17);
        predavalnice[26] = new Tretja.Garaza("G8", 67, 357);
        predavalnice[27] = new Tretja.Racunalnica("R15", 19, 19);
        predavalnice[28] = new Tretja.Avditorna("A6", 190);
        predavalnice[29] = new Tretja.Racunalnica("R16", 81, 52);
        predavalnice[30] = new Tretja.Avditorna("A7", 216);
        predavalnice[31] = new Tretja.Avditorna("A8", 227);
        predavalnice[32] = new Tretja.Avditorna("A9", 210);
        predavalnice[33] = new Tretja.Avditorna("A10", 142);
        predavalnice[34] = new Tretja.Racunalnica("R17", 49, 12);
        predavalnice[35] = new Tretja.Avditorna("A11", 70);
        predavalnice[36] = new Tretja.Garaza("G9", 93, 266);
        predavalnice[37] = new Tretja.Garaza("G10", 227, 362);
        predavalnice[38] = new Tretja.Racunalnica("R18", 30, 30);
        predavalnice[39] = new Tretja.Garaza("G11", 195, 270);
        predavalnice[40] = new Tretja.Avditorna("A12", 69);
        predavalnice[41] = new Tretja.Racunalnica("R19", 90, 54);
        predavalnice[42] = new Tretja.Racunalnica("R20", 57, 17);
        predavalnice[43] = new Tretja.Avditorna("A13", 129);
        predavalnice[44] = new Tretja.Avditorna("A14", 184);
        predavalnice[45] = new Tretja.Racunalnica("R21", 75, 4);
        predavalnice[46] = new Tretja.Avditorna("A15", 78);
        predavalnice[47] = new Tretja.Racunalnica("R22", 94, 73);
        predavalnice[48] = new Tretja.Racunalnica("R23", 30, 15);
        predavalnice[49] = new Tretja.Garaza("G12", 269, 225);
        predavalnice[50] = new Tretja.Garaza("G13", 291, 226);
        predavalnice[51] = new Tretja.Avditorna("A16", 251);
        predavalnice[52] = new Tretja.Garaza("G14", 231, 419);
        predavalnice[53] = new Tretja.Garaza("G15", 69, 104);
        predavalnice[54] = new Tretja.Racunalnica("R24", 46, 4);
        predavalnice[55] = new Tretja.Garaza("G16", 96, 479);
        predavalnice[56] = new Tretja.Avditorna("A17", 271);
        predavalnice[57] = new Tretja.Avditorna("A18", 171);
        predavalnice[58] = new Tretja.Garaza("G17", 171, 481);
        predavalnice[59] = new Tretja.Avditorna("A19", 216);
        predavalnice[60] = new Tretja.Racunalnica("R25", 48, 18);
        predavalnice[61] = new Tretja.Racunalnica("R26", 63, 9);
        predavalnice[62] = new Tretja.Racunalnica("R27", 47, 26);
        predavalnice[63] = new Tretja.Garaza("G18", 225, 187);
        predavalnice[64] = new Tretja.Garaza("G19", 245, 297);
        predavalnice[65] = new Tretja.Garaza("G20", 173, 274);
        predavalnice[66] = new Tretja.Garaza("G21", 256, 210);
        predavalnice[67] = new Tretja.Avditorna("A20", 59);
        predavalnice[68] = new Tretja.Garaza("G22", 60, 147);
        predavalnice[69] = new Tretja.Garaza("G23", 240, 266);
        predavalnice[70] = new Tretja.Avditorna("A21", 166);
        predavalnice[71] = new Tretja.Garaza("G24", 274, 419);
        predavalnice[72] = new Tretja.Garaza("G25", 94, 178);
        predavalnice[73] = new Tretja.Garaza("G26", 165, 166);
        predavalnice[74] = new Tretja.Racunalnica("R28", 71, 45);
        predavalnice[75] = new Tretja.Garaza("G27", 196, 496);
        predavalnice[76] = new Tretja.Racunalnica("R29", 28, 23);
        predavalnice[77] = new Tretja.Garaza("G28", 154, 465);
        predavalnice[78] = new Tretja.Garaza("G29", 50, 151);
        predavalnice[79] = new Tretja.Garaza("G30", 296, 467);
        predavalnice[80] = new Tretja.Racunalnica("R30", 75, 20);
        predavalnice[81] = new Tretja.Avditorna("A22", 254);
        predavalnice[82] = new Tretja.Garaza("G31", 98, 483);
        predavalnice[83] = new Tretja.Garaza("G32", 205, 134);
        predavalnice[84] = new Tretja.Garaza("G33", 113, 422);
        predavalnice[85] = new Tretja.Racunalnica("R31", 17, 6);
        predavalnice[86] = new Tretja.Garaza("G34", 63, 457);
        predavalnice[87] = new Tretja.Avditorna("A23", 236);
        predavalnice[88] = new Tretja.Racunalnica("R32", 49, 22);
        predavalnice[89] = new Tretja.Racunalnica("R33", 13, 4);
        predavalnice[90] = new Tretja.Racunalnica("R34", 78, 47);
        predavalnice[91] = new Tretja.Avditorna("A24", 31);
        predavalnice[92] = new Tretja.Avditorna("A25", 38);
        predavalnice[93] = new Tretja.Garaza("G35", 77, 312);
        predavalnice[94] = new Tretja.Avditorna("A26", 293);
        predavalnice[95] = new Tretja.Avditorna("A27", 164);
        predavalnice[96] = new Tretja.Garaza("G36", 72, 360);
        predavalnice[97] = new Tretja.Racunalnica("R35", 73, 51);
        predavalnice[98] = new Tretja.Garaza("G37", 157, 459);
        predavalnice[99] = new Tretja.Avditorna("A28", 36);
        predavalnice[100] = new Tretja.Racunalnica("R36", 35, 12);
        predavalnice[101] = new Tretja.Garaza("G38", 223, 373);
        predavalnice[102] = new Tretja.Racunalnica("R37", 79, 55);
        predavalnice[103] = new Tretja.Racunalnica("R38", 54, 49);
        predavalnice[104] = new Tretja.Garaza("G39", 160, 392);
        predavalnice[105] = new Tretja.Avditorna("A29", 75);
        predavalnice[106] = new Tretja.Avditorna("A30", 120);
        predavalnice[107] = new Tretja.Garaza("G40", 215, 172);
        predavalnice[108] = new Tretja.Avditorna("A31", 45);
        predavalnice[109] = new Tretja.Garaza("G41", 281, 413);
        predavalnice[110] = new Tretja.Garaza("G42", 104, 139);
        predavalnice[111] = new Tretja.Garaza("G43", 134, 152);
        predavalnice[112] = new Tretja.Racunalnica("R39", 37, 19);
        predavalnice[113] = new Tretja.Avditorna("A32", 13);
        predavalnice[114] = new Tretja.Avditorna("A33", 130);
        predavalnice[115] = new Tretja.Avditorna("A34", 180);
        predavalnice[116] = new Tretja.Racunalnica("R40", 20, 6);
        predavalnice[117] = new Tretja.Garaza("G44", 161, 391);
        predavalnice[118] = new Tretja.Racunalnica("R41", 55, 35);
        predavalnice[119] = new Tretja.Garaza("G45", 140, 462);
        predavalnice[120] = new Tretja.Garaza("G46", 208, 112);
        predavalnice[121] = new Tretja.Garaza("G47", 243, 423);
        predavalnice[122] = new Tretja.Avditorna("A35", 128);
        predavalnice[123] = new Tretja.Racunalnica("R42", 35, 10);
        predavalnice[124] = new Tretja.Avditorna("A36", 287);
        predavalnice[125] = new Tretja.Racunalnica("R43", 59, 6);
        predavalnice[126] = new Tretja.Avditorna("A37", 155);
        predavalnice[127] = new Tretja.Avditorna("A38", 37);
        predavalnice[128] = new Tretja.Garaza("G48", 146, 139);
        predavalnice[129] = new Tretja.Racunalnica("R44", 38, 28);
        predavalnice[130] = new Tretja.Garaza("G49", 186, 172);
        predavalnice[131] = new Tretja.Avditorna("A39", 245);
        predavalnice[132] = new Tretja.Avditorna("A40", 119);
        predavalnice[133] = new Tretja.Avditorna("A41", 90);
        predavalnice[134] = new Tretja.Avditorna("A42", 144);
        predavalnice[135] = new Tretja.Racunalnica("R45", 78, 30);
        predavalnice[136] = new Tretja.Avditorna("A43", 39);
        predavalnice[137] = new Tretja.Avditorna("A44", 123);
        predavalnice[138] = new Tretja.Avditorna("A45", 271);
        predavalnice[139] = new Tretja.Racunalnica("R46", 19, 7);
        predavalnice[140] = new Tretja.Racunalnica("R47", 40, 7);
        predavalnice[141] = new Tretja.Garaza("G50", 267, 399);
        predavalnice[142] = new Tretja.Avditorna("A46", 252);
        predavalnice[143] = new Tretja.Racunalnica("R48", 92, 77);
        predavalnice[144] = new Tretja.Garaza("G51", 122, 102);
        predavalnice[145] = new Tretja.Garaza("G52", 219, 224);
        predavalnice[146] = new Tretja.Garaza("G53", 190, 322);
        predavalnice[147] = new Tretja.Garaza("G54", 208, 133);
        Tretja.Stavba stavba = new Tretja.Stavba(predavalnice);

        int[] ostanek = new int[1];
        int[] razporeditev = null;

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(1881, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(8941, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(14819, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);

        ostanek[0] = -1;
        razporeditev = stavba.razporedi(30728, ostanek);
        System.out.printf("%s | %d%n", Arrays.toString(razporeditev), ostanek[0]);
    }
}