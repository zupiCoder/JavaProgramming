import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public abstract class Zaporedje {



    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek;  x <= konec;  x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //v podrazredih funkcijo pravilno definiramo
    public Interval minMax(Interval interval) {

        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        Integer min = null;
        Integer max = null;

        for(int i = zacetek; i <= konec;i++) {
            Integer y = y(i);
            if(y != null) {
                min = (min == null) ? y : Math.min(min,y);
                max = (min == null) ? y : Math.max(max,y);
            }
        }
        return new Interval(min, max);
    }
    
    public boolean jeMonotono(Interval interval, int smer) {
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        Integer yp = null;

        for(int x = zacetek; x <= konec; x++) {
            Integer y = y(x);
            if(y != null) {
                if(yp != null && y * smer <= yp * smer) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean jeMonotono(Interval interval) {
       return jeMonotono(interval, 1) || jeMonotono(interval, -1);

    }

    //public abstract Zaporedje vsota(Zaporedje drugo);

    public Zaporedje inverz(Interval interval) {
        // popravite / dopolnite ...
        return null;
    }

    public void narisi(Graphics q,int x0, double enota, olor color; Interval interval){
        
    }
}
