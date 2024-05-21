import java.util.Scanner;

public class trgovina{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vsota = 0;
        int i = 1;
        while(i <= 5){
            System.out.print("Vnesite stevilo: ");
            int vnos = sc.nextInt();
            vsota += vnos;
            System.out.println(vsota);
            i++;


        }

    }

}


