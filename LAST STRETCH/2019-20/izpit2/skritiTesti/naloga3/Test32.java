
import java.util.Arrays;

public class Test32 {
    public static void main(String[] args) {
        int[] stolpi = {7, 9, 1, 3, 18, 19, 17, 1, 13};

        Tretja.Ukaz[] ukazi = {
            new Tretja.Odvzemi(8),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(2),
            new Tretja.Postavi(3),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(6),
            new Tretja.Odvzemi(5),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(4),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(7),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(1),
            new Tretja.Postavi(6),
            new Tretja.Postavi(3),
            new Tretja.Postavi(4),
            new Tretja.Postavi(3),
            new Tretja.Postavi(6),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(5),
            new Tretja.Postavi(7),
            new Tretja.Postavi(8),
            new Tretja.Postavi(3),
            new Tretja.Postavi(7),
            new Tretja.Odvzemi(3),
            new Tretja.Postavi(1),
            new Tretja.Postavi(3),
            new Tretja.Postavi(6),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(6),
            new Tretja.Odvzemi(6),
            new Tretja.Postavi(5),
            new Tretja.Postavi(8),
            new Tretja.Postavi(1),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(7),
            new Tretja.Postavi(1),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(6),
            new Tretja.Odvzemi(8),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(4),
            new Tretja.Odvzemi(5),
            new Tretja.Odvzemi(0),
            new Tretja.Postavi(7),
            new Tretja.Postavi(2),
            new Tretja.Odvzemi(6),
            new Tretja.Postavi(5),
            new Tretja.Postavi(6),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(8),
            new Tretja.Odvzemi(1),
            new Tretja.Postavi(2),
            new Tretja.Postavi(1),
            new Tretja.Postavi(4),
            new Tretja.Postavi(3),
            new Tretja.Odvzemi(5),
            new Tretja.Postavi(5),
        };

        for (Tretja.Ukaz ukaz: ukazi) {
            ukaz.izvedi(stolpi);
        }
        System.out.println(Arrays.toString(stolpi));
    }
}
