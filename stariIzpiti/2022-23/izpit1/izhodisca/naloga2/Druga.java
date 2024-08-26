import java.util.*;

public class Druga {

    public static boolean krizankaOK(char[][] besede, char[][] polozaji) {

        char[][] krizanka = new char[10][10];

        for (int i = 0; i < polozaji.length; i++) {
            int x = polozaji[i][0] - '0';
            int y = polozaji[i][1] - '0';
            boolean vodoravno = polozaji[i][2] == 'v';

            if (vodoravno) {
                int temp_y = y;
                for (int j = 0; j < besede[i].length; j++) {

                    if (krizanka[x][temp_y] == 0 || krizanka[x][temp_y] == besede[i][j]) {
                        krizanka[x][temp_y] = besede[i][j];
                        temp_y++;
                    } else {    
                        return false;
                    }
                }
            } else {
                int temp_x = x;
                for (int k = 0; k < besede[i].length; k++) {

                    if (krizanka[temp_x][y] == 0 || krizanka[temp_x][y] == besede[i][k]) {
                        krizanka[temp_x][y] = besede[i][k];

                        if(temp_x + 1 < besede[i].length) {
                        temp_x++;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final char[][] B1 = {
            {'a', 'b', 'c'},
            {'b', 'c', 'd'},
            {'b', 'c', 'd'},
            {'a', 'b', 'c'},
        };

        final char[][] P1 = {
            {'9', '8', 'v'},
            {'9', '9', 'v'},
            {'8', '9', 'n'},
            {'7', '9', 'n'},
        };

        final char[][] B2 = {
            {'a', 'b', 'c'},
        };

        final char[][] P2 = {
            {'9', '9', 'v'},
        };

        final char[][] B3 = {
            {'a', 'b', 'a', 'b'},
            {'a', 'b', 'a', 'b'},
        };

        final char[][] P3 = {
            {'5', '3', 'n'},
            {'5', '1', 'n'},
        };

        final char[][] B4 = {
            {'a', 'b', 'a', 'b', 'b'},
            {'a', 'b', 'a', 'b', 'b'},
        };

        final char[][] P4 = {
            {'5', '3', 'v'},
            {'5', '1', 'v'},
        };

        System.out.println(Druga.krizankaOK(B1, P1));
        System.out.println(Druga.krizankaOK(B2, P2));
        System.out.println(Druga.krizankaOK(B3, P3));
        System.out.println(Druga.krizankaOK(B4, P4));
    }
}
