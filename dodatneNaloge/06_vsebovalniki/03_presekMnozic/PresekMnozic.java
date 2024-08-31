import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PresekMnozic {

    public static <T> Set<T> presek(Collection<Set<T>> mnozice) {
        Set<T> novaMnozica = new HashSet<>();
        boolean first = true;

        for (Set<T> mnozica : mnozice) {
            if (first) {
                novaMnozica.addAll(mnozica);
                first = false;
            } else {
                novaMnozica.retainAll(mnozica);
            }
        }
        return novaMnozica;
    }
}
