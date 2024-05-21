import java.util.Arrays;
import java.util.Scanner;
/**
 * ZlataSredinaFaster
 */
public class ZlataSredinaFaster {
  public static int zlata(int[] t, int k) {
    Arrays.sort(t);
    return t[k];
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int[] t = new int[2*k+1];

    for(int i = 0; i < t.length;i++) {
      t[i] = sc.nextInt();
    }

    System.out.print(zlata(t, k));

  }
}

//najhitrejsa metoda, sortiramo seznam od najmanjsega do najvecjega
//nato odcitamo element z indeksom k