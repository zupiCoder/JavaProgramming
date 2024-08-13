public class Tretja {

    public static abstract class Predavalnica {
        private String oznaka;
        private int stMest;

        protected Predavalnica(String oznaka, int stMest) {
            this.oznaka = oznaka;
            this.stMest = stMest;
        }

        public String vrniOznako() {
            return this.oznaka;
        }

        public int vrniSteviloMest() {
            return this.stMest;
        }

        // popravite / dopolnite ...
        public int casCiscenja() {
            return this.vrniSteviloMest() * 2;
        }
    }

    public static class Avditorna extends Predavalnica {

        public Avditorna(String oznaka, int stMest) {
            super(oznaka, stMest);
        }
    }

    public static class Racunalnica extends Predavalnica {
        private int stRacunalnikov;

        public Racunalnica(String oznaka, int stMest, int stRacunalnikov) {
            super(oznaka, stMest);
            this.stRacunalnikov = stRacunalnikov;
        }

        public int vrniSteviloRacunalnikov() {
            return this.stRacunalnikov;
        }

        @Override
        public int casCiscenja() {
            return this.vrniSteviloRacunalnikov() * 3 + this.vrniSteviloMest() * 2;
        }
    }

    public static class Garaza extends Predavalnica {
        private int povrsina;

        public Garaza(String oznaka, int stMest, int povrsina) {
            super(oznaka, stMest);
            this.povrsina = povrsina;
        }

        @Override
        public int casCiscenja() {
            return this.vrniSteviloMest() * 2 + this.povrsina;
        }
    }

    public static class Stavba {
        private Predavalnica[] predavalnice;

        public Stavba(Predavalnica[] predavalnice) {
            this.predavalnice = predavalnice;
        }

        public int casCiscenja() {
            int cas = 0;
            for (Predavalnica predavalnica: this.predavalnice) {
                cas += predavalnica.casCiscenja();
            }
            return cas;
        }

        public int[] razporedi(int stStudentov, int[] ostanek) {
            int[] razpored = new int[this.predavalnice.length];
            int remainingStudents = stStudentov;
        
            for (int x = 0; x < this.predavalnice.length; x++) {
                if (this.predavalnice[x] instanceof Avditorna) {
                    int roomCapacity = this.predavalnice[x].vrniSteviloMest();
                    if (remainingStudents <= roomCapacity) {
                        razpored[x] = remainingStudents;
                        remainingStudents = 0;
                        break;
                    } else {
                        razpored[x] = roomCapacity;
                        remainingStudents -= roomCapacity;
                    }
                }
            }
        
            for (int x = 0; x < this.predavalnice.length; x++) {
                if (this.predavalnice[x] instanceof Racunalnica) {
                    int roomCapacity = this.predavalnice[x].vrniSteviloMest();
                    if (remainingStudents <= roomCapacity) {
                        razpored[x] = remainingStudents;
                        remainingStudents = 0;
                        break;
                    } else {
                        razpored[x] = roomCapacity;
                        remainingStudents -= roomCapacity;
                    }
                }
            }
        
            for (int x = 0; x < this.predavalnice.length; x++) {
                if (this.predavalnice[x] instanceof Garaza) {
                    int roomCapacity = this.predavalnice[x].vrniSteviloMest();
                    if (remainingStudents <= roomCapacity) {
                        razpored[x] = remainingStudents;
                        remainingStudents = 0;
                        break;
                    } else {
                        razpored[x] = roomCapacity;
                        remainingStudents -= roomCapacity;
                    }
                }
            }
        
            ostanek[0] = remainingStudents;
        
            return razpored;
        }
        
    }
}
