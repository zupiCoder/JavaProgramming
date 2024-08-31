import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PresekMnozic {

    public static <T> Set<T> presek(Collection<Set<T>> mnozice) {

        Set<T> novaMnozica = null;

        for(Set<T> mnozica: mnozice) {

            if(novaMnozica == null) {
                novaMnozica = new HashSet<>(mnozica);
            } else {
                novaMnozica.retainAll(mnozica);
            }
        }
        return novaMnozica;
    }
}
