import java.util.Scanner;
public class Postevanka3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int zmnozek = 0;
    int kandidat = 1;
    while (zmnozek < b) {
      zmnozek = a * kandidat;
      System.out.printf("%d * %d = %d%n", a, kandidat, zmnozek);
      kandidat++;
    }
  }
}
