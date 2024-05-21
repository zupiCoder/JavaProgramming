import java.util.Scanner;

public class NajvecjiSkupniDeljitelj {
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int g = sc.nextInt();
    
    for (int i = g; i <= n; i+= g) { //vsakic dodamo g in ne preverjamo vseh stevil vmes, ker vemo, da niso deljiva z g
      for (int j = i; j <= n; j+= g) {
        if (gcd(i, j) == g){
          System.out.printf("(%d, %d)%n", i, j);
        }
      }
    }
  }
}
