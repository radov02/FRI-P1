
import java.util.*;

public class Test40 {

    private static final int[][][] SLIKA = {
        {{192,  96, 197}, { 52, 219, 245}, { 84,   6,  98}, {190, 172,  51}, {192,  11, 106}, { 38,   2,  47}, { 77, 198,  62}, {224, 218,  76}, { 60,  59, 102}, { 21,  70, 161}, {218, 160,  93}, {159, 154, 135}, {193, 227, 238}, { 89,  18,  57}, { 87,  49, 190}, { 90,   7, 133}, { 35, 119,  55}, {163, 109, 223}, { 88,  84,  59}, { 95,  63, 253}, {211,  70, 136}, {245, 138, 117}, { 80,   4,  80}, { 22,  22,  88}, { 26,  91, 118}, {112,  52,  61}, { 23,  42, 167}, {  5, 148, 172}, {239, 220, 100}, {227, 100, 134}, {  5,  21,  72}, {125, 102, 121}, { 26,  14,  38}, { 26,  17,  22}, {  4,  94, 153}, {133,   5, 134}, {206,  57, 187}, {126,  37, 177}, { 77, 113, 250}, { 84,  69,  14}, {168, 225, 241}, {100,  56,  79}, { 64,  60, 139}, {107,  45,  10}, {232,   5, 144}, {143,  31, 207}, { 98,  93,  90}, {112, 107,  19}, {231, 222,  28}, {123,  69,  50}, {187, 206, 101}, {238, 101, 103}, { 29, 151,   8}, { 25,  34, 155}, {124,  75,  59}, { 54,  51, 235}, { 87,  20,  91}, {105,  43,  22}, {  0,  11, 238}, { 94, 125, 149}, { 15, 171, 172}, { 23, 147, 116}, {177, 161,  99}, {195,  60,  92}, {  4, 232, 255}, {111,  17, 180}, {198, 160, 112}},
        {{161, 116, 180}, { 76, 182, 142}, {112, 216, 107}, {201, 100,   6}, { 65, 126, 221}, { 23,  29, 124}, {176, 165, 138}, { 70, 220, 241}, { 67, 109, 131}, { 73,  47,  70}, { 51, 212,  76}, {112,  40, 184}, { 45, 216, 234}, {178, 123,  97}, {178,  85, 247}, {245,  67, 114}, { 77, 212, 184}, {145, 151, 162}, {243, 155,   9}, {242, 155,   4}, {228, 214,  33}, { 85,  28, 137}, {155,  57, 213}, { 45, 121, 187}, {111, 137, 254}, {134,  96, 228}, { 88, 121, 196}, {124, 201, 152}, {230, 131,  90}, {145, 140,  39}, {243, 229, 243}, { 72, 207, 208}, {  7, 176, 199}, {117,  35,  78}, {  2,  11, 110}, { 13, 189, 246}, { 23, 109, 176}, { 85, 107, 239}, { 26, 144, 151}, {164, 230,  51}, {164,  50, 117}, {136, 163,  62}, {158,  91, 106}, {165,  53, 201}, { 10,  47,  79}, { 74,  35,  45}, {118,  51, 128}, {189, 190, 217}, {  8,  43,  62}, { 90,  79, 156}, {253,  94, 218}, {103,  79, 126}, {249,  94, 119}, {233, 185, 239}, {167, 159, 224}, { 20,  20, 171}, {228,  44, 243}, {165, 122, 141}, {203,  35, 205}, { 66,  61,  66}, { 18, 162, 234}, { 49, 132, 241}, {133, 200, 231}, { 63,  14,  40}, {145, 210, 255}, {181, 159, 221}, { 16, 239, 184}},
        {{ 45, 179, 216}, { 90, 205, 253}, {195,  73,  80}, {151,  41, 115}, {163, 246,  59}, {194, 151, 174}, {188, 221, 105}, {214, 196, 113}, {208,  74, 222}, {167, 102,  71}, { 56,  40, 150}, {254,  86,  96}, { 84,  22,  60}, {250,   4,  86}, {158,  72,  28}, {131,  38, 173}, { 70,  29, 178}, {190, 231,  10}, {201, 166,  67}, {172, 134, 216}, {104, 236, 197}, {109,  89, 189}, {189,  76, 178}, { 75,  83,  93}, {230, 226, 118}, {173,  81, 232}, {156, 146,  29}, { 46, 154,  63}, { 23,   8,  32}, {240, 186, 254}, {248,  35, 186}, {161, 118, 232}, {216,   9, 235}, { 46,  43,  74}, { 44,  11,   0}, {210, 217, 250}, { 73,  57,  60}, { 62, 157, 231}, {146,  46,  91}, {190,  51, 228}, {131, 185, 233}, {198,  96, 255}, {167,   3, 109}, { 31,  99, 186}, {159,  74, 151}, { 25,  38, 131}, {163, 140, 242}, {207, 138,  40}, { 43,  27,  56}, {235,  24,  80}, {135, 130, 151}, {118, 117, 195}, {166, 137, 163}, {235,  33,   8}, {  7, 108,  11}, {139, 151,  95}, {240,  32, 139}, {204,  58, 114}, {231, 139,  63}, {105, 148, 193}, {128, 169,  61}, {184,  74, 151}, {114, 116,  16}, {  9, 205, 221}, {185,  34,  82}, { 74,  13, 197}, {230,  84,  11}},
        {{240,  36, 230}, { 38,  37, 137}, {232,  53, 195}, {208,  24, 152}, { 11,   3,   1}, { 40,  65,  78}, {144,  70, 233}, {168, 135, 129}, {223, 128,  63}, { 73,  85, 219}, {180,  80, 120}, { 46,  17,  27}, {253,  58, 207}, { 38,  80,  84}, { 86,  55, 141}, { 12,  34,  62}, { 45, 138, 116}, { 90,  79, 131}, {126, 158, 250}, {158, 138,   5}, {118,  64, 107}, {145,  40, 117}, {210,  44, 161}, {167,   4, 135}, {234, 205, 125}, { 68, 235,  27}, { 75,   0, 177}, { 32,  16,  36}, {187, 104,  16}, { 59, 115,   2}, {161,  92,   7}, {  9,  14,  51}, {208, 181, 226}, {211, 161, 247}, {147, 108,  62}, { 76,  67, 216}, {152, 112, 157}, {125,  18, 148}, { 66,  13,  94}, { 77,  66,   7}, {138, 129,  39}, {194, 142,  37}, { 59, 205,  21}, {194, 131, 173}, { 23, 106,  10}, {207,  88,  43}, {160, 128, 104}, {163, 118,  81}, {159, 110,   4}, {156, 108, 148}, { 12,  14,  86}, {242, 154, 165}, {230,  92,  89}, {190,  17, 231}, {147, 247, 164}, {146,  77,  44}, { 87, 224, 125}, {141, 111,  29}, {246,  60, 232}, {209,  60, 112}, { 56,  20,  81}, {192, 144, 181}, {119, 112, 226}, {  4,  83, 153}, { 28,  57,  88}, {149,  39, 177}, {145, 136, 219}},
        {{248, 189, 140}, {207, 171, 246}, {147,  56,  74}, { 40, 171, 194}, {  5,  80, 255}, {234,  57, 245}, {188, 238, 135}, {208, 132, 239}, { 59, 150,  91}, {144, 111, 145}, { 84,  49, 189}, {168, 168, 125}, {124,  94, 117}, {124,   4, 225}, {148,   8, 230}, { 36,  13,  30}, {198, 248, 102}, { 46,  85,  39}, {210,  93,  98}, {242, 208, 110}, {196, 107, 173}, {240,  57,  40}, {208, 240, 240}, {126,   7,  39}, { 57, 196, 121}, { 78,  77,  42}, {249,   0, 105}, { 30,  69, 219}, {181, 106,  85}, { 16,  16,   5}, {224, 206,  96}, { 33, 206,  30}, { 67,  92, 135}, {124,  46,  84}, {210,  12, 192}, {218, 145,  87}, {151,  16, 164}, { 37,  80, 131}, {126, 154,  38}, {179, 171,   9}, { 19, 221, 107}, { 37,  24,  38}, {154,  31, 188}, { 41, 158, 188}, {  8,  93, 103}, { 79,  14,  23}, { 46,  30,  61}, {197,  46,  12}, { 47, 213, 162}, {163,  71, 103}, {164,  83, 147}, { 50,  12,  33}, {184, 242, 180}, { 85,  90, 249}, {207,  89, 112}, {104,  86,  48}, {151,  74, 205}, { 57,  90, 171}, {  2,  78, 250}, { 76,  41,  75}, {186,  46, 195}, {219, 185,  21}, {142,   4,   7}, {108, 219, 158}, {252, 242, 104}, {210,  37, 117}, {103,  47,  15}},
        {{ 61, 151, 163}, {211,  58, 180}, { 99, 242, 198}, {232,  95,  95}, {234, 101, 122}, { 51,  15,  34}, {197,  77, 152}, { 27,  26,  28}, {  6,  19,  29}, { 55, 161, 131}, { 71, 133, 134}, { 74, 228, 250}, {176,  66, 135}, {106, 134, 167}, { 46, 170, 144}, {201, 183, 114}, { 92, 150,  89}, { 14,  19,  26}, {195, 165, 147}, {248, 188, 126}, {112, 168,  27}, { 91,  56,   8}, {108,  23,  50}, { 77, 233,  44}, { 23, 153, 155}, {237, 241, 238}, {142, 120,  27}, { 17,  90, 199}, {205,  82,  75}, {185,  60, 200}, { 56,  49,  24}, {149,  15,  61}, { 45,   6, 224}, { 75,  18, 140}, {127,  36, 155}, {233, 213, 196}, {221, 124,  70}, {118, 245, 176}, {227, 138, 212}, { 45, 157,  58}, { 49,  32,   3}, {197, 192, 220}, { 41, 131, 240}, {157, 129,  26}, { 67,  24, 230}, {145,  43, 131}, {202, 176, 162}, { 24, 235, 189}, {190, 161, 191}, {115,  14,  55}, { 47,  45, 213}, {170,  49, 205}, {138,  64, 138}, { 39, 238,  30}, {180, 144, 166}, {228,  80, 141}, { 66, 172, 166}, { 29,  85,  56}, { 27,  15,   4}, { 61,  40,  71}, { 39,   4,   3}, {  2,   2,  29}, {241, 177, 244}, {  4, 182, 134}, {197, 214,  20}, { 89, 237, 225}, { 14,  18,  72}},
        {{191,  27, 195}, {127, 137,  82}, {119,  68,  66}, { 55, 171, 193}, { 68,  55, 127}, {189,  65,  36}, {250,  28, 143}, {124,  92, 127}, {144,  21,  84}, {250, 103, 172}, {221, 228,  80}, { 26, 187, 216}, { 82,   9,  50}, { 82,  74, 252}, {162,  75, 207}, { 71,  95, 225}, {172, 248, 139}, { 82,  73, 144}, {220,  44, 183}, {138,  35,  57}, {190,  37,  76}, {131,  58, 188}, {228,  69,  37}, { 42,  68,  85}, {212,  60, 254}, {  1,  56, 168}, {229,  49,  21}, {153, 198, 217}, { 97,  16, 168}, {117, 124, 200}, {217,  44, 247}, {222, 165,  24}, {196, 156, 244}, { 89,   5,   1}, {  3, 121, 155}, { 85,  58,  52}, {170,   0, 230}, { 74,   9, 120}, {160,  28,  21}, { 98,  81, 139}, { 73, 129,  27}, {108,  70,  64}, {137,  86, 175}, {127,  49, 129}, { 25, 218,  89}, {144, 137,  73}, { 93,  28,  69}, {  1,  96, 102}, {211, 116, 109}, { 54, 111, 219}, { 37,  70,  87}, {  6,   9, 171}, {248,  85,  31}, { 46, 144, 243}, {  3,  80, 127}, {216, 178,  47}, {198, 152,  33}, {232, 164,  41}, { 28,  12,  65}, { 69,  51,  99}, {149, 128, 149}, {120, 117,  78}, {144, 127, 248}, {192, 219,  44}, { 16,  35, 147}, { 86,  24, 177}, { 58,  45,  76}},
        {{ 86, 136, 137}, {168,  49, 145}, { 21,  92, 214}, {161, 107, 169}, {145, 130, 146}, {195,  90, 123}, {219, 173, 161}, {106, 133,  64}, { 56,  21, 194}, {201, 239,  23}, { 77, 115,  63}, {238, 211,  67}, {156,  69,   5}, {232,  77, 226}, { 73,  42,  72}, {  3, 193,   2}, {181, 241,  16}, { 50,   9,   6}, {249,  11, 215}, {  0,  34, 220}, {189, 125, 220}, { 22,  13, 156}, {141, 114,  34}, {107, 124, 229}, {196, 227,  53}, {164,  48, 214}, {197, 231,  37}, { 93, 111, 225}, {222, 214, 163}, { 71, 247, 104}, { 49,   7,  13}, {  9,  39, 181}, { 42,  32, 246}, { 79, 146,  86}, { 23,  92,   2}, {232,  74, 213}, {  9,  74, 216}, { 48,  12, 162}, {231,  94, 148}, {179,  21, 106}, {240,  44,  30}, { 21, 176, 166}, { 83, 215, 143}, { 87, 152,  43}, { 43,  44, 153}, { 40,  33,  43}, {  1,  70, 209}, {146, 170, 182}, { 82,  72, 255}, {178,   8, 176}, {109,   2,  93}, { 42,  51, 161}, {141, 131, 206}, {255,  89, 204}, {124, 243, 203}, { 89, 209, 128}, { 11, 179, 114}, {198, 173,  92}, { 62,  25,  61}, {101,  14,  48}, { 58, 123, 170}, {162, 169, 188}, {  5,  74, 181}, { 91,  54,  58}, {239, 122, 131}, {237,  71, 223}, {246, 239,   1}},
        {{ 52,   3,  45}, {161, 134, 147}, { 41,  41,  40}, {247, 226,  83}, { 89, 200, 102}, {222, 142, 147}, { 44, 175, 194}, { 31,  19,  58}, {214, 241,  23}, {217,  26, 221}, { 51,  36,  90}, { 52, 125, 194}, {225, 214,  88}, { 28,  49, 247}, { 23,  43, 243}, {110,  39, 102}, { 39,   8,  22}, { 10, 221, 104}, {195, 226, 229}, {210, 136, 144}, { 25,  59,  72}, { 85, 205, 170}, {240, 238,  49}, {101, 114, 158}, {191, 124, 174}, {123, 103,   7}, {238, 199,  40}, { 62, 227, 253}, { 15,  16, 157}, { 38,  59,  26}, {171, 169, 126}, {221, 140,  16}, {218, 129,  42}, { 38,   7, 212}, {251,  85,  98}, { 80,  62, 115}, {197, 186,  74}, {125,  58, 107}, {161,  84, 234}, {  4,  19,  60}, { 64,  26, 110}, { 14,  14,   0}, {  5, 217,  81}, {188, 140, 147}, {101,   2, 140}, { 52,  66, 238}, {183,  91,  50}, {  9,   1,   8}, { 20, 155, 228}, { 67, 100, 173}, {214, 205,  85}, {136,  51, 158}, { 62,  59,  95}, {  7, 137, 105}, {180, 136, 225}, {116, 111, 103}, {111, 179, 182}, {156, 136, 155}, { 64,  38, 121}, { 29, 181,  87}, {114, 194, 195}, {229, 228, 228}, { 49,  43, 101}, {151, 151,  32}, {123, 235, 200}, {109, 245, 231}, { 64,  73, 115}},
        {{ 77, 144, 240}, {168, 123, 226}, { 70,  78, 187}, { 88,  68, 207}, {238, 131, 220}, {138,  51, 205}, {213, 102, 176}, {231,   1, 249}, {252, 101, 218}, {168, 114,   4}, {188,  65,  28}, {207,  30, 171}, {120, 103, 232}, { 93,  42,   3}, { 29,  59, 130}, { 89,  65,  57}, {161, 203, 131}, { 94, 104,  83}, { 13, 138, 116}, { 36,   9,  64}, {119,  30, 235}, { 87,  82,  18}, { 80,   7, 159}, {192,   2,   1}, { 16,  40,  56}, { 55,  96, 166}, { 71, 215,  23}, {251,  50,  55}, { 85, 201, 104}, { 19, 172,  55}, {242, 217, 255}, {186,  11, 243}, { 11,   4,  18}, {248, 254,  22}, {181,  30, 126}, {246, 125, 144}, {247, 173, 187}, {  1,   8,  84}, {132,  57, 168}, {206, 189, 248}, {129, 155,  52}, {153, 222,  66}, {131, 115,   6}, {226,  41, 104}, {197, 249,  19}, {159, 242, 218}, {119,  79,  23}, {165, 131,  67}, {164, 191, 236}, { 92,   0,  79}, {125,  81, 116}, {191, 142, 234}, {115,  59, 158}, { 85,  44, 143}, { 34,  82, 103}, {120,  47, 102}, {  6,  13, 150}, {122,  88, 222}, {110,  26, 100}, {138, 223, 158}, {145, 166,  68}, { 93,  97, 182}, {188,  12, 108}, { 20, 111, 135}, {250,  50, 230}, {148, 126, 141}, { 72,  23, 145}},
        {{149,   4, 116}, { 33,  99, 196}, {226, 220, 122}, {162,  70,  38}, {165,  92,  42}, { 18,  13, 105}, { 68,  37, 124}, {145,  59, 125}, {123,  85,  69}, {  9,   4,  61}, {178, 254, 179}, { 62,  62, 148}, {201,  19, 171}, { 22, 194,  73}, {205, 199,  61}, {123, 153, 105}, { 92, 179,   5}, {105, 145, 173}, { 56, 200, 172}, { 68, 145, 128}, {111, 239, 182}, { 70,  36,   1}, {122, 100,  81}, {232, 124,  99}, {  0,  51, 100}, {117, 132,  31}, { 22,  72, 135}, { 96, 176, 197}, { 24,  30,  33}, {110,  96,   5}, {124,  23, 212}, { 79, 114, 155}, {215,  96,  25}, { 78,  28,   1}, {120,  43, 200}, {135,  39, 233}, {  9,  76, 158}, {164, 120, 151}, {240, 100,  58}, {181, 145, 208}, {174,  24, 169}, {137,  90, 126}, {219,   2, 106}, {145,  76, 119}, { 80,  47, 227}, {141,   7, 224}, { 27,  24,  20}, {190, 148,  25}, {131,  53, 100}, { 37,  28, 109}, {  3,  66,  84}, {145,  79,  38}, {  0,  69, 151}, {235, 210,  86}, { 76,  58,  56}, {177, 125, 117}, {163,  81, 159}, { 48,  59,  73}, {175, 147, 199}, { 77, 153,   8}, {224,  58, 125}, {182, 254,  44}, { 80,  79,  55}, { 29, 152, 175}, {234,  25, 217}, {196, 223, 211}, { 40,  44, 166}},
        {{240, 243,  70}, {161,  46, 234}, {201, 129, 232}, { 57, 123, 186}, {202, 170,  51}, {227, 128, 187}, { 39,  21,  23}, {162,  78, 107}, { 76,   3, 181}, { 57,  53,   8}, {200, 156, 193}, {166, 136, 188}, {237, 103,  92}, {169, 116,  56}, {  8,  31, 126}, { 97, 180, 179}, {  2,  74,  47}, {  9,  51, 239}, {135, 225, 229}, {236, 158,  79}, {162, 124,   4}, { 37, 181, 225}, {151, 233,  40}, { 77,  93, 105}, { 89,  63,  46}, {110, 114, 185}, { 82,  98,   5}, {120, 114, 217}, { 55,  39,   4}, {215, 168, 200}, { 28,   8,  74}, { 36,  43,  63}, { 14,  94, 126}, { 24, 153, 158}, {178, 207,  12}, {219, 187,  99}, {211,  65,  74}, {225, 187, 147}, {132, 108, 219}, { 11, 190, 241}, { 28,  21,   5}, {159, 117, 225}, {224, 243, 254}, {121,  47, 167}, {171, 159,  94}, { 55,  50,  19}, { 47,  18, 170}, {125, 113, 197}, {100, 183,  49}, {163,  84,  71}, {130, 155, 196}, {137,  84,  25}, { 22,   6,  25}, { 15, 187, 158}, {179,  15,  92}, {231,  44,  72}, {109, 108, 232}, {254,  90, 214}, {223, 147,  74}, { 99, 182, 162}, { 49,  30, 186}, {130,  71,  76}, { 99,  14, 129}, {203, 145, 198}, {133, 187,  31}, { 89, 139, 174}, { 76, 101,  85}},
        {{194, 218, 227}, {123,   8, 112}, {200, 182, 136}, {159, 109,   2}, { 58,  75, 154}, {183,  97,  88}, { 49, 110,  22}, {155,  95,  84}, {201, 146,   0}, { 38, 178, 118}, { 24,  86, 151}, {255,  68, 174}, {213,  54,  37}, {106, 102,  73}, { 32,  12, 243}, {144,  77, 204}, {239, 253,  61}, {151,   4,  16}, {185,  53, 128}, {207,  12, 151}, {122, 104,  55}, {231, 208,  61}, { 76,  21, 134}, {114,  81,  20}, { 88,  81,  39}, {127, 129, 175}, {124, 140, 107}, { 64,  73, 151}, {  1, 232,  14}, {  8,  73,  91}, {211, 125,  49}, { 36,  18,   7}, {102,  56, 102}, {  8, 100, 215}, {161, 155, 243}, { 91,  36, 150}, {128, 251, 207}, {200, 151,  79}, { 32,  50,  27}, {238, 116, 234}, {193,  88,  94}, {157, 103, 174}, {251, 237,  49}, { 15, 186, 247}, {149, 170, 208}, { 12,  74, 179}, {207,  96, 236}, {149, 231,  94}, { 92,  71,  14}, {227, 160, 105}, { 51, 126, 212}, {235,  98, 106}, {134, 100, 162}, {164, 122,  68}, { 21,   3,  35}, { 14,  24,  39}, { 74, 240, 248}, {171, 133, 251}, {222, 185, 138}, {118,  24, 156}, {157,   9, 140}, {186,  80,  25}, { 19,  23,  50}, { 65,  26,  43}, { 59,  20,  40}, {205, 122,  57}, {242,  34, 154}},
        {{229, 122, 229}, {116,  96, 223}, { 93,  91,  38}, { 74,  66,  62}, {229, 205, 149}, { 34,   7,   3}, {248, 108, 168}, {179, 172, 225}, {104, 141,  62}, {237, 248, 179}, { 93,  36, 112}, {181,   5, 135}, { 23,  19,  60}, { 92,  74, 118}, { 87, 161, 169}, { 18, 253, 106}, {138, 225, 179}, {253,  18, 123}, {162, 249, 106}, { 31,  57,  93}, {124, 147, 161}, {171, 161, 248}, { 15,  10,   0}, {247, 124,  99}, {190,  64, 171}, { 21, 101,   2}, {195,  35,  12}, { 31, 201, 115}, {121,  80,  53}, { 73,  50, 202}, {142,  20,  69}, {222, 111, 192}, {198, 130, 132}, {123, 129, 228}, {192,   6,  50}, { 63, 147, 226}, { 65,  49,   2}, {145,  88, 158}, { 56,  30,  41}, {141, 137,  87}, { 23,  35,  79}, { 42,  27,  79}, {183, 160,  21}, {163, 150, 145}, {212,  83,  63}, {125, 147,  89}, {195, 179,  71}, {204,  61,  47}, { 24,  21,  14}, { 35,   3,  80}, { 48,  67, 170}, {136,  70,  48}, { 36, 143, 103}, { 14, 115, 144}, {136, 124, 127}, {238, 147, 228}, {199,  66,  11}, { 17,   4,  34}, {139, 113,  22}, { 46,  19, 123}, {139, 113,  14}, {164,  63, 160}, {248,   2, 192}, {242, 139,  96}, { 81,  11, 130}, { 22, 131, 117}, { 71, 134, 178}},
        {{  8,  48,  70}, { 33, 114,  94}, {138, 154, 157}, {187,  17, 216}, { 59,  15,  41}, { 34,  63,  71}, {169,  26,  23}, {249, 167,  16}, {227, 118,  92}, {138,  52, 121}, { 97, 192, 247}, {145, 106,  39}, {135,  98,  36}, {116,  33,  16}, { 21,   3,  79}, { 28,  34, 112}, {198, 201,  76}, {113, 114, 171}, { 32, 185, 227}, {175, 127, 185}, { 17, 254, 127}, { 58, 189, 226}, {200,  69,  87}, {144, 141, 225}, {169, 224, 191}, {143,  45, 133}, { 71,  40,  39}, { 18,   2,  50}, {201, 119,  64}, { 13,  13,  13}, {226,  77,  47}, {164, 137,  30}, { 84,  57,  70}, { 75, 126, 134}, { 71,  85, 145}, { 45,  67, 156}, { 32,  11,  32}, { 98,  27,  65}, {117, 114, 142}, {167, 108, 195}, { 40,  43,  11}, { 58, 107, 194}, {177, 113, 245}, {144,  20,  14}, { 39,  40, 137}, {245, 217, 139}, { 57,  16,  77}, { 60, 162, 185}, { 60,  42,  49}, {159, 195, 251}, {156,  23, 177}, { 32, 125, 156}, {105,   7,  11}, { 85,  38, 202}, { 43,  10, 196}, {163,  94, 113}, {152, 125, 184}, {143, 229, 201}, {202, 117,  47}, { 59,  33,  32}, {  5, 245,  53}, {228, 126, 254}, {138, 111, 166}, { 56, 124,  86}, {230, 100, 175}, { 63,  95, 122}, {238,  43,  46}},
        {{127, 159, 224}, {157,  69, 170}, { 74,  10, 247}, {125,  35,  42}, { 20,   4,  21}, {185, 141,  22}, { 94,  10, 120}, {246, 104, 220}, {135, 132,  60}, {120,  41, 181}, {243, 143,  25}, {239, 227,  14}, { 51,  98, 180}, {137, 124,  71}, { 46,  21,   9}, { 43, 172, 221}, { 49, 230, 149}, {249, 188,  24}, {173, 152,  47}, {140,  42, 224}, { 60,  41, 123}, { 35, 168,   1}, {213, 245, 169}, {212,  71, 240}, { 47,  39,  76}, {218, 123,  31}, { 53,  10,  29}, {220, 226,  54}, {100, 168, 223}, {143,  58,  48}, { 91,  22,  47}, {129,  12, 173}, {240, 251, 133}, {132,  62,  18}, {116, 107,  44}, {111,  78,  74}, { 28,  35, 144}, { 61, 162, 254}, { 10,  49,  70}, { 32,  28, 123}, {103,  74, 114}, {207, 227,  49}, { 34,  90, 130}, {  3,  67, 180}, {162,  57, 227}, {134, 239,  39}, {124,  17,  53}, { 18, 142, 131}, { 63, 161, 179}, {117,  96, 223}, {246, 197, 198}, { 59, 239, 247}, {143,   5, 176}, {244, 147,  22}, { 70,   0,  65}, { 91,  10, 133}, {255,  23,  31}, {191,  93,   1}, { 33, 151,  86}, { 36, 128, 179}, {145,  73,  66}, { 47,  30, 127}, {141, 143, 185}, { 60,  43,  48}, { 95,  71, 224}, {190,  83, 222}, {122, 120, 128}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}