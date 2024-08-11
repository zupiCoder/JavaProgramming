
import java.util.*;

public class Test29 {

    private static final int[][][] SLIKA = {
        {{245, 174,  44}, {208, 166, 124}, {182, 221, 163}, {227,  62, 242}, {192,  78,  86}, { 44,  41, 137}, {213, 207,  43}, {148, 145, 252}, {151,  30,  28}, {188, 113,  69}, { 22,  73, 131}, {200, 195, 157}, {116, 222, 115}, {159,  91, 185}, {202, 145,  79}, {158,  85, 252}, {  0,  73,  86}, { 21,   6, 145}, {223, 185, 120}, {189, 160, 109}, {107,  72, 147}, { 23, 209, 235}, {131, 215, 250}, { 68, 240, 172}, {148,  78, 240}, { 95,  54, 185}, {109,  40,  24}, { 66,  41,  94}, {145,  79,  76}, {155,  46, 188}, {216,  46,  63}, {106,  14, 174}, {122, 110,  21}, {245, 207, 204}, {115, 115, 119}, {222, 155, 167}, {101,  19,  78}, {211, 175, 176}, { 83, 207, 224}, {188, 177, 231}, {198,  15,  94}, {152, 171, 246}, { 91,  18,  58}, {163,  28, 236}, {173,  87,  17}, { 78,  74,  89}, {171, 135,  66}, { 57,  21,  87}, {248,  39, 213}, { 18,  57, 138}, { 90,  93, 130}, { 11,   4,  83}, {120,   0, 173}, { 40,  32,  27}, {255, 205, 182}, { 29,   8,  71}, { 11,  50, 148}, { 81, 121, 247}, { 32,  43, 100}, {148, 111,  48}, {183, 204, 248}, {112,  93,  40}, {197, 218, 134}, {184,  93, 126}, {198,  11, 209}, {227,  44, 220}, { 73,  82, 109}, {155,  21,  71}, {169,  44, 121}, {228, 227, 179}, { 92,  22, 173}, { 88,  73, 229}, { 81, 177, 214}, {139,  94,  72}, {183, 156,  81}, {199, 138, 137}, {232, 191, 225}, {229, 206,   9}, { 12,   6,   7}, {125,  73,  99}, {162, 185, 206}, { 63,  98, 216}, { 63,  13,  91}, {211, 203,  15}, { 32,  52, 139}, { 64,  64,  52}, { 72,  45, 146}, { 17,  28, 236}, { 91,  47,  27}, {250,   7, 197}, {146,  67, 179}, { 22,  26,  63}, { 42,  84,  90}, {  7,   8,  86}, { 46, 145, 164}, { 11, 150, 200}, {101,   7,  22}, {  4,  68, 105}, { 53,  36,  20}, { 25, 140, 233}, { 61,  43,   5}, {202, 143,  16}, { 92,  46, 133}, {193,  27, 234}, { 31,  14,  37}, { 33,  96, 115}, { 56,  68,  79}, {137,  42,  64}, { 88,  50, 111}, {154, 192,  44}, {172,  41, 135}},
        {{239,  38,  53}, { 11, 170,  43}, {114,  57,  60}, { 34,  23, 119}, {194,  86, 185}, {240, 120, 150}, { 65,  97, 248}, {252, 153,  11}, { 69, 207, 216}, {195,  56, 152}, { 44,  61, 205}, {123, 243, 240}, { 46,  83, 233}, {166, 145, 114}, { 33,  99, 111}, {132, 165,  51}, {224, 150,  17}, {233,  62, 244}, {249,  73, 119}, { 21, 132, 136}, {131, 210, 187}, {239,  82, 188}, {153,  18,   0}, {149, 125, 217}, { 74, 157, 122}, { 50,  68, 126}, {205,  49,  58}, {153,   7,  59}, {120,  83, 104}, {  2,   6,  12}, {  4, 122, 199}, { 76,  14, 149}, {  0, 219, 220}, {100, 148, 185}, {239, 138, 122}, {220,  27, 101}, {225, 220,  16}, {118,  54, 137}, {120, 142, 177}, {226, 133,  87}, {113,  91,  80}, {171,  59,  81}, {230,  87,  33}, { 36, 143, 207}, {221, 123, 127}, {180,  37, 122}, {215,  85, 132}, { 94,  24,  78}, {195,   7,  18}, { 19, 105, 166}, {245, 139, 153}, { 56,  56, 216}, {191, 216, 241}, {103,  59,  92}, {187, 195, 132}, {172, 124, 231}, {103,  97,  57}, { 86, 147, 229}, {212, 107,  91}, { 70, 157,  26}, {152, 123, 122}, { 61,  22,  66}, {180, 119, 117}, { 10,  33, 180}, {251,   1,  35}, {166, 129, 113}, {216,  62,  48}, {138, 203, 251}, {115, 112, 186}, {208, 133,  84}, { 94,  20,  79}, { 21,   2,  23}, { 82,  77,  52}, {236, 202,  45}, {183, 197, 248}, { 52,  54, 183}, {111,  13, 144}, { 30,  10,  31}, {137,  20, 196}, {180, 144,  72}, { 70,  60,  38}, {190, 145, 146}, { 65,  70, 191}, {100,   8,  29}, {136,  19,  11}, { 42,  43, 179}, { 77,  21,  97}, { 20,  57, 178}, {104, 132, 173}, {147,  81, 110}, { 22,   2,  26}, {135, 120, 113}, { 44,  31,  28}, { 41,  12, 156}, { 71, 220, 113}, { 69, 120, 124}, { 14,  30,  62}, {244,  87,  12}, {106,   0, 174}, {148,  50,  41}, { 44, 120, 135}, {133, 130,  46}, {110,  61,  87}, {218, 135, 220}, { 64,  49, 131}, {  4,  42,  71}, {187,  91, 114}, { 58,  13,  19}, { 14,  10, 241}, {213, 193,  47}, {192,  69,  20}},
        {{ 69,  10, 107}, { 46,  82, 209}, { 63, 124,  36}, { 95,  56, 139}, { 45,  99, 108}, {151,  85, 150}, {166,   7, 114}, { 38, 134, 149}, { 80,  26,  33}, {249,  46, 143}, {231, 189, 186}, {182,  44,   0}, {161,  27,  84}, {200,  34, 104}, {176, 157, 252}, {141,  19, 152}, { 52, 235,  33}, { 54,  29,  41}, { 94,  40,  79}, { 23,  20, 101}, {140,  56,  58}, {228,  55, 102}, {120,  58, 179}, {255,  77, 146}, { 45,  62, 208}, {167,  88,  86}, { 64,   9, 233}, {181,  77, 214}, {184, 184, 173}, { 99,  92,  55}, { 32,  50, 234}, {106, 118, 146}, { 30, 213,  54}, {130, 224, 228}, {236, 180,  13}, { 35,  61, 146}, { 27,  20, 238}, { 47,   3,  93}, {193,  99, 104}, {173,  44,  21}, {248, 214, 135}, {181, 134,  51}, { 88, 218, 132}, { 55,   4, 144}, {213,  49, 234}, {116,  36, 210}, {246, 129, 165}, {192, 120, 248}, {206,  39,  76}, {122,  44, 155}, {242,  27,  84}, {143, 148, 151}, { 16,   0,  94}, {141,  66, 158}, { 60, 156, 194}, {111,  23, 197}, {192, 247, 102}, {149,  55,  68}, { 12, 182, 229}, { 76, 222,  83}, {112, 253, 108}, { 58,   4, 145}, {187,  70,   4}, {118,  75, 103}, {143, 135, 162}, { 49, 207, 221}, {225,  84, 141}, {104, 104, 158}, { 52, 239, 225}, {186, 249, 177}, { 70, 118, 179}, {  6, 177, 214}, {196,  62, 148}, { 85,   7,   7}, {103,   4, 177}, {229, 102,  32}, {118,  66,  54}, {  4, 103,  65}, { 24,  10,  12}, {199,  13, 184}, {194, 102, 180}, { 65, 124, 121}, {119,  99,  60}, {240,  13, 162}, { 68, 104, 192}, { 51,  50,  38}, {124, 203, 151}, {136,  98,  60}, {240, 142,  16}, { 19,  66, 172}, {186, 122,  51}, {165, 163, 198}, {  3,  15,  26}, { 71,  84, 151}, {139,  93,  94}, {195, 106,  15}, {252,   1, 223}, { 45, 123, 228}, {237, 173, 198}, {121,  77, 170}, {205, 159,  35}, {224, 148, 235}, {181,  72, 175}, {122, 117, 139}, {  2,   0,   5}, { 40,  85, 132}, {221, 170,  43}, { 13,  35, 217}, { 86, 202,   4}, {161,  87,  19}, { 61,   1,  92}},
        {{213,  53, 219}, {185,  78, 131}, {200, 188, 187}, {214, 190, 230}, { 61,  16,  63}, {104, 125, 152}, {224, 171, 138}, { 66,  46,  62}, {106,  30,  63}, { 26, 115, 235}, {153, 236,  86}, {219, 254,  45}, { 32,  14,  45}, {255, 124, 202}, {251,  24, 227}, { 18,  29,  70}, {217, 106, 212}, {151,   1,  22}, {232,  56,   3}, { 82, 132,  90}, { 96, 112, 239}, {211,  95, 196}, {  0,  23,  91}, {251, 211, 141}, {146,  40,  23}, {156, 125, 159}, {180,  27, 172}, { 61,  95, 134}, {233, 116,  67}, {121,  27,  48}, {160,  53, 132}, {  7,  85, 134}, {234,  66, 205}, {201,  48, 113}, { 85, 219, 243}, { 63, 221, 242}, {107,  25, 156}, { 16,  37,  71}, {130, 190, 207}, {107,  25,  87}, { 13, 161, 164}, { 10, 194, 251}, { 39,  15, 112}, {222,   8,  97}, {166,  32, 122}, { 75, 135, 162}, { 42,   8,   5}, {184, 210,  41}, {235, 224,  17}, {222, 132,  41}, { 12,   7,  85}, {104, 146, 157}, { 61,  44, 110}, {  1, 211,  97}, { 89,  98, 208}, { 88,  19, 139}, { 58,  62,  97}, { 69,  20,  32}, { 60,  46, 113}, {120, 164, 222}, {120, 100, 242}, {139,   1,  72}, { 32, 162, 205}, { 47,  24, 121}, {105,  59, 113}, {224, 121, 139}, {135, 174, 183}, {195,  15, 139}, { 41,  41,  92}, { 29, 136, 138}, { 92, 189, 246}, { 66, 112,  84}, { 65, 135, 234}, { 14, 152, 106}, {207,  76, 148}, {250,  42,  45}, {182, 160,  15}, { 65,   8,   6}, { 93,  57, 122}, {180,  11, 107}, {198,  41, 163}, {118, 146, 111}, { 44,  53,  67}, { 17,  46, 191}, {134, 110, 178}, {240,  47, 149}, { 53,  36, 139}, {181,   7,  92}, { 35, 104, 232}, {188,  49,  68}, { 95,  88, 147}, {234, 237,  80}, { 22,  22,  64}, {188,  51, 167}, { 45,  29,  30}, {251, 205, 249}, {139,  70, 111}, {159, 128, 217}, {  1,  82, 124}, {116, 114, 201}, {243, 134, 108}, {129,  36,  76}, { 92,  17,  93}, {247,  45, 199}, {173,  21,  50}, {117,  44, 128}, {217, 144, 241}, {136, 135, 126}, {157,  66,   2}, {221, 108,  62}, { 24,  95, 216}},
        {{ 45,  45,  44}, {190,  46, 160}, { 26, 173, 239}, { 30, 114, 203}, {214, 158, 231}, {128,  95,  88}, { 70,  73, 174}, { 14,  10,  15}, {185,  22, 144}, { 75,  79, 122}, {138,  62,   6}, { 10,  63,  95}, {148, 176, 158}, { 32,  92, 168}, { 13, 127, 215}, {135,  68, 184}, { 94,  86,  52}, {233,  27, 107}, {205, 156, 192}, { 80,  28, 112}, {195, 180,  44}, {105,  95, 111}, { 95,  94,  45}, {208,  81, 227}, { 45,  39,   6}, {211,  63, 114}, {227,  75,  33}, {250,  81, 232}, {  3, 233, 235}, { 33, 157, 207}, { 45, 119, 134}, { 67,  87, 140}, { 74, 171, 244}, {151, 126, 133}, {  9,  35, 103}, {164, 199,  11}, {174,  97,  13}, {201, 109, 183}, {  4,  26,  96}, { 88,   4, 112}, { 69,  30, 189}, { 88,  54,  97}, {185, 156,   7}, {153,  23,  49}, { 40, 106, 234}, { 17,  16,  11}, { 68, 125, 102}, {191, 150,  13}, { 72,  60, 127}, { 80,  11,  75}, { 68, 114, 117}, { 23,  96, 144}, {154,  94, 232}, { 28, 187, 188}, { 52,  58, 179}, {244, 107, 228}, { 16,   7,  99}, {114, 123, 145}, {164, 100,  13}, {185,  37,  27}, { 43, 239, 249}, {172, 102, 164}, {200, 123,  35}, {114,  33,  39}, {163,  77,  73}, {200, 107, 237}, {137, 159, 216}, {241, 153, 208}, { 91,  72,  89}, {128,  28,  25}, {224, 127,  87}, {245,  51, 137}, { 65,  13, 221}, {162, 208, 252}, { 51, 130, 162}, { 59,  12, 239}, {186,  97,  73}, {231, 125, 188}, { 53,  52, 103}, {207,  85, 165}, { 30,  21,  14}, {223, 251, 129}, {231, 116,  86}, { 49,  32,  75}, { 43, 120, 195}, {159,  44,  25}, {  0, 148, 246}, {127,  42,  69}, {186,   5, 192}, {151,  96, 177}, {136,  22, 171}, {240, 100,  33}, {163, 153, 133}, {178,  26, 218}, {223, 223, 107}, {170, 158, 235}, { 25,  32,  71}, { 74,   4, 114}, { 82, 213, 248}, {129,  57, 103}, {226, 111, 126}, {240,   6,  22}, { 21,   6,  55}, { 23, 201, 107}, {199, 150, 201}, {141, 156,  84}, {149, 175, 210}, { 61,  59,  74}, { 69, 157,  36}, {230, 102, 149}, { 98, 143, 179}},
        {{ 29,   0, 157}, {237,  68, 179}, { 59,   0, 208}, { 61,  15,  90}, {249, 247,  29}, {215,  95, 188}, { 31,  74, 100}, { 46, 184,  50}, {  7, 219,  36}, { 56,  42, 129}, {118,  74,  11}, {149, 100,  18}, {182, 146,  43}, {114,  59,  65}, { 74, 242,  75}, { 57, 147, 159}, {121,  74, 139}, {  1,   7,  73}, { 14,  75, 169}, { 79, 240, 143}, {201, 217, 148}, {148,  13,  54}, {214, 150,   8}, {210,  78, 103}, {229, 145, 112}, {200, 145, 136}, {182, 177,   5}, {191, 101, 110}, { 99, 180, 232}, {112,  62,  34}, {126, 121, 119}, { 50,  86, 162}, {196,  85, 131}, {182, 178, 220}, { 34, 220, 224}, {148,  96, 141}, {165,  49,  70}, { 10,  34,  45}, {104,  26,  42}, {180,  73, 248}, {225, 120, 103}, { 98,  38, 169}, {230,  49,   7}, { 78,   2, 121}, {194, 212, 213}, {155,  70,  80}, { 79, 138, 209}, {225, 145,  47}, { 19,  65,  59}, {100,  79, 238}, {  0, 110, 186}, { 65,  73, 197}, {135, 107, 247}, {131,  35,  33}, { 24, 182, 242}, {146,  40,  16}, { 16, 171, 184}, {  9,  10, 157}, {202,  67, 137}, { 86, 134, 139}, {155,  62, 103}, {199,  40, 179}, { 88, 243,  51}, {113, 219,  34}, {167,  85, 204}, { 73,  12,  40}, { 76, 164,  78}, {  5,  25,  34}, {249,  33, 245}, { 13,  76, 115}, { 11,  66, 235}, { 34, 169, 238}, {217,  17,  73}, { 14, 117, 122}, {166,  88, 140}, {  4,  45,  82}, { 40,  47, 175}, {120,  19, 102}, { 98, 163,  38}, {227, 194, 202}, { 94, 174, 238}, {118, 117,  71}, {  4,  16,  39}, {160, 124, 246}, { 77, 115, 179}, { 21,  38,  39}, { 63,  75,  79}, {180,  29,  33}, {114, 147,  43}, {105,  80,  78}, {116,  72, 104}, {238, 139, 137}, {187,  85,  68}, {218, 228, 215}, {161, 143, 186}, {204, 201, 214}, {222,  84, 162}, {  1,   3,  80}, { 67,  11,  44}, {146,  97, 115}, {178,  54,  98}, {198,  67,  90}, { 94,  36,   7}, { 81,  83, 235}, { 74,  98, 161}, {193,  73, 120}, { 89,  73,  27}, {100,  34, 141}, { 54,  35, 109}, { 10, 158, 166}, {145,  20,   3}},
        {{ 75, 104, 198}, { 74, 247,  51}, {169, 161,  76}, { 97,  27,  77}, {142, 164, 243}, {162, 135,  65}, {153, 220,  80}, {183,  70, 224}, { 29,  16,  55}, { 61,  87,  45}, {242,  55, 114}, {181, 165, 245}, {140,  16, 162}, {169, 235, 146}, { 20,  20, 169}, {112,   5, 120}, {  1, 162,  39}, { 61, 113, 113}, {105,  71,  51}, { 28,  41, 234}, { 70,  78,  81}, {  9, 116, 255}, {241,  75, 197}, {213, 127, 202}, { 78,  10,  82}, { 17,  23,  63}, {249,  23, 111}, {136, 115, 234}, { 14, 114,  75}, { 15,  59, 226}, {173, 162,  97}, { 48,   7,  20}, {154, 130,  87}, { 49,  45, 201}, {229, 227,  35}, {140,  43,  73}, {110,  63, 181}, {220, 115,  52}, {223,  91,  44}, { 98, 123, 169}, { 61, 122,  90}, {228,  73,  38}, {149,  58, 145}, {198, 149, 238}, {106, 118,  61}, {157, 137, 203}, {241, 147, 207}, {216, 141, 194}, { 72,   1,  59}, {  2,  41,  47}, { 79,  95, 232}, {170, 134,  83}, { 94,  37,  71}, { 61, 152, 157}, { 42,  91, 115}, { 14,   1,  91}, {255,  51, 189}, { 65, 152, 203}, { 58, 155, 174}, {236, 114,  43}, {120,  12, 102}, { 45, 113, 232}, { 82,   9,  25}, {160,  50, 230}, { 23,  16,  32}, {180, 134, 134}, {169,  63, 169}, {234,  37, 190}, {128,  77, 174}, {  6, 221,   0}, { 41,  59, 198}, {244, 240,   5}, {216, 149, 175}, { 89,  78, 124}, {141,  97, 231}, {167, 106, 177}, {223,  60,  32}, {109, 183, 198}, { 18,  22,  68}, {151, 145, 145}, {  4,  11, 208}, {174, 212, 188}, { 98, 117, 171}, {196, 103, 112}, {237,  57,  37}, {205,  59,  93}, {121,  39,  85}, { 89, 208, 210}, { 79, 243, 247}, {106, 244, 255}, { 84, 112, 238}, { 61, 106, 194}, {228, 137,  45}, {216, 209,  71}, { 70,   3,  37}, {181, 163, 114}, { 47,   0, 109}, {160, 201,  74}, { 29,  48, 103}, {203,  35,  41}, {  9,   4, 190}, {211, 126, 203}, {246, 193, 248}, {247, 179,  72}, {133, 161, 234}, { 20,  50, 199}, {200, 200,  88}, { 62,  87,  95}, {163,  83, 197}, { 29,  78,  46}, {239, 125, 213}},
        {{ 78,  83, 241}, {214, 138,  67}, {187,  46,  31}, {212,  56, 139}, { 67,  68, 193}, {108, 103,  68}, {131, 115, 215}, {215, 202, 146}, { 55,  13,  57}, { 54, 151, 205}, { 10,   6, 250}, { 60,  40,  81}, { 75,  63, 140}, {185, 110, 186}, {194,  79, 115}, { 21,  61, 100}, {190, 163,  67}, { 64,  35,  58}, {110,  70, 214}, {152, 126,  27}, {166, 120, 231}, { 86,  75,  34}, {238, 159, 169}, { 99,   5,  54}, { 87,  19,  33}, { 78,  60, 175}, { 51,  99, 174}, {212,  47,  83}, {209,  86, 123}, {135, 247,  98}, {243, 235, 234}, {171,  86,  33}, {124, 113,  76}, {252,  19, 137}, { 90,  70,  57}, {204, 108, 223}, {165,  54,  81}, {229, 224, 113}, {155,  35, 183}, {102,  53, 233}, {199,  60, 182}, {164, 115, 202}, {141, 106, 199}, { 11,  18, 203}, {221, 110,  46}, {127,  98,  96}, {186,   9, 131}, {104, 111, 213}, {224, 157, 205}, {137, 122, 196}, {  4, 111, 185}, {153,  53,  69}, {115,  74,  62}, {172,  55,  46}, {109, 149, 226}, {  3,  55,  68}, {193,  83, 167}, { 10,  16, 130}, { 74,  30, 158}, {112, 110,  79}, { 11,  63,  88}, {232, 171,  89}, {195, 172, 176}, {233,  39, 135}, {225, 110, 193}, {176, 158, 255}, {  5,  23, 194}, {173, 132, 118}, {104,  75,  19}, { 75,  93, 111}, {175,   5,   0}, {129, 189,  70}, {229, 134, 253}, { 12,   0,   4}, {139, 103,  58}, {233, 165, 193}, {152, 102,  13}, { 54,   8, 100}, {232,  46, 119}, {215,  46,  86}, {  2,  14, 116}, { 23, 105, 115}, {  6,   1,  29}, {183,  87, 192}, {230, 229, 242}, {141,  84, 141}, {148,  87, 112}, {253,  91, 141}, { 13, 198, 249}, { 25, 188, 126}, { 84, 147, 171}, {237, 237,  36}, {176,  99, 113}, {153,   8,  51}, { 26, 112, 139}, { 29, 137, 228}, {123,  60,  76}, { 11,   1,  63}, {111, 155, 218}, {231, 120, 203}, { 97, 173, 156}, { 17, 144,   6}, { 26,  86, 214}, { 81, 138, 224}, { 89,  17, 180}, { 99,  42,  86}, { 45,  61, 151}, {113,  49, 124}, {  3,  19, 112}, {243, 220,  84}, {245,  38, 189}},
        {{ 37,  73, 103}, {  8,  18, 223}, {232, 141,  92}, {218, 253,   9}, { 49, 155, 164}, { 51,  26,  18}, {129,  67, 136}, {156,  97,  80}, { 41,  40,  56}, {131, 221,  22}, {159,  71,  22}, {169, 220,  34}, { 57,  89, 100}, { 52, 100, 102}, {241,  42, 234}, {146,  31,  40}, {204, 141,  30}, { 41,  30,  23}, { 70, 185,  44}, {250, 140, 191}, { 86,  62,  25}, { 61,  53,  34}, {239, 237, 202}, { 99, 244, 139}, {185,  82, 243}, {105, 191, 254}, { 83, 101, 188}, {236, 233,  15}, {252,  51, 239}, {179,  83,  14}, {251, 128, 181}, { 53,  83, 170}, {235, 103, 206}, {219, 137, 129}, { 78, 125,  61}, {139,  49, 173}, {123,  24,  99}, { 37,  18,  23}, {129,  58,  29}, { 75, 212, 103}, { 42, 117, 158}, {158, 160, 175}, {120, 208, 196}, {207,  73, 180}, {184, 138,  37}, { 78,  31,  29}, { 67, 137, 167}, {197,   0, 199}, { 36,   8, 119}, { 12,  41,  19}, {246, 107,  98}, { 97, 117, 252}, { 50, 127, 239}, { 59,  48,  56}, { 25,  28,  32}, { 76,  54, 246}, {167,  40,  13}, {112, 113, 166}, {161, 125,  12}, {176,  31, 203}, { 51, 116, 167}, {111,  49, 202}, { 65,  45,  10}, {223,  27,  12}, {102,  28,   8}, {138, 123, 251}, {158,  68,  59}, {242, 201, 134}, { 61,  49,  22}, {215,  49, 172}, {212,   5,  54}, {  1,  96, 105}, { 88,   6, 173}, { 76, 201,  20}, {226,   3, 226}, {119,  41, 107}, { 34,  75, 151}, {137, 100, 108}, { 95,  44,   7}, { 98, 216,  47}, {249, 150, 194}, { 80, 247, 164}, { 92, 178, 168}, {135, 112, 111}, {157, 145,  45}, {224, 252, 205}, {199,  42, 206}, {131, 240,  88}, {111, 136, 217}, {180,  29, 152}, {109,  87,  41}, {101, 234, 249}, {201, 144, 201}, {129, 255, 238}, { 36, 141, 200}, {201, 178, 197}, {165,  61, 248}, {147, 117, 180}, { 16,  11,  19}, { 28,  84, 191}, {195,   6,  91}, { 55,   8,  53}, {111, 102, 151}, {249, 204,  61}, {236,  54,  65}, { 79, 145, 149}, {178, 125,   4}, {231,  95,  86}, {222, 221, 177}, {114, 108, 102}, { 13, 215, 239}},
        {{140, 158, 107}, { 59,  37, 193}, {135, 125, 171}, {199,  43,  37}, {118,   7, 127}, {222,  83,  76}, { 85,  70,  13}, {175,  23, 213}, { 32,  45, 159}, { 31,  15,  21}, {212, 132, 170}, { 38,  23, 234}, {227,  20, 171}, {170,   2, 117}, {  3,  50, 211}, { 87,   0,  85}, {121, 129, 147}, {137, 210, 212}, {  9,   7, 188}, { 81,  78,  64}, { 41,  37, 207}, {124,   2,  86}, { 42,  96, 140}, {240, 221, 254}, {231, 152, 150}, {200,  12, 140}, {113, 103,  22}, {238,   6, 175}, {188, 168,  94}, {178,   7, 166}, { 62, 254, 206}, {190,   6,  40}, {238,  10, 131}, {175, 243,  75}, {215,  17, 250}, { 46,  17, 254}, { 27,  27,   8}, { 79, 144, 242}, { 18, 113, 157}, {251,  57,  40}, {108,  81, 170}, {  8,  10,  77}, {213,  62, 159}, {208,  90, 189}, { 88,   8, 202}, {102,  56,  95}, {245, 152, 208}, { 41,   5,  15}, {184,  83, 222}, { 78, 102, 221}, {252, 191, 187}, { 55,  52, 156}, {217, 192,   7}, { 72,  51,  27}, { 16, 202, 236}, { 20,  33,  64}, {175,  38,   5}, {109,  85, 139}, {104, 238, 227}, {129,  69, 122}, {247,  72, 197}, {238, 147, 217}, {132, 237,  10}, { 70,  13,  60}, { 15,   0, 182}, {218,  92, 136}, {  5,  48,  80}, { 79, 229, 116}, { 63,  85, 141}, {112, 117, 111}, {204,  79,  20}, {243,  47, 196}, {152,  72,  27}, { 43,  25,  26}, { 62,   4, 129}, { 21,  97, 184}, { 20,  30, 155}, { 84,  22, 189}, {109,   5, 133}, { 27,  61, 136}, {152, 114,  36}, {  6, 232,  28}, {195, 152, 150}, {152,  47, 198}, {163,  44, 193}, { 61, 163, 254}, {124,  32,  10}, { 15, 235,  40}, {225, 180, 103}, { 61,  68, 192}, { 45, 170,  26}, {226,   6, 253}, {213, 169, 139}, { 55, 224,  12}, {103,  71,  83}, {132,  36,  33}, { 30, 117, 237}, {  4,   4, 205}, { 33,  31, 173}, {152,   1, 227}, {109, 115, 118}, { 30, 107, 118}, {178,  32, 233}, {195, 191, 161}, { 38, 183, 216}, {148,  70, 177}, {153, 240,  65}, {234,  75,  44}, {146,  60,  39}, {  5, 232,  75}, { 80,  26, 110}},
        {{ 96, 186, 151}, {138, 162, 245}, {125,  70, 157}, { 69, 138, 165}, { 35,  58,  81}, { 10, 246, 226}, { 72,  76, 237}, {252, 222, 149}, {247, 188,   6}, {  8,  10,  22}, {120,  57, 187}, { 80, 203, 212}, { 86,  12,  46}, {236,  35,  43}, {167, 195, 215}, {121, 115, 160}, {104, 160, 210}, {  4,  96, 187}, { 65,  38, 153}, { 44,  65,  82}, {186,  41, 186}, {238, 169, 230}, {  5, 139, 150}, {138,  57, 169}, { 13,  28, 153}, { 85,  67,  36}, {166,  83, 238}, {123,  89, 106}, {122, 233, 116}, { 18, 156, 236}, {104, 234, 109}, {170,  60,  77}, { 45,  12,  44}, {250, 203,  29}, { 58,   9,  39}, {196, 234, 136}, {191,  46, 128}, { 69,  24, 250}, {156,  68, 161}, { 87,  35,  51}, {229,  18, 101}, {170, 160, 223}, {107,  70, 162}, {229, 211,  53}, {226,  48,  33}, { 10,  51,  52}, {213,  44, 149}, {208,  69, 214}, {167,  47, 233}, {232,  66,  34}, {211,  59,  49}, {225, 242, 237}, { 20, 227, 136}, {201, 117,  44}, {201, 119,  29}, { 93, 217, 127}, { 12,   8,  15}, {158, 140, 165}, {227,  82, 118}, {219, 218, 231}, { 25,  75, 107}, {222,  46, 131}, {205,  74,  98}, { 24,  66, 111}, {255,  50, 148}, {123,  27, 194}, {143,  90, 133}, {159, 124, 240}, {252, 149, 200}, {222, 186, 101}, { 64, 192, 147}, { 54,   8,  68}, { 61,  36,  39}, { 55,  39,  16}, {255, 180,  84}, { 96,  18, 116}, {185,  42, 160}, { 79,  44, 154}, {148,  93,  47}, {109, 190, 219}, {254,  53, 133}, {159,  72, 239}, {106, 183, 162}, { 86,  43,  20}, {105, 124,   7}, {157,  61, 209}, {180, 158, 117}, {  2, 128, 131}, {164,  71,  52}, {139, 110,  37}, {217,  70, 200}, {180, 150, 120}, {218, 210, 181}, { 15,  33,  40}, { 41, 179, 219}, {184, 157,  39}, {179, 140, 199}, {118, 131, 209}, {193, 198, 226}, { 69,  59,  83}, {102,   3,  17}, { 30,  13, 162}, {143,  78, 144}, {125, 182, 195}, { 80,   9,  20}, {170, 136,  88}, {226,  64, 140}, {108, 177, 160}, { 21,  81,  94}, {140,  48,  25}, { 54,  11, 190}},
        {{226,  66, 144}, { 82, 124, 152}, { 80,  41,  59}, {202, 241, 193}, { 11,  47,  58}, { 85, 118, 136}, { 48,  79, 109}, { 71,  17,  26}, { 89,  19, 221}, { 32,  36, 247}, { 38, 240, 241}, {173, 167,  38}, { 67,  92,  26}, {240, 184, 125}, {236, 244, 127}, { 78,  27,  93}, { 23,   2,  53}, {208,  33, 122}, {141, 233, 188}, {241,  42, 147}, { 57, 155,  98}, {201, 128,  82}, {160, 135, 106}, { 80,  32, 150}, {109, 195, 147}, {233, 145, 210}, { 34,  49, 150}, {191, 174, 171}, { 72, 119, 101}, {105,   5,  83}, {154, 130, 128}, {115,  66,  93}, {248, 185, 108}, { 30, 179, 218}, {243, 200,  85}, {148, 148, 157}, {216,  93,  13}, {172, 114,  77}, { 33,   5,  77}, {  1,  15, 225}, {215,  56, 149}, {238, 122, 241}, { 62,  29,  79}, { 67,  89, 182}, {190, 179, 204}, { 16, 167, 114}, {184,  41, 175}, {148, 111, 228}, {203, 180,  53}, {127,  12,  40}, {169,  36,  60}, { 42, 142, 227}, { 89, 201, 152}, { 65, 219, 112}, {126,  57, 108}, { 80,   7, 148}, {114, 183, 233}, { 99, 181, 200}, {215, 195, 131}, {147, 197,  42}, {113,  82,  85}, {255, 169, 216}, { 87,  32,  65}, {  8, 220, 124}, { 37,  75, 174}, {232,  57, 211}, { 42, 106,  39}, { 32,  24,  43}, {171,   3,  12}, { 39,   4,  78}, {107, 241, 255}, {169, 166, 215}, { 74,  15,  92}, {144,  81,  85}, { 76,  23,  71}, { 90, 191, 161}, { 24, 156,  74}, {194, 207, 226}, { 67,  59,  19}, {179, 206,  71}, {  7,  85, 212}, { 46,  10, 142}, {233,  65,  84}, {111, 147, 156}, { 43, 122,  88}, {171,  27, 115}, { 26, 156, 229}, {236, 210, 226}, { 30,  27,  72}, {199, 251,  63}, {190, 132, 196}, {237, 101, 206}, { 45,  22,  24}, {136,  29,  33}, { 27, 147, 215}, { 94, 201,  37}, {125,  76, 244}, {231,  80, 186}, { 87,  64, 104}, {193,   1,  39}, { 42,  83, 174}, { 60,  32,   8}, { 47,  30,  29}, {204,  49, 223}, {244, 143,  52}, { 82,  37,  56}, { 76,  37,  31}, {220, 183, 141}, {197,  99,  84}, { 38,  51, 250}, {  1,  67, 207}},
        {{204, 104, 199}, {  6,   1, 107}, {223, 157, 159}, { 89,  77, 120}, {222,  54, 119}, { 17, 199, 255}, {163,  27, 139}, { 71,  68,  96}, {164, 111,  23}, {104, 153, 182}, { 90, 141, 160}, {138, 143, 156}, {164, 223,  66}, {135,  31,  42}, {238, 151, 239}, { 25, 137, 234}, {110,  92,  57}, { 47,  27, 133}, {152, 158, 114}, {136,  60, 105}, {100,   3, 112}, {180, 130,  25}, { 47, 207, 223}, {236,  92, 222}, { 29,  64, 247}, {  5,  71,  96}, { 59,  42,  96}, {226, 212,  98}, { 55, 179, 182}, { 19, 157, 128}, {107,  98,  54}, { 55, 227, 107}, {183, 218, 157}, {141,  78, 158}, {105, 113, 148}, { 68,  77,  78}, { 19,  72, 148}, { 45,  84,  88}, {158,  54, 213}, { 10,  41,  91}, {184, 142,  86}, {138, 149, 160}, { 13,  98, 195}, { 95,   5, 121}, {226, 153,  29}, { 98, 253,  96}, { 22, 132, 196}, {133,  75, 195}, { 77, 134, 141}, {181, 168, 175}, {138,  60, 108}, {219, 182, 177}, { 58,   0,  92}, {234,  42, 144}, { 82,  77,   0}, {234, 129, 125}, { 42,   8,  35}, {242, 173, 242}, {164, 131, 188}, { 72,  78, 124}, { 75, 173, 206}, {212, 105, 163}, {213, 132,  53}, {203,  45, 192}, {177,  14,  15}, {124,  54,  56}, {100,  58,   2}, { 30, 214,  92}, {210, 123, 127}, { 82,  74,   7}, {129, 122,  56}, { 52,  14,  60}, { 42,  69, 163}, {228, 107,  91}, { 50,  30,  52}, { 72,  90, 102}, {130,  73, 138}, {206,  86, 192}, { 19,  12,  30}, { 83, 134, 221}, {166, 184, 246}, {107, 149, 121}, { 43, 119, 227}, { 40,  28,  38}, {112,  80, 170}, {116, 119,  59}, { 85, 205, 223}, { 44, 166,  96}, { 50, 141, 155}, {254, 191, 141}, {237,  64,   0}, {123,  56,  14}, {139,  84,   9}, {231, 151, 228}, {177,  28,  31}, { 25,  36, 173}, {173,  58, 136}, {151,  51, 170}, {215, 147, 127}, {211,  80,  45}, {110, 134, 152}, { 48,  13,  28}, {198,  33,  95}, { 30,  22,  62}, {209,  33,  96}, { 24,  18, 112}, { 27,  30,  43}, { 45, 105, 172}, {123,  49,   8}, {247, 146,  25}, {205, 197, 146}},
        {{241, 117, 170}, { 53, 163, 206}, {196,  14,  79}, {185, 210, 221}, { 50,  25, 178}, {191, 210, 126}, {138,   7, 106}, {157,  93, 187}, {219,  99,  23}, { 77,  18, 187}, {110,  83, 161}, {  1,  84, 154}, { 34,  45, 156}, {118,  99, 130}, { 59, 202, 238}, {209,  83, 248}, { 47,  54,  63}, { 22,  85, 240}, {231,  20, 224}, { 96,  69, 153}, {213, 165,  22}, {184, 237, 171}, {251, 183, 134}, { 93,  78,  98}, {139,  56,  13}, {111, 224, 240}, {149,   6, 250}, { 50,  33,   4}, {196, 131,  97}, { 40,  18,  35}, {114, 154,  51}, { 75,   8,   1}, { 25,  47,  54}, {156, 186, 218}, { 88,   2, 157}, {110,  46,  57}, {107,  10,  33}, {112,  84, 100}, {115,  54,  41}, {163,  19,  94}, {232,  88, 207}, { 74,  78, 182}, { 59,  40, 151}, {166, 115,  78}, { 44,  35,  79}, { 33,  31,   2}, { 31,  58,  94}, {155,  84, 153}, {125,   4, 167}, {213, 140, 155}, { 46,  12, 104}, {198, 148, 117}, {  3,  56, 172}, {122, 202,  31}, { 55,  58, 146}, { 46,  55, 145}, { 40,  86, 121}, {124,  69,  56}, {138,  96, 214}, { 48,  13, 124}, {170,  61, 179}, { 77,  68,  36}, {208,  11, 170}, { 47, 112, 151}, { 29, 137, 250}, {102,  90,  15}, { 49, 235, 231}, {242,  90, 191}, {180, 168, 128}, { 98, 107, 137}, {200, 102,  22}, {160, 255, 117}, {139,  69,  57}, { 97,   0,  27}, { 77,   7,  26}, {174, 131, 114}, { 47, 138, 254}, { 62,  47, 189}, {222, 136, 201}, {155,  26, 202}, {  7,   6,  22}, {224, 245,  72}, {177,  39,  49}, {225, 112, 236}, { 51,  21, 131}, {251, 108, 209}, { 28,   9,  91}, {181, 153, 245}, {183, 186, 248}, { 77,  54, 170}, {157,  31,  82}, {231, 221,  73}, { 54,  39,  70}, {146, 105, 140}, { 32,  32,  32}, { 54,  99, 219}, { 43, 181, 187}, { 34,  17,  80}, { 33, 108, 202}, { 76,  85, 196}, { 74,  29,  62}, {122,  26,  56}, {109,  61,  87}, {206, 108,  76}, { 44, 213, 225}, { 90, 113, 214}, {106, 166, 202}, { 78, 201, 247}, {155,  98, 128}, {212,   4, 239}, {212,  88,   8}},
        {{ 34,  43,  65}, {234, 139,  98}, {214,  98,  92}, {245,  97, 195}, { 57, 105, 154}, {221, 125, 192}, {161,  92,  73}, { 83,  85, 102}, {223,  20, 198}, { 75, 155,  37}, { 90,  72,  53}, {231,   8, 145}, {115,  21,  64}, {142, 203, 223}, { 21,  70,  89}, { 52,  69,  28}, {238,  77, 182}, {188,  30,  19}, {112,  32,  89}, { 11,   2,  70}, {162, 112, 132}, {117,  58,  32}, {159, 160, 253}, { 30, 192,  87}, { 23, 118,  61}, {206,  18,  68}, { 37, 124, 202}, {156,  11, 133}, { 91,  30,  39}, {208,  74, 138}, { 55, 116, 240}, {102, 169, 216}, { 42, 164, 175}, {228, 170, 116}, {195,  95, 145}, { 83, 109, 117}, {178, 172, 164}, {139, 108,  37}, {145,  83, 163}, {200, 114, 153}, { 52,  45, 130}, {201, 106, 202}, { 63,  78, 118}, {128,  89,  46}, { 10,  72, 176}, { 58, 158, 213}, { 20, 139, 152}, { 48, 126, 139}, {217, 179, 118}, {137, 133, 183}, { 45,  58,  85}, { 41,  63, 102}, {124, 215, 237}, {225, 152, 249}, { 95, 127, 234}, { 42,  64, 148}, {187,  19, 179}, {182,  11,  34}, { 51, 132, 149}, {  1,  57,  33}, {186,  96, 224}, {109,  29, 121}, { 56,  61,   3}, {194, 101,  34}, { 92,  28,   6}, {231,  91,  76}, {205, 166, 241}, { 63,  42, 193}, { 66, 235, 153}, {177, 110, 171}, { 81,  69,  86}, {238,  83, 135}, {253, 135, 157}, {113, 207, 148}, { 98,  76, 112}, { 76, 131, 143}, {103,  51, 240}, { 82,  46, 155}, { 24, 146, 231}, { 13,  93,  95}, { 66,  79, 129}, {163, 129, 130}, { 81,  14,  97}, {132,   1, 236}, {217, 193,  59}, {250, 151,   9}, { 81,  86, 156}, {159, 113,  89}, {215,  64, 185}, { 17,  41,  58}, {  9, 219, 215}, { 57,  10,  51}, {239,  74,   3}, {199, 138, 136}, { 38,   9,  36}, {242, 154,  17}, { 65,  60, 137}, {144,  92, 120}, {180,  54,  55}, {138,  91,  57}, {172,  35, 239}, {225,  13,  40}, {153, 169,  67}, {133,  57, 188}, {255,  74, 239}, { 78, 209, 252}, {138,  22,  13}, {186, 182, 125}, { 92, 135, 210}, {236, 133,   7}, { 20,  41, 120}},
        {{160, 163, 170}, { 94, 108, 140}, { 66,  24,  33}, { 65, 171,  63}, { 46,  45,  52}, {  2,  76,  80}, {188, 104,  51}, {  3,  48,  79}, {206, 146,  18}, { 46, 162, 255}, {136,  84,  55}, { 71,  85, 213}, {220,  77,  60}, {188,  39, 204}, {  5, 148, 219}, { 83, 175, 137}, { 45,  12,  79}, {185,  35, 137}, {210, 179,  98}, {197, 147, 123}, { 29, 110, 152}, {144,  92,  23}, {167,  17,  98}, { 23, 214, 136}, { 68, 196, 151}, {162, 124, 165}, {127,  38,  98}, {226, 182,  76}, {129,  29,  66}, { 99,  36,  89}, {220, 149,  81}, { 78,  96, 211}, { 12,  34,  43}, { 96,   6,  51}, {114, 156, 226}, {191, 163, 168}, {193,  60, 198}, {138,  96, 180}, {192,  89, 129}, {140, 117, 139}, {227, 233, 198}, {253, 112, 195}, { 14,   3,   0}, {239, 109,  53}, {238,  79,  98}, {118,  34,  61}, { 81,  61,  82}, { 48,   1,  13}, {242,  14,   0}, { 59,  85, 127}, {  7,  11, 150}, { 79,  63, 197}, { 30, 172, 133}, { 46,  63,  92}, {188,  97, 100}, {107,  42, 237}, {143,  78,  77}, { 90,  32,  64}, {237, 218, 179}, {  0,  37, 146}, { 38,  31,   4}, {103,  88, 175}, {163, 224, 234}, {172,  55,  83}, { 87, 103, 169}, { 74,   7,   6}, {194, 173, 143}, { 24,   4, 184}, { 28,  97, 239}, { 20,  22,  45}, { 28, 160,  26}, {192,   8, 197}, {172,  56, 185}, {132, 107, 111}, {166,  91,  74}, { 99,  13,  63}, {217, 224,  19}, {173, 193, 215}, {162,  83, 242}, {206, 140, 209}, {106,  97, 115}, {123, 181, 110}, { 56,  16, 141}, {187, 175, 125}, { 30,  57,  61}, { 73,  86,  83}, { 41,  30,  86}, {113,  31, 108}, {251,  18, 117}, { 83,  38,   6}, { 92, 169,  70}, {223,  85, 144}, { 85,  34,  46}, { 91,  71,  88}, {182, 169, 197}, {153, 112, 116}, {153,  15, 198}, {148, 123, 177}, {209, 176,  75}, { 69,  55,  68}, {195,  45, 201}, { 33,  82, 164}, { 19,  77, 187}, {222,  93, 104}, {158,  40, 106}, {181,  90, 193}, { 89,  84,  74}, {242, 137, 128}, { 21,  82, 178}, { 79,  25, 211}, {217,  59, 122}},
        {{111,  37,   9}, {105,  76,  19}, {130,  86, 158}, { 80, 243, 170}, {  9,  40,  46}, {160, 186,  62}, {241, 163,   4}, {253, 119, 101}, { 62,  53,  68}, { 34, 162,  98}, { 18,  31, 114}, { 99, 108, 153}, {104, 182, 185}, {130,  34, 146}, { 30,  69, 122}, {187, 184, 234}, {235, 228, 208}, {162, 250, 253}, {190, 143, 130}, {221,  98,  99}, {123, 142, 254}, { 71,  86, 209}, {135,  27, 162}, { 89, 129, 212}, { 76,  76,  92}, {235,  11, 214}, {  2,  78, 101}, { 33,  57,  57}, { 81,  48,  38}, {117,  52,  45}, { 43,  54, 100}, {190, 124,  69}, {187, 133,  23}, {172, 211, 227}, { 21,  22,  44}, { 10,  97, 220}, {232, 139,  47}, {108, 202, 236}, { 87,  45,  72}, {145,   1,  37}, { 88,  25,  78}, {192, 191, 129}, { 25,  84, 160}, {230,  58, 225}, {186,  39, 151}, {172,  56, 175}, {211, 171,  20}, { 56, 236, 252}, { 51, 137, 255}, {197,  41, 173}, { 47,  18,  26}, {201,  38, 199}, {126, 118,  39}, {113, 110, 125}, {133,  86,   6}, {113, 176, 255}, {169, 213, 170}, {170, 252,  42}, {154,  47, 161}, {160, 107,  92}, {145,  76, 181}, { 59,  43,  82}, {154,  97,  51}, { 46,  41,  24}, {193,  63,  97}, { 11, 115, 190}, {243, 221,  91}, { 89, 219,  64}, {193,  75, 103}, {214,   6, 238}, {202, 218, 220}, {249,  56,   3}, {237, 162, 202}, { 53, 188, 205}, {173,  88, 215}, {136, 225, 191}, {159,  32,  27}, { 66, 139,  78}, {194,   0,   8}, { 38, 125,  90}, { 68,  16,   7}, { 57, 254, 205}, { 92, 244,  62}, {161, 101, 183}, {123,   1,  46}, {120,  89,  99}, { 34, 243, 208}, { 73,  17,  74}, {116,  84,  88}, {149,  20,  70}, {130, 214, 246}, {155, 212, 226}, {116, 114, 124}, { 24, 126, 230}, {156,   7,  31}, {142, 117,  47}, {210, 215, 239}, {247,  31, 195}, { 70,  52, 117}, {253,  78, 188}, {146, 169, 214}, { 91, 102,  87}, { 96,  78,  66}, {217, 168, 202}, {102,  27,  96}, { 66, 173, 238}, {122, 172, 158}, { 97,  65,  40}, {224, 156, 193}, { 37, 142, 185}, {180, 130,  22}},
        {{ 28,  16, 213}, {138, 118, 232}, { 30, 107, 108}, {163, 105, 182}, { 50,  86,  86}, {193, 203, 152}, {195,  87, 137}, {  6, 162, 192}, { 63, 200, 167}, { 34,  17, 177}, {133,  63, 168}, {  6,  68,  76}, {222,   5,  48}, { 48,   4,  60}, {155, 152, 115}, { 53,   4, 126}, {201,  94, 219}, { 25,   4,  41}, { 15, 132, 138}, { 33, 187, 227}, {114,  30, 127}, {129, 177,  26}, {145, 190, 214}, { 18,   6,  24}, {205, 171,  74}, { 65,  10,  95}, { 21, 185,  32}, {158,  85, 141}, { 49,  21, 166}, { 30, 114, 250}, {224, 154, 160}, {156,  58,  78}, { 11, 170,  40}, { 83, 132, 164}, { 49, 217, 251}, { 20,   1,  33}, {105,  52, 151}, {158, 109,  37}, {122, 220, 107}, {133, 177, 254}, {181, 156, 110}, {122,  54,  25}, {157, 133, 243}, { 99,  31, 182}, {178, 158, 116}, { 69,  40, 187}, { 79,  46, 229}, {229,  49,  12}, { 37, 239, 232}, {224,  20,   6}, { 67,  43, 102}, {200,  80, 192}, {238, 210, 121}, {133, 128,  83}, {117, 242,  64}, { 54,  22, 244}, {232, 218,  83}, { 92,  87,  32}, { 22,  84, 126}, {223, 160, 188}, { 51,  89, 117}, { 51,   5,  78}, {  4, 151, 211}, {197, 149,   7}, {156,  91, 140}, {137, 162, 199}, {  6, 114, 180}, {  8, 105, 110}, { 43, 231, 231}, {116,  30,   3}, {173,  18, 214}, {214, 157,  19}, {193,  13, 193}, {182,  26, 139}, { 42, 234, 119}, {230,  75, 100}, { 78,  32, 158}, { 52,  40,  65}, {249,  79,  23}, {212,  25, 202}, {111, 192, 254}, {120, 164, 137}, { 70, 212, 177}, { 29, 126, 164}, { 81,  65,  48}, { 12, 174,   7}, { 13,  88, 133}, {165,  16,  46}, {148,  57, 236}, {233,  39,  17}, { 14,  44,  71}, {  9, 226,  45}, {128, 121,  72}, {207, 149, 156}, { 85,  66,  45}, { 72,  78, 117}, {242, 117, 241}, { 76,  54,  68}, { 30, 228,  36}, { 81, 149, 177}, {106,   9, 187}, {153,  84,  74}, {171,  44, 176}, {147,  67,  11}, {131, 207, 224}, {186, 156, 120}, {221, 117, 212}, {247, 153, 225}, { 88, 138, 195}, {111,  10, 206}, {167,  34,  80}},
        {{213, 141, 147}, {178, 119, 125}, {176, 107,  18}, {167, 163, 224}, {104,  44, 101}, {237,   4,  25}, {164, 124,  58}, {142,  72,  80}, {147,  35, 244}, {169, 141,  87}, { 55,  42, 126}, {169, 203,  98}, {149,  27, 174}, { 93,  60,  14}, {  1,  41,  53}, {254, 190, 136}, { 42, 180,  54}, {156, 170, 194}, {242, 198,  90}, {  4,  25, 105}, {234, 168, 249}, { 98,  77,  64}, {174, 167, 215}, {147,  73,  94}, {116,  21, 228}, {160, 163, 236}, {149,  41,  18}, { 10,   8,  19}, {196,  31,   6}, { 52,  30, 239}, { 38,  55, 102}, {222, 198, 174}, {115,  72,  58}, {103, 220, 143}, {205, 145, 175}, {233, 150, 228}, {230, 198,  51}, {140,  47,  78}, { 58,  10,  25}, {183,  20, 127}, {249, 109, 141}, { 97, 110, 124}, { 83,  71,   3}, { 16, 146, 197}, { 82, 199, 210}, {143,  90,  10}, {  7, 140, 177}, {121,  17,   0}, {157,  31, 123}, { 58,  15, 129}, { 67,  56, 129}, {174,  47, 248}, {205, 197, 178}, {151, 102, 120}, {143, 135,  79}, { 64,  15,  40}, {210,  14, 255}, {219, 158,  48}, { 73, 178, 191}, { 87,  60, 128}, {203,  74,   4}, {163,  26,  25}, {130,  90, 143}, { 50,  38,  49}, {218, 220, 131}, {187,  53,  87}, {180,  40,  22}, { 14,   0, 137}, {200, 152, 152}, {113, 240,  11}, {243,  19, 223}, {223,  71, 110}, {238,  13, 125}, {174, 166, 155}, { 28,  78, 151}, {223, 171,  63}, {237, 177,  39}, { 58, 204, 167}, { 93,  20, 165}, {122,  28,  33}, {109, 117, 187}, {253, 255,  54}, { 38,  65,  88}, {125,   9,  60}, { 45,  44,  14}, {  7,   5,  28}, { 68, 214, 111}, { 67,   3,  71}, { 58,   2, 172}, { 73,  82, 191}, { 39, 153, 225}, {145, 148, 132}, {  3,  90, 170}, {  4,  40, 134}, { 34, 176, 241}, { 79,   7,  83}, {213,  57,  85}, {112, 210,  45}, {225,  52, 142}, {236, 213, 236}, { 53, 157, 214}, {233,  58, 201}, { 44,  49, 196}, { 47,  44,  14}, {226,  23, 144}, {128,  97, 105}, { 74, 117, 172}, {141, 192, 247}, {208, 153, 224}, {243,  89, 240}, { 73,  29, 164}},
    };

    public static void main(String[] args) {
        System.out.println(Druga.stolpecZNajvecPrevladujoceZelenimi(SLIKA));
    }
}
