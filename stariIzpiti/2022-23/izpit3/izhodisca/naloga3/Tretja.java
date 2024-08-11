import java.beans.PropertyDescriptor;
import java.util.*;

public class Tretja {

    public static class Beseda {
        private String zapis;  // neprazno zaporedje malih "crk angle"ske abecede

        public Beseda(String zapis) {
            this.zapis = zapis;
        }

        @Override
        public String toString() {
            return this.zapis;
        }
    }

    public static  abstract class SamPrid extends Beseda {
        private char spol;
        private int sklon;
        private int stevilo;

        public SamPrid(String zapis, char spol, int sklon, int stevilo) {
            super(zapis);
            this.spol = spol;
            this.sklon = sklon;
            this.stevilo = stevilo;
        }
    }

    public static class Samostalnik extends SamPrid {

        public Samostalnik(String zapis, char spol, int sklon, int stevilo) {
            super(zapis, spol, sklon, stevilo);
        }
    }

    public static class Pridevnik extends SamPrid {

        public Pridevnik(String zapis, char spol, int sklon, int stevilo) {
            super(zapis, spol, sklon, stevilo);
        }
    }

    public static class Glagol extends Beseda {
        private int oseba;    // 1, 2 ali 3
        private int stevilo;  // 1, 2 ali 3

        public Glagol(String zapis, int oseba, int stevilo) {
            super(zapis);
            this.oseba = oseba;
            this.stevilo = stevilo;
        }
    }

    public static class Stavek {
        private Beseda[] besede;

        public Stavek(Beseda[] besede) {
            this.besede = besede;
        }

        public Glagol poisciGlagol() {
            for(int i = 0; i < besede.length; i++) {
                if(this.besede[i] instanceof Glagol) {
                    return (Glagol) this.besede[i];
                }
            }
            return null;
        }

        public boolean preveriPS() {
            // popravite / dopolnite ...

            if(this.besede[besede.length - 1] instanceof Pridevnik) return false;

            for(int i = 1; i < besede.length; i++) {
                if(this.besede[i] instanceof Glagol && this.besede[i - 1] instanceof Pridevnik) {
                    return false;
                }
            }
            return true;
        }
    }
}
