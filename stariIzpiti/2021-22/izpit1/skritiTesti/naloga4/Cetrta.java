import java.util.*;

public class Cetrta {

    public static <T> List<T> odsek(Iterator<T> it, int p, int q) {
        List<T> result = new ArrayList<>();
        int index = 0;

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
            private Integer nextValue = null;

            @Override
            public boolean hasNext() {
                return true; // The task specifies that hasNext should always return true.
            }

            @Override
            public Integer next() {
                if (nextValue != null) {
                    int temp = nextValue;
                    nextValue = null;
                    return temp;
                }

                if (it.hasNext()) {
                    int nextInIt = it.next();
                    if (current < nextInIt) {
                        nextValue = nextInIt;
                        return current++;
                    } else {
                        current = nextInIt + 1;
                    }
                }

                return current++;
            }
        };
    }

    public static void main(String[] args) {

    }
}
