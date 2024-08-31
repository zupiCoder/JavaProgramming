
import java.util.*;

/*

   +-------+-------+-------+-------+
   | S(50) |   P   |       |       |
   +-------+-------+-------+-------+
   |       |   P   |   P   | S(40) |
   +-------+-------+-------+-------+
   |   P   |   P   | S(60) |       |
   +-------+-------+-------+-------+

 */

public class Test05 {

    public static void main(String[] args) {
        Tretja.Mesto mesto = new Tretja.Mesto(3, 4);
        mesto.postavi(0, 0, new Tretja.Stanovanjska(50));
        mesto.postavi(0, 1, new Tretja.Poslovna());
        mesto.postavi(1, 1, new Tretja.Poslovna());
        mesto.postavi(1, 2, new Tretja.Poslovna());
        mesto.postavi(1, 3, new Tretja.Stanovanjska(40));
        mesto.postavi(2, 0, new Tretja.Poslovna());
        mesto.postavi(2, 1, new Tretja.Poslovna());
        mesto.postavi(2, 2, new Tretja.Stanovanjska(60));

        System.out.println(mesto.poslovnaCetrt(1, 1, 1, 2));
        System.out.println(mesto.poslovnaCetrt(1, 1, 2, 2));
        System.out.println(mesto.poslovnaCetrt(0, 1, 2, 1));
        System.out.println(mesto.poslovnaCetrt(2, 0, 2, 0));
        System.out.println(mesto.poslovnaCetrt(0, 0, 2, 3));
        System.out.println(mesto.poslovnaCetrt(1, 0, 2, 1));
        System.out.println(mesto.poslovnaCetrt(1, 1, 1, 3));
    }
}