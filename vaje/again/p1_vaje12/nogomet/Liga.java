import java.util.*;

public class Liga {

    private Collection<String> klubi;
    private Collection<Tekma> tekme;

    public Liga(Collection<String> klubi, Collection<Tekma> tekme) {
        this.klubi = klubi;
        this.tekme = tekme;
    }

    public int steviloTock(String klub) {
        int st_tock = 0;

        Iterator<Tekma> iterator = this.tekme.iterator();

        while (iterator.hasNext()) {
            Tekma temp = iterator.next();

            if (temp.vrniGoste().equals(klub) || temp.vrniDomace().equals(klub)) {
                st_tock += temp.steviloTock(klub);
            }
        }

        return st_tock;
    }

    public Slovar<String, Integer> klub2tocke() {

        Iterator<String> iterator = this.klubi.iterator();

        Slovar<String, Integer> newSlovar = new Slovar<>();

        while (iterator.hasNext()) {
            String temp_klub = iterator.next();
            newSlovar.shrani(temp_klub, steviloTock(temp_klub));
        }

        return newSlovar;
    }

    public List<String> lestvica() {
        List<String> seznam = new ArrayList<>();
        for (String klub : klubi) {
            seznam.add(klub);
        }
        seznam.sort(new Comparator<String>() {
            public int compare(String ena, String dva) {
                if (steviloTock(dva) - steviloTock(ena) == 0) {
                    return ena.compareTo(dva);
                }
                return steviloTock(dva) - steviloTock(ena);
            };
        });
        return seznam;
    }

    public Iterator<Tekma> poTekmah(int minGR) {

        Iterator<Tekma> iterator__Tekma = new Iterator<Tekma>() {

            private final Iterator<Tekma> iterator = tekme.iterator();
            private Tekma nextTekma = null;

            @Override
            public boolean hasNext() {
                while (iterator.hasNext()) {
                    Tekma currentTekma = iterator.next();
                    int goalDifference = currentTekma.vrniGole();
                    if (goalDifference >= minGR) {
                        nextTekma = currentTekma;
                        return true;
                    }
                }
                return false;
            }

            @Override
            public Tekma next() {
                if (nextTekma == null && !hasNext()) {
                    throw new NoSuchElementException();
                }
                Tekma result = nextTekma;
                nextTekma = null;
                return result;
            }
        };

        return iterator__Tekma;
    }
}
