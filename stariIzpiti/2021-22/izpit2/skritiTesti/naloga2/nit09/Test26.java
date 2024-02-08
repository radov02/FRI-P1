
import java.util.*;

public class Test26 {

    private static final int[][][] SLIKA = {
        {{ 39, 164,  15}, {142, 226,  94}, { 89,  24, 125}, {  9,   9,  30}, { 12, 100, 185}, {196, 160, 211}, {185,  28,  12}, { 36,  27, 249}, {174, 124, 233}, {188,  35, 145}, {210, 183, 231}, {  6,  64, 250}, {195, 183,  31}, {222, 135, 131}, {  9, 109,  51}, {186, 125,  67}, {179, 101, 150}, {126,   7, 188}, {108,  37, 157}, {122,  36,  65}, {228, 194, 169}, {249, 222, 190}, {222,  50,  12}, { 52, 139,  41}, {236, 194, 179}, { 89,  44, 111}, {122, 126, 245}, {140, 140,  98}, {181, 230,  54}, {162, 191, 223}, {182, 142, 108}, {120,  12, 121}, {160, 130,  41}, {160, 168, 203}, { 73,  47,  70}, {230, 223, 228}, {203, 114,   3}, { 49,  91,  44}, {236, 224, 158}, { 85,  33, 137}, { 84,  14,  29}, {122, 225, 246}, { 58,  21, 198}, {204, 190, 214}, { 27, 187, 233}, {121,  64,  41}, {114, 215,  88}, { 90, 186,  94}, {151,  77,  40}, { 27, 253, 176}, {220,  99, 114}, { 68,  70, 102}, { 20,  14, 109}, { 68, 199, 114}, { 94, 107,   2}, {243, 226, 181}, { 24,  29, 194}, {125,  87,  11}, {132,  46, 226}, { 98,  31,   2}, {  9,   7,  13}, {  7,  49,  77}, { 88,  56, 141}, {226, 153,  34}, {115,  28,   4}, { 29,   9, 125}, { 39,  15,  10}, { 93, 161,  24}},
        {{163, 196, 235}, {122, 174, 214}, {174,   9,  31}, { 15, 154,  68}, {132, 100, 129}, { 24,  17,  15}, { 22,  97, 243}, { 90,  33, 212}, { 86,  42, 162}, {165,  28, 161}, {  1,  24,  29}, {205, 147, 138}, { 61,  15,  93}, {227, 222,  85}, {227, 209,   4}, { 37, 104, 155}, {201,  81, 197}, { 93, 212,  74}, { 32,  30, 131}, {188, 107,  64}, {177,  53,  29}, {131,  66,  60}, {123,  80, 168}, { 59,  34, 190}, {199,  88, 198}, { 96,  39, 118}, {209, 205, 159}, { 87, 192, 228}, { 95,  54, 189}, {124, 115,  21}, { 78, 151, 157}, { 16, 162, 164}, { 37, 120,  65}, {  9,  83, 102}, {162, 162, 249}, { 33, 185, 119}, {103, 129, 188}, { 42,  71, 248}, { 45,  43,  66}, {193,  38,  14}, {191, 178, 220}, { 59,  61,  94}, {219, 187, 158}, { 63,  46,  59}, { 69,  62,  56}, {244, 204, 100}, { 36, 141, 170}, { 75, 138, 167}, { 47,  72, 203}, {134, 232, 254}, {197,  33, 229}, { 52, 103, 230}, {161,  64, 114}, {207,  49, 194}, { 26,  94, 215}, {136, 216, 255}, {176,  16, 184}, {206,  23, 170}, {186, 198,  60}, {127,  38,  99}, { 42, 153,  17}, {237,  59, 210}, { 23, 161, 231}, {160,  68, 142}, {207, 112,  39}, { 79,  45, 140}, {192, 104, 226}, { 37,  10, 139}},
        {{129,  85,  48}, { 85,  64,  43}, { 28, 242, 143}, {234, 217, 223}, {193, 204, 223}, {  7, 138, 224}, { 92,  39,  17}, { 72, 156, 159}, {179, 115, 221}, {180,  80,  77}, {103,  51,   9}, {226,  92,  46}, {179,  16, 129}, {  3,  10,  31}, { 10,  14,  81}, { 17,  36, 235}, {122,  66, 126}, { 72,  64, 216}, {193, 183, 193}, {  0,  86, 107}, {220,  47, 191}, { 35, 189, 211}, { 81,  45,  15}, {215, 125,  75}, {250, 176,  41}, {225,   9,  25}, { 75,   0, 198}, {201,  53,  46}, { 75, 102, 126}, {112,  42,  58}, {207, 194,  40}, { 49,  22,  19}, {  1,   2,  12}, { 13, 100, 136}, {117, 124, 129}, {203, 176, 160}, { 62,  83, 206}, { 73,  78, 113}, {165, 127, 186}, {209, 240,  13}, { 11,  34, 198}, { 11,  80, 234}, {195,  35, 254}, {164, 159,  44}, {243,  23, 160}, { 90,  21,  85}, { 40,   2,  64}, { 76,  72,  22}, {212,  18, 217}, {210,  23,  49}, {  3,   1,   2}, {253,   3, 192}, { 43,  72, 144}, {104,  18,  44}, {215, 106,  43}, { 97,  70, 119}, {135, 229,  35}, {  0,  51, 244}, {227, 124,  14}, {134,  49,  80}, { 87,  57,  65}, {146,  66,  10}, { 23, 140, 222}, { 13,  43,  20}, { 55,  61, 208}, {106, 166, 209}, {230,  34, 181}, {136,  60, 159}},
        {{ 35, 239,  99}, {160, 115, 124}, {118, 214, 100}, { 35, 249, 203}, {215, 209,  68}, { 63, 138,  65}, {143,  69,  98}, {247, 164, 182}, { 30,  29, 194}, {142, 191, 159}, {  4,  85, 145}, {241,  67,  40}, { 85, 160, 255}, { 78,  27,  32}, { 32,  22, 163}, {149, 141,  71}, { 73,  47,  54}, { 50,  76, 121}, { 25,  23, 107}, { 63,   4,  38}, {  4, 112, 193}, {103, 148, 114}, {149,  42,  27}, {214, 157, 165}, {162, 168,  24}, {161, 236, 126}, { 91, 158, 177}, { 83,   0, 149}, {216, 206, 106}, {184,   0,  64}, { 37,   3, 148}, {142,  69,  67}, {176, 100,  87}, { 76, 114, 227}, { 32,  28, 138}, {121, 226, 233}, { 44, 123, 123}, {224, 168,  19}, {128, 110,  31}, { 48,  60,  85}, { 79,  72, 193}, {177, 187, 225}, {219, 198,  33}, {161, 127, 141}, {203, 100,  93}, { 60, 225, 197}, { 11,  55, 103}, { 55,  63,  82}, {186,  81,  21}, { 13, 186, 193}, {204,  17,  32}, {247, 228, 126}, { 69, 183, 219}, {113,   5, 135}, {245, 205, 235}, {156,   5, 204}, {113,  47,  58}, {  2,  39, 218}, {104, 105, 111}, { 33,  43,  51}, {165,   1,  32}, { 51,  42,  14}, {218, 196,  73}, { 87,  18, 215}, { 15,  42,  56}, { 30,  84, 106}, {147,   9,   2}, { 20, 111, 132}},
        {{223,  54, 154}, {  1, 130,  13}, {207,  40, 145}, { 54, 118, 161}, { 66,  32,  22}, {168,  43,  71}, {221, 140,   8}, {171, 170, 237}, {179,  31,  34}, {197,  64, 178}, {178,  19, 210}, { 36,  94, 186}, {216,  35,  62}, {232, 205, 224}, {152, 170, 184}, {102,  44,  79}, {116,  21,  40}, { 45,  53, 144}, {174,  49, 121}, {185, 146,   7}, {170, 120, 119}, { 30, 167, 132}, { 10,   6,  47}, {182,  50,  38}, {201,  28, 184}, {144,  38,  95}, {144,  83,  64}, { 17,  53,  65}, {220, 205, 109}, {  7, 114,  57}, { 89,  42,  40}, { 76,  89, 138}, {206, 206, 110}, { 28,  18,   9}, {174,  78,  69}, {212,  50, 241}, {170, 147, 253}, {191, 154,  96}, {173, 178, 213}, {178, 198, 227}, { 77, 181, 242}, {213, 155, 173}, { 13, 101, 121}, { 12,  18, 173}, {226,  12, 174}, {188, 102,  92}, {124,   6,  99}, { 90,  47,  63}, {253,  15, 247}, {226,  70,  80}, {131,  15,  35}, {242,  63, 203}, { 28,  12,   8}, {120,  25, 160}, { 93,  64, 230}, {238, 123, 122}, {112, 103,  52}, {111, 153, 228}, { 38,  27,  61}, { 99, 229, 194}, {253, 254, 144}, { 30,  22,  76}, {128,  64,  60}, {132,  93,   1}, {108,  17, 185}, {205,  66, 229}, { 35,  17, 108}, { 78, 235, 123}},
        {{103,  82, 172}, {195,  70, 248}, {  3,   3,  16}, {227, 149, 114}, { 98, 116, 211}, { 12,  28,  31}, {109, 121, 148}, { 27,  66,  69}, {  2, 146, 194}, {243,  82,  41}, { 92,   6, 146}, { 48, 151, 184}, { 62, 247, 157}, { 68,  14, 252}, { 59,  51,   6}, { 21,  25,  97}, {230, 124,  56}, {206, 171, 186}, { 41,  20,  17}, {238, 118,   6}, {242, 116, 148}, { 45,  94, 111}, {129,  70,  51}, { 18, 135, 248}, {217, 234,  91}, { 74,  47,  66}, {187, 201,  42}, { 95, 112, 114}, {154, 220, 253}, {166,  39,  50}, { 10,  56, 222}, { 38,  96, 229}, {155, 132,  37}, { 23,  36, 122}, {118,  48,   2}, {205,   0, 102}, {  3, 113, 234}, {131, 131, 108}, {122, 101, 164}, {140,  99, 182}, {174,  38,  68}, { 48,   9, 243}, { 62,  93, 239}, {126,  57,  31}, {234, 172, 165}, {207, 193,  99}, {191,  87, 180}, { 62,  43,  26}, { 30, 108, 113}, {235,  83, 145}, { 22,  96, 144}, {185,  85, 253}, { 24, 129, 178}, {111, 118,  73}, {133, 149, 175}, { 55,  43,  51}, {186,   0,  78}, { 82,  27, 108}, {223,  93,  34}, {209,   7,  59}, {157,  24,  94}, {231,  88, 146}, { 59,  72,  74}, {172,  77,  31}, {209, 167, 133}, {229,  11,  40}, { 26, 163, 250}, { 48,  32,  28}},
        {{174,  13, 106}, { 99,  54, 216}, { 51,  34, 221}, {184,  89,  63}, {205,   6, 210}, { 38, 242, 229}, { 71,  56,  51}, {180,  86, 189}, {195, 253,  92}, {106,  86,  27}, {251, 126,  95}, {192, 108,  94}, {251,   3, 234}, { 19,  31,  58}, {153,   0, 104}, {166, 126, 138}, {128,  75, 191}, {115,  18, 170}, {115,  92, 103}, {140, 121, 200}, { 46,   1, 143}, {247, 200, 138}, {191,  49, 152}, { 49, 112, 121}, {162, 118, 161}, { 27, 122, 158}, {214, 197, 122}, { 86,  30, 183}, { 92,  38, 105}, { 72,  19,  80}, {211, 119, 150}, {171, 111, 182}, {216, 134,  54}, { 25,  98, 177}, {239,  41, 161}, {180,  41,  88}, {171, 145,  84}, {  8, 103, 113}, {241, 218, 157}, {164,  75,  75}, {179, 107,   6}, {123, 153, 233}, { 12,  34, 175}, {129, 178, 172}, {173, 174, 171}, { 57,  14,  94}, {230, 145,   2}, {199, 239, 246}, { 46, 240, 230}, {112,  71, 163}, { 84, 106, 222}, { 34,  22, 130}, { 15,  17, 114}, { 16,  15,  30}, {163,   4, 141}, { 27,  25, 167}, {175, 162, 108}, {175, 150,  11}, { 71,  28,  85}, { 79,  20,  45}, {251,  12,   3}, { 30, 144,  65}, {224, 156, 177}, {182, 235, 233}, {213,  10,  50}, { 99, 149, 214}, {169, 146,  57}, {126, 158, 207}},
        {{ 50,  36,  51}, {200,  34, 149}, {128,  61, 115}, {243, 124, 192}, {235, 159, 250}, {  8,  11,  11}, {207, 165, 182}, { 64,  97, 104}, { 30, 108, 143}, {207, 181,  94}, {229,  46,  90}, { 88, 225, 133}, { 78, 167, 205}, {133, 204, 112}, {  2, 118, 246}, {128,  48,  59}, { 73,  57,  41}, { 34,  42, 191}, {102, 252, 171}, {105,   6, 225}, { 39,  18,   0}, {249,  92, 163}, {172, 119,  60}, { 42, 147, 249}, {244,  17,  69}, { 94,  42,  48}, { 76,  69,  22}, { 14,  26, 238}, { 93, 193, 244}, { 51,  10,  31}, {154,  19, 191}, {197, 187,  37}, {211,  86,  40}, {159, 129, 159}, {150,  18, 125}, {223, 192,  76}, {158, 149, 219}, {207, 199,   7}, {250, 168,   5}, {146,   2, 148}, {105,   3,  68}, {135, 184, 194}, {216,  25,  73}, {129, 227, 141}, { 18,  20,  65}, {188, 174, 156}, {139, 154,  37}, { 75, 169, 181}, {145, 143,  32}, {219, 179,  12}, { 32,  15,  83}, {131, 100,  40}, {135,  70,  18}, { 94,  63, 133}, { 93,  19, 174}, {147, 141, 144}, {130,  68,  94}, { 34, 163, 225}, {121,  21,  24}, {  1, 113,  32}, { 36, 107,  69}, {253, 180,  26}, { 94,  60, 198}, { 37, 120, 140}, {236,  40,  42}, {103,  58, 176}, {192,   1,   4}, { 50,   4,  45}},
        {{ 53,  25, 160}, {106,  28, 249}, { 70,  82, 246}, {142,  56,  50}, { 38,  44,  85}, { 33,  13, 190}, { 83,  28, 137}, {237, 160, 172}, {247,   5,  84}, {115, 151, 140}, {127,  42, 226}, { 63,   4,  84}, {214, 186,  91}, { 26,  14, 214}, {241,  69, 202}, {103,  20, 183}, {213,  43,  28}, { 31,  21,   8}, { 51, 161, 150}, {142, 138, 209}, {109,  95, 169}, {115, 142, 243}, {224,  69, 154}, { 31,  78,  32}, {  7,  88, 161}, {140, 247,  22}, { 72,  84, 243}, { 47, 130, 189}, { 46,  78, 131}, { 27,  44,  85}, {180,  56, 234}, {104, 173,   7}, { 50, 139, 128}, {130,  80, 168}, { 44,  87, 223}, { 24, 202, 125}, {154, 138,  30}, {220, 129, 190}, { 87, 178,  67}, {185,   0,  94}, {  6, 166, 187}, { 44,  75, 108}, {199,  62,  57}, { 22,  14,  19}, {126, 153, 217}, { 28,  25, 117}, { 41,  10, 130}, {253, 170, 179}, { 53, 198,  62}, {225,   7, 103}, {218,  71,  66}, { 77,  28,  79}, { 93,  36, 110}, { 27,  13,  29}, {102,  13, 250}, {124, 104, 118}, { 52,  17,   1}, {116,  75, 160}, {254, 134, 215}, {100,  27,  95}, { 62, 228,  85}, { 82,  38, 144}, {  8,  39, 237}, {144,  17,  80}, { 13, 108, 118}, {202,  54,  44}, {246, 122, 241}, {243,  92,  58}},
        {{251,  48, 116}, { 60,  59, 128}, {246, 189, 169}, { 70,  57,  33}, { 20,  46,  96}, {106,  81, 178}, { 64, 213, 225}, {101,  44,   6}, { 37,  50,  86}, { 65,  15, 121}, { 40,  68, 148}, {123,  51, 130}, {161,   4, 139}, { 40,  83,  83}, {116,   4, 154}, {184,  89, 233}, { 96, 160, 211}, { 64, 243, 131}, { 70,  93, 214}, {139, 117,  48}, {175,  77,   2}, {104, 122, 164}, {245,  66,  48}, { 58, 151, 215}, {103, 172, 197}, {164,  67,  97}, { 78, 237, 134}, {233, 138,  93}, {183, 149, 106}, {130,   8,  30}, {149,  52,  99}, { 34, 115, 144}, {224, 194, 196}, { 45,  17, 183}, { 90, 121, 214}, {144,  13,   0}, {200,  36,   1}, {172, 216,  86}, {110,  89,  15}, {158, 166,  99}, {105, 204, 226}, {177,  83, 102}, {137, 121, 134}, {139,  17, 196}, { 70,  53,   0}, { 55,  93, 169}, { 49,  32, 132}, { 30, 187, 189}, { 30,  68,  77}, { 43, 180, 180}, {160, 170, 189}, {197, 192,  48}, { 90,  38,  82}, {155, 142,   5}, { 41, 142, 170}, {237,  27,  15}, { 36,   2,  14}, {203,  84, 197}, {244,  57, 230}, {111, 143, 156}, {185, 182,  31}, {199,  17, 105}, {238,  43,  45}, { 63,  71,  85}, { 70,  76, 195}, {248, 153, 152}, { 75,  66,  16}, {204,  25,  38}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}