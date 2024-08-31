
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
        Tretja.Mesto mesto = new Tretja.Mesto(3, 4);
        mesto.postavi(0, 0, new Tretja.Stanovanjska(50));
        mesto.postavi(0, 1, new Tretja.Poslovna());
        mesto.postavi(1, 1, new Tretja.Poslovna());
        mesto.postavi(1, 2, new Tretja.Poslovna());
        mesto.postavi(1, 3, new Tretja.Stanovanjska(40));
        mesto.postavi(2, 0, new Tretja.Poslovna());
        mesto.postavi(2, 1, new Tretja.Poslovna());
        mesto.postavi(2, 2, new Tretja.Stanovanjska(60));

        System.out.println(mesto.poslovnaCetrt(1, 1, 2, 2));
    }

    //=========================================================================

    public static abstract class Stavba {
        int x;
        int y;
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
        Stavba[][] povrsina;
        // po potrebi dopolnite ...

        public Mesto(int stVrstic, int stStolpcev) {
            povrsina = new Stavba[stVrstic][stStolpcev];
        }

        public void postavi(int vrstica, int stolpec, Stavba stavba) {
            povrsina[vrstica][stolpec] = stavba;
        }

        public int steviloStanovanj() {
            int vsota = 0;
            for(int i = 0; i < povrsina.length; i++){
                for(int j = 0; j < povrsina[0].length; j++){
                    if (povrsina[i][j] instanceof Stanovanjska) {
                        vsota+= ((Stanovanjska)povrsina[i][j]).steviloStanovanj();
                    }
                }
            }
            return vsota;
        }

        public int koliko(Stavba stavba) {
            int vsota = 0;
            if (stavba instanceof Stanovanjska) {
                for(int i = 0; i < povrsina.length; i++){
                    for(int j = 0; j < povrsina[0].length; j++){
                        if (povrsina[i][j] instanceof Stanovanjska) {
                            vsota++;
                        }
                    }
                }
            } else {
                for(int i = 0; i < povrsina.length; i++){
                    for(int j = 0; j < povrsina[0].length; j++){
                        if (povrsina[i][j] instanceof Poslovna) {
                            vsota++;
                        }
                    }
                }
            }
            return vsota;
        }

        //
        // Velja 
        // 0 <= vrZac <= vrKon < this.stVrstic
        // in
        // 0 <= stZac <= stKon < this.stStolpcev.
        //
        public boolean poslovnaCetrt(int vrZac, int stZac, int vrKon, int stKon) {
            for(int i = vrZac; i <= vrKon; i++){
                for(int j = stZac; j <= stKon; j++){
                    if (!(povrsina[i][j] instanceof Poslovna)) {
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
