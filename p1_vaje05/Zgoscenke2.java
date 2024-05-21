import java.util.Arrays;
import java.util.Scanner;
public class Zgoscenke2 {
  public static int indeksMinimuma(int[] t) {
    int ixMin = 0;
    for ( int i = 1; i < t.length;i++) {
      if (t[i] < t[ixMin]) {
        ixMin = i;
      }
    }
    return ixMin;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int st_zgoscenk = sc.nextInt();
    int capacity = sc.nextInt();
    //tabela za trenutne zasedenosti zgoscenk
    int[] zasedenost = new int[st_zgoscenk];
    while(sc.hasNextInt()) {
      int datoteka = sc.nextInt();
      //a lahko datoteko spravimo na najmanj zasedeno zgoscenko
      int ixzgoscenka = indeksMinimuma(zasedenost);
      if (datoteka + zasedenost[ixzgoscenka] > capacity) {
        break;
      }
      zasedenost[ixzgoscenka] += datoteka;

      System.out.printf("%d Ep -> zgoscenka %d %s%n",datoteka,ixzgoscenka + 1, Arrays.toString(zasedenost));
    } 
  }
}
