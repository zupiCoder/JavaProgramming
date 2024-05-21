import java.util.Scanner;
public class Smrekca{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //stevilo vrstic
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
}


