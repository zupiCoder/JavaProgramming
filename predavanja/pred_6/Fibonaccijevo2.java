import java.util.Scanner;
public class Fibonaccijevo2 {

  public static int f(int n, int[] memo) {
    if (n <= 1) {
      return n;
    }
    int pp = f(n - 2); //predprejsni clen
    int p = f(n - 1);//prejsnji clen
    memo[n] = pp + p; //za nek n memoriziramo vrednost, s tem zmanjsamo stevilo rekurzij
    return memo[n];
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] memo = new int[n+1];

    System.out.println(f(n,memo));
  }
}
