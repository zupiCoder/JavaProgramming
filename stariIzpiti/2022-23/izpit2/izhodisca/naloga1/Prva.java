import java.util.*;

public class Prva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int st = 0;

        for(int i = 0; i < n; i++) {
            int prvo = sc.nextInt();
            int drugo = sc.nextInt();

            boolean manjse = true;

            while(prvo != 0 && drugo != 0) {
                int tempPrva = prvo % 10;
                int tempDruga = drugo % 10;

                if(tempPrva >= tempDruga) {
                    manjse = false;
                    break;
                }

                prvo = prvo / 10;
                drugo = drugo / 10;
            }

            if(manjse) st++;
        }
        System.out.println(st);
    }
}
