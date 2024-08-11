import java.util.*;

public class Druga {

    public static int[] poLomljenki(boolean[][] matrika) {
        int[] smeri = new int[4];

        int d = matrika.length - 2;
        int k = matrika[0].length - 2;

        int i = 1;
        int j = 1;

        matrika[1][1] = false;

        while (i <= d && j <= k) {
            // levo
            if (matrika[i][j - 1]) {
                smeri[0]++;
                matrika[i][j - 1] = false;
                j--;
                // navzgor
            } else if (matrika[i - 1][j]) {
                smeri[1]++;
                matrika[i - 1][j] = false;
                i--;
                // desno
            } else if (matrika[i][j + 1]) {
                smeri[2]++;
                matrika[i][j + 1] = false;
                j++;
                // navzdol
            } else if (matrika[i + 1][j]) {
                smeri[3]++;
                matrika[i + 1][j] = false;
                i++;
            }
            if(i == d && j == k) break;
        }
        return smeri;
    }
}
