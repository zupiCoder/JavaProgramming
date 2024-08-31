import java.util.*;

public class Tekma {

    private String domaci;
    private String gostje;
    private int goliDomacih;
    private int goliGostov;

    public Tekma(String domaci, String gostje, int goliDomacih, int goliGostov) {
        this.domaci = domaci;
        this.gostje = gostje;
        this.goliDomacih = goliDomacih;
        this.goliGostov = goliGostov;
    }

    public int steviloTock(String klub) {
        
        if(!klub.equals(this.domaci) && !klub.equals(this.gostje)) return 0;

        if(this.goliDomacih == this.goliGostov) return 1;

        if(klub.equals(this.domaci)) {

            if(this.goliDomacih > this.goliGostov) {
                return 3;
            } else {
                return 0;
            } 
        } else {
            if(this.goliGostov > this.goliDomacih) {
                return 3;
            } else {
                return 0;
            }
        }
    }

    public String vrniDomace() {
        return this.domaci;
    }

    public String vrniGoste() {
        return this.gostje;
    }

    public int vrniGole() {
        return (int) Math.abs(this.goliDomacih - this.goliGostov);
    }

    @Override
    public String toString() {
        return String.format("%s %d : %d %s", this.domaci, this.goliDomacih,
                this.goliGostov, this.gostje);
    }
}
