import java.util.*;

public class Druga {

    public static int[] manhattan(boolean[][] t) {

        int[] tabela = new int[t.length + t[0].length - 1];

        int maxTrueCount = 0;
        for (int v = 0; v < t.length; v++) {
            for (int s = 0; s < t[0].length; s++) {
                if (t[v][s]) {
                    maxTrueCount++;
                }
            }
        }

        int[][] indexes = new int[maxTrueCount][2];
        int i = 0;

        for (int v = 0; v < t.length; v++) {
            for (int s = 0; s < t[0].length; s++) {
                if (t[v][s]) {
                    indexes[i][0] = v;
                    indexes[i][1] = s;
                    i++;
                }
            }
        }

        for (int j = 0; j < i; j++) {
            for (int k = j + 1; k < i; k++) {
                int distance = manhattanska(indexes[j][0], indexes[j][1], indexes[k][0], indexes[k][1]);
                tabela[distance]++;
            }
        }
        return tabela;
    }

    public static int manhattanska(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
