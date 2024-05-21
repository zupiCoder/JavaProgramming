import java.util.Scanner;

public class prestopno{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int leto = sc.nextInt();

        if(leto % 400 == 0 && leto % 4 == 0 && leto % 100 != 0 ){
            System.out.println("Leto je prestopno.");
        }else{
            System.out.println("Leto ni prestopno.");
        }

    }

}


