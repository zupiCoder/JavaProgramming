
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        List<String> la = List.of("abb", "agk", "amr", "aus", "bdd", "bur", "byg", "clh", "cni", "cou", "cqa", "csr", "dbc", "dbz", "djy", "elg", "eob", "eop", "eue", "evu", "ewz", "exh", "ezj", "fan", "fhp", "fll", "fop", "fwo", "gdx", "git", "gko", "gqf", "guo", "hbo", "hcf", "huz", "igj", "iit", "ilw", "ilz", "ipq", "ipx", "isr", "jbi", "jho", "jkt", "kmb", "kmh", "ktz", "kuc", "kvb", "laq", "lbk", "liw", "lko", "lmk", "lpw", "lux", "mfu", "mih", "mkp", "mtg", "mzx", "nco", "nnu", "ocd", "okq", "omf", "omi", "ooy", "orf", "ovs", "par");
        List<String> lb = List.of("pbh", "pdn", "pdv", "php", "pjo", "pmj", "pmp", "pvc", "qap", "qex", "qim", "qiu", "qkc", "qli", "qqw", "qtg", "qtv", "qvc", "qvd", "rcz", "rjm", "rpo", "rtx", "sbr", "sbs", "spp", "sss", "stk", "stn", "tfz", "tmn", "tqp", "tyh", "ucb", "ufs", "ugl", "uhr", "uia", "ukc", "ulz", "unb", "uqt", "uug", "uyq", "vas", "vbx", "viz", "vqn", "wdv", "weh", "wmh", "woa", "wun", "wzn", "xax", "xcw", "xdx", "xeo", "xjg", "xsj", "xvh", "xwh", "ybl", "ybz", "yeo", "ylt", "yto", "zbc", "zno", "zpw", "zrb", "ztw", "zxv");
        List<String> lc = it2list(Cetrta.zlitje(la.iterator(), lb.iterator()));
        System.out.println(lc);
    }

    private static <T> List<T> it2list(Iterator<T> it) {
        List<T> seznam = new ArrayList<>();
        while (it.hasNext()) {
            T element = it.next();
            seznam.add(element);
        }
        return seznam;
    }
}
