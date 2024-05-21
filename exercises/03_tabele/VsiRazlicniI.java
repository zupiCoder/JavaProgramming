import java.util.Scanner;

public class VsiRazlicniI {
  public static int[] sortArray(int[] t) {
    for (int i = 0; i < t.length - 1; i++) {
      for (int j = 0; j < t.length - i - 1; j++) {
        if (t[j] > t[j + 1]) {
          int temp = t[j];
          t[j] = t[j + 1];
          t[j + 1] = temp;
        }
      }
    }
    return t;
  }

  public static int staEnaka(int[] t) {
    for (int i = 0; i < t.length - 1; i++) {
      if (t[i] == t[i + 1]) {
        return t[i];
      }
    }
    return Integer.MAX_VALUE;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int[] t = new int[k];

    for (int i = 0; i < t.length; i++) {
      t[i] = sc.nextInt();
    }

    sortArray(t);
    int enaka = staEnaka(t);
    if (enaka != Integer.MAX_VALUE) {
      System.out.println(enaka);
    } else if( enaka == Integer.MAX_VALUE) {
      System.out.println("RAZLICNI");
    }
    sc.close();
  }
}
