import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class VsiRazlicniII {

  private static final int MAKS_STEVILO = 10000;

  public static int maxRepNum(int[] t) {
    int maxElement = t[0];
    int maxCount = 0;

    for (int i = 0; i < t.length; i++) {
      int count = 0;
      for (int j = i + 1; j < t.length; j++) {
        if (t[i] == t[j]) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        maxElement = t[i];
        return maxElement;
      }
    }

    return Integer.MAX_VALUE;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();
    int n = sc.nextInt();
    int[] t = new int[n];

    Random rand = new Random(s);
    for (int i = 0; i < t.length; i++) {
      t[i] = rand.nextInt(2 * MAKS_STEVILO + 1) - MAKS_STEVILO;
    }
    Arrays.sort(t);
    int maxRep = maxRepNum(t);
    if(maxRep != Integer.MAX_VALUE) {
      System.out.println(maxRep);
    } else if (maxRep == Integer.MAX_VALUE) {
      System.out.println("RAZLICNI");
    }
  }
}
