
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
        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(3, new Cas(7, 0), true),
            new Tretja.Rekreacija(6, new Cas(7, 30), true),
            new Tretja.Rekreacija(3, new Cas(8, 0), false),
            new Tretja.Rekreacija(6, new Cas(8, 20), false),
            new Tretja.SluzbenaPot(1, new Cas(8, 20), true),
            new Tretja.SluzbenaPot(2, new Cas(8, 40), true),
            new Tretja.Rekreacija(3, new Cas(11, 20), true),
            new Tretja.Malica(0, new Cas(11, 30), true),
            new Tretja.Malica(4, new Cas(11, 30), true),
            new Tretja.Rekreacija(3, new Cas(11, 40), false),
            new Tretja.SluzbenaPot(2, new Cas(11, 50), false),
            new Tretja.Malica(4, new Cas(12, 0), false),
            new Tretja.Malica(0, new Cas(12, 10), false),
            new Tretja.Rekreacija(6, new Cas(13, 30), true),
            new Tretja.Rekreacija(6, new Cas(13, 50), false),
            new Tretja.Rekreacija(6, new Cas(14, 0), true),
            new Tretja.SluzbenaPot(1, new Cas(14, 10), false),
            new Tretja.Malica(5, new Cas(14, 10), true),
            new Tretja.Malica(5, new Cas(14, 30), false),
            new Tretja.Rekreacija(6, new Cas(14, 50), false),
        };

        int stZaposlenih = 7;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = List.of(
            new Cas( 6, 59),
            new Cas( 7,  0),
            new Cas( 7, 30),
            new Cas(11, 29),
            new Cas(11, 30),
            new Cas(11, 50),
            new Cas(13, 30),
            new Cas(14, 10),
            new Cas(14, 50)
        );
        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
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
            int st = 0;
            
            for(int i = 0; i < dogodki.length; i++) {
                if(this.dogodki[i] instanceof Malica) {
                    st++;
                }
            }

            st = st / 2;
            return st;
        }

        public int kolikoRekreacije(int oseba) {
            Cas start = null;
            Cas end = null;
            int c = 0;
            
            for(int i = 0; i < dogodki.length; i++) {
                if(this.dogodki[i] instanceof Rekreacija && this.dogodki[i].oseba == oseba) {

                    if(this.dogodki[i].odhod) {
                        start = this.dogodki[i].cas;
                    }

                    if(this.dogodki[i].odhod == false) {
                        end = this.dogodki[i].cas;
                        c += end.razlikaVMin(start);
                    }
                }
            }

            return c;
        }

        public boolean[] prisotnost(Cas cas) {
            
            boolean[] prisoten = new boolean[this.stZaposlenih];

            for(int i = 0; i < prisoten.length; i++) {
                prisoten[i] = true;
            }

            for(int i = 0; i < dogodki.length && cas.razlikaVMin(this.dogodki[i].cas) >= 0; i++) {
                int index = this.dogodki[i].oseba;

                if(this.dogodki[i].odhod) {
                    prisoten[index] = false;
                } else if(!this.dogodki[i].odhod) {
                    prisoten[index] = true;
                }
            }
            
            return prisoten;
        }
    }
}
