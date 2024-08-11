import java.util.*;

public class Prva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = 0;
        int z = 0;
        int temp = 0;

        boolean zero = false;
        boolean one = false;

        while(sc.hasNextInt()) {
            int input = sc.nextInt();

            if(input == 2) {
                one = false;
                temp = 2;
            }

            if(input == 0 && !zero) {
                z = 1;
                temp = 0;
                zero = true;

            } else if(input == 1 && !one) {
                v++;
                one = true;
                zero = false;
            } else if(input == 0 && zero) {
                z++;
            } else if(input == 1 && temp == 2) {
                z = 0;
                temp = 0;
            }
        }
        System.out.println(v);
        System.out.println(z);
    }
}
