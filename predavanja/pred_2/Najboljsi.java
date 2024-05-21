import java.util.Scanner;

public class Najboljsi{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stA = sc.nextInt();
        int najdolzina = 0;
        int najAtlet = 0;
        for(int atlet = 1; atlet <= stA; atlet++){
            int dolzina = sc.nextInt();
            if(dolzina > najdolzina){
                najdolzina = dolzina; // nova najvecja dolzina
                najAtlet = atlet; //novi rekorder
            }
         

        }
        System.out.println(najdolzina);
        System.out.println(najAtlet);
    }

}
//stevec na tem mestu ne obstaja vec

