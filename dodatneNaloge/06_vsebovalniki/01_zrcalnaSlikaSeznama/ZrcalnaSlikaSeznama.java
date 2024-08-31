import java.util.ArrayList;
import java.util.List;

public class ZrcalnaSlikaSeznama {

    public static <T> List<T> zrcalnaSlika(List<T> seznam) {

        List<T> nov_seznam = new ArrayList<>();

        for (int i = seznam.size() - 1; i >= 0; i--) {
            nov_seznam.add(seznam.get(i));
        }

        return nov_seznam;
    }
}
