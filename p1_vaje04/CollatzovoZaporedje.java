import java.util.Scanner;

public class CollatzovoZaporedje {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int st_clenov = 1;
    int st_max = 1;
    int naj_clen = 0;

  for(int i = a; i <= b; i++) {
    int kandidat = i;
    while (kandidat > 1) {
      if (kandidat % 2 == 0) {
        kandidat = kandidat / 2;
      } else {
        kandidat = kandidat * 3 + 1;
      }
      st_clenov++;          
    }
    if (st_clenov > st_max) {
      st_max = st_clenov;
      naj_clen = i;
    }
    st_clenov = 1;
  }
    System.out.printf("%d%n%d",naj_clen, st_max);
  }
}
