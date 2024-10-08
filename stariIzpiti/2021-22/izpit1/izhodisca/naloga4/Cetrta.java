import java.util.*;

public class Cetrta {

    public static <T> List<T> odsek(Iterator<T> it, int p, int q) {
        int index = 0;
        List<T> result = new ArrayList<>();

        while (it.hasNext()) {
            T element = it.next();
            if (index >= p && index <= q) {
                result.add(element);
            }
            index++;
        }

        return result;
    }

    public static Iterator<Integer> manjkajoci(Iterator<Integer> it, int zacetek) {
        return new Iterator<>() {
            private int current = zacetek;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                if (it.hasNext()) {
                    int nextItValue = it.next();
                    while (current < nextItValue) {
                        return current++;
                    }
                    // Skip the current value since it's in the iterator
                    current = nextItValue + 1;
                }
                return current++;
            }
        };
    }

    public static void main(String[] args) {
        // Test odsek method
    }
}
