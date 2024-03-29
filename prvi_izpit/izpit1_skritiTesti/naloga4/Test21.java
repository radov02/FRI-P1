
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        List<Integer> la = List.of(6, 19, 29, 61, 73, 81, 94, 99, 109, 120, 137, 154, 159, 166, 171, 184, 195, 215, 230, 245, 258, 261, 263, 279, 288, 303, 319, 337, 344, 349, 357, 362, 371, 377, 388, 391, 405, 410, 415, 435, 440, 459, 465, 472, 477, 493, 504, 507, 545, 553, 557, 569, 595, 610, 619, 625, 645, 653, 675, 681, 697, 707, 713, 731, 738, 744, 750, 760, 790, 818, 829, 834, 859, 866, 876, 893, 898, 923, 940, 947, 990, 992);
        List<Integer> lb = List.of(7, 28, 47, 66, 79, 92, 96, 101, 114, 136, 152, 158, 165, 169, 181, 190, 201, 216, 232, 254, 259, 262, 273, 286, 300, 316, 326, 338, 346, 350, 358, 368, 374, 386, 389, 401, 406, 413, 422, 438, 445, 464, 467, 473, 487, 497, 505, 542, 546, 556, 563, 593, 600, 613, 622, 636, 646, 669, 678, 690, 704, 712, 716, 734, 742, 748, 751, 766, 813, 823, 831, 849, 860, 868, 883, 896, 910, 939, 943, 974, 991, 999);
        List<Integer> lc = it2list(Cetrta.zlitje(la.iterator(), lb.iterator()));
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
