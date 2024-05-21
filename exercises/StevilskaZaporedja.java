import java.util.Scanner;

public class StevilskaZaporedja {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();

    if (k == 0) {
      System.out.println("NAPAKA");
      if ((a > b) || (k < 0 && b < 0)) {
        System.out.println("NAPAKA");
      }
    } else {
      while(a < b) {
        if (a < b) {
          System.out.printf("%d%n", a);
        }
        a +=k;
   
      }
    }
  }
}
