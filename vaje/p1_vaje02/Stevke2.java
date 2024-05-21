import java.util.Scanner;

public class Stevke2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stevilo = sc.nextInt();

        while(stevilo > 0) {
            int stevka = stevilo % 10;
            System.out.println(stevka);
            stevilo /= 10;

        }
        

    }
}
// se enkat naredil program iz vaj sam, stevilo vsakic delimo z deset, da se znebimo ene od stevk
// ker je deljenje celostevilsko, stevke preprosto ni vec