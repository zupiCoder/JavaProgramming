import java.util.Scanner;

public class Kvadrati2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i <= b; i++){            // definiras i, postavis nek statement za i, definiras sestevanje i
            System.out.println(i * i);

        }
    }
}

