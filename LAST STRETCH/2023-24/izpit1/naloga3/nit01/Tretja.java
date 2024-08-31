
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02, 03: ro"cno izdelani (in manj"si)
04--10: samodejno izdelani (in ve"cji)

Primeri 01, 02 in 03 vsebujejo isti dnevnik, razlikujejo se le po klicih metod.

01, 04--05: steviloMalicarjev
02, 06--07: kolikoRekreacije
03, 08--10: prisotnost
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
    }

    public abstract static class Dogodek {
        private int oseba;
        private Cas cas;
        private boolean odhod;

        protected Dogodek(int oseba, Cas cas, boolean odhod) {
            this.oseba = oseba;
            this.cas = cas;
            this.odhod = odhod;
        }

        public int vrniOsebo() {
            return this.oseba;
        }

        public Cas vrniCas() {
            return this.cas;
        }

        public boolean jeOdhod() {
            return this.odhod;
        }
    }

    public static class Malica extends Dogodek {
        public Malica(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Rekreacija extends Dogodek {
        public Rekreacija(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class SluzbenaPot extends Dogodek {
        public SluzbenaPot(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Dnevnik {
        private int stZaposlenih;
        private Dogodek[] dogodki;

        public Dnevnik(int stZaposlenih, Dogodek[] dogodki) {
            this.stZaposlenih = stZaposlenih;
            this.dogodki = dogodki;
        }

        public int steviloMalicarjev() {
            int vsota = 0;
            for(int i = 0; i < dogodki.length; i++){
                if (dogodki[i] instanceof Malica && dogodki[i].odhod) {
                    vsota++;
                }
            }
            return vsota;
        }

        public int kolikoRekreacije(int oseba) {
            int vsota = 0;
            for(int i = 0; i < dogodki.length; i++){
                if (dogodki[i] instanceof Rekreacija && dogodki[i].vrniOsebo() == oseba) {
                    Cas t1 = dogodki[i].vrniCas();
                    i++;
                    while (!(dogodki[i] instanceof Rekreacija && dogodki[i].vrniOsebo() == oseba)) {
                        i++;
                    }
                    vsota += dogodki[i].vrniCas().razlikaVMin(t1);
                }
            }
            return vsota;
        }

        public boolean[] prisotnost(Cas cas) {
            boolean[] tabelca = new boolean[stZaposlenih];
            for(int i = 0; i < stZaposlenih; i++){
                tabelca[i] = true;
            }
            for(int i = 0; i < dogodki.length && cas.compareTo(dogodki[i].vrniCas()) >= 0; i++){
                if (dogodki[i].odhod) {
                    tabelca[dogodki[i].vrniOsebo()] = false;
                } else {
                    tabelca[dogodki[i].vrniOsebo()] = true;
                }
            }
            return tabelca;
        }
    }
}
