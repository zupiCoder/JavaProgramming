import java.util.Scanner;

public class Prva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt(); // height
        int d = scanner.nextInt(); // length of the upper side
        
        // Draw the trapezoid
        for (int i = 0; i < h; i++) {
            int stars = d + 2 * i; // Number of stars in the current row
            int spaces = h - i - 1; // Number of leading spaces
            
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            
            if (i == 0 || i == h - 1) {
                for (int j = 0; j < stars; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < stars - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
