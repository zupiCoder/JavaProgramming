import java.util.Scanner;

public class ZlataSredina {

  public static int najdiZlatoSredino(int[] t, int k) {
    // Gremo čez vse elemente v tabeli
    for (int i = 0; i < t.length; i++) {
      int manjsih = 0;
      int vecjih = 0;
      // Preštejemo elemente, ki so manjši in večji od trenutnega elementa
      for (int j = 0; j < t.length; j++) {
        if (t[j] < t[i])
          manjsih++;
        if (t[j] > t[i])
          vecjih++;
      }
      // Preverimo, če je trenutni element zlata sredina
      if (manjsih == k && vecjih == k) {
        return t[i];
      }
    }
    // Če ni elementa, ki ustreza kriteriju, vrnemo neveljavno vrednost
    return -1; // ali -1, odvisno od konteksta
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();  
    int[] t = new int[2 * k + 1];

    for (int i = 0; i < t.length; i++) {
      t[i] = sc.nextInt();
    }

    int zlataSredina = najdiZlatoSredino(t, k);
    if (zlataSredina != -1) {
      System.out.println(zlataSredina);
    } else {
      System.out.println("Ni zlate sredine.");
    }
    sc.close();
  }
}


