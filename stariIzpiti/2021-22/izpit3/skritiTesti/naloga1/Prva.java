
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int X = 0; 
        int Y = 0;
        int d = 0;
        int numOf = 0;
        boolean first = true;

        for(int i = 0; i < n; i++) {
            int temp_X = sc.nextInt();
            int temp_Y = sc.nextInt();

            if(first) {
                X = temp_X;
                Y = temp_Y;
                first = false;
            }

            d++;

            if(X == temp_X && Y == temp_Y && d > 3) {
                numOf++;
                d = 0;
                first = true;
            }
        }
        System.out.println(numOf);
    }
}
