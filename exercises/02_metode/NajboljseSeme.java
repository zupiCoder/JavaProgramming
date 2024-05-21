import java.util.Scanner;
import java.util.Random;

public class NajboljseSeme {
  
  public static long getSeme(int seme, int n) {
    long stevilo = 0;
    Random rand = new Random(seme);
    for (int i = 0; i < n; i++) {
      stevilo += (long) (rand.nextInt(10) * Math.pow(10, n - i - 1));
    }
    return stevilo;
  }
  



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    
    long biggestSeed = 0;
    long changingSeed = 0;
    int indexOfBiggest = 0;

    for (int seme = a; seme <= b; seme++) {
      changingSeed = getSeme(seme, n);

      if(changingSeed > biggestSeed) {
        biggestSeed = changingSeed;
        indexOfBiggest = seme;
      }
    }
    System.out.println(indexOfBiggest);
  }
}
