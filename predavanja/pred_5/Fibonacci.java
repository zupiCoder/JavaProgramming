import java.util.Scanner;
public class Fibonacci {
  public static int f(int n) {
    if (n <= 1) {
      return n; 
    }
    int pp = f(n-2);
    int p = f(n-1);
    return pp + p;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(f(n));

  }
}
