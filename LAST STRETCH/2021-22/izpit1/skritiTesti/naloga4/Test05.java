
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        List<Integer> seznam = List.of(
            514, 728, 405, 268, 587, 562, 7, 398, 685, 776, 57, 532, 94, 955, 27, 65, 994, 444, 224, 941, 859, 856, 754, 783, 728, 219, 683, 122, 191, 990, 43, 90, 732, 492, 697, 847, 135, 720, 37, 283, 877, 229, 188, 709, 754, 357, 443, 239, 503, 720, 531, 318, 187, 955, 170, 234, 16, 870, 220, 626, 482, 62, 991, 900, 239, 552, 457, 123, 706, 813, 412, 543, 677, 971, 417, 281, 108, 50, 321, 3, 986
        );
        System.out.println(Cetrta.odsek(seznam.iterator(), 11, 12));
    }
}