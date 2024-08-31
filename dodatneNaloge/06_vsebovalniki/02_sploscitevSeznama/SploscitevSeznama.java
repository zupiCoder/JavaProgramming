import java.util.ArrayList;
import java.util.List;

public class SploscitevSeznama {
    
    public static <T> List<T> splosci(List<List<T>> seznami){
        List<T> nov_seznam = new ArrayList<>();
        
        for(int i = 0; i < seznami.size(); i++) {

            for(int j = 0; j < (seznami.get(i).size()); j++) {
                nov_seznam.add(seznami.get(i).get(j));
            }
        }
        return nov_seznam;
    }
}
