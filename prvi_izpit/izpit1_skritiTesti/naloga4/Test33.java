
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        List<Integer> la = List.of(1, 4, 6, 7, 14, 16, 17, 19, 21, 25, 27, 28, 30, 32, 33, 34, 35, 36, 37, 38, 40, 43, 48, 50, 51, 55, 57, 58, 64, 65, 67, 71, 72, 73, 74, 75, 77, 80, 82, 83, 84, 85, 89, 90, 92, 93, 94, 95, 97, 99, 101, 102, 104, 107, 110, 111, 115, 117, 118, 121, 123, 126, 129, 130, 131, 132, 135, 136, 137, 139, 140, 141, 142, 143, 145, 146, 147, 150, 151, 153, 154, 155, 156, 158, 161, 162, 165, 167, 168, 172, 173, 177, 178, 182, 183, 185, 186, 187, 189, 190, 193, 195, 198, 199, 202, 204, 208, 209, 211, 212, 215, 216, 217, 220, 222, 226, 229, 231, 239, 240, 241, 243, 251, 253, 255, 256, 257, 261, 262, 263, 264, 268, 272, 274, 275, 279, 282, 285, 286, 289, 290, 292, 293, 297, 298, 301, 303, 304, 307, 313, 315, 316, 321, 323, 324, 325, 327, 328, 331, 333, 334, 337, 340, 341, 342, 345, 347, 352, 353, 356, 358, 364, 366, 367, 369, 371, 374, 377, 379, 383, 385, 386, 389, 390, 393, 395, 397, 398, 399, 401, 402, 403, 405, 407, 408, 410, 411, 412, 413, 421, 423, 426, 428, 434, 446, 448, 449, 451, 453, 455, 456, 457, 458, 460, 461, 465, 467, 468, 473, 475, 476, 477, 478, 480, 483, 484, 488, 489, 492, 493, 494, 496, 497, 499, 500, 502, 503, 505, 506, 509, 513, 514, 517, 520, 525, 527, 529, 532, 534, 543, 545, 546, 550, 553, 554, 555, 557, 566, 570, 571, 575, 581, 584, 585, 586, 588, 595, 596, 599, 602, 603, 606, 608, 614, 615, 618, 620, 622, 623, 624, 625, 626, 627, 631, 632, 633, 635, 639, 644, 646, 647, 653, 654, 655, 656, 657, 661, 663, 670, 672, 680, 681, 682, 683, 684, 685, 687, 688, 689, 691, 692, 703, 708, 711, 712, 713, 715, 716, 717, 720, 723, 724, 725, 726, 727, 728, 729, 732, 738, 743, 744, 748, 749, 751, 754, 756, 757, 758, 759, 761, 764, 765, 767, 771, 774, 778, 779, 780, 781, 782, 783, 786, 789, 793, 798, 799, 800, 802, 803, 804, 805, 807, 809, 810, 811, 812, 815, 817, 818, 821, 825, 826, 827, 829, 832, 835, 838, 841, 843, 847, 850, 853, 856, 859, 861, 863, 866, 867, 868, 870, 871, 874, 877, 878, 880, 883, 884, 885, 886, 887, 888, 891, 892, 895, 898, 900, 905, 906, 908, 910, 914, 915, 916, 918, 919, 920, 922, 925, 926, 927, 929, 934, 935, 937, 938, 939, 940, 941, 942, 943, 944, 945, 947, 948, 950, 952, 953, 954, 955, 957, 959, 960, 961, 968, 969, 971, 972, 974, 976, 977, 979, 981, 982, 986, 990, 997, 998);
        List<Integer> lb = List.of(4, 7, 16, 20, 34, 38, 41, 50, 56, 57, 58, 60, 63, 65, 71, 73, 90, 97, 101, 103, 104, 111, 115, 136, 138, 139, 141, 142, 145, 152, 153, 169, 171, 173, 174, 181, 182, 189, 194, 198, 199, 205, 207, 209, 218, 221, 234, 237, 239, 258, 267, 277, 284, 294, 295, 300, 306, 313, 319, 330, 332, 344, 349, 358, 363, 371, 374, 378, 382, 384, 389, 390, 391, 393, 397, 401, 406, 411, 417, 424, 425, 435, 444, 448, 453, 459, 464, 476, 485, 491, 492, 496, 508, 509, 516, 519, 522, 526, 527, 531, 534, 536, 542, 549, 551, 554, 556, 560, 569, 570, 576, 581, 583, 589, 596, 601, 602, 612, 615, 616, 619, 622, 626, 627, 631, 635, 642, 643, 655, 656, 664, 666, 670, 679, 690, 694, 699, 708, 710, 713, 715, 716, 718, 722, 724, 737, 739, 740, 747, 748, 757, 760, 770, 773, 774, 775, 776, 778, 786, 806, 809, 812, 816, 817, 820, 821, 827, 830, 836, 837, 842, 847, 848, 850, 853, 855, 863, 868, 872, 880, 884, 889, 899, 900, 901, 902, 908, 911, 912, 917, 922, 924, 930, 932, 936, 939, 941, 945, 946, 949, 950, 952, 953, 955, 958, 965, 973, 993, 994, 996);
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
