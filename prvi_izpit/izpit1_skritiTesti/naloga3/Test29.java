
import java.util.*;

public class Test29 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(26, new Cas(0, 4), true),
            new Tretja.Malica(19, new Cas(0, 8), true),
            new Tretja.Malica(23, new Cas(0, 16), true),
            new Tretja.Rekreacija(37, new Cas(0, 22), true),
            new Tretja.Rekreacija(34, new Cas(0, 32), true),
            new Tretja.Malica(43, new Cas(0, 36), true),
            new Tretja.SluzbenaPot(10, new Cas(0, 47), true),
            new Tretja.Rekreacija(24, new Cas(0, 54), true),
            new Tretja.Rekreacija(31, new Cas(0, 56), true),
            new Tretja.Rekreacija(11, new Cas(0, 56), true),
            new Tretja.Malica(13, new Cas(0, 59), true),
            new Tretja.Malica(38, new Cas(0, 59), true),
            new Tretja.Malica(3, new Cas(1, 5), true),
            new Tretja.Rekreacija(14, new Cas(1, 25), true),
            new Tretja.Malica(40, new Cas(1, 32), true),
            new Tretja.Malica(15, new Cas(1, 33), true),
            new Tretja.Rekreacija(29, new Cas(2, 9), true),
            new Tretja.Rekreacija(45, new Cas(2, 46), true),
            new Tretja.Rekreacija(34, new Cas(2, 50), false),
            new Tretja.Malica(9, new Cas(2, 51), true),
            new Tretja.Malica(36, new Cas(3, 0), true),
            new Tretja.Malica(4, new Cas(3, 7), true),
            new Tretja.SluzbenaPot(17, new Cas(3, 7), true),
            new Tretja.SluzbenaPot(35, new Cas(3, 15), true),
            new Tretja.Rekreacija(0, new Cas(3, 16), true),
            new Tretja.SluzbenaPot(20, new Cas(3, 18), true),
            new Tretja.SluzbenaPot(33, new Cas(3, 21), true),
            new Tretja.SluzbenaPot(27, new Cas(3, 35), true),
            new Tretja.SluzbenaPot(16, new Cas(3, 45), true),
            new Tretja.SluzbenaPot(47, new Cas(3, 50), true),
            new Tretja.SluzbenaPot(30, new Cas(4, 2), true),
            new Tretja.SluzbenaPot(10, new Cas(4, 8), false),
            new Tretja.SluzbenaPot(10, new Cas(4, 9), true),
            new Tretja.SluzbenaPot(17, new Cas(4, 20), false),
            new Tretja.Rekreacija(49, new Cas(4, 26), true),
            new Tretja.Rekreacija(28, new Cas(4, 44), true),
            new Tretja.Rekreacija(6, new Cas(5, 9), true),
            new Tretja.SluzbenaPot(8, new Cas(5, 12), true),
            new Tretja.Rekreacija(5, new Cas(5, 14), true),
            new Tretja.SluzbenaPot(35, new Cas(5, 20), false),
            new Tretja.SluzbenaPot(22, new Cas(5, 27), true),
            new Tretja.Rekreacija(46, new Cas(5, 30), true),
            new Tretja.SluzbenaPot(44, new Cas(5, 37), true),
            new Tretja.Malica(38, new Cas(5, 38), false),
            new Tretja.Rekreacija(32, new Cas(5, 51), true),
            new Tretja.SluzbenaPot(12, new Cas(5, 57), true),
            new Tretja.Rekreacija(18, new Cas(5, 58), true),
            new Tretja.Rekreacija(28, new Cas(6, 3), false),
            new Tretja.Rekreacija(25, new Cas(6, 11), true),
            new Tretja.Rekreacija(24, new Cas(6, 13), false),
            new Tretja.Rekreacija(45, new Cas(6, 15), false),
            new Tretja.SluzbenaPot(1, new Cas(6, 17), true),
            new Tretja.Rekreacija(6, new Cas(6, 23), false),
            new Tretja.Rekreacija(39, new Cas(6, 24), true),
            new Tretja.SluzbenaPot(35, new Cas(6, 30), true),
            new Tretja.SluzbenaPot(20, new Cas(6, 30), false),
            new Tretja.Malica(3, new Cas(6, 43), false),
            new Tretja.Malica(19, new Cas(6, 48), false),
            new Tretja.Rekreacija(0, new Cas(6, 51), false),
            new Tretja.SluzbenaPot(28, new Cas(6, 55), true),
            new Tretja.Malica(15, new Cas(6, 56), false),
            new Tretja.Rekreacija(48, new Cas(7, 7), true),
            new Tretja.Rekreacija(42, new Cas(7, 14), true),
            new Tretja.Rekreacija(20, new Cas(7, 24), true),
            new Tretja.Malica(7, new Cas(7, 25), true),
            new Tretja.SluzbenaPot(3, new Cas(7, 29), true),
            new Tretja.SluzbenaPot(26, new Cas(7, 33), false),
            new Tretja.Malica(17, new Cas(7, 33), true),
            new Tretja.SluzbenaPot(41, new Cas(7, 35), true),
            new Tretja.SluzbenaPot(38, new Cas(7, 45), true),
            new Tretja.SluzbenaPot(21, new Cas(7, 51), true),
            new Tretja.SluzbenaPot(1, new Cas(7, 52), false),
            new Tretja.SluzbenaPot(34, new Cas(8, 0), true),
            new Tretja.Rekreacija(24, new Cas(8, 6), true),
            new Tretja.Malica(26, new Cas(8, 24), true),
            new Tretja.Rekreacija(29, new Cas(8, 39), false),
            new Tretja.SluzbenaPot(47, new Cas(8, 48), false),
            new Tretja.Rekreacija(45, new Cas(8, 54), true),
            new Tretja.Malica(0, new Cas(9, 10), true),
            new Tretja.SluzbenaPot(15, new Cas(9, 13), true),
            new Tretja.Rekreacija(20, new Cas(9, 14), false),
            new Tretja.Malica(2, new Cas(9, 15), true),
            new Tretja.SluzbenaPot(47, new Cas(9, 22), true),
            new Tretja.SluzbenaPot(10, new Cas(9, 24), false),
            new Tretja.SluzbenaPot(29, new Cas(9, 37), true),
            new Tretja.SluzbenaPot(20, new Cas(9, 38), true),
            new Tretja.Rekreacija(32, new Cas(9, 45), false),
            new Tretja.SluzbenaPot(6, new Cas(9, 49), true),
            new Tretja.Rekreacija(18, new Cas(9, 54), false),
            new Tretja.SluzbenaPot(28, new Cas(10, 6), false),
            new Tretja.Rekreacija(19, new Cas(10, 11), true),
            new Tretja.Rekreacija(42, new Cas(10, 13), false),
            new Tretja.Malica(4, new Cas(10, 13), false),
            new Tretja.SluzbenaPot(30, new Cas(10, 42), false),
            new Tretja.SluzbenaPot(4, new Cas(10, 52), true),
            new Tretja.SluzbenaPot(33, new Cas(11, 0), false),
            new Tretja.SluzbenaPot(22, new Cas(11, 8), false),
            new Tretja.Rekreacija(48, new Cas(11, 19), false),
            new Tretja.SluzbenaPot(3, new Cas(11, 23), false),
            new Tretja.SluzbenaPot(4, new Cas(11, 42), false),
            new Tretja.SluzbenaPot(44, new Cas(11, 46), false),
            new Tretja.SluzbenaPot(4, new Cas(12, 1), true),
            new Tretja.Rekreacija(48, new Cas(12, 1), true),
            new Tretja.SluzbenaPot(3, new Cas(12, 3), true),
            new Tretja.Malica(22, new Cas(12, 7), true),
            new Tretja.SluzbenaPot(44, new Cas(12, 15), true),
            new Tretja.Malica(28, new Cas(12, 24), true),
            new Tretja.SluzbenaPot(27, new Cas(12, 25), false),
            new Tretja.Rekreacija(10, new Cas(12, 30), true),
            new Tretja.Rekreacija(10, new Cas(12, 36), false),
            new Tretja.Malica(1, new Cas(12, 42), true),
            new Tretja.Malica(40, new Cas(13, 6), false),
            new Tretja.Rekreacija(39, new Cas(13, 13), false),
            new Tretja.SluzbenaPot(33, new Cas(13, 14), true),
            new Tretja.Malica(36, new Cas(13, 31), false),
            new Tretja.Rekreacija(32, new Cas(13, 39), true),
            new Tretja.SluzbenaPot(47, new Cas(13, 48), false),
            new Tretja.Malica(7, new Cas(13, 52), false),
            new Tretja.Rekreacija(7, new Cas(13, 57), true),
            new Tretja.Rekreacija(5, new Cas(14, 3), false),
            new Tretja.SluzbenaPot(15, new Cas(14, 4), false),
            new Tretja.Rekreacija(30, new Cas(14, 10), true),
            new Tretja.Rekreacija(7, new Cas(14, 19), false),
            new Tretja.Malica(43, new Cas(14, 22), false),
            new Tretja.Rekreacija(43, new Cas(14, 29), true),
            new Tretja.Malica(27, new Cas(14, 31), true),
            new Tretja.Rekreacija(7, new Cas(14, 38), true),
            new Tretja.Rekreacija(48, new Cas(14, 47), false),
            new Tretja.Rekreacija(25, new Cas(14, 56), false),
            new Tretja.SluzbenaPot(29, new Cas(15, 15), false),
            new Tretja.Rekreacija(48, new Cas(15, 15), true),
            new Tretja.Rekreacija(40, new Cas(15, 39), true),
            new Tretja.SluzbenaPot(42, new Cas(15, 40), true),
            new Tretja.SluzbenaPot(12, new Cas(15, 48), false),
            new Tretja.SluzbenaPot(38, new Cas(15, 52), false),
            new Tretja.Malica(39, new Cas(16, 0), true),
            new Tretja.SluzbenaPot(18, new Cas(16, 4), true),
            new Tretja.Malica(23, new Cas(16, 6), false),
            new Tretja.SluzbenaPot(33, new Cas(16, 19), false),
            new Tretja.SluzbenaPot(36, new Cas(16, 22), true),
            new Tretja.Malica(28, new Cas(16, 32), false),
            new Tretja.SluzbenaPot(44, new Cas(16, 32), false),
            new Tretja.Rekreacija(5, new Cas(16, 42), true),
            new Tretja.Rekreacija(28, new Cas(16, 45), true),
            new Tretja.Malica(22, new Cas(17, 6), false),
            new Tretja.Rekreacija(14, new Cas(17, 12), false),
            new Tretja.SluzbenaPot(42, new Cas(17, 30), false),
            new Tretja.SluzbenaPot(6, new Cas(17, 36), false),
            new Tretja.Rekreacija(24, new Cas(18, 1), false),
            new Tretja.Rekreacija(43, new Cas(18, 5), false),
            new Tretja.Rekreacija(33, new Cas(18, 10), true),
            new Tretja.SluzbenaPot(15, new Cas(18, 19), true),
            new Tretja.SluzbenaPot(15, new Cas(18, 38), false),
            new Tretja.Rekreacija(45, new Cas(18, 52), false),
            new Tretja.SluzbenaPot(35, new Cas(19, 0), false),
            new Tretja.Rekreacija(46, new Cas(19, 5), false),
            new Tretja.Malica(44, new Cas(19, 23), true),
            new Tretja.Rekreacija(12, new Cas(19, 31), true),
            new Tretja.Malica(14, new Cas(19, 36), true),
            new Tretja.Rekreacija(11, new Cas(19, 37), false),
            new Tretja.SluzbenaPot(38, new Cas(19, 38), true),
            new Tretja.Rekreacija(30, new Cas(19, 39), false),
            new Tretja.SluzbenaPot(18, new Cas(19, 43), false),
            new Tretja.SluzbenaPot(8, new Cas(19, 45), false),
            new Tretja.Rekreacija(12, new Cas(19, 49), false),
            new Tretja.Malica(1, new Cas(20, 18), false),
            new Tretja.SluzbenaPot(38, new Cas(20, 22), false),
            new Tretja.Rekreacija(40, new Cas(20, 37), false),
            new Tretja.Rekreacija(30, new Cas(20, 48), true),
            new Tretja.Rekreacija(32, new Cas(20, 48), false),
            new Tretja.Rekreacija(49, new Cas(20, 54), false),
            new Tretja.Malica(13, new Cas(20, 58), false),
            new Tretja.Malica(39, new Cas(21, 3), false),
            new Tretja.Malica(17, new Cas(21, 9), false),
            new Tretja.SluzbenaPot(34, new Cas(21, 20), false),
            new Tretja.SluzbenaPot(4, new Cas(21, 34), false),
            new Tretja.Malica(14, new Cas(21, 38), false),
            new Tretja.SluzbenaPot(41, new Cas(21, 39), false),
            new Tretja.Rekreacija(31, new Cas(21, 40), false),
            new Tretja.Rekreacija(19, new Cas(21, 54), false),
            new Tretja.Malica(2, new Cas(21, 54), false),
            new Tretja.Rekreacija(7, new Cas(22, 4), false),
            new Tretja.Rekreacija(28, new Cas(22, 7), false),
            new Tretja.SluzbenaPot(16, new Cas(22, 24), false),
            new Tretja.Malica(9, new Cas(22, 34), false),
            new Tretja.Rekreacija(33, new Cas(22, 37), false),
            new Tretja.Malica(42, new Cas(22, 42), true),
            new Tretja.Rekreacija(48, new Cas(22, 46), false),
            new Tretja.Malica(26, new Cas(22, 49), false),
            new Tretja.Rekreacija(37, new Cas(22, 50), false),
            new Tretja.Malica(42, new Cas(23, 6), false),
            new Tretja.Rekreacija(5, new Cas(23, 8), false),
            new Tretja.Malica(0, new Cas(23, 15), false),
            new Tretja.SluzbenaPot(36, new Cas(23, 16), false),
            new Tretja.Malica(44, new Cas(23, 22), false),
            new Tretja.SluzbenaPot(3, new Cas(23, 24), false),
            new Tretja.SluzbenaPot(21, new Cas(23, 44), false),
            new Tretja.SluzbenaPot(20, new Cas(23, 52), false),
            new Tretja.Malica(27, new Cas(23, 52), false),
            new Tretja.Rekreacija(30, new Cas(23, 54), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        for (int i = 0; i < stZaposlenih; i++) {
            System.out.printf("%d -> %d%n", i, dnevnik.kolikoRekreacije(i));
        }
        System.out.println();
    }
}
