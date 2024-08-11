import java.util.*;

public class Prva {

    public static boolean jePrastevilo(int lihoStevilo) {
        boolean prastevilo = true;
        int meja = (int) Math.round(Math.sqrt(lihoStevilo));
        for (int d = 3; d <= meja; d += 2) {
            if (lihoStevilo % d == 0) {
                prastevilo = false;
                break;
            }
        }
        return prastevilo;
    }

    public static boolean stDeljiteljev(int st) {
        int d = 1;

        for(int i = 2; i <= st; i++) {
            if(st % i == 0) d++;
        }

        return d <= 4;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int st = 0;

        if(a % 2 == 0) a++;

        for (int i = a; i <= b; i += 2) {
            if(jePrastevilo(i) && stDeljiteljev(i + 2)) {
                //System.out.println(i);
                st++;
            }
        }

        System.out.println(st);
    }
}
