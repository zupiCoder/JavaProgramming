import java.util.Scanner;

public class Prastevila {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meja = sc.nextInt();

        for(int i = 2; i <= meja; i++) {
            //za vsako stevilo izracunamo st deljiteljev

            int st_deljiteljev = 0;
            for(int d = 1; d <= i; d++) {

                if (i % d == 0){      //preverimo koliko deljiteljev ima stevilo i znotraj meje
                 st_deljiteljev += 1;
            }
            if(st_deljiteljev == 2){    // ce ima stevilo samo dva deljitelja, 1 in a | a, vemo da je prastevilo
                System.out.println(i);
            }
            }
        }

    }

}

