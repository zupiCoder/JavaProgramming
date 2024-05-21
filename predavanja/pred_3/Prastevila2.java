import java.util.Scanner;

public class Prastevila2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meja = sc.nextInt();

        for(int i = 2; i <= meja; i++) {
            //za vsako stevilo izracunamo st deljiteljev
            boolean prastevilo = true;
            for(int d = 2; d < i; d++) {
                if (i % d == 0){      //preverimo koliko deljiteljev ima stevilo i znotraj meje
                    prastevilo = false; 
                    break;
                }
            //ce se zanka iztece do konca potem bo prastevilo enako true

            }
            if(prastevilo) {
                System.out.println(i);

            }    
        }
    }

}


