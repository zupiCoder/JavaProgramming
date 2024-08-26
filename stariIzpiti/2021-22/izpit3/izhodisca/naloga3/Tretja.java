import java.util.*;

public class Tretja {

    public static class Oddajnik {

        private Sprejemnik[] sprejemniki;
        private int stSprejemnikov = 0;

        public Oddajnik() {
            this.sprejemniki = new Sprejemnik[1000];
            this.stSprejemnikov = 0;
        }
        
        public void dodajSprejemnik(Sprejemnik sprejemnik) {
            if (stSprejemnikov < sprejemniki.length) {
                this.sprejemniki[stSprejemnikov++] = sprejemnik;
            }
        }
        
        public void oddaj(char znak) {
            for (int i = 0; i < stSprejemnikov; i++) {
                sprejemniki[i].prejmiZnak(znak);
            }
        }


    }

    public static class Sprejemnik {
        private char[] sporocila;
        private int stSporocil;
        private String zadnjeSporocilo;


        public Sprejemnik(String oddajnik) {
            this.oddajnik = oddajnik;

        }

        public String vrniOddajnik() {
            return this.oddajnik;
        }
        
    }

    public static void main(String[] args) {

    }
}
