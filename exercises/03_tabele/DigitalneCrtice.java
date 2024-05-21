import java.util.Scanner;

public class DigitalneCrtice {

  public static int indexMax(int[] t, int[] c) {
    int maxSum = 0;
    int sum = 0;
    int indexMax = 0;

    for (int i = 0; i < t.length; i++) {
      int stevilo = t[i];
      while (stevilo > 0) {
        int stevka = stevilo % 10;
         sum += c[stevka];
         stevilo = stevilo / 10;
      }

      if (sum > maxSum) {
        maxSum = sum;
        indexMax = t[i];
      }
      sum = 0;
    }
    return indexMax;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] t = new int[n];
    int[] c = {6,2,5,5,4,5,6,3,7,6};

    for (int i = 0; i < t.length; i++) {
      t[i] = sc.nextInt();
    }
    int maxCrtic = indexMax(t, c);
    System.out.println(maxCrtic);
  }
}