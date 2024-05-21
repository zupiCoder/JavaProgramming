import java.util.Scanner;

public class Postevanka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            //izpisi ito vrstico veckratnike stevila i

            //presledki i -1 ( izpisemo jih tako, da i-1 krat izpisemo presledek)
            for(int p = 1; p <= i - 1; p++ ){
                System.out.print("    ");

            }
            //zmnozki
            for(int j = i; j <= n; j++){
                int zmnozek = i * j;
                System.out.printf("%3d ", zmnozek);

            }

            // prelom vrstice
            System.out.println();
        }

    }

}

