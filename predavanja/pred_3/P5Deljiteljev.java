import java.util.Scanner;

public class P5Deljiteljev{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int st_deljiteljev = 0;
        for(int d = 1; d <= n; d++) {   //namesto break lahko dodamo pogoj v glavo zanke d <= n && st_deljiteljev < 5!!
            if( n % d == 0){
                System.out.println(d);
                st_deljiteljev++;
            }
            if(st_deljiteljev == 5) {
                break;
            }
        }

    }

}


