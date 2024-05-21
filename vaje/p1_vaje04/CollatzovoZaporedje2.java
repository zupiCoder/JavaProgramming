import java.util.Scanner;

public class CollatzovoZaporedje2 {
  
  public static int StClenov(int kandidat) {
    int st_clenov = 1;
    while (kandidat > 1) {
      if (kandidat % 2 == 0) {
        kandidat = kandidat / 2;
      } else {
        kandidat = kandidat * 3 + 1;
      }
      st_clenov++;
    }
    return st_clenov;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int st_max = 1;
    int naj_clen = 0;

    for (int i = a; i <= b; i++) {
      int kandidat = i;
      if (StClenov(i) > st_max) {
        st_max = StClenov(i);
        naj_clen = i;
      }
    }
    System.out.printf("%d%n%d%n", naj_clen, st_max);
  }
}