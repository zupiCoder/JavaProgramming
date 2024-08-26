public abstract class Zaporedje {

    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek; x <= konec; x++) {
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

    public Interval minMax(Interval interval) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = interval.vrniZacetek(); i <= interval.vrniKonec(); i++) {
            if (y(i) != null) {
                if (y(i) < min) {
                    min = y(i);
                }
                if (y(i) > max) {
                    max = y(i);
                }
            }
        }
        return new Interval(min, max);
    }

    public boolean jeMonotono(Interval interval) {

        boolean narasca = false;
        boolean first = true;

        for (int i = interval.vrniZacetek(); i <= interval.vrniKonec() - 1; i++) {
            if (y(i) == null || y(i + 1) == null)
                return false;

            if (first) {
                if (y(i) < y(i + 1))
                    narasca = true;
                first = false;
            }

            if (y(i) < y(i + 1) && !narasca) {
                return false;
            } else if (y(i) > y(i + 1) && narasca) {
                return false;
            }
        }
        return true;
    }

    public Zaporedje vsota(Zaporedje drugo) {
        // popravite / dopolnite ...
        return null;
    }

    public Zaporedje inverz(Interval interval) {
        // popravite / dopolnite ...
        return null;
    }
}
