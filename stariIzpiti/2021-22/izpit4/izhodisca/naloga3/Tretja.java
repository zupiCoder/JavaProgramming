import java.util.*;

public class Tretja {

    public static abstract class Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Profesor extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Docent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Asistent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Tiskalnik {
        int st_dokumentov;
        ArrayList<String> vrsta;
        ArrayList<Pedagog> vrsta_pedagogi;

        public Tiskalnik() {
            this.st_dokumentov = 0;
            this.vrsta = new ArrayList<String>();
            this.vrsta_pedagogi = new ArrayList<Pedagog>(); 
        }

        public void prejmi(Pedagog pedagog, String dokument) {
            novDokument();

            vrsta.add(dokument);
            vrsta_pedagogi.add(pedagog);
        }

        public int dolzinaVrste() {
            return this.st_dokumentov;
        }

        public void novDokument() {
            this.st_dokumentov++;
        }

        public int steviloDokumentov(Pedagog pedagog) {
            int con = 0;

            if (pedagog instanceof Profesor)
                con = 1;

            if (pedagog instanceof Docent)
                con = 2;

            if (pedagog instanceof Asistent)
                con = 3;

            int st = 0;

            for (int i = 0; i < this.st_dokumentov; i++) {
                if (vrsta_pedagogi.get(i) instanceof Profesor && con == 1) {
                    st++;
                } else if (vrsta_pedagogi.get(i) instanceof Docent && con == 2) {
                    st++;
                } else if (vrsta_pedagogi.get(i) instanceof Asistent && con == 3) {
                    st++;
                }
            }
            return st;
        }

        public void sortArray() {
            int n = vrsta_pedagogi.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (getPriority(vrsta_pedagogi.get(j)) > getPriority(vrsta_pedagogi.get(j + 1))) {
                        Pedagog temp = vrsta_pedagogi.get(j);
                        vrsta_pedagogi.set(j, vrsta_pedagogi.get(j + 1));
                        vrsta_pedagogi.set(j + 1, temp);
                    }
                }
            }
        }
    
        private int getPriority(Pedagog p) {
            if (p instanceof Profesor) {
                return 1; 
            } else if (p instanceof Docent) {
                return 2; 
            }
            return 3;
        }

        public String natisni() {

            if(vrsta.size() == 0) {
                return null;
            }

            String temp = vrsta.get(0);
            vrsta.remove(0);

            if(temp != null) {
                return temp;
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
