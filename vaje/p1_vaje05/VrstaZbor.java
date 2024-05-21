import java.util.Scanner;

public class VrstaZbor {
  public static boolean lokalnoPravilno(int[] visina,int i) {
    return((i == 0 || visina[i - 1] <= visina[i]) && (i == visina.length -1 || visina[i] <= visina[i + 1]));
  }

  public static int[] preberiVisine(int n, Scanner sc) {
    int[] visina = new int[n];
    for (int i = 0; i < visina.length; i++) {
      visina [i] = sc.nextInt();    
    }
    return visina;
  }
  public static void debugIzpis(int[] visina) {
    String niz = "[";
    for (int i = 0; i < visina.length;i++) {
      if (i > 0) {
        niz += ", ";
        niz = niz + visina[i];
      }
    }
    niz = niz + "]";
    System.out.println(niz);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean lokal = false;
    int[] visine = preberiVisine(n, sc);
    for (int i = 0; i < n; i++) {
      if (lokalnoPravilno(visine,i)) {
        System.out.println(i);
        lokal = true;
      }
    }
    if (!lokal) {
      System.out.println("NOBEDEN");
    }
  }
}
