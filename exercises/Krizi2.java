import java.util.Scanner;

public class Krizi2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    // navpicniKrak(n);
    // SredinskaLinija(n);
    // navpicniKrak(n);
    znaki('*',10, false);
  
  }

  public static void navpicniKrak(int visina) { //parametru je na zacetku dodeljena vrednost n
    for (int i = 1; i <= visina; i++) {
      for (int j = 1; j <= visina; j++) {
        System.out.print(" ");
      }
      System.out.println("+");
    }
  }

  public static void SredinskaLinija(int n){  //dodamo parameter, saj metoda ne more uporabiti spremenljivke n
    for (int i = 1; i <= 2 * n + 1; i++) {
      System.out.print("+");
    }
    System.out.println();
  }

  public static void znaki(char znak, int stPonovitev, boolean prelom) {
    for (int i = 1; i <= stPonovitev; i++) {
      System.out.println(znak);
      if (prelom) {
        System.out.println();
      }
    }
  }
}