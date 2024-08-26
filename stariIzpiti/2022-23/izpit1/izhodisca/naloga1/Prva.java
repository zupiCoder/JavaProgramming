
/*
Samodejno testiranje:
tj.exe Prva.java . .

Testni primeri:

01: primer iz besedila
02..04: na vhodu je 42 "stevil
01, 05..10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        int input = sc.nextInt();
        int temp = input;

        while(sc.hasNextInt()) {
            input = sc.nextInt();

            if(input + temp > max) {
                max = input + temp;
            }
            temp = input;
        }
        System.out.println(max);
    }
}
