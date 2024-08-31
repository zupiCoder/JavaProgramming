
import java.util.*;

public class Test01 {

    private static final int[][][] SLIKA = {
        {{ 56,  58, 223}, {245, 170, 236}, {232,  18, 252}, {  6, 131, 228}, { 28, 228, 240}, {200,  38, 125}, {236,  18, 175}, { 89,   9,  58}, { 91,  36, 219}, {168, 157, 220}, {183, 201, 229}, {229, 183,  93}, { 59,  21,  76}, {245, 140,  47}, {137,  21, 199}, {242, 199, 118}, {219,   1,   0}, { 59,  38,   5}, { 55,  95, 166}, {240, 181,   5}, {236, 163,  10}, { 66,  80, 124}, {141, 108, 228}, {209, 195,  90}, { 54,  55, 198}, {220, 116, 231}, {249, 137, 201}, {196, 209, 219}, {144, 126,  74}, { 80,  29,   8}, {162,  76, 127}, {162,  66,  73}, {137,  36,  93}, {189,   5, 143}, {113,  95, 169}, { 91, 105, 123}, {204,  54, 113}, {244, 243,  89}, { 47,  43,  28}, { 31, 136, 150}, {195,   4, 147}, {184, 123, 139}, { 21,   4,  37}, {232, 136, 209}, {201, 117,  94}, {223, 176, 185}, { 11,  34, 220}, {156, 129,  44}, {148,  19,  16}, { 45, 120, 222}, {169,  44,  37}, { 23,  25, 149}, {  7, 151, 199}, { 56, 173, 193}, { 98,  13, 102}, {197, 200, 248}, { 60, 100, 174}, {208, 159, 123}, { 66,  48,   8}, { 69, 125, 125}, { 42,  53,  87}, {157,  53,  65}, {112,  22,  74}, { 96,  11, 173}, { 21, 165, 172}, {191, 152, 250}, { 70,  18, 196}, {202, 157, 111}, {226,  47, 132}, { 70,   1, 131}, {136,  17, 173}, {178, 156,  84}, {159,  57,  83}, {181,  68,  38}, { 56,  34, 163}, { 50,  32,  54}, {173,  40,  73}, {108, 122, 225}, {109,  55, 102}, {184,  90, 247}, { 24,  15,   7}, {184,  80,  37}, {241,  95, 170}, {102,  53,  39}, {234, 115, 245}, {167,  54, 236}, { 58,  35, 129}, {125,  18,  88}},
        {{ 35,  25,  14}, { 63,  47,  31}, {211, 175,  11}, {178,  41, 185}, { 33,   9,  81}, {150,  50,   6}, {228, 225, 115}, {255, 223, 155}, { 72,  28, 100}, {243, 226,  86}, {205,  32,  23}, { 14,  16, 253}, {186, 225, 255}, { 77,  57,  94}, {103, 168, 202}, { 93, 162, 223}, {  1,  12,  82}, {190,   2, 205}, {203, 151, 241}, { 21,  68, 152}, {175, 137, 100}, { 44, 147, 172}, { 65,  45, 128}, { 47,  36, 206}, {184, 100, 137}, {236, 112, 142}, { 49,  15, 144}, {131, 121, 143}, { 24,  32, 182}, { 74, 158, 241}, {234, 193, 148}, {243, 226,  95}, { 19,   5,  81}, {245,  96,  73}, {237,  26, 197}, {178,  53, 189}, {185, 155, 122}, { 32,  28, 248}, { 98,  20,  35}, {  7,  62, 200}, { 42,  23,  79}, { 82,  58, 181}, { 92,  76, 169}, { 46,  45,  48}, { 60, 104, 118}, { 50,  94, 101}, { 42,  32,  25}, { 35,  34, 101}, {229, 226, 120}, { 22,  20,  25}, {199, 197,  94}, {124,  99, 216}, {253,   5, 187}, {201, 112, 248}, { 42, 140, 216}, { 94,  23,  50}, {212, 208,   5}, {222,  27, 244}, { 93,  45, 200}, {144,   6, 247}, {141,  69,  19}, { 78,  76, 129}, { 33,  26,  50}, { 94,  57,   7}, {  8,   7,   6}, {193, 144, 127}, {163,   0, 109}, { 19,   9,   0}, { 42, 120, 222}, {230, 243, 244}, {180,  28, 253}, { 40,  37,  53}, {235,  55, 147}, { 90,  94, 175}, {172, 140,  63}, {129,  71,  62}, { 67,  59, 185}, {171, 128, 176}, {185,  60,  41}, {216,  39,  94}, { 96,  33,  27}, {234,  94, 246}, { 75, 186, 228}, {176, 151, 218}, {219, 128,  97}, {124,  14,   4}, {188, 109,  24}, { 78, 143, 245}},
        {{ 53,  35,  34}, { 75, 165, 193}, {217, 180,  82}, { 19,  28, 198}, {219, 195, 141}, {209, 179, 210}, { 26, 231, 234}, {114,  10, 111}, {103, 103, 147}, { 64,  78, 152}, {  0,  46, 186}, {157,  26,  88}, {106,   7, 202}, {242, 103, 121}, { 62,  11, 121}, {184, 113,  65}, {171,  48, 217}, {167,  31, 125}, {202, 172, 231}, { 59,  72, 116}, { 72,  76, 128}, {209,  45,  19}, { 34,  37, 146}, {106,  33,  45}, { 72, 186, 229}, {  5,  35,  49}, {202, 131, 140}, {247,  79, 131}, {248,  41, 126}, {167, 212, 237}, {226,  42,  61}, { 27,  37, 238}, {157,  28, 165}, { 46,  21, 106}, {109,  47,  28}, { 62, 193, 209}, {103, 172, 173}, { 85,   0,   6}, {192,   6, 181}, { 68,  30, 188}, {252, 161, 126}, { 23, 194, 214}, {179,  22, 190}, {169,  50, 112}, {179,  26, 203}, { 50,  64, 222}, {108,  16, 237}, {219,  18,  29}, {187, 137, 139}, { 39, 130, 158}, {125,  46, 100}, {208,  46,  74}, {159,  54, 182}, { 63,  46,  17}, {151,  78, 117}, { 13,   2,   1}, {108,  64, 168}, { 96, 105, 144}, { 39,  11,  39}, { 18, 226, 227}, {254, 234,   2}, {109, 117, 170}, { 44,  38, 113}, { 63, 200, 254}, {111, 125, 149}, {124, 144, 156}, {221, 150, 193}, {217,  36, 119}, {197,  22,  74}, {229,   8, 219}, {  1,  23,  34}, {138,   7, 194}, { 45,  57, 106}, {170, 148,  69}, {236, 233, 242}, { 57,  36,  26}, {157,  52,   2}, {236, 100, 187}, {163, 118,  84}, {245, 241,  69}, {136,  80, 119}, {112, 215, 238}, {173,  98,  94}, {145,  75,  67}, { 10, 131, 132}, {179, 135,  24}, {200,  75, 117}, {101,  70,  60}},
        {{186, 105,   9}, {221,  98,  46}, {232,  48, 254}, {165,  26,  86}, {238, 100, 203}, {108,  39,  84}, {225, 175, 179}, { 62,  10, 108}, { 53,  24, 102}, {116, 101,   8}, {115,  50,   7}, {247, 109, 149}, {252, 191, 235}, {173, 218, 234}, { 51,  90,  93}, {203, 175, 219}, {126,  55, 219}, {120, 157, 205}, {  0,  35,  47}, {196,  57,  10}, {221,  67, 134}, {237,  51, 156}, { 25,  12,   6}, {155,  67, 150}, {167,  66, 169}, { 91,   7, 132}, { 27,  90, 183}, {200,  28,  89}, {155,  10,  20}, { 36,  14,  43}, {230, 100,  15}, {135, 134, 189}, {222,  92,  58}, {  5, 224, 248}, { 71, 110, 209}, {  8,  61, 104}, { 40,  93, 213}, { 62, 209, 240}, { 23,  94, 149}, {231, 146, 165}, {243, 235,  69}, { 18,  95, 197}, {126, 117, 183}, {187, 139, 167}, {107,  28, 226}, {150,   9, 145}, {119,  45, 136}, {137,   4,  53}, { 32,  47,  64}, { 17,  27, 250}, {102, 132, 143}, {149,  21,  93}, { 61, 116, 189}, {128,  99,  77}, { 29,  26, 202}, { 47,   1,  51}, {195,  65,  63}, {109, 130, 211}, {152,  44, 205}, {234, 167, 201}, {162, 122,  76}, {  0,  61, 174}, {128,   1, 169}, { 78, 149, 234}, { 79,  76,  55}, {  9, 124, 142}, {121, 118, 120}, {246, 126,   6}, {128,   6, 201}, {229, 163, 179}, {154,  61, 124}, {  2,   8,   9}, {109,  50,  92}, {153,  90,   3}, {234, 135, 158}, { 51,  49,  41}, {254, 153,  68}, {144,   6,  95}, {101,  60,  15}, {203, 140, 129}, {125,  51, 106}, { 53,  98, 176}, {190,  51,  64}, {111,  41, 197}, {115,  98, 160}, { 75, 173, 186}, {143, 211, 246}, { 26, 139, 158}},
        {{ 62,  28,  57}, {132,  28,  30}, {115, 105, 177}, { 41, 115, 172}, { 24,  13, 100}, {199, 101, 185}, {250,  26,  32}, { 76,  21,  82}, {198, 113,   2}, { 22, 165, 232}, {174,  78,  61}, { 85,   6, 102}, { 35,  45,  61}, {251, 191,   5}, {131,   7, 154}, {200, 153, 206}, {177,  36, 221}, {124, 156, 204}, { 33,  72, 247}, {146,  48,  84}, { 91, 108, 115}, {232,   3,  17}, { 11,  11,   5}, {110,   1,  10}, { 47, 117, 236}, {  6, 206, 233}, {252, 133, 190}, { 60,   8, 126}, {  0,  72, 181}, {245, 135, 220}, {252,  18,  43}, { 17,  56, 155}, {186, 183, 115}, { 56,  14, 216}, { 90, 190, 221}, { 69,  89, 168}, {186, 135, 242}, {206,  83,  69}, {210,  37,  95}, { 75,  59,  62}, { 99,  89, 120}, {191,   2, 246}, {251,  95, 189}, {  7,  53,  68}, {244, 133, 230}, {109, 181, 223}, {236, 158, 127}, { 36,  14, 220}, {216, 140, 110}, { 48, 140, 175}, { 76, 148, 231}, {112,  26, 135}, {116,  60, 204}, {  0,  76,  85}, { 70,  53, 165}, { 21,   1,  23}, {203,  65, 203}, {217, 186, 243}, {233, 102, 180}, { 71,  40,  17}, {232, 179,  66}, {  5,  45, 139}, { 86, 160, 174}, {159,   7,  76}, {148, 125,  15}, {188, 111,  70}, {144,  36, 196}, { 61,  23, 248}, { 46, 111, 146}, { 31,  38, 157}, {153, 187, 223}, { 36,  92, 141}, {  3, 107, 111}, {134,  38,   1}, {170,  72,  31}, {137,  48, 133}, {148,  11, 124}, {204,   8,  33}, {157,  75, 111}, {  9, 114, 155}, {193,  75, 157}, {181, 118,   8}, {183,  25,  49}, { 61,  40,  24}, { 12,  26,  60}, { 78,  99, 100}, {134,  46,  95}, { 23, 185, 185}},
        {{ 86,  40,  32}, {244, 161,  32}, {119,  96,  19}, { 95,  62, 102}, {224, 109, 135}, { 72, 105, 250}, {193,  77,  47}, { 38, 136, 225}, { 38,   2,  97}, {131, 122, 220}, {132, 111, 223}, {137,  25, 248}, { 85,  44, 135}, {234, 112,  60}, {148,  91, 164}, {172,  96,  67}, {206, 174, 119}, { 37,   0,  11}, {203, 144, 139}, { 17, 151, 177}, {125, 204, 221}, {103,  15,  12}, {199, 120, 116}, {234,  20, 202}, { 37,  11, 144}, {227,  63,  23}, {144, 120, 226}, {125, 210, 220}, {110, 101, 198}, {133, 113, 120}, { 32,  26,  33}, {234,  81,  29}, { 89,   4,  25}, {119,  65,   7}, { 37,  99, 177}, { 80,  12, 163}, {175,  16, 177}, {198, 133,  20}, { 77,  59, 128}, {222,  97,  69}, {125,  46, 190}, {220, 139, 226}, {137,  80,  25}, { 52,  38, 110}, {221, 116, 226}, {253, 231,  30}, {205,  38, 128}, {231, 192, 103}, { 71,  27, 113}, {213, 208, 185}, {138,  13, 128}, {209,  91, 193}, {204,   4,  54}, { 50, 104, 124}, { 85,  77,  59}, {118, 140, 222}, { 48, 109, 170}, {  6, 117, 224}, {189,  11,  99}, {186, 121, 110}, {233, 184,  44}, {236, 129,  29}, {171, 155,   5}, {127,  38,  95}, {243, 103, 211}, {  9, 221, 241}, { 10,   6, 166}, {223,  73, 127}, {125,  35, 113}, { 45,   0, 157}, { 12,  92, 129}, {104,  57, 119}, {127,  78,  34}, { 76,  92, 196}, {133, 111,  58}, { 13,  22,  46}, {144, 149, 182}, {213, 210,  19}, {  8,  32, 135}, {159, 157, 225}, { 41,  40, 196}, {253, 209, 133}, {156,  33,  27}, {176, 129, 199}, {130,   2, 128}, { 35,  35,  20}, { 50, 186, 221}, {174, 162, 150}},
        {{ 24,  31, 217}, {106,  70,  78}, { 49, 192, 230}, { 73,  22,  37}, {171, 115, 239}, {194,  88, 206}, {155,  15,  88}, {235,  60, 168}, {244,  31,  33}, { 84, 125, 163}, {102, 184, 195}, { 70,  31,  32}, { 33,  98,  99}, {156, 114,  25}, {193,  81, 209}, {235, 120, 248}, { 64, 111, 150}, {189,  63,  31}, { 94,   6, 108}, {238, 232,  91}, { 42,  14,   6}, { 72,  56,  26}, { 15,  15,  36}, {145, 157, 235}, {174, 110, 228}, {249, 154,  99}, {110,  61,  94}, {153, 103, 222}, {228,  11,  38}, {250,  36, 155}, { 77,  25,  45}, {251, 110, 226}, { 81,  74, 125}, {175, 149, 182}, { 54,  46,  28}, { 71,  15, 250}, { 22, 103, 214}, { 63,  81, 119}, { 26,   3,  64}, {190,  54,  42}, { 91, 184, 204}, {219, 183, 224}, {194,  98, 215}, { 20, 113, 163}, { 46,  52,  59}, {116,  61,   4}, {168, 131,  31}, { 23,   3,   1}, { 79,  51,  61}, {134,  93,  54}, {204,  77,  99}, { 63,  10,   1}, {169,  42,   9}, { 82,  48, 209}, {220,  45, 185}, { 40,  74,  83}, {168, 110, 157}, { 67, 141, 169}, {212, 136, 178}, { 10,  29, 198}, { 72,  46,  31}, {199, 113, 193}, {254,  44,  60}, {230,  85, 190}, { 71,  72, 168}, {130,  92, 229}, {156, 175, 224}, { 90,  74,  13}, { 59,  91, 129}, {171,  43, 219}, {224,  58, 138}, {173, 112,  83}, {162,  22, 255}, {148,  62,  43}, { 57,  29,  29}, { 85,  77, 118}, {249,  53, 151}, {108,  76,  35}, {227,  70, 188}, {134,  86, 189}, {231,  96, 157}, {193,   2, 134}, { 63,  91, 120}, {147, 156, 188}, {232,  56, 211}, { 26,  26,  18}, {124,  40, 197}, {112, 251,  53}},
        {{ 37,   5,  46}, {117, 142, 142}, {223, 184, 174}, { 69,  25,  32}, {  1,  94, 157}, { 12,   3, 160}, { 12, 127, 238}, {228,   6, 231}, {184, 104, 134}, { 14, 144, 226}, {232, 108,  35}, {198, 166,  49}, {234,  51, 189}, { 23, 129, 180}, { 77,  38, 207}, { 82,  62,  40}, { 25,  19,  36}, { 40,  56, 186}, { 19,  66,  66}, {227, 114,  73}, { 99,  29, 145}, {241, 169,  24}, {108,   2, 176}, {239,   8, 132}, {134,  75, 189}, {118,  85,  51}, {212,  88, 128}, {154,  26, 211}, {124, 100,  53}, {125,  96, 225}, { 97,  70, 159}, { 14,  19,  31}, {214, 172, 149}, { 81, 211, 229}, {178,  11,  22}, {159,  55, 201}, { 11,  15, 214}, { 23,  10,  70}, { 92,  68,  34}, {200,  80, 182}, { 90, 102, 109}, { 35,  92, 130}, {244,  80, 196}, {211, 127, 182}, {149, 111,  63}, {185, 105,  77}, {144,  45, 209}, {136, 100,  73}, { 45,  44,  90}, {167,  33,  44}, { 97,   4, 135}, {146,   5, 143}, {146,  12, 172}, {118, 110,  10}, { 26, 216, 232}, {159, 101, 198}, {121, 159, 200}, { 11,   5, 212}, {249, 116,  94}, {111,  44,  63}, {129,  87,  45}, {219, 103, 185}, {179, 167, 168}, { 58,  57, 205}, {190, 174,  84}, { 63,  53, 135}, {234,  83, 189}, {109,  28,  78}, { 23, 128, 181}, {180,  19,  29}, { 26, 103, 156}, {216, 210, 211}, {238,  94, 161}, {169,  59, 108}, { 49,  41, 112}, {226,  47, 217}, {181,  74,  78}, { 61,  14,  30}, { 61,  23, 220}, { 26,  23,  71}, {154,   8, 111}, { 81, 101, 228}, {151,  43, 239}, {246, 188, 203}, { 30,  49, 225}, {124, 124,  48}, {215, 229, 231}, { 53,  48,  13}},
        {{ 37,  45, 109}, {168,  66,  73}, {143, 142, 230}, {179, 106, 178}, {229, 172, 113}, {123, 167, 170}, { 23,  10,  58}, {229,  46,  26}, {154,  84,  82}, {116,  86,  93}, { 23, 119, 144}, {211, 152, 176}, {194, 187, 162}, {226, 145, 200}, {212,   0,  90}, {117, 119, 233}, { 88,  22, 140}, {242,  11, 108}, { 14, 150, 239}, { 10,   5,   3}, {179,  87,   3}, { 62,  59, 113}, {163,  16,  15}, {247,  38,   3}, { 68,  46, 134}, { 79, 123, 157}, { 45,  57, 177}, {249, 199, 122}, {255,  65,  61}, { 93,  19,  95}, { 70,  45,  69}, {104,  17, 218}, {141, 135, 158}, { 53,  33,  81}, {158, 144, 127}, { 57,   2, 113}, {118,  65, 117}, { 51,  43,  72}, { 30, 138, 157}, { 66, 119, 195}, {189, 174,   4}, { 84,  44, 250}, {160,  64,  46}, { 50, 132, 219}, { 39,  38,  13}, {  8,  38,  83}, { 53,  38,   5}, {228, 246, 250}, { 70,  35,  17}, {204,   5, 166}, {225, 115,  59}, {102,  27, 223}, {  3, 198, 239}, {203,  38,  96}, { 71,  74, 148}, { 43,  11,  65}, {  1,  64,  74}, { 24, 172, 247}, {245, 219,  74}, {124,  93,   2}, {146, 130, 148}, {162,  14, 108}, { 67,  41, 250}, {124,  82,  84}, { 87,  71,  20}, {126,  19, 164}, {195, 165,  26}, {154,  14,  65}, {233, 169,  16}, {120,   6,  45}, {  1,   1,   4}, {  7, 185, 193}, { 53,  30, 104}, {100,  51, 102}, { 66,  23,   2}, { 35,  62,  76}, { 93,  35, 126}, {197, 157,  12}, {119,  53,  25}, {219, 193,  73}, {145, 192, 238}, { 18,  48, 163}, { 78,  41,  57}, {147,  30,  83}, {142, 150, 204}, {222,  74, 240}, { 90,  57,  54}, {231, 196,  57}},
        {{142, 108,   8}, {100,  22,  66}, { 16,  69, 103}, {190,  32, 149}, {  6,  10,  68}, { 63,  58,  41}, {166, 102,  47}, {254,   5,   5}, { 63,  87,  91}, {179, 170, 209}, {205,  73,  28}, {196,   4, 121}, {166,  77,  67}, { 22,  84, 138}, {117,  66,  95}, {135, 130,  95}, { 91, 216, 226}, {174,  82, 232}, {173, 162, 122}, {120, 100,  27}, {230, 211, 232}, {168, 139, 244}, { 81,  72, 220}, {187, 157, 183}, {253, 200, 184}, { 72,   1, 121}, { 88,  83, 217}, {168, 118, 241}, { 37,  34, 171}, { 96,  88, 233}, { 46,  11, 164}, {159, 159,  62}, {196,  18,  57}, {122, 111, 177}, {103, 148, 193}, {112,  97, 175}, { 56,   4,  69}, { 80,  37,  74}, { 92,   8,  17}, {197,  99, 224}, { 51,  75, 119}, {191,  77, 155}, {149,  16, 115}, {149,  99, 101}, {246,  91, 242}, {119,  29, 111}, {139,  10, 158}, { 73,  31,  66}, {113,  70,  30}, { 51,  19,  57}, {240, 149,  75}, { 92,  71, 101}, {155, 190, 244}, { 88,  47,  37}, { 99,  48,  15}, { 54,  90, 164}, { 28,  17,  39}, { 41, 105, 131}, { 88, 163, 252}, {118,  25,  50}, {111,  13, 228}, {179,  24, 171}, { 55, 183, 234}, {195,  38, 154}, { 66,  63,  73}, {227, 157, 229}, { 51,  81,  88}, {189, 180, 216}, { 54,  36, 141}, { 98, 147, 245}, {195,  68,  12}, { 53,  31,  15}, {107,   1, 204}, {154,   2,  76}, {116,  49, 160}, { 96, 160, 180}, {116, 114, 105}, { 82,  69,  30}, {210, 100,   6}, {155,  16, 166}, {213,   4,  35}, {183, 107,  37}, {213,   6, 127}, {243,  53, 146}, {189,  24,  83}, { 54,  13,  40}, {138,  52,  64}, { 83, 129, 171}},
        {{ 14,  65,  67}, {210, 116, 125}, {106,  80,  87}, {247,  13, 192}, {253,  60, 219}, { 60,  24, 188}, {146,  95, 152}, {243, 153,  85}, {239,  27,  71}, {148,  82, 109}, { 84,  38,  63}, { 79,  56,  66}, {204,  79,  79}, {108, 125, 138}, {214, 210, 193}, {128,  65, 166}, {108,  33,  62}, {  0,  47,  93}, {189, 182, 226}, { 15,   1,   3}, {221,  82, 252}, {171,  74,  48}, { 35,  61,  62}, {214, 110, 145}, {233, 167, 188}, { 62,  15,  11}, { 14,  60,  80}, {  1,   6,  74}, {162, 133, 140}, { 75,   7,  27}, { 93,  32,  52}, {219,  75, 218}, { 47, 104, 242}, { 26,  66,  71}, {176, 164,  49}, {139,  28, 115}, {149, 131, 135}, { 31,  93, 169}, {105,   6, 134}, {135,  58,  21}, {250,  38, 203}, {130, 125,  31}, {192,   6,  11}, {206,  94, 112}, { 40, 216, 242}, {103,  28, 115}, {121, 187, 250}, {245,  34, 225}, {208, 191, 152}, { 52,  87, 166}, {194, 193,  91}, {141,  19, 231}, { 21,  16,  74}, {193, 145, 187}, {209,  18, 111}, {160, 221, 252}, {206, 119, 197}, { 19, 106, 134}, { 57, 174, 182}, {  3,  34,  50}, { 82, 142, 154}, { 18,  31, 124}, { 73, 124, 150}, {215, 160,  79}, {249,  27, 154}, { 19, 181, 223}, {217,  80,  27}, {231, 118, 134}, {212, 203, 126}, {169,  22, 104}, { 90,  17,   7}, {203,   5, 161}, {228, 226, 144}, { 90,  17, 100}, {189,  30,  57}, { 93,  46,  19}, {228,  36, 254}, {179, 161,  35}, {227,  69, 227}, { 18,  41,  61}, {174,  91, 103}, {219, 103,  67}, {213, 106,  62}, {187, 132, 145}, { 37, 106, 126}, { 20, 143, 144}, {156, 129, 197}, { 42,  41, 196}},
        {{111,  13,  91}, {167,  95, 223}, {232, 164,  65}, { 20,  22, 103}, { 76,   9,  93}, {206, 204, 214}, {217, 186,  40}, {121,  69, 238}, {246, 114, 213}, {127,  23,   8}, { 65,  50,  58}, {167,  91,  97}, {182, 155,  40}, {192, 188,  99}, {108,  39, 238}, {124,  21, 184}, {102,   8, 226}, {  7, 142, 153}, {171,  14,  31}, {116,  37,  44}, {169,  87, 223}, { 57,  18,  15}, {169, 107, 136}, { 12,  68, 120}, { 64,  89, 170}, {246, 209,  73}, {238,  25, 218}, {121,   0, 110}, {220,  51, 206}, {118,  35, 218}, {142, 194, 223}, { 88,  24,  67}, {248,  72,  53}, { 56,  91, 179}, {  8,  79, 167}, {169, 159,  89}, { 91,  11, 120}, { 51,  24,  91}, {100,  96,  43}, {120, 116, 116}, {158,   7, 225}, {  4,  46,  58}, { 36,  34, 159}, {140,  35, 209}, {180,  94,  82}, {169,  16,   8}, {254,  94, 217}, {  6,  28,  87}, {173, 148, 131}, {120,   4, 182}, {184, 141,  56}, {150,  37, 169}, { 47,  52,  59}, {157,  88,  45}, {112,  87, 227}, {170,  21, 175}, { 84,  29,  44}, { 70,  69,  19}, {183,  46,  32}, {240,  21,  88}, {157,   6,   5}, { 62,  23,  15}, {178, 107,  13}, { 67,  38, 165}, {229, 204,  14}, { 18,  51, 105}, {151, 201, 207}, {161, 226, 228}, {130,  98,  76}, {219,   1, 174}, {185, 176, 139}, {206,  46, 230}, { 78,  72, 114}, {171,  85,   7}, {153,  90,  95}, {199, 107, 113}, {162, 165, 188}, { 33,  10, 243}, {  7, 132, 183}, {138, 138, 111}, {186,  22, 177}, {148, 132, 217}, {126,  72, 161}, {236, 116,  64}, {143,  56, 143}, { 14, 103, 135}, {186,  24, 253}, {179,  63, 238}},
        {{216,  55,  82}, {118, 112,  73}, {170,  31,  25}, {224,  16,  74}, { 16, 171, 192}, {233,   9, 209}, {242, 211, 123}, { 65,  69, 174}, {125,  26, 122}, {174,  25, 237}, {180,   7,  31}, { 23,  32,  34}, {184,  99, 244}, {  7,   5,  79}, {125,  85,  54}, { 21,  20,  77}, {140,  58, 184}, {  8,  36,  73}, { 80,  18,  33}, {185,  30, 107}, {205,  30, 182}, {241,  25, 164}, { 96, 198, 204}, { 86,  30,   2}, {246, 188,  98}, { 45,  83, 193}, { 12,  49,  55}, {148,  61,  14}, {127, 121, 124}, {226, 107, 162}, {161, 102, 194}, {243,  71, 163}, {252, 196,  73}, { 22,  38, 224}, { 17, 124, 205}, {115, 128, 146}, {208, 149,  63}, {128,  49, 225}, { 30,  50,  70}, { 13, 146, 191}, { 75,  55, 190}, { 25,  54,  71}, {111,  64, 132}, {206,   0,  63}, { 54,  49,  85}, {148,   1, 108}, { 35,  16,  25}, { 96, 155, 209}, {180,  54, 207}, {244, 159, 138}, {155,  41, 228}, {201,  18, 177}, { 76,  36, 158}, { 33,  70, 102}, { 21,  77, 181}, {237, 168, 153}, { 93,  69,  24}, { 31,  59, 252}, {230, 182,  80}, { 50, 151, 151}, { 44,  12, 135}, { 74, 141, 191}, {129,  70,  16}, {216,  45, 241}, {135,  23,  10}, { 70,   1,  43}, {117,   2, 217}, {144,  51, 133}, {239,  25,  70}, { 64,  40,  58}, { 49, 110, 211}, {180,  68,  72}, {125, 102,   9}, {169,  52,  91}, {109, 158, 239}, {123, 106,  24}, { 46,  37, 155}, {157,  27,  27}, { 65,  20,  83}, { 69,   7,  71}, { 19, 223, 232}, {134,  50, 128}, { 15,   8,  18}, {210, 210,  72}, {193,   1, 201}, {115,  82,  54}, {148,  86, 113}, {198, 172,  74}},
        {{208, 155, 154}, {227,  70, 249}, {154,  95,  12}, {211, 193,  64}, {113,  52, 168}, {175, 225, 241}, {215, 143, 166}, {205, 174, 213}, {195,  81,  70}, {193,   0, 173}, {246,  43,  41}, { 80,  46,  84}, { 87,  23,  43}, {253,  25,  94}, {156,  44, 118}, {158, 182, 192}, { 69, 133, 152}, { 76,  21, 141}, {135, 111, 104}, { 41,  51, 170}, { 49,  50,  90}, { 99,  48, 198}, { 32,   9, 102}, {218,  54, 147}, {159,  20,  71}, {175,  78, 174}, {177,  43, 239}, {236, 159,  18}, { 96,  90,  47}, {135, 135,  29}, {251, 239,  54}, {  3,  17,  35}, { 85, 102, 143}, { 85, 194, 202}, {221, 185, 116}, {215,  22, 134}, {117, 187, 187}, {  4,  26, 132}, {174, 109,  88}, { 97,  33,  70}, {132,  57, 239}, {249, 194, 204}, {165,   7, 146}, {186,  80, 120}, { 80, 127, 174}, {175, 166, 118}, {243, 238,  97}, {147, 112, 108}, {148, 105, 109}, { 92, 186, 214}, {125, 145, 147}, { 58,  70,  87}, { 51,  20,  56}, {152, 163, 225}, {230, 213, 247}, {243, 166, 153}, { 98,  46, 158}, {203, 128,  17}, {103,  57, 122}, { 78,  78,  82}, { 99,   5, 134}, {202,  63, 141}, { 56,  41,   8}, {114,  67, 123}, { 74, 235, 248}, {  4,  36, 171}, { 75, 198, 245}, {175,  48, 132}, {187,  10,   7}, {193,  17, 234}, {133,  29,  16}, { 90, 181, 214}, {252, 210, 204}, { 21,   5,   6}, {216,  15,  20}, {109, 134, 138}, {198,  61, 244}, {249, 102, 153}, {148,  81, 196}, { 98,  76,  80}, {249, 235,  53}, { 44, 161, 179}, { 46, 173, 241}, {218,  87, 216}, {121,   8,  85}, { 89, 124, 231}, {218,  99, 175}, { 50,   7,  46}},
        {{ 54,  95, 205}, {166,  50, 142}, { 38,   1,  14}, { 56,   9,  90}, { 65, 162, 171}, {161,  35,  63}, { 42,  12,   5}, {101,  32, 237}, { 32,  25,  18}, { 41,  79, 160}, { 50, 140, 161}, {156,  70, 212}, { 49, 122, 129}, {  8, 171, 234}, { 11,  24,  37}, { 85,  86, 132}, { 77,  91, 131}, {109,  97, 117}, {233, 120,  72}, {104,  51, 119}, {135, 169, 184}, { 52,  41,  48}, {216, 180, 102}, {149,  70, 252}, { 13,  63, 177}, {214,  34, 108}, { 96, 106, 126}, { 92, 142, 209}, {165,  79, 109}, {167, 139, 218}, { 44,  13, 178}, {244, 204, 246}, {219,  61, 121}, {117,  81, 139}, {200, 166, 188}, { 32,   3,  85}, { 24, 129, 184}, {254,  53, 232}, {164, 137, 103}, { 71,  54,   0}, { 53,  27,   5}, { 78,  71,  89}, {149, 179, 193}, { 88,  11,  87}, {231, 235, 240}, { 78,  98, 219}, { 72,  42,  65}, {152,  37, 223}, { 96,  69,  99}, {129,  82,  68}, {178,  18, 129}, {247, 218, 139}, {219, 139, 165}, {223, 142, 248}, {178,  31, 168}, {  1,   6,  94}, {228, 120, 221}, { 21,   8,  70}, {133, 145, 206}, { 65, 153, 213}, { 11,  15,  50}, { 46,  93, 201}, { 45, 106, 149}, { 63,  64, 116}, {246,  66,  87}, { 33,  21,  10}, {138,   1,  73}, { 35,  18,  21}, {209, 143, 136}, {209, 153,  49}, { 90,  80,  51}, {246,  82,  82}, { 54,  48, 147}, {144, 144, 136}, {214, 184,  51}, {120,  88,  83}, {132,  69, 115}, {216,  62, 241}, {136, 104, 134}, { 87,  49, 233}, {225, 224, 251}, { 75,   5,  26}, {213, 147, 132}, { 86,  33, 192}, {230, 137,  43}, { 22, 119, 125}, {137, 114,  24}, {145,   0,  47}},
        {{ 98,  69,  79}, {143, 159, 191}, {235, 115, 139}, {243, 150, 243}, { 61,  48, 144}, {175,  88,  86}, { 71,   2,  30}, { 38,  46, 162}, {131,   4, 167}, {225,  50, 106}, {171, 137, 221}, {218, 209, 151}, { 19,  52, 185}, {101, 125, 214}, {216, 130,  43}, {255,  10,  31}, { 36,  25, 205}, {200,  22, 240}, { 59,  51, 139}, {136,  90, 196}, {194,  93, 229}, {253, 209, 165}, { 49, 140, 204}, {252, 122, 150}, {124, 116, 192}, {192, 194, 209}, {184,  39, 205}, { 19, 139, 199}, { 17,  16, 223}, { 64, 139, 254}, {141,  93,  66}, { 83,  79,  39}, {224,  61, 219}, {183, 185, 239}, {241, 220, 112}, { 53, 202, 218}, {136,  71,  82}, {173, 160,   3}, {168, 119, 116}, {111,  64,  15}, { 63,  54,  40}, { 60,  29, 135}, {147,  32, 153}, {107, 103, 160}, {143,  42,  24}, { 29,  78, 240}, {130, 124, 221}, { 35,  41, 175}, {160,  84, 196}, {154, 113, 167}, {115, 165, 191}, {101,  40, 127}, {  3,  99, 114}, { 19, 147, 194}, {179, 151, 133}, {208, 203, 184}, {167, 105, 209}, {137, 104,   4}, { 97,  14, 164}, {  5,   3,  23}, {187,  58, 177}, {132,  65,  68}, { 56,  41,   1}, {195,  37,  90}, {230,  17,  94}, {202, 124,  37}, {213, 202, 117}, { 98,  88,  84}, { 56,  74, 154}, {208,  98,  95}, {193, 153,  79}, { 83,  72, 131}, {209,  47,  64}, {212, 160, 117}, {176, 110,  42}, { 87,  18,   9}, { 48,  81, 114}, { 23,  64, 129}, {249,  38, 104}, {183, 163, 124}, {154, 130, 114}, {198, 193, 158}, {  1,  34,  92}, {247, 119, 112}, { 18,  31,  83}, { 57,  17,  37}, { 89,  51, 192}, {125, 121, 140}},
        {{147, 114,  38}, {115,  91,  13}, {215, 174, 250}, {201,  55, 123}, { 68,  13, 153}, {204,  79, 110}, {216, 175, 105}, {195,  20,   1}, { 43,  67, 227}, {234, 207,  39}, { 95,  53,  92}, { 48,   6, 151}, {252, 130,  96}, {227, 110,   5}, {238,   9, 127}, { 34,  51, 225}, {218, 173, 226}, { 37,  56, 252}, {145,  97,  88}, {246,  69, 171}, {225, 105,  80}, { 82,  42,   5}, {253, 229,   0}, {127,  28,  77}, {  1, 173, 234}, {110, 136, 184}, {174, 160, 204}, { 96,  41, 148}, {151,  47, 114}, {166,  39,  62}, { 80,  36, 224}, {203,  36,  34}, { 93, 150, 199}, {231, 157, 132}, { 43, 141, 175}, {104,   6,  33}, {203, 159,  55}, {192,  48, 132}, { 19, 159, 182}, { 28,  55, 115}, {  1, 125, 142}, {109,  23, 251}, {230,  89, 120}, {211, 123, 198}, { 23,  27, 133}, {198, 178,  16}, { 88,  32, 105}, {124,  84, 148}, { 68,  49, 156}, {248,  12, 188}, {127,  12,  18}, {180,  94, 226}, { 16,  55,  81}, { 89,  92, 111}, {197, 119,  14}, { 91,  36,  68}, { 49,  31,  73}, { 41,  83, 103}, { 40,   6,  86}, {196, 130, 177}, {209,  42, 145}, { 79,  23, 171}, {233,  17,  71}, {230,  25, 154}, {166,  29,  51}, {156,  90,  30}, { 36,  25, 185}, {251, 165,  77}, { 24, 138, 188}, { 37, 107, 126}, { 81,  10,  15}, {214, 123,  74}, {  4,  14, 252}, {252,  84, 222}, {125,  64, 115}, {183,  48,  36}, {146,  30, 219}, { 74,  50,  18}, {225, 149,  71}, {233,  84, 132}, {184, 107,  36}, {152, 122,  12}, {236,  53,  56}, {203,  30, 177}, {  5,  12,  12}, {137,  96, 100}, {106,  18, 219}, { 41,  16, 118}},
        {{ 51,  15,  85}, {202, 161,  82}, {186,  34, 250}, { 94,   4,  23}, { 34,  18,   2}, { 57, 210, 228}, { 88,   2, 191}, { 26,  22,  65}, { 98,  24, 255}, { 68,  65,  23}, {198,  58, 239}, {  3,   2,  44}, {198, 187,  55}, {233,   9,  81}, { 10,  31,  95}, { 42, 136, 192}, { 40,  99, 136}, {165, 140,  36}, {185, 119, 119}, {241,  49, 109}, {185,  69, 222}, {243, 195,   1}, {108,  18,   8}, {100,  62,  81}, {195,  35,  58}, {128, 104,  65}, {189,  81, 159}, { 94,  86,  23}, { 53, 138, 248}, {161,  85, 219}, { 32,  68, 205}, {215,  59,  24}, { 69, 225, 239}, {176,  63,   4}, { 30,  68, 105}, {  8, 144, 162}, {  0,  11, 159}, {114, 150, 171}, {221,   0, 186}, {210, 172, 131}, {115,  19,  11}, {177,  38,  77}, {250, 112, 174}, {160, 177, 194}, {186,  20, 186}, {177,  92,  73}, {  2, 221, 236}, {135,  45, 125}, {234, 219, 160}, {145,  57, 142}, { 18, 119, 152}, {  8,  54, 130}, {204,  35,  84}, {235, 187,  75}, { 42,  36,  94}, {101,  75,  92}, { 22,  25, 124}, { 29,   8,  49}, {134,  89, 178}, { 52, 107, 121}, {  8,  97, 217}, {242, 209, 101}, {174, 171,  41}, {156, 154, 100}, {123, 173, 220}, {166,  81,  18}, {185, 133, 153}, { 34,  86, 252}, {231,   9,  44}, { 68,  14, 240}, {118,  62, 128}, { 82,  11, 254}, { 20,  84, 238}, {226, 122, 232}, {190, 180, 136}, {125,  45, 230}, { 47,  57, 158}, { 12,   2, 147}, { 38, 147, 157}, {175,  85, 173}, {165, 152, 124}, {157, 152, 174}, {  1, 125, 194}, {247, 139, 183}, {148,  30, 131}, {240, 184,   4}, {185, 195, 240}, { 41,  13,  12}},
        {{  0,  74,  93}, { 65,  42,  10}, {129, 154, 213}, { 21,  58, 152}, { 54,  14, 204}, {252,  25, 192}, {108,  88, 138}, { 97,  83, 167}, {238,  62, 235}, {  5,  64, 165}, {167, 242, 253}, {122,  69,  70}, { 80,  37, 203}, {231, 132, 242}, {100,  39, 114}, {158,  64,  33}, { 90,  53, 132}, {133,  44,  39}, { 31,  18,  20}, {235, 136,  32}, {155,  86, 131}, {250,   0, 148}, {189, 101, 108}, { 42,  60, 199}, { 72,  38, 186}, { 27,  92, 156}, { 13,  23, 119}, { 99,  82,  60}, {200,  95, 171}, {188,  43,  17}, {234,  76, 157}, {123, 104,  12}, {113, 170, 246}, {155,  50,  97}, {213, 124, 164}, {182,  95,  97}, {242,  38, 228}, {106, 144, 154}, { 56,  77, 223}, {244, 143,  61}, {252,  65, 138}, {138,  51,  13}, { 51, 112, 181}, { 53,  18,  89}, {167, 163, 122}, {107, 155, 253}, { 61,  76, 177}, {111,  32,  31}, {158,   0, 189}, {159,  17, 140}, {250,  84,  39}, { 44,  10,  71}, { 14,  12,  17}, {112,  95, 119}, { 94, 184, 188}, {201,  86, 154}, { 22,  69, 105}, { 41,  43, 190}, {195, 106, 235}, {255,  41,  16}, {123, 104, 210}, {252,  12, 221}, {117,  94,  87}, { 78, 159, 174}, {109,  48, 177}, { 14, 178, 229}, { 27,  89, 165}, { 43,  85, 114}, { 69, 130, 183}, {116,  68, 189}, {241, 191, 213}, { 44, 162, 209}, { 38, 148, 240}, {166,  64, 255}, { 68, 103, 104}, {191, 212, 222}, {240, 129, 131}, {235, 192,  58}, {210,  80, 233}, { 81,  12, 197}, {  4,  16, 207}, { 88,  90, 122}, { 33,  27,  47}, {152, 223, 244}, {181,  31,  29}, { 22,  15,  35}, {110,  61,  62}, {152, 155, 241}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}