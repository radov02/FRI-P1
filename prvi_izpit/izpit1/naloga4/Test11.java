
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        List<String> la = List.of("aaj", "aav", "abh", "acb", "acc", "acd", "acm", "afn", "agi", "ajq", "amt", "ana", "and", "anx", "aob", "aoe", "aqp", "aro", "asz", "atp", "aut", "avk", "aya", "bac", "bad", "bba", "bfb", "bfq", "bgv", "bka", "blm", "blo", "bng", "boa", "bol", "bpl", "bsb", "bul", "bxh", "byd", "cav", "cbx", "ccn", "ccq", "chv", "cmy", "cpm", "crt", "csr", "ctk", "cve", "cvj", "czn", "czr", "dao", "dcq", "dlg", "dot", "dpe", "drr", "dth", "dts", "dvm", "dvs", "dws", "dyd", "eak", "ebh", "ech", "ecs", "eeb", "efl", "ejy", "ekw", "eng", "enl", "epu", "esy", "evo", "ewl", "exx", "eyw", "ezp", "fbr", "fgt", "fkn", "fkr", "flw", "fpg", "fph", "fqb", "fqe", "fse", "fta", "ftg", "ftz", "fvr", "fwu", "fxt", "fyf", "fzs", "fzu", "gcd", "gdf", "geq", "gfj", "ggv", "gjl", "glk", "gln", "gnx", "gsb", "guq", "gvb", "gwk", "gxh", "gzt", "hca", "hck", "hey", "his", "hiu", "hiv", "hjf", "hjr", "hka", "hkz", "hoh", "hpz", "htk", "hxg", "ifw", "igc", "ihw", "iiv", "ijc", "ijo", "ilu", "inx", "iqd", "irx", "ivo", "iwa", "ixq", "iyt", "iyx", "jcr", "jdc", "jds", "jdx", "jew", "jhn", "jhw", "jjf", "jki", "jky", "jly", "jmi", "joj", "jpj", "jrg", "jsg", "jtn", "jvp", "jzf", "kag", "kal", "kan", "kax", "kbq", "kbu", "kcl", "kdu", "kdz", "khd", "khi", "kiu", "kjg", "kjq", "klq", "kme", "kmq", "kow", "kqh", "kqx", "krg", "krs", "ktj", "kwb", "kwu", "kyg", "kzm", "lbe", "lbp", "lcr", "ldl", "lfo", "lfz", "lhf", "lhp", "ljx", "lru", "ltd", "ltt", "luv", "lwn", "lzk", "lzs", "lzx", "mas", "mev", "mfx", "mgb", "mik", "mkl", "mkm", "mmm", "mnl", "moe", "mqu", "mrm", "msm", "muq", "mzc", "mzg", "naf", "nak", "naw", "nco", "ndm", "ned", "nex", "nhx", "njf", "nmp", "nnw", "nos", "nsw", "nta", "nyg", "ocp", "ogv", "ogz", "ojr", "okj", "olk", "opz", "oqy", "oto", "otz", "ovn", "oyk", "oyt", "pan", "pap", "pbq", "pgf", "pji", "pkt", "pmq", "pni", "poy", "prk", "pss", "ptw", "pvo", "pym", "pze", "pzm", "pzq", "qbt", "qcg", "qdj", "qef", "qei", "qel", "qer", "qhn", "qhz", "qir", "qkb", "qmk", "qpu", "qrf", "qsx", "qth", "qvf", "qxi", "qyo", "qyt", "reb", "rez", "rgw", "rhq", "rkl", "rkn", "rkz", "rrr", "rrv", "rve", "rvm", "rvp", "rzk", "rzn", "saj", "scf", "sgc", "sid", "sjv", "smb", "sog", "sps", "spv", "ssm", "ssz", "stl", "suc", "suh", "suo", "svb", "sxn", "syd", "syu", "tas", "tbd", "tca", "tdc", "tex", "tig", "tii", "tkw", "tlu", "tlx", "tny", "tpc", "tpm", "trf", "tsx", "ttm", "ttr", "tuz", "tvn", "tyl", "tzz", "uah", "ucw", "ufe", "ugz", "uhq", "ujb", "uli", "unl", "upn", "upu", "urq", "utd", "utm", "uuv", "uzj", "vae", "val", "vbv", "vcs", "vfj", "vfs", "vfw", "vgo", "vir", "vjx", "vlh", "vlu", "vqa", "vrx", "vtf", "vuu", "vwo", "wab", "wbw", "wcw", "wdn", "web", "wfi", "wfw", "wjd", "wjs", "wnh", "wob", "wpp", "wqc", "wqq", "wra", "wrd", "wrw", "wsz", "wte", "wtn", "wuh", "wui", "wxm", "wzs", "xcl", "xdc", "xeh", "xhc", "xhj", "xiq", "xjc", "xnu", "xny", "xqg", "xta", "xxi", "yav", "yge", "ygh", "yjk", "ylk", "ylo", "ymc", "ync", "yon", "yql", "yth", "yvb", "zea", "zfc", "zis", "zkg", "zlr", "zni", "zsv", "zvk", "zvp", "zwt", "zyn");
        List<String> lb = List.of("abp", "aek", "agh", "aia", "ajc", "ajy", "arh", "ata", "auw", "bzc", "cal", "cby", "cdv", "cff", "che", "ckr", "cqm", "cto", "cvy", "cxj", "dfb", "dis", "dnh", "dor", "dsm", "duq", "ehk", "epi", "fac", "fin", "fjy", "flj", "frp", "fyu", "gbh", "gkh", "gkz", "glm", "gmi", "hae", "hdn", "hfa", "hfs", "hfw", "hlg", "hlv", "hvg", "hvr", "hwy", "ice", "jbm", "jfg", "jis", "jlp", "jqd", "jzv", "kha", "ktv", "kwp", "ljz", "lso", "mdr", "mjn", "mqq", "nfw", "nuo", "ocd", "ogt", "onb", "oom", "pah", "paq", "pcz", "qcx", "qsb", "qwn", "qxq", "qzj", "rao", "rcu", "rjd", "rpx", "rsu", "sge", "sjw", "sol", "sot", "sqn", "sxf", "tko", "tvs", "twd", "ugb", "uhl", "uki", "vfn", "vgo", "vnr", "vxk", "wmv", "wrg", "wxh", "xff", "xvi", "xwi", "xxn", "ybu", "yzu", "zcc", "zja", "zlc");
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