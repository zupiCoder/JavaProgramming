import java.util.*;

public class Druga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int u = sc.nextInt();//mode
        int m = sc.nextInt(); //drazitelji
        int n = sc.nextInt();//izdelki
        int k = sc.nextInt();//ponudbe

        int[][] t = new int[n][2];

        for(int i = 0; i < k; i++) {
            int indexDrazitelja = sc.nextInt();
            int indexIzdelka = sc.nextInt();
            int ponujenaCena = sc.nextInt();
            
            if(t[indexIzdelka][1] < ponujenaCena) {
                t[indexIzdelka][1] = ponujenaCena;
                t[indexIzdelka][0] = indexDrazitelja;
            }
        }

        if(u == 1) {
            int[] cene = new int[n];

            for(int i = 0; i < n; i++) {
                cene[i] = t[i][1];
            }

            System.out.println(Arrays.toString(cene));

        } else if(u == 2) {
            int[] stIzdelkov = new int[m];

            for(int i = 0; i < n; i++) {
                int tempIndex = t[i][0];

                if(t[i][1] != 0) stIzdelkov[tempIndex] += 1;
            }

            System.out.println(Arrays.toString(stIzdelkov));
        }
    }
}
