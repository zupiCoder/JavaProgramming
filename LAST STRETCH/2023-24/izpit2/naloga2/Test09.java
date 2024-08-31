
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -802, 211, 618, -395, -911, -535, 925, 45, 57, -924, 115, 939, 31, 903, -459, -779, -792, 775, 843, 189, 762, 92, 71, -482, 587, 733, -506, 572, 3, -279, -758, 653, 103, 8, -785, 713, -476, 629, -960},
            {879, -146, 189, 991, -910, 76, -608, -934, -416, -188, 273, -91, -891, -608, 812, 224, -298, 885, 251, 727, 564, -784, 916, -583, -294, -945, -74, -608, -143, 19, 373, -189, 874, -825, -701, -615, -65, 370, -455, 708},
            {569, -748, -637, -349, 172, 80, -787, 858, -723, -384, -136, -956, -265, 518, -264, 429, -785, 194, -151, -88, -291, 287, 60, -406, 880, 28, 477, -483, -288, 687, -776, -966, 599, 454, -212, -791, -94, 29, -85, 631},
            {-458, 625, -905, 563, -901, -557, 280, -951, -190, -271, 985, -157, -931, -60, -418, -274, -486, -512, -828, -538, -456, 118, -33, -176, 334, -411, 10, 691, -620, 212, -978, -871, 4, -296, -341, 178, 14, 682, -230, 877},
            {-919, -375, -936, 609, 930, 907, 822, -117, -323, -951, 973, 307, 306, -700, 770, 766, 976, 773, -504, -97, -531, -105, -486, -63, -643, -79, 403, -821, -104, 621, -548, 565, 912, -696, 315, -765, 343, 455, -17, 764},
            {859, 829, -352, 547, -888, 118, -922, -706, -356, 60, 439, 111, -282, -346, -31, 528, -89, -329, 649, 309, -400, -582, 756, -703, 591, 45, -640, 824, -132, -779, 953, 962, -2, -883, 427, -269, -670, 626, 149, -131},
            {677, 482, -747, 716, -88, 227, -607, -150, -32, 511, -395, -585, 620, -868, 471, 717, 890, -204, -835, 932, 19, 515, 922, -99, 423, 31, -655, -489, 706, -963, 431, -385, -297, 777, 921, -210, -679, -22, -153, 287},
            {85, 385, 442, -33, 683, 136, 652, 327, 399, 685, -976, -485, -403, -31, -875, 600, 734, 54, -660, 662, 526, 518, -776, -867, -83, -455, 621, -109, -538, 781, -255, 716, 933, -659, 854, -173, 699, 455, -611, 282},
            {825, 848, -767, 872, 457, 704, 999, -800, 243, 757, 839, 463, -654, -520, 670, 359, -775, 889, 102, 719, 67, 154, -935, -529, 460, 478, -754, 584, -718, -190, 693, -363, -78, -926, -564, 804, 212, 62, -102, -181},
            {-361, 768, -382, -129, 418, 634, -52, 666, -961, -44, -823, -886, 883, -199, -660, 241, -419, -927, -486, 228, 748, 811, 481, -362, -364, 921, -512, -844, 455, -933, 894, 121, -550, 893, -254, 565, -152, 658, 322, 242},
            {-503, -72, 279, -775, 0, -209, 960, 251, -783, -199, 105, 948, 436, -226, 632, 748, -286, -696, 564, -268, -303, 720, 490, 408, 993, -231, -289, 128, -277, 170, 551, 786, -772, -180, 564, 6, 807, 326, -826, 652},
            {-768, 215, 238, -735, -537, 424, 603, 87, -858, 307, -904, 762, 68, -934, 184, -127, -937, 51, -821, -302, -307, 49, 270, -812, -630, 376, 607, -983, -882, -343, -86, -146, -705, -69, -863, -408, 551, -664, -145, 199},
            {588, 562, -613, -377, -68, 165, 144, 199, 328, 847, -816, -189, -176, -358, -272, 94, 434, 319, -143, 147, 681, 149, 698, -865, 499, 0, -495, 289, 940, 148, 229, 393, -464, 957, -36, -87, -269, 40, -430, -951},
            {-714, -591, 399, -472, 298, 647, 900, 90, 425, -713, -61, 20, 66, 22, 165, -245, -814, -434, -583, 685, -582, 516, -544, -473, 539, 74, -933, -775, -523, -55, -172, -961, -58, -604, -68, 697, -703, 861, 311, 883},
            {310, -837, 203, 831, -737, 138, 94, -771, 177, 208, -651, 204, -970, 406, 963, 294, -487, 309, 194, -392, -701, 761, 216, 264, -54, 874, -690, 149, -688, 691, -569, -958, 606, 188, -214, -253, -305, 246, -118, 675},
            {-73, 284, -203, -184, -291, -130, -950, -172, 462, -520, 18, 49, -16, 514, 740, 274, 611, -752, 678, -243, 165, -466, 504, -727, -568, -414, 849, -531, -861, 840, -678, 754, 11, -99, -978, 769, -516, -636, 936, 118},
            {168, 635, 181, 88, 521, 474, 305, 70, 961, 25, 155, -366, -822, -17, -993, 950, -471, 872, -861, 615, 346, -43, 641, -120, -94, 717, 216, -727, -458, -955, 431, 82, -328, 733, -592, -877, -72, 714, 546, 416},
            {126, 859, -576, -799, 12, -452, 435, -298, 977, -748, 96, -793, 715, -867, -261, 711, 298, 221, 798, -782, 530, -601, -802, -592, 47, -700, 761, -765, 163, 404, 299, -641, 123, 844, 336, -964, 770, 860, -152, -204},
            {-705, 316, 70, 402, 241, 165, -952, 610, 163, 34, -961, -121, -147, 100, -549, -738, -64, -943, 875, 499, 706, 79, -871, -787, -628, -631, -383, -305, -217, -136, -205, -825, -623, 264, -839, -217, 2, -716, 787, 148},
            {364, 326, -523, -193, 915, -931, 524, 130, -460, 578, -817, 188, -35, -215, -280, -658, 662, -180, -502, -635, 82, -915, 130, 295, 615, -12, 6, -723, 880, -103, -414, 452, -779, 586, 299, 276, -686, 77, -59, -966},
            {-245, 477, 983, 107, -405, -870, 82, -821, 223, -839, -623, 479, 238, -217, -828, 321, 476, -442, 592, -597, -340, -480, 215, 674, 841, -216, 135, -112, -951, 168, 879, 962, -62, -807, 956, -420, -559, -290, 746, 557},
            {626, -972, -834, -796, 828, -806, 603, 927, 14, 57, 715, -970, -773, 214, 732, -946, -322, -490, -725, 961, -235, 867, -99, 944, -866, 907, 224, -350, 143, 6, 775, -321, -640, 388, 618, 538, 43, 144, 177, -971},
            {981, 671, 799, 519, -445, 151, 8, -824, 377, 600, 298, 97, -984, -50, -869, -340, -649, 727, 356, -533, -845, -831, 466, 90, -899, 417, -258, -575, 279, -454, -959, -286, 123, -395, 330, 190, -104, -491, 192, -914},
            {-18, -654, -447, 986, 882, -321, 202, 140, -864, 539, -469, 959, -363, 338, 393, 536, -783, -272, 307, 910, -683, -333, 227, 158, -183, 481, 98, -236, 924, 830, -19, -306, -415, -582, -789, 559, 712, -361, -902, -289},
            {590, 168, -244, 129, -199, -107, 112, -312, -528, -554, 542, -388, 949, -949, -772, -344, 269, 669, 521, 450, 82, 347, 614, 444, 734, -368, -245, 442, 231, -711, -653, 457, 788, 106, -719, -428, -385, -138, -28, 52},
            {-825, -738, -893, 25, -760, -367, 107, 317, -642, -260, -638, 966, 459, -55, -347, 350, 231, -734, -196, 37, -117, 519, -759, 339, -196, 530, -282, 658, -787, -622, 381, 825, -363, 398, -358, 833, 164, -206, -741, -657},
            {-5, 816, -124, 466, -734, -523, -151, -792, -955, 589, 461, 806, -712, -585, -309, -124, 840, -957, 935, -139, -629, -44, 631, -150, -941, -250, -483, -843, 736, -400, -482, 534, 810, 350, -217, 130, -491, 872, 810, 18},
            {-132, 864, 639, 865, -558, 14, 632, -122, 691, 526, -123, 863, 427, 230, 181, 502, -140, 868, -502, -894, -230, 281, 713, -159, -530, 602, -117, 705, -728, -992, 361, 527, 429, 746, -661, -238, 902, 175, -781, -603},
            {-548, -413, -87, -110, -877, 135, -146, 797, 376, -119, 378, -142, 372, 411, -80, 708, -934, 847, 746, 222, 112, 786, -958, -103, 224, -560, -29, 488, 448, -219, -499, -353, 234, 857, -79, -789, -967, 362, 302, -587},
            {639, -896, 505, 402, 314, -962, -656, -688, -855, 445, -184, 947, -797, -400, -734, -937, 189, 918, -846, 825, 385, 991, 292, -616, -570, -382, 382, -383, -294, -267, -134, 461, 3, 146, 634, -218, 2, 670, -266, -633},
            {323, -669, -831, -788, 403, 894, 925, 3, 693, -663, 88, -454, 816, 177, -965, -394, -7, 29, 80, -32, 162, 475, -7, 406, 932, 57, 114, -377, 328, 650, -177, -664, -712, 712, -564, 397, -535, -53, 951, 53},
            {-576, 451, 858, -5, 282, 90, -158, 312, 780, -31, 529, -147, -926, -313, 414, -405, 889, -405, 175, 571, -4, -78, 911, 100, -753, -45, -199, -599, -933, -546, -758, -309, -817, 624, -696, 216, -318, 197, -897, -586},
            {451, 306, 685, -61, -987, 875, 547, -902, 210, -275, -8, -213, 435, -889, -727, 96, -114, -386, -457, -638, -241, -786, -771, 435, -223, 913, 191, -994, 479, -969, 114, 930, -480, -587, 998, -438, -388, 526, -277, 3},
            {-643, -781, 861, -912, -891, 138, 783, -130, -484, 191, -479, 615, 210, 249, -409, -696, -757, -397, 545, 787, 951, -472, 939, 264, 799, 16, 847, 365, 890, 148, -351, -91, -435, -406, 773, -604, 231, 289, 362, 948},
            {-66, 600, 461, -922, -486, -468, 650, 70, -793, 973, -56, 975, -383, -320, 433, 90, -466, -871, 301, 111, -69, -304, 281, 734, 805, -819, -223, 836, -998, 822, 308, 211, -246, -294, 622, 262, -731, 658, -233, -6},
        };
        int[][] smer = {
            {0, 3, 3, 3, 3, 4, 3, 3, 4, 1, 1, 1, 1, 1, 3, 3, 4, 3, 3, 3, 3, 4, 1, 1, 4, 1, 1, 1, 3, 3, 4, 1, 1, 1, 1, 1, 1, 1, 3, 4},
            {2, 1, 2, 4, 1, 1, 2, 1, 3, 4, 3, 4, 1, 2, 2, 1, 3, 2, 1, 4, 1, 4, 4, 2, 1, 4, 1, 2, 1, 1, 3, 3, 4, 3, 4, 4, 1, 2, 1, 1},
            {4, 2, 1, 3, 4, 2, 4, 2, 4, 4, 2, 3, 3, 2, 1, 1, 1, 1, 4, 1, 2, 1, 4, 1, 1, 4, 3, 3, 4, 2, 2, 4, 3, 2, 4, 3, 3, 3, 3, 2},
            {3, 3, 2, 2, 4, 2, 1, 2, 1, 3, 3, 3, 3, 4, 4, 3, 3, 2, 4, 4, 1, 1, 4, 3, 2, 4, 2, 1, 3, 2, 2, 4, 3, 4, 3, 3, 4, 2, 1, 4},
            {2, 3, 4, 2, 4, 3, 2, 1, 2, 1, 1, 1, 4, 4, 4, 2, 3, 4, 1, 4, 3, 2, 3, 4, 2, 1, 3, 2, 4, 3, 2, 4, 2, 3, 3, 4, 4, 4, 2, 1},
            {2, 2, 3, 2, 3, 3, 3, 3, 3, 4, 3, 2, 4, 4, 4, 2, 4, 1, 3, 3, 4, 2, 1, 1, 3, 4, 2, 3, 4, 2, 3, 3, 2, 4, 1, 4, 4, 4, 3, 2},
            {2, 2, 1, 1, 1, 4, 1, 1, 2, 3, 2, 1, 1, 4, 3, 2, 3, 3, 4, 2, 4, 3, 4, 2, 2, 4, 2, 1, 3, 2, 1, 1, 1, 1, 2, 1, 4, 3, 2, 1},
            {2, 1, 1, 1, 4, 1, 3, 2, 2, 1, 1, 4, 1, 1, 2, 3, 2, 1, 4, 2, 3, 2, 3, 4, 2, 4, 1, 2, 1, 1, 1, 1, 3, 3, 3, 2, 3, 3, 3, 4},
            {4, 1, 3, 2, 4, 3, 2, 3, 3, 3, 2, 4, 3, 4, 2, 1, 1, 2, 4, 2, 1, 1, 1, 4, 2, 4, 2, 3, 3, 3, 3, 2, 4, 1, 4, 1, 1, 2, 4, 1},
            {4, 3, 2, 3, 4, 2, 3, 2, 1, 1, 1, 4, 2, 4, 3, 4, 2, 4, 1, 3, 3, 4, 2, 3, 2, 4, 2, 2, 3, 3, 3, 3, 4, 2, 1, 4, 2, 1, 1, 2},
            {4, 2, 1, 1, 1, 2, 4, 1, 1, 1, 1, 4, 2, 3, 4, 3, 2, 1, 2, 2, 4, 1, 2, 4, 4, 1, 2, 2, 1, 1, 1, 2, 3, 4, 3, 4, 3, 3, 3, 2},
            {3, 3, 4, 1, 1, 2, 3, 4, 4, 3, 2, 4, 2, 1, 3, 4, 3, 3, 2, 2, 4, 3, 2, 1, 3, 3, 3, 3, 4, 1, 2, 1, 1, 4, 2, 3, 2, 3, 4, 1},
            {4, 1, 1, 3, 4, 2, 1, 4, 4, 2, 3, 3, 3, 2, 1, 3, 3, 3, 3, 2, 3, 4, 4, 2, 3, 4, 4, 1, 1, 2, 1, 1, 2, 1, 2, 1, 3, 2, 4, 2},
            {3, 4, 3, 2, 3, 4, 2, 4, 3, 2, 2, 1, 4, 1, 4, 1, 1, 2, 4, 1, 1, 1, 4, 2, 4, 1, 4, 3, 4, 4, 3, 2, 3, 3, 4, 2, 1, 1, 1, 2},
            {2, 4, 2, 4, 1, 4, 2, 1, 2, 1, 2, 4, 1, 2, 4, 3, 2, 2, 3, 4, 3, 3, 4, 2, 4, 2, 4, 2, 4, 4, 2, 1, 2, 4, 3, 3, 3, 4, 3, 2},
            {4, 1, 2, 4, 2, 1, 3, 3, 3, 2, 4, 1, 3, 2, 1, 2, 1, 1, 1, 1, 4, 1, 1, 2, 1, 2, 3, 2, 4, 4, 3, 2, 2, 1, 1, 1, 1, 3, 2, 4},
            {3, 3, 2, 3, 3, 3, 2, 3, 4, 1, 3, 3, 4, 3, 4, 1, 1, 3, 4, 1, 3, 3, 3, 2, 4, 1, 1, 1, 1, 4, 2, 3, 3, 3, 4, 3, 2, 4, 1, 4},
            {2, 1, 3, 4, 1, 4, 1, 2, 3, 4, 2, 1, 4, 4, 1, 3, 2, 4, 1, 2, 1, 1, 2, 1, 3, 4, 3, 3, 4, 1, 2, 2, 1, 1, 3, 2, 3, 4, 2, 1},
            {4, 2, 1, 1, 2, 1, 2, 1, 2, 3, 2, 4, 1, 3, 4, 2, 3, 4, 3, 3, 4, 2, 1, 4, 1, 4, 2, 1, 4, 3, 2, 4, 3, 2, 3, 4, 1, 1, 3, 2},
            {4, 3, 4, 1, 3, 3, 3, 2, 2, 4, 1, 4, 3, 2, 4, 2, 1, 1, 2, 1, 3, 4, 2, 1, 2, 1, 4, 1, 1, 2, 1, 1, 2, 1, 1, 1, 4, 1, 2, 1},
            {3, 2, 3, 3, 2, 3, 3, 4, 2, 4, 4, 1, 2, 1, 3, 4, 3, 3, 3, 2, 4, 3, 4, 3, 3, 3, 4, 4, 2, 3, 4, 2, 3, 3, 4, 3, 4, 3, 3, 2},
            {2, 3, 4, 1, 4, 2, 1, 3, 2, 4, 4, 3, 3, 2, 1, 4, 2, 1, 1, 1, 1, 1, 3, 4, 2, 1, 4, 4, 2, 4, 1, 2, 2, 4, 1, 2, 4, 2, 1, 1},
            {2, 1, 4, 2, 3, 4, 2, 3, 3, 4, 4, 2, 1, 3, 4, 4, 1, 4, 1, 1, 3, 2, 4, 3, 4, 2, 4, 4, 2, 1, 2, 2, 1, 4, 3, 2, 3, 4, 3, 2},
            {4, 2, 4, 2, 1, 4, 2, 1, 1, 4, 4, 2, 3, 2, 4, 4, 2, 1, 3, 3, 2, 1, 1, 1, 4, 2, 4, 4, 1, 2, 3, 3, 2, 4, 2, 3, 4, 3, 2, 4},
            {4, 2, 1, 3, 2, 3, 4, 1, 2, 1, 3, 3, 2, 4, 1, 3, 3, 4, 2, 4, 4, 1, 3, 2, 3, 4, 4, 4, 3, 2, 2, 1, 1, 1, 2, 2, 4, 1, 4, 1},
            {3, 4, 3, 2, 3, 2, 4, 2, 1, 2, 1, 4, 1, 4, 4, 2, 4, 3, 2, 1, 4, 2, 1, 1, 1, 1, 4, 4, 2, 4, 2, 3, 3, 3, 2, 2, 4, 2, 4, 2},
            {2, 3, 2, 3, 4, 1, 1, 3, 2, 4, 2, 4, 2, 4, 4, 2, 1, 1, 3, 4, 4, 2, 3, 3, 4, 4, 1, 4, 2, 4, 2, 2, 3, 3, 3, 2, 4, 2, 3, 4},
            {2, 3, 3, 2, 4, 3, 3, 4, 2, 1, 2, 1, 2, 4, 3, 2, 3, 4, 2, 4, 3, 3, 2, 4, 1, 4, 3, 3, 2, 1, 2, 2, 2, 4, 1, 4, 1, 2, 1, 1},
            {2, 2, 1, 4, 1, 2, 4, 1, 3, 3, 3, 2, 4, 1, 2, 3, 2, 3, 2, 3, 4, 4, 1, 3, 4, 3, 3, 3, 3, 3, 2, 2, 1, 1, 2, 1, 3, 3, 3, 2},
            {2, 2, 4, 1, 3, 2, 3, 3, 2, 4, 1, 2, 3, 4, 2, 2, 3, 3, 4, 1, 4, 4, 2, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 4, 1},
            {2, 1, 3, 3, 2, 1, 1, 1, 1, 4, 2, 1, 1, 3, 4, 2, 1, 2, 3, 4, 4, 3, 4, 3, 4, 2, 1, 1, 1, 1, 4, 1, 1, 1, 3, 4, 1, 1, 1, 2},
            {4, 2, 1, 1, 1, 3, 3, 3, 2, 3, 3, 4, 2, 1, 3, 3, 2, 2, 4, 1, 3, 4, 3, 2, 4, 1, 1, 1, 4, 2, 1, 4, 1, 2, 2, 4, 4, 1, 3, 2},
            {4, 3, 4, 3, 2, 4, 1, 1, 1, 1, 2, 4, 4, 2, 1, 2, 1, 1, 1, 4, 1, 4, 4, 1, 1, 3, 3, 2, 4, 1, 3, 3, 4, 2, 2, 4, 4, 3, 2, 4},
            {3, 2, 4, 2, 1, 4, 4, 3, 3, 2, 4, 1, 3, 4, 2, 4, 1, 1, 4, 1, 2, 1, 3, 3, 4, 2, 1, 1, 1, 3, 2, 4, 3, 2, 2, 4, 4, 2, 4, 1},
            {2, 1, 3, 3, 2, 1, 3, 2, 1, 1, 1, 3, 2, 3, 2, 1, 3, 2, 1, 3, 3, 3, 2, 1, 3, 3, 3, 3, 3, 2, 1, 1, 1, 1, 1, 1, 3, 2, 1, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}