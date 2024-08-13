import java.util.*;

public class Prva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int k = sc.nextInt();

        int s_temp = s;
        int index_ = 1;

        for(int i = 0; i < k; i++) {
            int st_glav = sc.nextInt();
            //ce vec glav kot na zalogi
            if(st_glav > s_temp) {
                s_temp = s - st_glav;
                index_++;
            } else {
                s_temp -= st_glav;
            }
        }
        System.out.println(index_);
    }
}
