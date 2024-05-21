import java.util.Scanner;

public class DN03_63230372 {

  public static int koliko(int ploscice, int h, int l, int k) {
    int st_ploscic = 0;
    int st_kvadrata = 0;
    // System.out.println("x in y prav: " + h + " " + l);
    st_kvadrata = (int) Math.pow(2, k);
    // System.out.println("velikost ploscice: " + st_kvadrata);
    if (st_kvadrata <= h && st_kvadrata <= l) {
      int xh = h / st_kvadrata;
      int xl = l / st_kvadrata;
      // System.out.println("xh in xl: " + xh + " " + xl);
      if (xh > 0 && xl > 0) {
        st_ploscic += xh * xl;
        ploscice += st_ploscic;
        if (k > -1) {
          if (h % st_kvadrata != 0 && l % st_kvadrata != 0) {
            return koliko(ploscice, h % st_kvadrata, l, k - 1)
                + koliko(ploscice, l % st_kvadrata, h - h % st_kvadrata, k - 1) - ploscice;
          } else if (h % st_kvadrata != 0 && l % st_kvadrata == 0) {
            return koliko(ploscice, h % st_kvadrata, l, k - 1);
          } else if (h % st_kvadrata == 0 && l % st_kvadrata != 0) {
            return koliko(ploscice, h, l % st_kvadrata, k - 1);
          } else if (h % st_kvadrata == 0 && l % st_kvadrata == 0) {
            return ploscice;
          }
        }
      }
    } else {
      return koliko(ploscice, h, l, k - 1);
    }
    return st_ploscic;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int l = sc.nextInt();
    int k = sc.nextInt();
    int st_vseh_ploscic = 0;
    st_vseh_ploscic = koliko(st_vseh_ploscic, h, l, k);
    System.out.println(st_vseh_ploscic);

  }
}


