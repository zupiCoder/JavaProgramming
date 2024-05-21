import java.util.Scanner;

public class tocke{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int tocke = sc.nextInt();

   int ocena = 0;
   if(tocke >= 0 && tocke <= 100){
    if(tocke >= 90){
        ocena = 10;
    }else if (tocke >= 80){      //v else stavku hitrejsi program, ker ne gleda posameznega if stavka
        ocena = 9;
    }
    } 
    
}

}

