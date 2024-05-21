import java.util.Scanner;

public class Deljitelji{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int stevilo = sc.nextInt();
        int st_deljiteljev = 0;
        for(int i = 1; i <= stevilo; i++) {
            if (stevilo % i == 0){
                System.out.println(i);
                st_deljiteljev += 1;
            }
        }
        System.out.println(st_deljiteljev);



    }

}

