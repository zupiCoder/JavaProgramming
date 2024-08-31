import java.util.*;

public class Druga {

    public static int[][] postaviPolice(int m, int[][] p) {

        int[][] police = new int[m][m];

        for (int i = 0; i < p.length; i++) {
            int x = p[i][0];
            int y = p[i][1];
            int dolzina_police = p[i][2];

            for (int xx = x; xx < (x + dolzina_police); xx++) {
                police[xx][y] = 1;
            }
        }
        return police;
    }

    public static int najGlobina(int m, int[][] p) {
        int max_d = 0;

        int[][] police = postaviPolice(m, p);

        for (int i = 0; i < m; i++) {
            int d = 0;
            for (int j = 0; j < m; j++) {
                if (police[i][j] == 1) break;
                d++;
            }

            if (d > max_d) max_d = d;
        }
        return max_d;
    }
}
