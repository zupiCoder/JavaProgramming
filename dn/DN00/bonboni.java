import java.util.Scanner;

public class DN0063230372 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int p = sc.nextInt();

        int st_b = b / p;
        int o = b % p;
        System.out.println(st_b);
        System.out.println(o);

    }

}


