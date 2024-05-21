import java.util.Scanner;

public class Prastevila3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meja = sc.nextInt();


        System.out.println(2);
        for(int i = 3; i <= meja; i += 2) {
            //za vsako stevilo izracunamo st deljiteljev

            boolean prastevilo = true;
            for(int d = 3; d < i; d += 2) {
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


