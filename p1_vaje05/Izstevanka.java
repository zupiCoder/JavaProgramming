import java.util.Arrays;
import java.util.Scanner;
public class Izstevanka {

  // public static int kdorIzpade(int stOtrok, int stBesed) {
  //   int i = stOtrok % stBesed;
  // }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int stOtrok = sc.nextInt();
    int stBesed = sc.nextInt();
    String[] otroci = new String[stOtrok];
    for(int i = 0; i < stOtrok;i++) {
      String vhod = sc.next();
      otroci[i] = vhod;
    }

    //int st otrok
    int stKrogov = stOtrok;
    int stVigri = stOtrok;
    for(int krog = 0; krog < stKrogov; krog++) {
      int ixIzpadlega = kdoIzpade(stOtrokVigri,stBesed);
    }
  }
}


