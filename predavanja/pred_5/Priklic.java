import java.util.Scanner;
public class Priklic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] tabela = new int[n];

    for ( int i = 0; i < n; i++) {
      // int stevilo = sc.nextInt();
      // tabela[i] = stevilo;
      tabela[i] = sc.nextInt();
    }

    for (int el : tabela) {
      System.out.println(el);
    }
  }
}
