
import java.util.*;

public class Test07 {

    private static final int[][][] SLIKA = {
        {{235, 216,  99}, { 34, 133, 217}, {180, 110,  52}, {178,  81,  69}, {147,  57, 169}, {241, 217, 197}, {124,  88,  83}, {220, 183, 174}, { 87, 112, 205}, {222,  29,  18}, { 12,  37,  62}, { 19,   7,  31}, { 45,  22, 193}, {224,  13, 197}, { 51, 123, 143}, {225,  70, 162}, {200,  57, 133}, {137, 123, 220}, {234,  35,  40}, {246, 235, 251}, {123,  28, 157}, {120,  99, 218}, {162,  91, 209}, {108, 109, 220}, {164,  49, 100}, { 50,   3,  38}, {202, 106,  97}, {117,  25, 200}, { 89,  73,  52}, {237, 150, 101}},
        {{ 96,  99, 250}, {185, 102,  56}, {233,  21,  15}, { 22,  18,   6}, {144, 101, 175}, {216,  49,   1}, {161,  31, 129}, {241, 144, 157}, { 14,  10, 207}, {183, 102,  89}, {232, 165,  21}, {144, 115, 224}, {248, 156, 194}, { 73,  60,  89}, {149, 129,   4}, { 71,  36,  61}, { 98, 115, 189}, {220,  13,  91}, { 95, 110, 147}, {174,  99,  46}, {135, 166, 214}, { 26,  12, 249}, { 11,  18,  20}, {129,  45,  38}, {104,   5, 219}, {243, 186,  61}, { 87,  20,  96}, {233,  98, 140}, { 94,  34,  86}, {  0,  13,  41}},
        {{137,  28,  93}, {159,  65,  13}, {255, 231, 146}, {200,  32,  60}, { 53,  36, 245}, {161, 122,  20}, {191, 115,  32}, { 93, 132, 166}, {219, 104, 224}, { 47,  46, 105}, {  1,  21, 127}, { 12, 171, 251}, { 64,  57,  86}, { 53, 100, 175}, {187,  12, 180}, {127,  26,  10}, { 29, 202, 239}, { 16, 154, 173}, {178,   0, 208}, {185, 132,  71}, {158,  85,  67}, { 19,  51,  86}, {123,  89,  16}, {137,  44,  87}, {255,  41, 138}, { 55,  26,  12}, {233, 172,  50}, {156, 107, 148}, {192, 133, 139}, {  9, 107, 119}},
        {{ 51,  23, 206}, {232, 204, 189}, {151,  42, 224}, { 49, 112, 209}, {153, 206, 248}, {117, 150, 198}, {241,  66, 184}, {184,   4, 205}, { 75,  40, 125}, { 50,   1,  48}, { 58, 128, 216}, { 94, 140, 173}, {253,  67, 181}, { 82, 125, 230}, {200,  10, 142}, { 24,  23, 139}, {103,  53, 202}, {166,  14,  85}, { 85,   0,  77}, {149,  73, 142}, { 24,  74, 248}, {115, 139, 243}, {225,  74, 195}, { 83,  32, 198}, {117,  27, 152}, {114,  69, 143}, {183, 187, 222}, {108, 120, 225}, { 39,   5,  91}, {111,  45,  22}},
        {{167,  50, 184}, {153,   7, 126}, { 92, 146, 233}, {247, 220, 192}, {124, 119,   6}, { 88, 111, 204}, {147,  59, 124}, {239,  44, 184}, { 90,  75, 167}, {147, 120, 136}, {107, 106, 119}, {184, 179, 235}, {218, 168, 106}, { 49,  40, 100}, { 99,  95, 123}, { 60,  51,  40}, { 10,  76, 104}, { 81,  38, 157}, {235,  97, 155}, {196,  61, 166}, { 13, 219, 245}, { 41,  28,  65}, {210,  78,  89}, { 58,  27,  41}, {117,   9, 122}, { 20,   8,  56}, {245, 124, 166}, {141, 132, 185}, {206,  91,  12}, {252, 219,  93}},
        {{ 14,   2,  19}, {194, 174,  85}, {230,  62, 181}, {198, 162, 132}, {226, 158, 126}, {255, 242, 235}, {  9,  31, 121}, { 34,  70, 135}, {140, 107, 180}, {253, 205, 225}, {241, 231, 239}, {129, 119, 149}, { 92, 161, 247}, {147, 150, 248}, {112, 105, 161}, { 52, 113, 166}, {225, 125,  99}, { 57,  71,  87}, { 11,  80, 117}, {209, 128, 173}, {147, 116,  56}, {109, 190, 194}, { 27,   5, 152}, {103,  88,  73}, {107,  42,  19}, { 38,  35,   5}, { 17,   8, 114}, {121,   6, 228}, {168,  51,  28}, { 10,  33, 221}},
        {{ 27, 139, 158}, { 64,  59, 146}, {206,   7,   7}, { 19,  32, 182}, {131,  32,  28}, {223,  11,  68}, { 46,   0,  46}, { 93,  25, 229}, {113, 182, 205}, {219,  35, 109}, {206, 178, 124}, {167,   3,  78}, {238, 152, 169}, {  8,  57, 156}, {199, 181, 212}, { 59,  86, 248}, {104,  83, 122}, { 47,  23,  96}, {121, 219, 251}, {104,  35,  77}, { 98,  12, 172}, { 37, 117, 165}, { 37,  33, 217}, {102, 151, 233}, {149, 146, 224}, {187, 124, 168}, {122,  67, 251}, {131,  26,  93}, { 41,  37,   8}, {146,  71, 103}},
        {{  5,  44, 126}, {119,   3,  57}, { 52,  33, 134}, {232,   5,   1}, {227, 182, 101}, { 85,  32,  87}, {182, 106, 166}, { 85,  48, 209}, {245,  66,  78}, { 86,  72,  30}, { 70,  52,  15}, {172,  51, 183}, {  9,  52, 171}, {212, 146,  51}, {140,  52, 119}, {170, 160,  67}, {101,  45,  85}, {198,  25,  17}, { 55,  56, 104}, { 34,  53,  54}, { 39,  49,  67}, {118,  26,  57}, {215,  30,  88}, {189, 186, 216}, {  2, 102, 234}, {252, 197,  72}, {176, 149,  27}, {103,  89,  80}, { 31, 188, 251}, {153, 130, 139}},
        {{ 90,  93, 143}, {160,  52, 119}, {206, 117,  97}, {211, 141,  61}, { 91,  27,   5}, {  9,   0,  82}, {144,   1, 176}, {  9, 134, 176}, { 32,   9,  36}, {211,  17, 241}, {115,  19, 117}, { 22,  20,  19}, { 60,  85,  89}, { 62,  38,  66}, { 63,  32,  39}, {161,  42,  67}, { 73, 251, 251}, { 56, 108, 174}, { 49,  67,  79}, {220, 169, 116}, {152,  25,  45}, {149,  28, 174}, {134, 113,  79}, {130, 144,  91}, {253, 131, 149}, {243, 134, 226}, { 75,  22,  39}, { 60,  35, 117}, { 75, 119, 155}, { 31,  57, 197}},
        {{153, 130, 177}, {218, 192, 238}, { 32, 110, 171}, { 85,  15,   7}, { 11,   3,  23}, {197,  24,  12}, { 25,  57, 122}, { 12,  17,  88}, {233, 164,  48}, {240, 129, 226}, {173, 158, 197}, {130,  20,  69}, { 45,  78, 110}, { 68,  42,   8}, {160,  43,  13}, {149,  55,  13}, { 75, 216, 237}, {127,  35, 175}, {182, 103,  62}, {  8,  41, 122}, {250, 208, 202}, {224,  80, 244}, {174,  84, 140}, {201, 169, 234}, {217, 144, 129}, { 43, 173, 177}, {187,  19, 215}, {165,  33, 194}, {179,  59,  86}, {216, 106,  92}},
        {{ 12,  21,  78}, {165, 117,  16}, {147, 153, 187}, { 30,  11, 204}, {255,  77,  24}, { 15,  64,  93}, {143,   1, 240}, { 30, 131, 250}, {107, 154, 212}, { 29,  27,  42}, {225,  68, 117}, {  6, 236, 253}, {157, 157, 242}, { 69,   1,  68}, {161,  74,  56}, { 88,  96, 147}, { 94,  25, 181}, {140, 188, 206}, {111,  46,  70}, {198, 111,  54}, { 38,  31, 166}, {172, 190, 193}, { 50,  42,  22}, {  4, 124, 177}, {202, 198,  17}, {191, 183,  34}, {191, 118, 206}, { 56,  26,   1}, {197, 199, 199}, {114,  85,   3}},
        {{243, 148, 100}, { 91,  85,  16}, { 68,  59,  68}, { 26,  53,  60}, {208,  41,  65}, {255, 176, 228}, { 53, 136, 240}, { 56,  80, 127}, { 11,  91,  93}, {222, 215,  42}, {137,  67, 177}, {148,  53,  86}, { 73, 104, 106}, {187,  74,  14}, {  1,  47,  50}, {218, 131, 221}, {165,  25, 128}, {222, 115,  78}, {142, 100, 100}, {127,  14, 122}, {141,   1, 161}, {181,  54,  72}, {138,  96, 116}, { 59,  44,  82}, { 64,  39,  52}, { 10,  14,  16}, { 92, 107, 164}, {144, 165, 221}, {244,  46, 175}, { 82,  22,  39}},
        {{ 81,  50, 103}, {121,  80,  64}, {248, 144, 148}, { 52,  18,   9}, {162, 149, 212}, { 68,   2,  93}, {232, 127,  16}, {116, 102, 187}, { 51,  12, 182}, { 96,  10, 148}, {120,   7,  95}, { 35,  64,  67}, {154, 142, 209}, {236,  68, 240}, {116,  95,  59}, {220,  26, 186}, { 29,   6,  38}, {  6, 149, 208}, {213, 125, 100}, { 69, 164, 230}, {209,   0, 238}, {  3, 210, 229}, {233, 176, 109}, {237,  56,  43}, {125,   5, 181}, {155,  48, 218}, {201, 136, 190}, {223, 118, 210}, { 79,  40,  82}, { 99,  29,  83}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}