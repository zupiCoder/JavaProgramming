
import java.util.*;
import java.util.function.*;

public class Test09 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-891, 389);
        for (int i = 0; i < 485; i++) {
            System.out.println(gen.get());
        }
    }
}
