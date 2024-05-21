import java.util.Scanner;

public class sestevanje1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stanje = 42;
        

        while(stanje > 0){
            int nakup = sc.nextInt();
            stanje -= nakup;
            
        }
        System.out.println("zmanjkalo je denarja");
    }

}


