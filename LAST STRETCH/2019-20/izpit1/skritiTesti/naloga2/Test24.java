
public class Test24 {

    public static void main(String[] args) {
        int[][] t = {
            { 822, 744, 532,  61, 975, 465, 740, 956, 671, 595, 269, 412,  22, 154, 509, 683,   6, 804, 257 },
            { 690, 322, 321, 450, 112, 836, 329, 306, 838, 936,  80, 858, 977, 665, 996,  84, 459, 977, 608 },
            { 407, 273, 110, 311, 892, 528, 611,  20, 658, 645,  56, 794,  18, 856,  38, 797, 978,  62,  20 },
            { 493, 933, 612, 467, 575, 824, 631, 580, 634, 880, 593,  54, 275, 769, 452, 616, 306, 772, 448 },
            { 997, 510, 719, 948,  96, 524, 103, 810,  23,  47, 736, 432, 683, 787, 650, 101, 826, 144, 264 },
            { 718, 557, 827, 138, 521, 781, 558, 194, 754, 829, 967, 566, 839, 737, 778, 418, 457, 818, 753 },
            { 342, 317, 893, 399, 223, 660, 174, 529, 743, 417, 605, 953, 308,  39, 379, 935, 479,  55,  64 },
            { 853, 575, 208, 576, 349, 645, 171, 145, 267,  82, 288, 903, 570, 420, 743, 278, 361, 978, 784 },
            { 316, 475, 952, 774, 415, 331, 322, 336, 743, 236, 402, 377,  20, 299, 881, 573, 687, 272,  41 },
            { 557,  51, 401, 629, 967, 540, 813, 438,  61, 685, 383, 864,  48, 601, 500,  54, 422, 914, 390 },
        };

        for (int krog = 0;  krog < 19;  krog++) {
            System.out.println(Druga.najCas(t, krog));
        }
    }
}