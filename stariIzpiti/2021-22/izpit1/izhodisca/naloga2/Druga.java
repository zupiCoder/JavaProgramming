import java.util.*;

public class Druga {

    public static boolean[][] premakniIgralce(boolean[][] igralci, int start_Y) {
        boolean[][] newIgralci = new boolean[igralci.length][igralci[0].length];

        for (int y = 0; y < igralci.length; y++) {
            for (int x = 0; x < igralci[0].length; x++) {
                if (igralci[y][x]) {
                    if (y > start_Y && y - 1 >= 0) {
                        newIgralci[y - 1][x] = true; 
                    } else if (y < start_Y && y + 1 < igralci.length) {
                        newIgralci[y + 1][x] = true;
                    } else {
                        newIgralci[y][x] = true;
                    }
                }
            }
        }

        return newIgralci;
    }

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {

        int start_X = strelec;
        int start_Y = igralci.length / 2;

        int X = start_X;
        int Y = start_Y;
        int distance = 0;

        while (true) {
            if (X == 0) {
                break;
            }

            if (X == igralci[0].length - 1) {
                break;
            }

            if (igralci[Y][X]) {
                break;
            }

            distance++;
            X += smer;
            igralci = premakniIgralce(igralci, start_Y);
        }

        return distance;
    }
}
