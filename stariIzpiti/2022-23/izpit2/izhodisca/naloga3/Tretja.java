
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01-03: razdalja2
04-06: poPredpisih
07-10: najTip
01, 04, 07: ro"cno izdelani
*/

import java.util.*;

public class Tretja {

    //=========================================================================

    public static class Igrisce {
        private Igralo[] igrala;

        public Igrisce(Igralo[] igrala) {
            this.igrala = igrala;
        }

        public boolean poPredpisih() {
            for(int i = 0; i < igrala.length; i++) {
                for(int j = 1; j < igrala.length; j++) {
                    if(!igrala[i].equals(igrala[j])) {
                        int minRaz = igrala[i].minRazdalja2() > igrala[j].minRazdalja2() ? igrala[i].minRazdalja2() : igrala[j].minRazdalja2();

                        if(igrala[i].razdalja2(igrala[j]) < minRaz) return false;
                    }
                }
            }
            return true;
        }

        public int najTip() {

            int naj = 0;
            int indx = 0;
            int[] stIg = new int[4];

            for(int i = 0; i < igrala.length; i++) {
                if(igrala[i] instanceof Gugalnica) {
                    stIg[0]++;
                } else if(igrala[i] instanceof Tobogan) {
                    stIg[1]++;
                } else if(igrala[i] instanceof Plezalo) {
                    stIg[2]++;
                } else if(igrala[i] instanceof Vzmetnik) {
                    stIg[3]++;
                }
            }

            //System.out.println(Arrays.toString(stIg));

            for(int i = 0; i < stIg.length; i++) {
                if(stIg[i] > naj) {
                    naj = stIg[i];
                    indx = i;
                }
            }
            return indx;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static abstract class Igralo {
        private int x;
        private int y;

        protected Igralo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public abstract int minRazdalja2();

        public int razdalja2(Igralo igr) {

            int xx = (igr.x - this.x) * (igr.x - this.x);
            int yy = (igr.y - this.y) * (igr.y - this.y);

            return (int)Math.abs(xx + yy);
        }
    }

    //=========================================================================

    public static class Gugalnica extends Igralo {
        public Gugalnica(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 200 * 200;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Tobogan extends Igralo {
        public Tobogan(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 150 * 150;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Plezalo extends Igralo {
        public Plezalo(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 130 * 130;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Vzmetnik extends Igralo {
        public Vzmetnik(int x, int y) {
            super(x, y);
        }

        @Override
        public int minRazdalja2() {
            return 100 * 100;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...

    }
}
