import java.util.*;

public abstract class Lik implements Comparable<Lik> {

    public abstract int ploscina();

    public abstract int obseg();

    public abstract int tipLika();

    public static Comparator<Lik> poObsegu() {
        return new PoObsegu();
    }

    private static class PoObsegu implements Comparator<Lik> {

        @Override
        public int compare(Lik prvi, Lik drugi) {
            return prvi.obseg() - drugi.obseg();
        }
    }

    public static Comparator<Lik> poTipu() {
        return new PoTipu();
    }

    private static class PoTipu implements Comparator<Lik> {

        @Override
        public int compare(Lik prvi, Lik drugi) {
            return prvi.tipLika() - drugi.tipLika();
        }
    }

    public String toString() {
        return String.format("%s [%s]", this.vrsta(), this.podatki());
    }

    @Override
    public int compareTo(Lik drugi) {
        if (this.ploscina() == drugi.ploscina())
            return 0;

        if (this.ploscina() > drugi.ploscina())
            return 1;

        return -1;
    }

    public static void urediPoTipuInObsegu(Vektor<Lik> vektor) {
        int n = vektor.steviloElementov();
        Comparator<Lik> comparator = Skupno.kompozitum(new PoTipu(), new PoObsegu());
    
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(vektor.vrni(j), vektor.vrni(j + 1)) > 0) {
                    // Swap elements if they are in the wrong order
                    Lik temp = vektor.vrni(j);
                    vektor.nastavi(j, vektor.vrni(j + 1));
                    vektor.nastavi(j + 1, temp);
                }
            }
        }
    }
    
    public abstract String vrsta();

    public abstract String podatki();

    public static void izpisi(Vektor<Lik> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 0; i < stElementov; i++) {
            Lik lik = vektor.vrni(i);
            System.out.printf("%s | p = %d | o = %d%n",
                    lik.toString(), lik.ploscina(), lik.obseg());
        }
    }
}
