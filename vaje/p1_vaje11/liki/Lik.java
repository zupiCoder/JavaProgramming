
import java.util.*;

public abstract class Lik implements Comparable<Lik> {

    public int compareTo(Lik drugi) {
        return this.ploscina() - drugi.ploscina();
    }

    public static class PrimerjalnikPoObsegu implements Comparator<Lik> {
        public int compare(Lik a, Lik b) {
            return a.obseg() - b.obseg();
        }
    }

    //////////////
    //anonimni razred - klicemo konstruktor in ustvarimo nov razred



    public static Comparator<Lik> poObsegu() {
        //return new PrimerjalnikPoObsegu();


        return (a, b) -> a.obseg() - b.obseg();
    }

    public static Comparator<Lik> poTipu() {
        return new PrimerjalnikPoTipu();
    }

    public static class PrimerjalnikPoTipu implements Comparator<Lik> {
        public int compare(Lik a, Lik b) {
            return a.tip() - b.tip();
        }
    }

    // public int compareTo(Object a) {
    //     if(a instanceof Lik) {
    //         Lik drugi = (Lik) a;
    //     }
    // }


    //dodaj
    public static void urediPoTipuInObsegu(Vektor<Lik> vektor) {
        Skupno.uredi(vektor,Skupno.kompozitum(poTipu()));
    }


    public abstract int ploscina();

    public abstract int obseg();

    public abstract int tip();

    public String toString() {
        return String.format("%s [%s]", this.vrsta(), this.podatki());
    }

    // Vrne vrsto lika <this> (npr. "pravokotnik").
    public abstract String vrsta();

    // Vrne niz s podatki o liku <this> 
    // (npr. "širina = 3.0, višina = 4.0").
    public abstract String podatki();

    public static void izpisi(Vektor<Lik> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 0;  i < stElementov;  i++) {
            Lik lik = vektor.vrni(i);
            System.out.printf("%s | p = %d | o = %d%n",
                    lik.toString(), lik.ploscina(), lik.obseg());
        }
    }







    //LAMBDE = matematicno definirana metoda

}
