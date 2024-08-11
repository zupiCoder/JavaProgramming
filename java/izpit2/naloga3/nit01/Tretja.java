
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--06: ro"cno izdelani
07--12: samodejno izdelani

01--02, 07--08: klici metode steviloStanovanj
03--04, 09--10: klici metode koliko
05--06, 11--12: klici metode poslovnaCetrt

01, 03, 05, 07, 09, 11: brez ru"senja
02, 04, 06, 08, 10, 12: z ru"senjem
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    //=========================================================================

    public static abstract class Stavba {
        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Stanovanjska extends Stavba {
        private int stStanovanj;   // "stevilo stanovanj

        public Stanovanjska(int stStanovanj) {
            this.stStanovanj = stStanovanj;
        }

        public int steviloStanovanj() {
            return this.stStanovanj;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Poslovna extends Stavba {

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Mesto {

        private int stVrstic;
        private int stStolpcev;
        private Stavba[][] parcele;

        public Mesto(int stVrstic, int stStolpcev) {
            this.stVrstic = stVrstic;
            this.stStolpcev = stStolpcev;

            parcele = new Stavba[stVrstic][stStolpcev];
        }

        public void postavi(int vrstica, int stolpec, Stavba stavba) {
            this.parcele[vrstica][stolpec] = stavba;
        }

        public int steviloStanovanj() {
            int stStanovanj = 0;
 
            for(int i = 0; i < this.stVrstic; i++) {
                for(int j = 0; j < this.stStolpcev; j++) {
                    Stavba temp = this.parcele[i][j];
                    if(temp instanceof Stanovanjska && temp != null) {
                        stStanovanj += ((Stanovanjska) temp).steviloStanovanj();
                    }
                }
            }

            return stStanovanj;
        }

        public int koliko(Stavba stavba) {
            int st = 0;
            boolean stanovanjsko = true;

            if(stavba instanceof Poslovna) stanovanjsko = false;

            for(int i = 0; i < this.stVrstic; i++) {
                for(int j = 0; j < this.stStolpcev; j++) {
                    Stavba temp = this.parcele[i][j];

                    if(stanovanjsko && temp instanceof Stanovanjska) {
                        st++;
                    }

                    if(!stanovanjsko && temp instanceof Poslovna) {
                        st++;
                    }
                }
            }

            return st;
        }

        //
        // Velja 
        // 0 <= vrZac <= vrKon < this.stVrstic
        // in
        // 0 <= stZac <= stKon < this.stStolpcev.
        //
        public boolean poslovnaCetrt(int vrZac, int stZac, int vrKon, int stKon) {
            for (int i = vrZac; i <= vrKon; i++) {
                for (int j = stZac; j <= stKon; j++) {
                    if (!(parcele[i][j] instanceof Poslovna)) {
                        return false;
                    }
                }
            }
            return true;
        }

        // pomo"zne metode (po potrebi) ...
    }

    //=========================================================================

    // drugi notranji razredi (po potrebi) ...
}
