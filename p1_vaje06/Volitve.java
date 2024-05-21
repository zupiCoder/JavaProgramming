
public class Volitve {

    public static void main(String[] args) {
        // dopolnite po potrebi ...
        // System.out.println(glasovi(int [][][]t, int leto, int stranka));
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        // popravite / dopolnite
        int stGlasov = 0;
        for(int volisce = 0; volisce < t[leto][stranka].length;volisce++) {
            stGlasov += t[leto][stranka][volisce];
        }
        return stGlasov;
    }

    public static int[][] glasovi(int[][][] t) {
        // popravite / dopolnite
        int [][] gls = new int[t.length][t[0].length];

        //za vsako leto in vsako stranko
        for(int leto = 0; leto < t.length;leto++) {
            for (int stranka = 0; stranka < t[leto].length;stranka++) {
                gls[leto][stranka] = steviloGlasov(t, leto, stranka);
            }
        }
        return gls;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        // popravite / dopolnite
        int iMaxStGlasov = 0;
        int vMaxstGlasov = 0;
        int indeks = t[leto].length - 1;
        for(int volisce = 0; volisce < t[indeks][stranka].length; volisce++) {
            int vsota = 0;
            for(int leto = 0; leto < t.length; leto++) {
                vsota += t[leto][stranka][volisce];
            }
            if(vsota > vMaxstGlasov) {
                vMaxstGlasov = vsota;
                iMaxStGlasov = volisce;
            }
        }
        return iMaxStGlasov;
    }
    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        // popravite / dopolnite
        int vsotaUvrstitev = 0;
    
        for(int leto = 0; leto < t.length; leto++) {
            int uvrstitevVletu = 1;
            for(s = 0; s < t[leto].length;s++) {
                if(t[leto][s][volisce] > t[leto][stranka][volisce]) {
                    uvrstitevVletu++;
                }
            }
            vsotaUvrstitev += uvrstitevVletu;
        }
        return vsotaUvrstitev;
    }
}
