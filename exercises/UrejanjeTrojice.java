import java.util.Scanner;

/**
 * UrejanjeTrojice
 */
public class UrejanjeTrojice {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int max = a;
    int min = a;
    
    if(b > max && b > c) {
      max = b;
    } else if (c > max && c > b) {
      max = c;
    }
    if (b < min && b < c){
      min = b;
    } else if (c < min && c < b) {
      min = c;
    }
    
    System.out.println((max));
    System.out.println((min));
  }
}