
import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int st_pik = 0;

        int t[][] = new int[h][w];

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                t[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {

                if(t[i][j] == 1) {
                    //rob slike
                    if(i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                        st_pik++;
                    } else {
                        if(t[i + 1][j] == 0) {
                            st_pik++;
                        } else if(t[i - 1][j] == 0) {
                            st_pik++;
                        } else if(t[i][j + 1] == 0) {
                            st_pik++;
                        } else if(t[i][j - 1] == 0) {
                            st_pik++;
                        } else if(t[i + 1][j + 1] == 0) {
                            st_pik++;
                        } else if(t[i - 1][j - 1] == 0) {
                            st_pik++;
                        } else if(t[i - 1][j + 1] == 0) {
                            st_pik++;
                        } else if(t[i + 1][j - 1] == 0) {
                            st_pik++;
                        }
                    }
                }
            }
        }
        System.out.println(st_pik);
    }
}
