import java.util.*;

public class MaksimumiPoStolpcihII {

  public static int[] maksimumi(int[][] t) {
    int d = 0;
    // Find the length of the longest row first
    for (int i = 0; i < t.length; i++) {
        if (t[i].length > d) {
            d = t[i].length;
        }
    }
  
    // Initialize tOfBiggest with the length of the longest row
    int[] tOfBiggest = new int[d];

    // Calculate the maximum values in each column
    for (int col = 0; col < d; col++) {
        int biggestElement = Integer.MIN_VALUE;
        for (int row = 0; row < t.length; row++) {
            if (col < t[row].length) {
              if(t[row][col] > biggestElement) {
                biggestElement = t[row][col];
              }
            }
        }
        tOfBiggest[col] = biggestElement; 
    }

  return tOfBiggest;
}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] t = new int[n][];
    int d = 0;

    for(int row = 0; row < n; row++) {
      d = sc.nextInt();
      t[row]= new int [d];
      for(int col = 0; col < d;col++){
        t[row][col] = sc.nextInt();
      }
    }

    int[] newT = maksimumi(t);
    //System.out.println(Arrays.deepToString(t));
    System.out.println(Arrays.toString(newT));
  }
}
