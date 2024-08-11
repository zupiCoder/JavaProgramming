
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--10: splošni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();

            while(input %p == 0) {
                input /= p;
            }

            while(input %q == 0) {
                input /= q;
            }

            if (input == 1){
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
