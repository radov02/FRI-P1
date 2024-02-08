
import java.util.*;

public class Test21 {

    private static final int[][][] SLIKA = {
        {{ 14,  32, 129}, { 76,  36, 109}, {169,  30, 165}, {161, 100, 166}, {223,   6, 145}, {248,  80, 121}, {116,  87, 225}, { 68, 197, 219}, {188,  36, 126}, { 28,  48, 207}, {145, 139,  25}, {184,  11,  44}, {178, 114, 165}, {191, 133,  61}, { 33, 191, 193}, { 95,  58, 111}, {157, 100,  26}, {222, 100, 119}, {103, 179, 249}, { 69,  39,  64}, {176,  77, 142}, {215,  95, 156}, {236, 110, 161}, {195,   4, 208}, {126, 155, 192}, {125,   0, 149}, { 47,  77, 180}, {248, 198,  54}, { 98,  56, 180}, {132, 179, 183}, { 91, 160, 240}, {215, 100,  52}, {147,  81, 121}, {196,  68, 109}, {209,  81,  32}, {181,  74,  20}, {196,  41,  60}, {  9,   7,  20}, {117,  57, 159}, {193, 193, 118}, {215,  44,  51}, {190,  89, 114}, {107,  35,  65}, {136, 106, 157}, {227,  54, 249}, {197,   3,  82}, { 35,  91, 241}, {227, 201,  16}, { 11,  22,  26}, {109,  22,  10}, {196, 106, 182}, {122, 125, 237}, {116, 232, 240}, { 11, 210, 242}, {101,  29,  12}, {140, 137,   0}, { 63,  77, 114}, { 84, 170, 197}, {224, 195, 206}, { 19, 130, 245}, {244, 125,  57}, { 33, 122, 142}, {117,  40, 112}, {253,  15, 182}, {175, 158,  75}, {173,  34,  11}, {134,  42, 154}, { 69,  45,  75}, {  7,  11,  13}, { 76,  21,  31}, {172,  74, 241}, { 49,  19, 223}, {237, 182, 119}, { 27,  27,  68}, {140,  45,  98}, {243,   3,  56}, {236, 117, 150}, { 51,  72, 209}, {196,  57,  97}, { 62, 175, 237}, {120, 126, 149}, {254, 107,  61}, {175, 138,  17}, {239, 138, 154}, {247, 111, 104}, { 41,   3,  29}, {154, 112,  84}, { 28,   5,  89}, {253,  17,  41}, {144, 220, 223}, { 26,  54, 136}, {100, 133, 219}, {162, 129, 159}, { 35,  58, 190}, { 85,  63, 153}, { 18, 116, 250}, {210,  51, 196}},
        {{221,  58, 220}, { 59, 199, 224}, { 81,  92, 130}, {108, 152, 201}, {162,  10,  41}, {202,  62,  18}, {118,  24,  63}, {183,  38, 237}, {102, 123, 166}, {145,  24, 123}, {214,  50, 155}, { 22,  10, 182}, {123, 159, 239}, {253, 140, 122}, {128,  39, 129}, {132,  16,  61}, {  0,   4,  47}, {153,  84, 199}, { 66, 223, 230}, { 95,  82, 177}, {159,  77,  62}, {126,  49, 132}, {161,  34, 147}, {224, 161,  43}, { 72,  50,  84}, { 12,   8,   9}, { 79, 117, 196}, {103, 152, 213}, { 12,  10,  42}, { 28,  29,  53}, { 37,  46,  59}, {186,  81, 124}, { 24,  17,  98}, {235,  14, 213}, { 50,  75,  99}, { 31,  65, 119}, {172, 129, 179}, {146,  17, 224}, {  5,  81, 136}, {232, 142, 161}, {115,  57, 139}, {224,   6, 170}, {219, 195, 108}, {168, 103, 153}, {159, 126,  83}, {242, 120, 200}, {174,  11,  72}, {119,  75, 214}, {208, 163,  20}, {224, 149,   2}, {150, 116,  71}, {253, 159, 141}, {196,  21, 170}, {208, 202,  96}, { 62,  62,  15}, { 15, 128, 209}, {114, 165, 183}, {250, 112, 142}, {110,  86, 253}, {  2,  55,  95}, {243, 231, 188}, {186, 169,  32}, {208, 166, 242}, { 63,  43, 115}, {228, 112,   4}, { 84,   8,  22}, {  8,  26,  51}, {108, 127, 187}, {229,  72,  15}, {218,  19, 251}, {125,  26,  54}, {198,  79, 200}, {183, 173, 125}, {136, 138, 187}, {  6,  28,  33}, { 23, 121, 174}, { 33,  34, 167}, { 89,  67,  80}, {100,  29,  50}, {236, 159, 102}, {246, 190,  48}, {120, 198, 220}, {243, 227, 117}, {105,   4,  71}, { 72,  69,  36}, {139, 110, 218}, { 95, 134, 176}, {171,  25, 108}, {136,  36,  41}, { 28,  17, 134}, { 88,  84,  10}, {145,  61, 185}, {147,  98,  49}, {151, 159, 166}, { 64, 124, 150}, { 99,  50, 167}, { 98, 148, 205}},
        {{115,  64, 110}, {121,  80, 170}, {  5, 196, 244}, {210,  28,  82}, { 70,  39,  22}, {213,  24,  95}, { 17,  75,  91}, {243,  15, 222}, {204,  93, 178}, { 47,  10, 145}, {177,  75, 149}, {106,  90, 196}, {219,  85, 135}, { 21,  29, 100}, { 47,   2,  19}, { 77,  48, 137}, {165,  21, 194}, {146,  52,  16}, {167, 127, 102}, {146,  24, 105}, { 91,  61,   9}, {100,  98,  21}, {213, 187,  92}, { 99,  76,  84}, {105,  69, 134}, {230, 164, 229}, {214, 239, 244}, {248, 122, 245}, { 95,  70,  84}, {  0,  30,  60}, {204, 133,  77}, { 67,  91,  95}, { 85,  71, 101}, {212, 206, 208}, { 86, 107, 161}, {131, 107,  11}, {246, 156,  47}, { 32,   5,  10}, { 71,  28,  54}, {213,  81,   8}, { 79,  12,  42}, { 67, 144, 185}, {  4,   7,   7}, {224, 145, 217}, { 66,  66,  50}, { 92,  23,  57}, {122, 116, 163}, {177, 188, 255}, { 42, 169, 201}, {223, 205,  12}, {143, 119,  28}, {151,  91,  19}, {214, 111,  64}, {185,  65, 236}, {214, 211,  77}, { 91, 100, 124}, { 40, 178, 193}, {125,  79,   5}, { 46,  65, 135}, {240,  34, 153}, {  0,  30, 163}, { 96,  63,  19}, {202,   3,  90}, { 55,  28,  43}, {127,  80, 152}, {137,  44, 178}, {196, 137,  54}, { 46,   9,  14}, { 29,  21,  21}, {104,  24, 124}, {189, 166,   7}, {156, 148, 143}, {189, 160, 223}, { 64, 154, 183}, {220, 152,  83}, { 21, 130, 200}, {142,  84, 135}, {224, 215,  80}, { 42,  32, 213}, { 46, 118, 137}, {  3, 108, 124}, { 44, 132, 226}, {110,  43, 247}, {162, 104,  46}, {239,   2,  11}, { 89,  86, 128}, {173,  37, 191}, {218, 193,  91}, { 46,  48,  96}, {177,  68,  95}, { 29,  22,  73}, {138,  52, 121}, {187,   0, 197}, {  5,  36, 149}, {173, 171, 143}, { 30,  22,  35}, {218, 168, 134}},
        {{198, 197, 225}, {121,  44, 229}, { 36,  83, 138}, {185,   3,  99}, { 18,  77, 244}, { 56,  49, 166}, {170,  77, 234}, {241, 208, 225}, {254, 102, 159}, { 66,  54, 176}, {145,  32, 218}, {145, 104, 168}, {  6,   4, 133}, { 95,  74,  22}, {109,  15,  30}, {245,   2, 170}, {134, 131, 214}, { 75, 174, 195}, {246, 199,  29}, {119,  31, 184}, { 60,  37,  21}, {  1,   3,  65}, {  5,  42,  46}, { 19,   0,  15}, {236, 145,  26}, {221,  36, 219}, {225,  54, 249}, { 99,  23,  72}, {187,   5, 103}, {  3,  23,  27}, {159,  63, 172}, { 14, 100, 106}, { 97,  71,  24}, { 54,  69, 172}, {102,  97,  16}, {185, 110, 204}, {233,  51, 158}, {208, 173, 160}, {139, 111,  20}, {104,  53,  73}, { 68,  55, 150}, { 45, 225, 237}, {189,  79, 176}, { 13,  57, 100}, {232,  93, 253}, { 53,  29,  44}, {135, 194, 239}, {157, 111, 110}, {112,  38, 152}, {122, 112, 123}, { 94, 159, 235}, { 20,   4,   1}, { 67,   1, 111}, {190,  39,   4}, { 42,  29, 209}, { 97,  41, 128}, {182,  25, 149}, { 45,  44, 243}, {244,  11,   7}, { 82,  70,   1}, {199, 144, 104}, {141,  87,  65}, {239, 195,  68}, {242, 171,  74}, {251, 168, 125}, {188, 136, 200}, { 73,  88, 137}, {  7,  34,  55}, {212,  25, 108}, {100,  42,  58}, { 78, 136, 140}, {  4,   2,  62}, {104,  96,  70}, { 34,  95, 207}, {127,  60, 141}, {118, 130, 190}, {216,  56, 144}, { 57,  40,  46}, { 73,  38, 141}, {113,  25, 148}, {122,  23, 217}, {180, 166, 151}, { 83,  78,  44}, { 90,  33,  96}, {129,  47,  61}, {155, 192, 204}, {181, 148, 232}, {202,  75,  54}, { 26,  56, 116}, {245,  51, 157}, { 57,  21,  42}, {168, 131,  82}, {105,  41,  30}, {167,  14, 156}, {163, 128, 123}, {109,  64, 127}, {149,  82,   7}},
        {{167,   9,  27}, { 83,  12, 152}, {163,  87,  34}, {249,  47, 101}, { 10,  14,  88}, {253, 158, 152}, { 88,  90, 136}, { 71, 209, 212}, { 85,  13,  59}, { 89,  26,  23}, { 59,  23, 175}, { 92,  66, 250}, {138,   4,  56}, { 68,  46,  87}, { 79,   6,  34}, {132,  28, 227}, { 74,   6, 114}, {197, 173,  55}, {237, 205,   3}, { 58, 172, 182}, { 53, 105, 120}, { 10,  34,  34}, {217, 170,  66}, {248, 208,  26}, {211,  98,  40}, { 16, 101, 192}, {174, 207, 219}, {113,  86, 174}, { 67,  33,  61}, {233,  20, 214}, {114,  42, 214}, {149,  55,  47}, {241,  97, 133}, {243, 163, 230}, {197, 142, 161}, {137,  43, 212}, {174,   7,  13}, { 56,  61, 104}, { 45,  27,  61}, { 64,  52, 144}, {184,  76, 196}, {126,  83, 108}, {218, 165,   7}, { 27,   8,  16}, { 89,  80, 110}, {131,  64, 240}, {232,  37, 181}, {164,  61, 201}, {249, 189, 191}, {133,  78, 129}, {145,  98, 122}, {141,  90, 237}, {144, 123,  67}, {123,  41, 189}, {213,   6, 111}, { 74,  16, 222}, {132, 168, 198}, {226,  71, 172}, {229, 167, 126}, {227,  98,  27}, {181,  72, 232}, {  2,  37, 239}, {255, 196, 141}, {163, 169, 176}, {159, 143,  53}, {241,  11, 148}, {122,  64, 147}, {226, 194,  82}, { 14,  25, 145}, {110,  56,  99}, {155,  83, 184}, { 42, 149, 192}, {153, 144, 196}, { 72, 129, 219}, {176,  12,  62}, { 42, 101, 115}, {226, 110, 239}, {225, 138,  73}, { 18,  30, 168}, { 86,  32, 138}, {126, 139, 182}, { 26,  25, 117}, {230, 191, 122}, { 62, 103, 138}, {141,  13, 100}, {228, 128, 160}, { 21, 101, 223}, { 69, 159, 230}, {125, 121, 128}, {102,  21,  22}, { 45,  80, 126}, {190,  10, 152}, { 24,  21, 240}, { 92,  60,  63}, {253,  97,  16}, {120,  64, 157}, {105,  33, 161}},
        {{ 44, 100, 235}, { 66,  95, 131}, {150, 144,  70}, { 67,  41,  16}, {142,  51,  92}, { 17,  52, 121}, {245, 115,  27}, { 80,  60,  33}, {208, 168, 204}, { 56, 178, 208}, {201,  27, 245}, {101,  67, 206}, { 48,  70, 138}, {132,  88,  29}, { 36,   5,  31}, {127, 125,  22}, {141, 119,  13}, {136, 169, 189}, {180, 105, 122}, {121,  24,  70}, {181,   5,  43}, {234,  14,  75}, { 85,  66, 122}, { 52,  60, 172}, {  5,  74, 200}, {108,  63,  64}, { 70,  20,   5}, { 89, 235, 242}, { 73,  62, 209}, {138,  66,  77}, {173, 105, 205}, {189, 182, 102}, {231,  32, 191}, { 80,  90, 120}, {138,   2, 116}, {143, 128, 147}, {213,  57, 140}, {145,  83, 111}, {213, 153, 185}, {202, 123, 122}, {157, 153, 156}, {  7,   9, 201}, {175,   0,  45}, {  3,  42, 159}, { 65,  58,  41}, { 84,  17,  11}, { 95, 105, 227}, {142, 182, 235}, { 76, 184, 239}, { 26,  60, 189}, { 41,  21,  31}, { 57, 125, 225}, { 64,  43,  16}, { 11,   5,  66}, { 28,  38, 168}, { 30,  80,  95}, {174,  25, 177}, { 11,   1,   7}, {156, 142,  84}, {160, 142, 119}, {184, 190, 205}, { 49,  56, 219}, {177, 105, 172}, {143, 126, 175}, { 53, 131, 221}, {106, 167, 198}, {147,  56,  41}, {235, 219, 159}, {  2,  98, 213}, { 26, 150, 170}, { 43,  25,   7}, { 13,  22,  73}, {175,  38, 239}, { 13,   3,  12}, {212, 141, 185}, { 61,  98, 168}, {130,  59,  76}, { 63,  17,  27}, {184,  94, 165}, {150, 187, 225}, { 42,  30,  44}, {122,  61,  41}, { 94,  48, 176}, {120,   2, 165}, { 86,  89, 249}, {152,  94,  72}, {136, 136,  44}, {142,  28,  32}, {206, 104,   5}, {195,  47, 153}, { 43,   7,   7}, {219,  52, 251}, {232,  92,  93}, {183,  76, 179}, { 28,  36, 108}, {  8, 177, 253}, {170, 115,  37}},
        {{ 57,  52, 218}, {159,  15, 220}, {111,  61,  27}, { 58,  69,  71}, {  3,  54,  79}, {120, 109, 249}, { 69,  45, 160}, { 75,  92, 162}, {226,  19, 129}, {142, 103, 230}, {144, 134, 152}, {253, 195, 193}, {242, 113, 138}, {204, 110, 125}, { 95, 122, 250}, {  8,   4,  55}, {188, 106, 163}, { 43, 139, 193}, {153,  65,  63}, {  3,  65, 200}, {232, 226, 199}, {144,  32,  95}, { 41,  47, 182}, {172,  94, 100}, {239, 124,  97}, { 58,  20, 126}, {  7,  95, 214}, { 72,  58,  35}, {152, 165, 211}, { 90,  70,  94}, {237, 116, 148}, { 32,   6,  32}, { 59, 161, 208}, { 11,  83, 103}, {222,  78,  24}, { 55,  28,  15}, {176, 179, 212}, { 89, 113, 140}, { 45,  13,  13}, {216,  93, 172}, {239, 127,  53}, {164, 214, 226}, {192, 175,  82}, {189, 159,  18}, {249, 209, 253}, { 10,  96, 105}, {147,  45,  11}, { 18,  33, 118}, {111, 105,  79}, { 79,  67,  63}, { 80, 227, 242}, {239, 151, 232}, {  2,  25, 182}, {187, 161, 241}, {  5,  34, 233}, { 73,  43,  61}, {152,  38,  60}, {229,   9, 138}, {118,  32,  42}, {178,  26, 100}, {147, 124,   1}, {145,  16,  52}, { 92,  97, 186}, {121,  38,  16}, {191,  78, 114}, { 67,  19,   3}, {177,  97,   9}, {104, 129, 168}, {154,  16, 254}, { 92,  12, 154}, {183, 127, 173}, {244,  70,  97}, {160,  56, 162}, {  4,  18,  80}, { 61,  22, 228}, {139,  26, 197}, {167,  56, 173}, { 91,  85,  87}, {141, 188, 190}, {112,  10,  94}, {234, 118, 202}, {212,  16, 187}, {169,  28, 189}, {240, 233, 112}, {140,  96, 109}, { 34, 118, 136}, {225, 154, 191}, { 69,  17, 220}, {181, 161, 174}, {243,  83, 193}, {166,  75, 140}, {194,   3,   3}, { 75,  82, 204}, { 82,  41,  33}, {137, 138, 174}, {218,   6,   8}, { 58,  67, 156}},
        {{113,  90,  32}, { 11,  59, 152}, {135,   6,  72}, {113, 104, 119}, { 49,  58,  81}, {225, 145, 233}, {206, 170, 163}, {230, 208,   0}, { 90,  65,  33}, { 20,  51,  92}, {191,  18,  53}, {214,  25, 241}, {177, 203, 247}, {112,  73,   6}, { 72,   7, 184}, {251, 232, 216}, {167, 123, 167}, { 39,  75,  89}, { 18, 103, 214}, {181, 126, 193}, {183,  66,  23}, {206, 106, 235}, { 59, 227, 254}, { 75,  14, 105}, {114, 201, 226}, {179, 121, 166}, {187,  32, 113}, {186, 154, 150}, { 95,  55, 101}, {183,  56,  23}, { 76,  32,  83}, { 76,  67, 193}, {100,   5,  56}, { 99,  57,  16}, { 16,  20, 190}, {137, 131,  14}, { 38,  17,  25}, {130,  92, 255}, {238, 155, 140}, { 52,   0,  63}, {238, 151,  37}, {214, 190,   5}, {206, 205, 179}, {178,  52,  24}, {114,  23,  79}, {161, 156, 244}, { 90, 158, 161}, { 87, 143, 212}, {121, 183, 225}, { 48,  69,  76}, { 29,  16, 119}, {158, 140,  71}, {106, 118, 158}, { 13,   9,   0}, {236,  73,  64}, { 16,  48,  94}, { 70, 197, 235}, { 94,  80,  37}, { 59, 153, 174}, {141,  62, 148}, {248, 105, 142}, {201,  41,  15}, {  3,   2,   9}, {227,  91,  19}, { 72, 124, 222}, {176, 231, 243}, { 19,   8,  51}, { 38,  17, 163}, {232, 165, 154}, {138,  75, 152}, {138, 107,  11}, {  2, 143, 197}, { 92, 226, 243}, { 99,  88, 206}, { 76,  72, 169}, {139, 131,  65}, { 30, 204,  15}, { 60,   1,   2}, {170,  66,  71}, { 74, 106, 109}, {226, 180,  28}, {126, 205, 246}, {  4,  57, 164}, { 58,  23,  15}, {216,  12,  88}, {155,  93, 104}, {218, 110, 195}, {182, 176,  63}, {244, 222, 214}, {247,  74, 117}, { 43,  37,  28}, {133, 101,  25}, { 92,  48, 119}, {246, 248, 251}, {166, 146,  16}, { 93, 112, 170}, { 41,  39,  52}},
        {{ 25,   1,  25}, { 60,  13,  20}, {176,  68,  99}, {116,  33,  72}, {218, 120,  32}, {213,   1,  31}, { 24, 143, 160}, {127,  73, 169}, {222, 221, 214}, {229, 197,  65}, { 24,  98, 158}, { 88,  73,  63}, { 85,  61, 178}, {166, 108, 136}, {137, 134, 230}, {250, 155, 222}, {107,  45,  16}, { 69,  32,  87}, { 87,  61,   4}, {209, 195, 218}, { 88,  38, 254}, {135,  65, 183}, {199,  22, 185}, {158,  87, 108}, {241, 200, 220}, {208,  42,  27}, { 73, 214, 225}, {122,  52, 185}, { 45,  35,  16}, {117,  66, 103}, {203, 173, 172}, {224, 163, 178}, { 12,  44,  76}, { 31,  86, 107}, { 95,  76, 131}, { 45,  66, 152}, {126, 206, 236}, {205, 200,  79}, {213,  54, 234}, {202, 160, 108}, {188,  44,  34}, { 71, 130, 189}, {129,  38,  48}, {230,  72,  90}, {238, 135, 234}, {196, 116,  51}, {226, 146, 205}, {223, 182,  20}, {187,  62, 225}, {180,  39,  94}, { 16,   5, 155}, {101, 127, 196}, { 93, 113, 223}, {174, 148, 175}, { 26,  39,  65}, {247, 195,  21}, {225, 160, 232}, {245,  22,  80}, { 88,  32, 219}, {166,  78,  46}, {167,  74,  36}, { 82,  48,  69}, {220,  61, 146}, {235, 215,  24}, {217,   2, 122}, {125, 198, 207}, {173,  39, 149}, {111,  11, 176}, { 96,  41,  86}, {172,  84, 163}, {137,  24,  78}, {131, 134, 208}, { 11, 117, 146}, {239, 151, 132}, {132,  13, 172}, { 13,  14,  16}, {226, 183,  80}, {  2,  16,  92}, {229, 164, 141}, {111, 177, 214}, {243,  86,  70}, {220,  14,  25}, {209,  79,  11}, {  1, 107, 176}, {232,  95, 230}, {234,  31, 128}, {186,  43,  47}, {233, 204, 228}, {212,  17, 229}, {204, 105, 116}, {223, 146,  52}, { 13,   3, 169}, {105,   8,  32}, {119,  85, 191}, { 94, 136, 254}, {158,  90, 169}, {237,  22, 216}},
        {{229, 202, 217}, {155,  68,  36}, {136,  42,  98}, { 37,  26,  48}, {236,  46, 209}, {165, 114,  99}, {188,  81, 119}, {163,  12, 167}, {  1,  31, 218}, {172,  13, 214}, { 56, 129, 217}, { 39,  70,  77}, {171,  65,  39}, { 81,  65,   3}, {217,  67,  25}, {177, 114,  49}, { 70,  70, 151}, { 15,  34,  77}, { 87,  86,  69}, {235,  41,  18}, {251, 152, 213}, {253, 159, 236}, {153,  56,  81}, {186,  79,  75}, {133,  55, 178}, {244, 236,  40}, {147,  69,  66}, {170,  26, 126}, {164,  28, 208}, { 95,  85,  26}, { 26,  58, 160}, {241,  28, 242}, { 49,   9,  76}, { 55,  43,  58}, {155,  18, 226}, { 12,  55, 119}, {128,  96, 114}, {135,  85, 152}, { 28, 110, 137}, {247,  20, 106}, {179,  66,   0}, { 35,  70, 233}, {161,  56,  43}, { 85,  31,  42}, {  1, 117, 119}, {228, 146,  31}, {213, 119,   9}, {249, 231,  87}, {182,   5, 167}, {168, 134, 105}, { 36, 119, 183}, {179, 142, 248}, { 38, 205, 211}, {237,  76,  85}, {101,  81, 167}, {130, 133, 210}, {252,  91, 221}, {150, 133, 112}, {234,   1, 212}, { 97, 186, 237}, { 96,   0,  26}, { 32,   9,   2}, {238,   5, 203}, {215, 155,  33}, {242, 165, 242}, {145, 219, 223}, {141,  51, 137}, {154, 136,  59}, {190,  17, 225}, { 19,  28,  55}, {  5,   7,  40}, {168,  56, 140}, {230, 143,  12}, { 66, 146, 156}, {173,  87, 220}, {194,  58,  17}, {121,  39, 107}, { 68,  93, 204}, { 85, 142, 252}, { 54,  29, 106}, {241,   6,  38}, {  8,  42,  45}, {109,  98,  62}, { 17, 145, 253}, { 49,  17,  36}, { 84,  75, 118}, {101, 124, 191}, {173, 149,  91}, {190,   7, 240}, {229,  83,  67}, {  1, 107, 247}, {227, 191, 164}, { 22, 161, 241}, {107,  61,  41}, { 30,  23, 129}, { 23,  14,  77}, { 45,   1,  67}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}