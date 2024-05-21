import java.util.Scanner;

public class Izstevanka1 {

  public static int Izpadli(int stVigri, int stBesed) {
    return (stBesed - 1) % stVigri;
  }

  public static String[] Preuredi(int i, String[] t) {
    if (i >= 0 && i < t.length - 1) {
      for (int indeks = i; indeks < t.length - 1; indeks++) {
        t[indeks] = t[indeks + 1];
      }
    }
    String[] n = new String[t.length - 1];
    for (int j = 0; j < n.length; j++) {
      n[j] = t[j];
    }
    return n;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int stOtrok = sc.nextInt();
    int stBesed = sc.nextInt();
    String[] otroci = new String[stOtrok];
    for (int i = 0; i < stOtrok; i++) {
      String vhod = sc.next();
      otroci[i] = vhod;
    }
    int vIgri = stOtrok;

    for (int j = stOtrok; j > 1; j--) {
      int IndeksIzpadlega = Izpadli(vIgri, stBesed);
      System.out.println(otroci[IndeksIzpadlega]);
      otroci = Preuredi(IndeksIzpadlega,otroci);
      vIgri--;
    }
  }
}
