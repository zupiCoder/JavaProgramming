import java.util.*;

public class PravilniTrikotniki {

  public static int dolzinaStranice(int[][] t, int row1, int row2) {
    int dolzina = (int) (Math.sqrt(Math.pow((t[row1][0] - t[row2][0]), 2) + Math.pow((t[row1][1] - t[row2][1]), 2)));

    return dolzina;
  }

  public static int jeTrikotnik(int[][] t,int d) {   

    for (int point = 0; point < t.length; point++) {
      for (int point2 = 0; point2 < t.length; point2++) {
        for (int point3 = 0; point3 < t.length; point3++) {
          if (point != point2 && point != point3 && point2 != point3) {
            int minD = 0; //najmanjsa stranica
            int maxD = 0;//najdalsa stranica

            int[][]isItTri = { t[point], t[point2], 
              t[point3]
            };
            for(int i = 0; i < isItTri.length - 1; i++) {
              for(int j = i + 1; j < isItTri.length - 1; i++) {
                int dolzina = dolzinaStranice(isItTri, i, j);
                
                
              }
            }
            //get sizes by comparing all three points

          }
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int d = sc.nextInt(); // st kordinat
    int n = sc.nextInt(); // st tock

    int[][] t = new int[n][2];

    // fill the table
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2; j++) {
        t[i][j] = sc.nextInt();
      }
    }
  }
}
