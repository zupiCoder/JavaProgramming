import java.util.*;

public class Druga {

    public static int stolpecZNajvecPrevladujoceZelenimi(int[][][] slika) {
        // popravite / dopolnite ...
        int max = 0;
        int index_max = -1;

        for (int j = 0; j < slika[0].length; j++) {
            int temp = 0;
            for (int i = 0; i < slika.length; i++) {
                if (slika[i][j][1] > slika[i][j][0] && slika[i][j][1] > slika[i][j][2]) {
                    temp++;
                }
            }

            if (temp > max) {
                max = temp;
                index_max = j;
            }
        }

        return index_max;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
