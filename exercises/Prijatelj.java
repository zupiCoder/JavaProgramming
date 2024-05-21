import java.util.Scanner;
/**
 * Prijatelj
 */
public class Prijatelj {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int stevilo = sc.nextInt();

    //kandidat za prijatelja
    int kandidat = vsotaDeljiteljev(stevilo);

    if(kandidat != stevilo && vsotaDeljiteljev(kandidat) == stevilo) {
      System.out.println(kandidat);
    } else {
      System.out.println("Nima prijatelja.");
    }
  
  }

  public static int vsotaDeljiteljev(int stevilo) {
    int vsota = 0;
    for (int d = 1; d < stevilo; d++) {
      if (stevilo % d == 0) {
        vsota += d;
      }
    }
    return vsota;
  }
}