
import java.util.*;

public class Test33 {

    private static final int[][][] SLIKA = {
        {{ 81, 182, 200}, {127,  94,  28}, {134,  42, 130}, {202, 108, 115}, { 59,  54, 148}, {111, 185,  16}, {122, 243, 225}, {111, 168, 181}, {133,  47, 138}, { 86,  35, 140}, {182, 223,  35}, {101, 142, 168}, {151, 134,  87}, {246, 115, 233}, {164, 162,  10}, {214,  53,  99}, {241, 158, 121}, {  6,  26,  36}, { 11, 101, 146}, { 28,   9,  19}, { 27, 207, 226}, {168, 140, 216}, { 44,  16,  13}, { 28,  43, 251}, { 68, 223,  20}, {  5,  46,  96}, {103,  49, 232}, {201, 152, 105}, {215, 188, 192}, {218, 144, 210}, {234, 185, 124}, {  0,  60, 190}, {208, 111,  47}, {203,  44, 215}, {191,   4, 207}, { 56, 205, 249}, { 60,  46,  59}, { 79,  27,  55}, {178,  87,  72}, {126,  38,  23}, {117, 101,  27}, { 39, 116, 219}, {192, 101,   0}, { 49,  14,  48}, { 71, 211, 155}, {126,  81, 202}, { 61,  23,  46}, {103, 128, 232}, { 24,  18, 104}, {251,  80,  54}, {184, 232,  99}, {206,   7, 103}, {144, 170, 149}, {232, 240, 190}, { 77,  55, 180}, { 36,  26, 178}, {253,  15, 195}, {202,  38,  22}, {208,   2,  84}, {171,  26, 245}, {115,  89,   6}, { 69,  36,  54}, {249,  70, 241}, {159,  68, 125}, { 10,  96, 155}, {239,  48, 252}, { 87, 191, 231}, { 75,  36,  25}, {102, 120,  14}, {113, 126, 141}, {242, 203,   4}, {  1,  36,  47}, {158, 155, 220}, { 37,  63,  88}, {180, 112, 132}, { 49,  26,  95}, {159, 178,  11}, {133,   3, 188}, { 67,  67,  44}, {194,  33,  15}, {106,  98, 178}, { 55, 155, 209}, {252,  62, 127}, {132, 106,  46}, { 92,  54,  15}, {  7,  93, 246}, {167, 144,  12}, {160,   9, 192}, { 29,  93, 193}, { 71, 226, 176}, {113,  42,  22}, { 68, 136, 199}, {222,  80,  95}, { 21, 116, 118}, {214,  50,  61}, {150, 139,  60}, {115, 109,  32}, {168,  84,  63}, {254,  31,  90}},
        {{ 17, 143, 238}, {216, 180, 204}, {226,  82,  54}, { 41, 142, 224}, { 35, 183, 250}, {142,  21,  61}, {216,   8, 180}, {133,  43, 213}, { 66,  26, 174}, {179,  18,  64}, {147,  76, 161}, {  5,  93,  93}, {182,  52, 160}, {119,  74,  26}, {250,  70, 175}, {131, 109, 115}, { 53,  92, 240}, {116,  79, 113}, { 28, 112, 116}, {223, 129, 173}, {194, 180,   2}, {173, 162,  57}, {112, 194, 211}, {203, 138, 223}, {117,  95,  41}, { 90, 150, 214}, {106,   8,   6}, {139, 174, 175}, {253, 132,  81}, {225, 192, 184}, {134,  67, 166}, {243, 100,  67}, {127,  58,  74}, {131, 130, 196}, {115, 243, 121}, {139,  49,  80}, {104, 179,  95}, {141,  89, 115}, {161,  43, 209}, { 53,   5,  50}, { 29, 150, 253}, {120, 121, 194}, {  2, 106, 218}, {111, 117, 124}, { 32,  45,  88}, {183,  12,  95}, { 14, 159, 237}, {131,  37, 132}, { 51, 248, 251}, {135, 107, 180}, { 42, 142, 226}, {  7,  21,  28}, {  9,  25,  58}, { 15,  60, 216}, { 38, 100, 181}, {166, 132,  14}, {242,  97, 141}, {199,  81,  54}, { 64,  10,  26}, {253,  31, 245}, {  0,  55, 106}, {234,  93,  59}, {211, 204, 233}, { 52,  95,  98}, { 12,  20,  87}, {128,  56,  25}, { 40, 203,  93}, {224,  21,  18}, {239, 202,   4}, {193, 225, 218}, {168,  70, 186}, {169,  91,  69}, { 49,  25,  76}, { 71,  42,  83}, {133,  36,  43}, { 65,  23,  73}, {231, 144, 216}, {104,  35,  81}, {115, 151, 164}, {  3, 189, 236}, {187,  25,  95}, { 82,  51, 252}, {112, 133,  51}, { 26, 122,  39}, { 59, 236, 255}, {192,  51, 210}, {146, 185, 231}, {123,  81,  18}, { 67, 136, 206}, { 37, 138, 136}, {202,  85,  69}, {210, 128, 208}, {  8,  29,  43}, {189,  28,  50}, { 35,  62, 167}, { 26, 141, 178}, { 72,  83,  93}, {231, 202,  76}, {118,  96, 165}},
        {{ 45,  80,  88}, {240,  18, 145}, {139,   2,  86}, { 91,  22, 151}, {164,  24,  13}, { 13,  36,  49}, {226, 210,  34}, {151, 120, 157}, {  1,   4,  16}, {241,  37,   0}, {100, 104,  97}, { 12, 193, 210}, { 21,  69, 182}, { 89,  46,  11}, {246,  15, 107}, {224, 131, 248}, { 62, 229, 251}, { 84, 211, 244}, {182, 231, 116}, {197,  43,  41}, {  9,  84, 113}, {244, 189,  55}, { 56,  18,  13}, {241,  15, 129}, { 12,  16,  41}, { 93,  12, 227}, { 30, 113, 189}, {116,   9,  29}, {  7, 228, 127}, {249, 251, 201}, { 32,  95, 154}, {244, 116, 168}, {187, 134, 143}, { 68, 123, 192}, {226,  80,  27}, {160,  77, 241}, {105,  91, 166}, {195,  59,  12}, {158,  65,   6}, {180,  77,  49}, { 98,  32,  76}, { 97,  30, 168}, { 71,  36,   4}, { 44,  10,  53}, {164, 109, 163}, {131,   7, 200}, {190, 227, 207}, {120, 111,  45}, {144,  60, 172}, { 51, 124, 195}, {146,  44,  81}, {147, 155,  77}, {213,  53, 124}, { 78, 186, 253}, { 16, 130, 242}, { 48,  41,  68}, {105, 238, 246}, { 21, 102, 103}, {156, 178, 251}, {246,  52, 218}, {160, 162, 183}, {193, 145,  99}, {174,  66, 177}, {199, 173, 141}, { 22,  25, 216}, {250,  21, 210}, { 29, 101, 135}, {128,  61,  73}, {171, 102, 201}, {224,   6,  77}, { 35,   6,  52}, { 53,   1, 128}, {106,  14,  89}, { 59,  29,  79}, { 68,   2,  55}, { 70,  29,  46}, {195,  61, 248}, {141, 176, 177}, { 28,  48,  59}, {159, 128,  95}, { 26,  17, 119}, { 36,  66, 146}, { 39, 173, 193}, { 75,  32, 156}, {144,  65, 135}, {122,  12, 149}, { 91,  47,  42}, { 61,  35,  17}, {222, 164,  86}, {182, 190, 116}, {183,  83, 201}, { 77, 236, 236}, {225,  77, 124}, {191,  99, 197}, { 71,  41, 130}, { 84, 138, 223}, { 81,  63,  56}, {118,  81,  11}, {233,  93,  62}},
        {{103,  81,  36}, {120, 107,  21}, { 92,  48, 226}, {118, 103,  48}, {156,  56,  42}, { 98,   2,  60}, { 50, 239,  59}, {249,  25,  76}, {235, 151, 179}, {130, 122,  91}, {206,  23,   3}, { 76,  10, 142}, {184,  57, 123}, { 41, 120,  59}, { 71,  18,  84}, {155,  21, 184}, {221,  42, 186}, {195, 184, 232}, {  1,  73, 216}, {252, 170, 128}, {183, 127,  37}, {230,  72, 248}, { 24,  38, 204}, {183,  31, 224}, { 34,  28,  34}, { 58,   1,  64}, {191, 164,  10}, { 51,  22,  32}, {  6,  66, 225}, {158, 246, 113}, {121, 137, 180}, {141, 197, 217}, { 45,   7,  54}, {163,  42,  23}, {193, 149, 229}, { 15,  12,  43}, {164, 128,  22}, { 70,  51, 153}, {167,  47,  81}, {157,   7,  69}, {150,  37, 145}, { 82,  53,  14}, {195,  74, 203}, { 62,  23,  82}, {187, 149, 240}, {172, 157, 158}, {  9, 104, 159}, {173, 194, 218}, {106,  13, 165}, { 93, 178,  92}, {117, 106,  69}, { 31,  29,   6}, {198, 243,  36}, {251, 118,   5}, {191, 129,  40}, {223, 107,  20}, { 33,  25,  17}, { 72,  46, 135}, {216, 142,  55}, { 70, 100,  84}, { 38,  83, 197}, { 26,  12, 106}, {174, 167, 132}, { 57, 224, 197}, { 85, 249, 163}, { 84,  79,  37}, { 10,   0,  24}, {208, 193, 195}, {205, 139, 251}, {215,  13,  50}, {139, 141, 248}, {242, 221, 115}, {189, 127, 151}, {  7,  58,  97}, { 40,  71, 162}, { 15,   8,  70}, { 57,  44,  69}, { 54,   8,  99}, {132,  42,  35}, {135, 109,  30}, {229, 171,  65}, { 89,  11,  92}, {143,  47,  34}, { 62,  32, 105}, {201, 113,  21}, {176, 167, 156}, {161,  70,  55}, {218,  88,  15}, { 52,  49,  20}, {103,  54,  53}, {199, 198, 239}, { 48, 161, 242}, {215, 209,  65}, {233,  28,   2}, {164,  58,  32}, { 64, 208, 211}, { 56, 145, 147}, { 66,  39,  54}, {138, 102,  75}},
        {{253, 219, 145}, {175,  78, 157}, { 76,   9,  11}, {  8,   8,  61}, {159,  99,  13}, {226, 217, 235}, {212,  95, 125}, {200,  26, 213}, {195,  79, 144}, { 76,  22,  21}, {210,  57, 204}, { 53,  26,  12}, { 26,  18,  77}, {187,  41, 111}, { 99, 219, 246}, {134,  45, 145}, {171, 123, 105}, {247,  22, 170}, {208,  38, 172}, { 74,  77, 195}, {150, 187,  11}, {237, 182, 209}, { 87, 121, 154}, { 97,  10,  94}, {132, 226, 144}, {187,  53, 254}, {  2, 156, 222}, { 17,  62, 103}, { 40,  12,  28}, {  8, 166,  58}, { 51,  53,  65}, {216, 179, 176}, {220, 130, 199}, {204, 118, 198}, { 92, 163, 194}, {110,  16, 124}, { 84,  23, 215}, { 20, 133, 246}, { 39, 213, 109}, {186, 186,  70}, { 57,  92,  20}, { 31, 101, 240}, { 83, 104, 193}, {135,  89,  49}, {195,   3, 208}, {145,  36, 195}, {196, 101,  35}, { 56, 121, 173}, {113,  11, 163}, { 17,   8,  19}, {127,  47,  48}, {202,  94,  14}, {198, 134, 188}, {197, 171, 204}, {241, 182,  67}, {175, 220, 252}, {139, 207, 236}, {220, 191,   4}, { 39, 138, 227}, { 54,  11,  38}, { 28,  56, 199}, {181,   3, 219}, { 82, 196, 230}, {125,  29,  68}, {151, 238,  29}, { 39, 137, 135}, {  0,  97, 228}, {246,  34,   4}, {136,   4,  25}, { 64,  68, 144}, {178, 160, 177}, { 70,  82, 100}, {157, 108, 138}, { 87, 132, 250}, {194, 135,   4}, { 75, 209, 131}, { 16, 128, 189}, {  4,   4,  54}, {234,  12,   9}, {221, 138, 182}, {168, 194, 205}, {243, 221, 165}, { 60, 239, 206}, { 73, 107,  70}, {216, 244, 128}, {113,   0, 166}, {147,  36, 108}, {210, 106,   3}, {133,  43, 255}, { 36,   2,  74}, {224, 212,  35}, {186,  76, 108}, { 49,  39, 111}, {  5, 171, 242}, { 96, 165,  79}, {150, 173, 202}, { 36,  72,  75}, {253, 198, 147}, {195, 165, 179}},
        {{ 29,  46, 189}, { 31, 147, 168}, { 73,   8,  73}, { 40, 160, 198}, { 95,  76,  40}, { 66, 102, 113}, {134, 127,  35}, {129,  11,  97}, {119,  64, 107}, {163, 125, 234}, {  0,  63,  63}, {126, 120,  27}, {191, 205, 209}, {191,  70,  56}, {202, 195,  19}, {  1,   6,  31}, {154,  80,  50}, {111,  98,  81}, {144,  93,  30}, {217,  34, 152}, {249, 143, 185}, {221, 170, 203}, {226, 109,   5}, {110, 244, 113}, {234,  73,  12}, { 30,  55,  71}, { 56, 128, 157}, {104,  14,  70}, {220, 134, 171}, {161,  39, 153}, {218, 201,   1}, {160, 143, 144}, {193,  26,  41}, { 57, 121, 170}, {231,  68,  78}, {157,  59,  55}, {153,  91,  25}, { 11, 103, 104}, {216,   4,  85}, {230, 138, 150}, {255, 151, 160}, { 77,  12, 214}, {  9,   5,  23}, { 33, 108,  67}, {184,  57, 161}, {178,  86, 202}, { 44,  64,  66}, { 26,  78,  96}, { 66, 172, 178}, {146, 156, 218}, {239, 189,  53}, { 10, 223,  68}, { 81,  81, 207}, { 63,  97, 178}, { 91, 159,  94}, {240,  64, 249}, { 79,  21,  70}, {247, 106,  63}, {104,  49, 210}, {160,  81,  17}, {227,  55,  12}, {248,   4, 225}, { 95, 121, 133}, { 81, 113, 221}, { 16,  52, 137}, {106,   3, 158}, {  5, 238, 246}, {238,  95,   5}, {238, 170, 166}, { 32,  25,  83}, { 65,  21,  11}, { 69,   3, 227}, { 59, 219, 200}, { 68,  20, 194}, {220, 109, 100}, { 92,  13, 249}, {147, 140, 161}, {125,  18, 113}, { 23,  51, 141}, {189,  37, 224}, {  9,   2,  69}, {173, 112, 195}, {186, 198,  17}, { 62,  32,  44}, { 97, 241, 157}, {133, 160, 182}, { 98,  90,  17}, { 88,  70, 201}, {184,  83, 213}, { 34,  31,   9}, {153,  65, 207}, {217,  24, 104}, { 38, 209, 101}, {199,   8,  44}, {177, 101, 137}, {247, 193, 225}, {155, 127,  85}, {108,  50, 255}, {  8, 207, 111}},
        {{104, 204, 245}, {234, 207,  92}, {223,  72,  47}, {146, 133,  15}, { 92,  55, 165}, { 88,  17, 210}, {207, 119,  96}, {  6,  81, 148}, {136, 176, 255}, {126,  24,  16}, {175, 104, 165}, { 96,  14,  16}, {140,  28,  46}, { 20,  42,  97}, {  0,  77,  79}, {106,  28,  30}, {174, 171,  84}, { 86, 126, 209}, {231, 173,  42}, { 60,   0,  61}, {196, 183,  56}, {155,  42,  43}, {252, 151, 227}, {110,  98, 122}, { 25,  16,  79}, { 57, 158, 234}, {139, 199, 217}, { 41, 247,  85}, { 11, 184,  91}, {140, 171, 232}, {229, 217,  11}, {153, 161,  60}, {  1,   0,  87}, {253,  19,  92}, {118,  61, 102}, { 13, 215,  52}, { 95,  85,  76}, {196, 139, 132}, {182,  82, 167}, {125,  56,  45}, {186, 181,  41}, {163, 117,  33}, { 76, 132, 182}, { 76, 142,  44}, {252,  23, 134}, {251, 219,  66}, { 60, 103,  89}, { 21, 153, 186}, {172,  61,  15}, { 54,  57, 181}, {129, 125,  33}, {128,  14,  58}, { 37, 108,  85}, {  9,   6,  18}, {215,  46,  37}, { 21,  81,  92}, {137, 172, 156}, {185,  39, 184}, {195,   4, 237}, {137,  49,  11}, {177,  67, 123}, { 86,   9,  89}, {147,   6, 227}, { 92,  17,   4}, { 84, 111,  17}, {205, 136, 154}, { 81,  27, 113}, {103, 119,  10}, { 49,  21,  95}, { 40,  48,  80}, { 84,  75,  79}, {144,  43, 246}, {156, 216, 226}, { 53,  67,  80}, {139,  30,  77}, {211, 229, 153}, {201, 185,  24}, { 26,  77,  82}, {212, 133, 143}, {237, 142, 145}, {187, 185, 150}, { 96,  60,   1}, {188,  24,  23}, { 87,  24, 125}, { 37,  34,  46}, {172, 105,  58}, {255, 194, 198}, { 16, 167,  62}, { 35, 138, 237}, {128,  47,  80}, { 21,  50,  57}, {154,  99, 195}, { 39,  72, 230}, { 47,  12,  28}, {129,  57, 121}, {169, 130, 128}, {181, 134,  99}, {138, 208, 191}, { 73,  32,  60}},
        {{116, 132, 176}, {149, 108, 188}, {247,  69, 203}, { 78, 115, 231}, {115,  41, 140}, { 95,  28, 198}, {125, 105, 250}, {147, 240,  27}, { 69,  57, 170}, {191, 131,  47}, {228, 205,  48}, {137,  10, 175}, {122,  88, 240}, {161, 227, 159}, {100, 122,  32}, { 93,  86,   4}, {105,  92,  13}, {149, 106,  34}, {217, 195,  75}, { 55,  13,   3}, {212, 108,  44}, {186, 135,  79}, { 92,  17,  33}, { 16,  49, 145}, {124,  54, 225}, { 60, 145, 160}, { 98,  53,  12}, {183, 134, 176}, { 64,  64,  67}, {236,  83, 178}, {223, 164, 124}, {100,  79, 139}, {101, 185,  70}, {212,  22,  55}, {201, 145,  54}, {168,  30,  87}, { 83,   1,  94}, { 56, 180, 218}, {155,  38,  12}, {185, 222, 212}, { 28,  56, 232}, {197, 194, 116}, { 22, 158, 169}, { 90, 193, 253}, { 56,  70, 179}, {182,  88, 158}, { 58,  24,  14}, {111,  68,  66}, {  3,   3,  63}, {118, 178, 154}, {171, 165, 181}, {122,  57, 126}, { 99,   8,  66}, {209, 119, 151}, {123, 133, 167}, {122,  46, 175}, {144,  87, 151}, {126, 172,  85}, {118,  12, 112}, { 97,   4, 127}, {234, 218,  42}, {195,  62, 125}, {193,  94, 237}, {107,   9,  22}, {107,  26, 144}, { 37,  26,  15}, {194,  81,  46}, {131, 117,  36}, {211, 226,  14}, { 34,  79, 200}, {210, 201, 191}, {165,  94,   1}, {127,  70,  90}, {176, 122,  59}, { 82, 124, 196}, { 63,  33,  87}, {227, 196, 220}, { 16,  14, 124}, {170,  22,  85}, {105,   3,  81}, {122,  56,  27}, {124,  90,  60}, { 29, 180,  81}, { 74, 104, 251}, { 84,  35, 127}, {252,  81, 240}, { 24,  34, 240}, {182,  59, 254}, {215,  25, 155}, {252, 244, 233}, {108,   5, 121}, { 73, 139, 135}, {205, 167, 128}, {131,  82,  13}, { 49, 218, 166}, { 61, 102,  91}, { 60, 165, 175}, {117,  21, 134}, { 83, 227,  29}},
        {{128,  81, 102}, {146,  26,  88}, {201, 170, 152}, {129, 108,  69}, { 31,  69, 112}, {149, 114, 242}, {221, 139, 129}, { 11,  21, 124}, { 74,  51,  46}, {166, 128, 220}, {118,  54,  16}, { 16, 194,  97}, {154, 135, 147}, {141,  63, 143}, { 46,  33,  44}, { 25,  38, 172}, {128,  89,  10}, {235, 219,  75}, {117,  93,  40}, { 41, 135, 148}, { 89, 200,  71}, { 42,  10,  39}, {131, 156,  29}, {146,  58,   4}, {193,   1, 121}, { 25,  25,   3}, {252, 217,  56}, {221,  42, 208}, { 72, 121, 229}, { 27,  47, 243}, {139, 133,  80}, {169,  32,  99}, { 24,  87, 222}, { 44,  63, 218}, {201, 188, 133}, {232, 115, 155}, {234,   1,  64}, {101, 165, 146}, {213, 153, 135}, {122,  38, 179}, { 15,   3, 221}, {166, 182, 182}, {250,  87,  70}, { 25,  29, 160}, { 37,  33,   1}, {170,  30,  72}, {227,  52, 241}, { 88,  96, 187}, {244,  93, 147}, {162,  25,  87}, {222,  10,  32}, {144,   1, 251}, { 90,  17,  88}, {150, 164,  48}, {120,  79,  50}, {203, 168,   9}, { 45,  90,  59}, {243, 165,  55}, {240,  99, 148}, {179, 147, 212}, {152,  60, 122}, { 42, 241, 161}, { 96,  39,   6}, {176,  36,  90}, {128, 201, 158}, { 77, 179, 196}, {156, 151,  34}, {200,  10, 144}, { 50,  16,  35}, {250, 141, 254}, {103,  77, 116}, {178,  72, 115}, {  7, 115, 204}, { 27, 118, 126}, {244,  90, 120}, {236,  59, 223}, {196, 233, 251}, {251, 158,  57}, { 89, 186, 205}, { 67,  28,   5}, { 85,   7,  92}, {250,  10, 234}, {231, 252, 177}, {211,  35,  49}, {245,  11, 141}, {119, 114,  25}, {222, 135, 185}, {237,  95,  47}, { 49,  94, 137}, {173,  29, 122}, { 89,   2,  55}, { 52,  52,  16}, {219,  29,  50}, {136, 171, 226}, { 48,  44,  26}, { 83,  64, 203}, { 52,  16, 157}, { 70,  52,  28}, {156,  51, 168}},
        {{121, 232, 221}, {243, 142,   4}, {232, 230, 205}, {214,  82, 246}, {171,   8, 207}, { 20,  14,   3}, {  9,  80, 106}, { 85,  56, 127}, { 40,  75, 232}, {188, 179,  85}, {225, 131,  36}, { 51,  15, 136}, {110,  30,  71}, { 62,  57,  54}, {247,  87,  39}, { 23, 113,  57}, { 48,  33,  17}, { 91, 236, 135}, {244,  60, 228}, { 98,  51,   8}, {217, 157,  41}, {178, 228,  62}, {141, 119, 101}, {220,  47, 184}, {195,  71,  52}, {116,  35,  91}, {192, 169, 157}, {233, 221, 219}, {255, 180, 168}, {155,   9, 135}, { 84, 242, 188}, { 84,  58,  96}, {240, 227,  31}, {253,  51, 172}, {236,  36, 131}, {242, 146,  34}, {225, 146, 136}, {199,  44, 148}, { 93, 139,  56}, {173,  67,  42}, {121, 144, 118}, { 24,   5,  64}, {250, 146, 187}, { 51,  32, 172}, { 99,  81,  72}, {  1,  52, 127}, {178, 146, 134}, {200,  16,  34}, { 71,  31,  60}, {204,  11, 101}, { 30,  94,  50}, {178,  10, 163}, {127,  74,  63}, {102, 199, 231}, {209,  41,  15}, { 91,  72, 191}, { 46,  82, 117}, {161,  76,  19}, { 40,  45,  45}, {158,  37,  85}, {247, 222, 223}, {111, 186, 101}, {153,  86, 246}, {243, 152, 123}, {237, 205,  69}, {102,  39, 124}, { 87,  10, 222}, {185, 208, 147}, {179, 158,  52}, {106, 194,  10}, {  7,  58, 152}, { 95, 133, 236}, {202, 197,  41}, { 89,  67,  26}, {216, 148, 155}, {154,  15, 141}, {251, 234, 134}, {161, 216, 137}, {238,  63, 214}, {114,  66, 109}, {131,  75, 215}, { 13,  10,  19}, { 97,  41, 250}, {197, 168, 136}, { 52, 101, 100}, {124, 135, 140}, {247, 115, 206}, {225, 246, 218}, {  8, 126, 249}, {202,  63, 231}, { 28,  13,  15}, { 28,  33, 136}, { 28,  48,  63}, {148,  96, 142}, { 46, 170, 215}, { 32,  17, 110}, {243,  10, 150}, {157, 159, 252}, {204, 139,  13}},
        {{160, 232, 100}, {109,  80,  65}, { 84,  27, 227}, {174, 129, 155}, {147,  94,  93}, {225, 127,  47}, { 40, 224,  98}, {123, 162, 135}, {168, 128, 135}, { 46, 194, 200}, {156, 209, 228}, {176,  57, 124}, { 51,  92, 134}, {106,  47, 101}, {202, 251, 251}, {230,  48, 187}, {251,   4,   8}, { 25,  19, 162}, {181, 218, 200}, {199, 189, 197}, { 27, 115, 158}, {175,  96,  99}, {190,   0, 182}, { 70, 149, 224}, {175,  73,  90}, {191, 160, 143}, {104, 164, 168}, {158,  75, 134}, { 66,  33,  60}, {141, 109,  89}, {102, 219, 234}, { 49,  21,  65}, { 72,  41,  77}, {214, 155, 201}, { 12, 107, 135}, { 46,  17,  19}, {128,  15,  39}, { 76, 169, 191}, {177, 198,  17}, {127,  57, 163}, {128,  78, 110}, {159,  26,  72}, { 74, 238, 244}, {156, 136, 133}, {127,   2,  30}, { 18,  18,   4}, {182, 250, 244}, {234, 240, 124}, {235, 147, 193}, {203,  19, 166}, {186,   5, 119}, {176,  18, 170}, {  0,   5,  82}, { 25,  58, 229}, {108, 115, 197}, { 19,  24,  16}, { 82,  63, 148}, {145,  35,  24}, { 49, 146,  53}, {  1,   5,  33}, {248,  62, 250}, { 14,  28,  28}, {172, 104, 203}, {248,  98, 101}, {118, 152, 210}, {  7,  67, 171}, {113,  58, 239}, {174,  12, 244}, { 93, 200, 230}, { 26,  47, 117}, {194, 226, 154}, {155,  69, 108}, {231, 221,  55}, { 70,  42,   1}, { 69,  62,   1}, {111,  40,  75}, {145, 129, 136}, {197, 105, 118}, { 29, 100, 182}, {123, 199, 227}, {209,   9, 176}, { 22,  44, 249}, {137, 242,  96}, {137, 108,  20}, {199, 119, 169}, {240, 180,  52}, { 19,  49, 182}, {110, 198, 250}, {160,  38,  47}, {142,  93,  12}, {197, 180,  91}, {118, 241,  67}, { 21, 125, 133}, {141,  55, 254}, {144, 119,   9}, {243, 137, 113}, { 36, 198, 241}, { 89, 141,  99}, { 42,   0,  14}},
        {{  5, 193, 158}, {180,  61, 153}, { 27,  84, 102}, { 34,  65, 139}, {195,  82,  50}, {150, 228, 191}, {251,  19, 201}, {119,  92, 172}, { 81, 177,   9}, { 55,  56, 175}, {207,  77, 125}, { 49, 244, 218}, {209,  47, 118}, { 56,   1, 110}, { 47, 246,  61}, { 16,  21,  52}, {148,   1,  17}, { 24,  71, 172}, {163,  97, 247}, {211,  50, 234}, {117,  80,  57}, {209, 152,  62}, {109, 217,  46}, {221, 157,  74}, {108, 129, 192}, {253,  80, 162}, {202, 173, 222}, {168, 148, 127}, {  3, 103, 123}, {  4,  41, 124}, {223, 171, 125}, {141,  69, 148}, {195,   4, 115}, {248, 245, 253}, { 12,  57,  93}, { 80, 149, 107}, { 10,  37, 170}, {213, 173, 209}, {  2,  86, 171}, { 75,  65, 205}, {222, 156,  77}, {  6, 159, 171}, {156,   9, 205}, {207, 180, 135}, {107, 109,  41}, { 61,  87, 239}, {163, 110, 210}, {  8, 135,  81}, { 30,   2, 234}, { 91,   8, 247}, {255,  25, 119}, {165, 229, 150}, {190,  19, 178}, {249,  38,   4}, { 63,  13,  25}, {233, 233,  52}, {  7,  68,  99}, {232, 248, 143}, {  3, 160, 226}, {  4, 169, 175}, { 70,  98, 123}, {117,  38, 153}, {129,  71, 199}, {191, 117, 161}, {  5, 110, 128}, { 54,   9, 159}, {136, 205, 126}, {188,  70,  82}, { 17,  67,  62}, {206,  61, 237}, { 37,   6, 128}, {180, 115, 110}, {151, 197,  45}, { 58, 219,  59}, {  9,   1,   3}, {135,  13, 202}, { 67,  31,  71}, { 22,  13,  45}, {174, 173, 255}, {101, 162, 164}, {107, 106, 231}, {130,  18, 192}, {215, 141,  34}, {128,  37, 223}, {110, 129, 156}, {108, 194, 253}, {134,  64,  25}, {157, 107, 124}, {238,   0, 192}, { 83, 214,   6}, { 90,  19, 180}, {  0,  61,  61}, {  3,  18, 112}, {155,  21, 170}, {192,  27, 184}, {135, 212, 251}, { 46, 125, 218}, { 89,  66,  25}, { 83,  69, 155}},
        {{196,  67, 232}, {117,   2,  14}, {155,  12, 238}, {  5,  95, 138}, {236, 101, 242}, { 39,   3,  37}, {203, 144, 114}, {126, 126,  41}, {230, 172, 224}, {202, 152, 173}, {232, 161, 133}, { 54, 166, 247}, {108,  86,  90}, {196, 190, 186}, {140, 156, 202}, { 44,   8,  50}, { 83,  78, 168}, {220, 134, 240}, { 39,  17, 239}, {  9,  39,  70}, {233,  67, 113}, { 14,  44, 212}, {139,  53, 182}, {144, 112,  17}, { 83,  74,   3}, { 63,  43, 112}, {172,  38, 246}, { 26,   3,   9}, { 17,   2,  58}, {180, 102, 104}, { 92,  73,  81}, { 84, 166, 218}, {146, 142, 189}, {166, 115,   7}, {114, 243, 160}, {143,  61,  44}, {113, 188,   6}, { 99,  53,  90}, {214,  86, 152}, {209,  81,  80}, { 45, 146, 176}, { 75,  32, 207}, { 12,  87, 192}, {210,  97, 251}, {168,  79,  35}, {176,  55,  23}, {212,  98, 193}, {136,   0,  64}, { 57, 114, 205}, {103,  47,  68}, { 98,  44,  55}, {135,  31, 126}, {207, 179, 193}, {180,  56,  47}, {158,  93, 167}, { 16,  38,  64}, {  1,  64,  66}, {140,  54, 126}, {121,  81, 212}, {205, 183, 107}, {251, 210, 143}, {176,  96, 168}, { 62,  49,  38}, { 59, 245,  41}, { 18,   2,  28}, {222, 128, 113}, {227, 148, 159}, { 73,  57, 241}, {144, 189,  25}, { 49,  38, 129}, { 92, 164,  47}, {164, 103,  43}, { 26,  13,  83}, { 69,  74,   8}, {195,   0, 205}, { 98, 194,  93}, {236,  65,  81}, { 56,  62, 171}, { 64,  29,  36}, {150,  80,  38}, {175,  58, 195}, { 55,  60, 188}, {126,  69, 182}, { 38, 225, 247}, { 89,  14, 186}, { 62,  63, 103}, {144, 195, 231}, {128,  78,   8}, {  3,   6,  32}, {241,  44, 154}, { 35,   7, 136}, {  8, 223, 254}, {199,  86, 240}, {171, 180, 238}, {  5,  56,  57}, { 54,  38, 102}, { 60,   4,  23}, { 67,  49,  46}, {238, 242,  52}},
        {{114,  16, 226}, {104,  61,  21}, {164,  30, 106}, {105, 183, 237}, {103, 120, 227}, { 94,  46, 230}, {159,  13, 121}, {173,  57, 189}, { 13, 144, 145}, {156,  52,  64}, {233,  98, 147}, {171,  56,  92}, {178,  90, 233}, {247, 117, 236}, {230, 233,  94}, {107,  83,  20}, {  5,   3,  17}, { 73, 102, 132}, { 78, 150,  95}, {150, 105, 197}, { 43,  45, 187}, { 92,  47,  89}, {232,  72,   0}, {236,   4, 212}, {160, 186,  51}, {145,  79, 189}, {214, 203,  75}, { 41, 131, 174}, {234,  42,  45}, {131,  91,  17}, {107, 114, 233}, {198,  83, 244}, {160, 217,  12}, {160, 111, 149}, { 80, 106,  10}, {  6,  67,  86}, {155, 196, 239}, {101,  18,  36}, { 60,  65, 181}, { 47,  28, 117}, {167,   4, 173}, {201,  12, 198}, {205, 225, 224}, { 57,  47,  57}, {  3, 159, 116}, {120,  27, 128}, { 58,  37,  39}, {222,  46,  44}, {117,  89, 159}, {109, 147, 206}, { 82,  24,  37}, { 24,  21, 209}, {173, 217, 219}, { 12, 165, 114}, { 81, 215,  65}, { 44, 118, 232}, {166, 193, 245}, {134,  65,  68}, { 78, 143, 243}, { 42, 198, 200}, { 64,  15, 110}, {234, 135,  92}, { 65,  18, 146}, {198, 254,  92}, {201,  38,  54}, {  0, 202, 240}, {119,  58, 176}, {198,  28,  48}, {170,  45,  53}, {104,  66, 123}, {104, 109, 233}, {  3,  14, 137}, { 34,  84, 136}, {244,  47, 249}, {141,  92, 195}, {124,  49, 244}, {228, 218, 113}, {188, 102,  14}, {173,  88,  82}, {195,  43,  73}, {144, 123,  53}, { 90, 161, 238}, { 31, 244, 210}, {155,  19, 100}, {216,  76, 243}, { 40,   6, 220}, { 96,   9,   6}, { 34, 225,  73}, {204, 121,  79}, {181,  23,  38}, {163,  37, 212}, {186, 122, 153}, { 32, 192,  78}, { 96,  35,  44}, { 55,  28, 227}, { 39,  75,  81}, {221, 144,  18}, {122,   2, 184}, {161,  69, 136}},
        {{118,  38,  11}, { 51,  35,  40}, { 12,   9, 165}, { 46,  18,  18}, {226,  78, 154}, { 60, 118, 124}, {180, 115,  73}, {140, 131,  43}, {225, 212, 170}, {115,  74,  93}, {166, 217,  31}, {195, 169, 188}, {148, 108,  73}, {110,  59, 100}, { 23,  35,  65}, {134,  23, 117}, { 62, 118, 141}, { 50, 156, 159}, { 99, 252, 165}, { 68,   8, 217}, {197,  12, 132}, { 84,  30, 144}, { 10,  21,  63}, {153,  56, 157}, {  1,  33,  44}, { 73,  37,  10}, {174,  71, 241}, {165, 153,  77}, {245,  94, 195}, {169,  91,  40}, {142,  45,  46}, {131,  25,  48}, {182, 178,  46}, {196,  43,  25}, { 21,  29,  37}, { 27, 141, 222}, { 29,  20, 177}, {201,  51,  75}, {126,  48,  51}, { 46,  11,  52}, {124, 130, 144}, {218, 176,  58}, {115, 189, 215}, { 16,   7,  20}, {161,  80,  86}, {129,  62,  68}, {134, 163, 199}, {133,  16, 245}, {166,   1, 179}, {144,  76, 136}, {161, 138,  69}, { 41,   5,  51}, { 82,  76,  90}, {218, 189, 158}, { 13, 154,  11}, { 99,  25, 127}, { 98, 209, 227}, { 65, 252, 243}, {213, 183, 171}, {251, 223,  75}, {160, 209, 220}, {186, 145,  13}, { 79,  13, 121}, {126, 169, 228}, {241, 187, 158}, {201,  47, 171}, {159,  54,  48}, { 30, 211, 229}, { 44,  23,  51}, { 82,  78, 177}, { 24,   7,  12}, {195, 189, 165}, {227, 143, 191}, { 23, 156, 243}, {141,  85, 112}, {243, 165, 195}, {130,   0,  61}, { 57, 128, 233}, {114,  46,  83}, {120,  96, 138}, {182, 138, 185}, { 90,  74,  64}, {196, 222, 101}, { 33, 168, 120}, { 93,  55,  95}, {206, 143, 158}, {  7,  11,  93}, { 44,  29, 111}, {171,  38,  11}, { 83,  86, 150}, {252, 132,  55}, { 69,   2, 147}, {190, 174,  99}, {  7, 144, 215}, {125, 241,  10}, {244, 112, 100}, {217, 146,  20}, { 15, 121, 169}, {137,  72,  84}},
        {{154, 192, 255}, {111,  65,  32}, { 37,  80, 101}, { 31, 175,  18}, {220, 210, 173}, { 37,  44, 117}, { 82,  34, 109}, { 62,  42, 110}, { 66, 150, 170}, {  0, 168, 182}, { 85, 149, 121}, {217,  96, 247}, {170, 102,  64}, {244,  65, 220}, { 66,  30, 179}, {149, 214,   9}, {184,  99,  96}, {125,  80,  33}, { 71,  20,  62}, { 91,  90,  47}, {  0, 181, 224}, {199,  75, 226}, {  1,  20,  33}, { 95,  29,  76}, { 45,  27,  39}, {105,  49,  42}, {133,   1,  38}, {176,  89,  47}, {253, 212, 226}, { 32,  38, 242}, { 71, 252,  20}, {236,  42, 214}, { 33, 113, 111}, { 58,  26, 160}, { 20,  61, 159}, {211, 108,  28}, {137, 200,  56}, {211,  33, 213}, {168,  90, 255}, {140,  91,   5}, { 70,  62,   4}, { 20,  70, 141}, { 14, 124,  33}, { 30, 237, 253}, {122, 133, 100}, {134, 118, 113}, {157,  34, 148}, {163,  12,  50}, { 24,  47, 199}, {173,  20, 111}, {215, 117,  91}, {106,  60, 124}, { 97,  43, 181}, {233,  53,  78}, {153,  55, 186}, { 83,   5,  38}, {195, 197, 113}, {  7,   3,   3}, {131,  54, 116}, { 74, 163,  25}, {125,  55,  23}, {119, 236, 137}, {195,  46,  17}, { 33,   3, 100}, { 38, 107, 200}, {111,  61,  26}, {187,  70, 201}, { 51, 178, 196}, {188, 221, 233}, { 32, 226,  55}, { 91,  27, 181}, {137,  52, 145}, { 86,  98, 138}, {223, 171, 186}, { 71,  25,   5}, {113,   6, 118}, {165,  20, 126}, {124, 145, 187}, {244, 158, 191}, {121, 110, 120}, { 13, 122, 198}, { 14,   4,  30}, {228, 255, 222}, {236,  59, 128}, { 99,  22, 115}, {130,  88, 194}, { 38,  14, 196}, {194,  98, 103}, {111, 118, 156}, {243,   7,  66}, { 49, 137, 241}, { 42,  99, 160}, {188,  72,  24}, {203,  17,  26}, { 37,  83, 166}, {160, 140, 183}, {132,   5, 187}, { 68,  24,  88}, {236, 243, 129}},
        {{141,  48, 167}, { 42,  30,  78}, { 63,  47,  63}, {187,  98,   8}, { 58, 208, 173}, {131,  87,  25}, {182,  21, 189}, {101,  99, 203}, { 59, 241, 102}, {232,   6,  76}, {  4,  33,  66}, { 13, 215,  61}, {123,  32, 249}, {137, 223,  52}, { 66,  49,  66}, {141, 103, 206}, {206,   1,  29}, {103,   6,  67}, {104,  11, 164}, { 93,  29, 227}, {126,  96,  53}, { 87, 106, 252}, { 42,  87, 105}, { 95,  45,  68}, { 73,  12, 139}, {105,  36, 237}, {247, 151, 150}, { 97, 131, 167}, { 63,  36,  72}, {141, 183, 206}, {207, 186, 249}, { 18,  14,  48}, { 85, 211, 188}, { 32,  54, 116}, { 52,  55,  67}, {235, 178,  24}, {111,  99, 110}, {201, 118,  53}, {123, 185, 212}, {106, 234,   5}, { 88, 194,  45}, {109,  78,  81}, { 70, 224,  72}, { 15, 198, 237}, { 17,  47, 133}, {176,  64, 211}, {135, 167, 167}, {231, 164,  37}, {138,  65,  70}, {162,  87,  42}, {240, 207,  43}, {113, 113, 242}, { 48, 116, 126}, {122, 105, 176}, {  8,  41, 103}, { 86, 118, 157}, {200,   3,   8}, { 10,  14, 115}, { 11,  28,  67}, { 34,  47, 147}, {149, 114,  95}, { 18,  61, 185}, {138,  13,  56}, {148,  89, 115}, {152, 193, 229}, { 34, 134, 184}, {250,  59, 101}, { 97, 214, 115}, {165, 168, 190}, {174, 206,  34}, {221,   1,  29}, {151, 116, 146}, {155,  86, 115}, {186, 107, 233}, { 72,   9,  69}, { 15,  92, 176}, {118, 100,  32}, {152,   3, 127}, { 10, 150, 216}, { 78,  80, 144}, { 82, 122, 131}, {  8,   8,   1}, { 37, 172, 124}, { 99, 127, 169}, {175, 116,  35}, {226, 162,  98}, {150, 234, 243}, {105,  20,  84}, { 41,  18, 123}, {186, 134,  99}, {220, 196,  15}, {137,  56, 195}, {187, 107,  20}, {211, 200,  69}, { 14, 162, 218}, { 49,  58, 120}, { 78,  84, 230}, { 31,  25,  30}, { 72, 133, 234}},
        {{222,   9,  65}, {121,  47, 158}, { 37,  40,  41}, {211, 106, 186}, {232,  87, 133}, { 17, 159, 233}, { 17,  99, 192}, {154, 250, 114}, {124,  96,  75}, {193, 182,  97}, {117, 175, 227}, { 58,  64, 118}, {175,  41,  30}, { 84,   0, 219}, {101, 216,  25}, { 67,  28, 121}, {218, 136,  42}, { 28,  13,  34}, {243,  32, 213}, {103,  96, 126}, {116,   1, 121}, { 14,  23,  58}, { 23, 209,  35}, { 68,  38, 186}, {138, 123, 121}, {191,  39, 217}, { 60, 199, 202}, { 97,  53, 159}, { 21,  76, 112}, {104, 116, 127}, {149,  60, 108}, {189,  50, 128}, { 73,  17, 214}, {105, 150, 150}, {144,  35,  44}, {121,  91, 134}, { 32,  40,  61}, {146,  83, 157}, { 96, 124, 165}, { 34, 137,  50}, {227, 144,   4}, { 18,   3, 135}, {163,  41, 155}, {128, 204, 247}, {144, 109,  11}, {  9,  24, 149}, { 68,  44,  57}, {  3,  61, 108}, {175,  71,  36}, {  1, 127,  61}, {101, 234,  49}, {163, 135,  10}, { 34, 112, 114}, { 41, 163, 206}, { 27,  19,  77}, { 97,  99, 160}, {154,   9,  67}, {182, 111, 122}, { 28,   7,  17}, {166,  34, 130}, { 91,   2, 215}, { 11,  44,  70}, {121,   9, 215}, { 51,  86, 121}, { 85, 115, 144}, { 29, 189,  11}, { 83, 101, 172}, {114, 116,  15}, {103, 100,  89}, { 26,  27,  33}, { 38,  17,  86}, {229,  86, 247}, {123,  86,  62}, {172, 130,  25}, {196, 154, 234}, { 71, 121, 139}, { 55,  78, 140}, {145,  15, 224}, { 93, 108, 143}, { 62,  56,  62}, {255,  23,  24}, { 54,   9, 120}, {209, 174, 126}, {119,  60,  75}, { 92,  48, 124}, {189,  24, 232}, {159, 157, 171}, { 50,   4,  52}, {115,   5, 114}, {217, 177, 139}, {203, 130,  38}, {113, 191, 239}, { 72,  73, 140}, {170,  33, 155}, { 54,  26,  43}, {212, 210, 118}, { 10,  61, 129}, { 18, 108, 180}, {195, 163, 217}},
        {{ 76,   8, 248}, {228, 108, 103}, {138,  43,   3}, {136, 225, 164}, {  3,  21, 150}, { 26, 114, 198}, {101,  79, 163}, { 86,  29,   0}, {135, 174,  55}, { 76,  10,  25}, { 96,  32, 204}, { 41,  25,  38}, { 57, 167, 200}, {210,  28, 180}, {114,  65, 225}, { 14,   8,   4}, { 30, 192, 196}, {  9, 114, 153}, {  2,  66,  77}, {  8,   6,  65}, {118,  39, 145}, {104,   4, 132}, { 51, 254, 212}, {155, 171, 204}, {203, 187,  28}, {155, 179,  65}, { 20,  31,  88}, {117,  36, 139}, {138, 239, 207}, { 94, 185, 115}, { 73, 147, 175}, {127, 124,   7}, {160,  30, 212}, {122,  50, 139}, { 85,  28,  62}, { 97,  88,  14}, { 29,  87, 182}, {182,  38, 171}, {241,  95, 213}, {218,  91, 230}, {211, 105, 225}, { 13,  25, 216}, {159, 131,   9}, {211,  64,  15}, { 40, 205, 254}, {230, 221, 240}, {122,   7, 218}, {207, 240, 113}, {104,  76,   2}, { 77,  65, 203}, { 19, 111, 224}, {123, 187, 217}, { 66,  12,  88}, {165, 117, 133}, { 47,  39,  47}, {243,   7, 239}, {134,  30,  93}, { 85,  18, 230}, { 96,  35,  73}, {216,  15,  30}, {113, 119, 139}, {221,  51,  10}, { 13,   6,   8}, { 40, 207, 226}, {118, 101, 112}, {236, 163, 130}, { 97, 123,  34}, {139,  89,  85}, {193,  28, 179}, {210,   2, 157}, { 30,  89, 175}, {126,  29,  29}, {177,  68,  40}, { 18,  70,  77}, {114,  61, 227}, { 36, 130,  70}, {168, 125, 141}, {120,  86,  87}, { 24,  91, 155}, { 84,  62,  35}, {255,  72,  78}, {233,  65, 255}, {179, 117, 160}, { 53,  74,  21}, { 43,  93, 182}, {112, 144, 157}, {176,  24, 185}, {185,  71,  19}, {191,  39, 235}, { 55,  51,  53}, {186,  34, 184}, {232, 195, 135}, {198, 214,  84}, { 35,  25,  42}, {114,  62, 156}, {145,  40,  65}, {163,  60,  23}, { 53, 207, 107}, {159, 113, 126}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}