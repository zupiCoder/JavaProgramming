import java.util.Scanner;

/**
 * ZaporedjeZvezdic
 */
public class ZaporedjeZvezdic {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}