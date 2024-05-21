import java.util.Scanner;
// public class Smreka {
//   public static void Piramida(int n) {
//     for (int k = 1; k < n; k++)
//       for (int i = 0; i < n - k; i++) {
//         for (int j = 0; j < n - i - 1; j++) { 
//           System.out.print(" ");  
//         }
//         for (int j = 0; j < (2 * i + 1); j++) {
//           System.out.print("*");
//         }
//         System.out.println();
//       }
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int h = sc.nextInt();
//     for (int i = 1;i <= h; i++) {
//       Piramida(n);
//     }
//   }
// }


/**
 * Smreka
 */
public class Smreka {
  public static void Piramida(int n) {
    for (int i = 0; i < n; i++){ //for zanka se zazene tolikokrat, kolikor je vrstic
      for (int j = 0; j < n - i - 1; j++) { 
        System.out.print(" ");
        
      }
      for (int j = 0; j < (2 * i + 1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void znaki(int n) {
    for (int j = 0; j < n - i - 1; j++) { 
      System.out.print(" ");
      
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Piramida(n);
  }
}
//dokoncaj doma

//metode : 
// - zmanjsanje kompleksnosti programa
// - znebimo se dolocenih pogojnih stavkov in zank, sploh ce zelimo nek postopek izvajati veckrat