import java.util.Scanner;

public class Sestevanje2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vsota = 0;
        int i = 1;
        for(i = 1; i <= 5; i++){
            System.out.print("Vnesite stevilo: ");
            int vnos = sc.nextInt();
            vsota += vnos;
            System.out.println(vsota);

        }

    }

}
//stevec na tem mestu ne obstaja vec

