import java.util.Scanner;
import java.util.Random;

public class Ugibanje {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); //inicializacija nakljucnega generatorja
        
        int ZgornjaM = sc.nextInt();
        int izbrano_stevilo = random.nextInt(ZgornjaM) + 1; //izberemo nakljucno stevilo
        int poskus = sc.nextInt();
        int st_poskusov = 1;
        while(poskus != izbrano_stevilo){
            if(izbrano_stevilo > poskus){
                System.out.println("Vneseno stevilo je manjse.");
            }else {
                System.out.println("Vneseno stevilo je vecje.");
            }
            poskus = sc.nextInt();
            st_poskusov++;

        }
        
        System.out.println(st_poskusov);






    }
}
