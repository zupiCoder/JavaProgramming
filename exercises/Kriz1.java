
public class Kriz1 {

  public static void main(String[] args) {

    navpicniKrak();

    // sredinska linija
    for (int i = 1; i <= 2 * 4 + 1; i++) {
      System.out.print("+");
    }
    System.out.println();
    navpicniKrak();
  }

  public static void navpicniKrak() {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        System.out.print(" ");
      }
      System.out.println("+");
    }
  }

}