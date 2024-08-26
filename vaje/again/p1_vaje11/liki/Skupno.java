
import java.util.*;

public class Skupno {

    public static <T extends Comparable<T>> void uredi(Vektor<T> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1; i < stElementov; i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && vektor.vrni(j).compareTo(element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    public static <T> void uredi(Vektor<T> vektor, Comparator<T> primerjalnik) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1; i < stElementov; i++) {
            T element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && primerjalnik.compare(vektor.vrni(j), element) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    public static <T> Comparator<T> kompozitum(Comparator<T> prim1, Comparator<T> prim2) {
        return new Kompozitum<>(prim1, prim2);
    }

    private static class Kompozitum<T> implements Comparator<T> {

        private final Comparator<T> prim1;
        private final Comparator<T> prim2;

        public Kompozitum(Comparator<T> prim1, Comparator<T> prim2) {
            this.prim1 = prim1;
            this.prim2 = prim2;
        }

        @Override
        public int compare(T prvi, T drugi) {
            int result = prim1.compare(prvi, drugi);
            if (result != 0) {
                return result;
            }
            return prim2.compare(prvi, drugi);
        }
    }
}
