import java.util.Scanner;

public class NajblizjiElement {

  public static int najmanjOddaljen(int[] t, int k) {
    int min = Math.abs(k - t[0]); //vzame abs od teh dveh
    int minIndex = 0;
    for(int i = 0; i < t.length; i++ ) {
      if(t[i] < k) {
        if(k - t[i] < min) {
          min = k - t[i];
          minIndex = i;
        }
      } else if(t[i] > k) {
        if(t[i] - k < min) {
          min = t[i] - k;
          minIndex = i;
        }
      }
    }
    return minIndex;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int n = sc.nextInt();
    int[] t = new int[n];

    for(int i = 0; i < n;i++) {
      t[i] = sc.nextInt();
    }
    int minIndex = najmanjOddaljen(t, k);
    System.out.println(minIndex);
  }
}