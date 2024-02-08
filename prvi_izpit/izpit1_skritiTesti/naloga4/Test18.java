
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        List<String> la = List.of("ach", "adw", "afn", "ajp", "ako", "akz", "aoa", "aot", "axo", "axw", "bbs", "bdk", "bdm", "bfi", "ble", "bmp", "bnh", "bvc", "bvs", "bwz", "bzl", "cby", "ccx", "ciy", "cjc", "cqa", "ctq", "cyw", "dcr", "ddk", "dgf", "die", "dji", "djq", "dku", "dov", "dpu", "dqq", "dus", "dzt", "ebk", "ebx", "ebz", "eck", "ees", "egb", "ejy", "epd", "eso", "eta", "etl", "fcc", "fsy", "ftj", "fvp", "fzd", "fzp", "gdj", "gez", "ghs", "gtj", "gtt", "gyw", "hcr", "hfa", "hfd", "hgc", "hgh", "hhx", "hnp", "hru", "hsl", "hsp", "hts", "iii", "iku", "ikz", "ill", "ipn", "iqc", "ixh", "iyh", "jbt", "jbz", "jcx", "jdm", "jdn", "jif", "jkm", "jlk", "jpi", "jpk", "jxn", "jyf", "kcf", "kcg", "kdn", "kdt", "kgj", "khk", "klp", "krm", "kto", "kwh", "lay", "lbv", "lby", "lho", "lkm", "lly", "lml", "lnd", "lsr", "ltb", "lxe", "lyj", "lzi", "mbu", "mdd", "men", "mhf", "mhr", "mlt", "mss", "mvb", "mvd", "myc", "nct", "ncv", "ndl", "net");
        List<String> lb = List.of("nhr", "nhv", "nif", "nks", "npm", "nrx", "nve", "nwi", "ocl", "oet", "ojk", "okb", "okh", "oqw", "otn", "oun", "oza", "ozh", "pbg", "pbv", "pcb", "pfm", "pft", "phe", "plv", "pml", "pnn", "pph", "prd", "psu", "psv", "psw", "qba", "qib", "qjb", "qji", "qpg", "qps", "qqt", "quf", "qzx", "rbt", "rcx", "rfo", "rkq", "roa", "rsk", "rwc", "rww", "rxm", "scf", "sgq", "shn", "sim", "slc", "slv", "sok", "spd", "sql", "tev", "tfi", "tjr", "tkv", "tme", "tmr", "tra", "tre", "uah", "uap", "uce", "udu", "uge", "uii", "uje", "uld", "ull", "uqf", "uqi", "urn", "utr", "uug", "uvq", "uww", "uyf", "vch", "vco", "vdd", "vgv", "vmh", "vqa", "vsh", "vyu", "vyv", "wbj", "wdn", "web", "wef", "wkk", "wkv", "wnn", "wnp", "wns", "wsm", "wwb", "wzl", "wzw", "xhh", "xip", "xjp", "xjy", "xkl", "xrz", "xse", "xwd", "xxc", "xzs", "ybn", "ybp", "ysa", "zcw", "zde", "zes", "zgt", "zjt", "zmg", "znu", "zny", "zss", "zvi", "zxg", "zxk");
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
