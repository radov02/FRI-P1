
import java.util.*;

public class Test05 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Malica(45, new Cas(0, 2), true),
            new Tretja.Malica(6, new Cas(0, 27), true),
            new Tretja.Malica(18, new Cas(1, 3), true),
            new Tretja.Rekreacija(25, new Cas(1, 18), true),
            new Tretja.SluzbenaPot(13, new Cas(1, 21), true),
            new Tretja.Malica(15, new Cas(1, 47), true),
            new Tretja.SluzbenaPot(8, new Cas(2, 3), true),
            new Tretja.Malica(44, new Cas(2, 4), true),
            new Tretja.Rekreacija(1, new Cas(2, 15), true),
            new Tretja.Rekreacija(12, new Cas(2, 23), true),
            new Tretja.Rekreacija(35, new Cas(2, 43), true),
            new Tretja.Rekreacija(20, new Cas(2, 51), true),
            new Tretja.SluzbenaPot(46, new Cas(2, 54), true),
            new Tretja.Rekreacija(35, new Cas(3, 14), false),
            new Tretja.SluzbenaPot(37, new Cas(3, 32), true),
            new Tretja.SluzbenaPot(31, new Cas(3, 47), true),
            new Tretja.Rekreacija(38, new Cas(3, 54), true),
            new Tretja.Malica(16, new Cas(4, 28), true),
            new Tretja.SluzbenaPot(46, new Cas(4, 29), false),
            new Tretja.Rekreacija(12, new Cas(4, 34), false),
            new Tretja.SluzbenaPot(36, new Cas(4, 37), true),
            new Tretja.Rekreacija(42, new Cas(5, 27), true),
            new Tretja.Malica(16, new Cas(5, 43), false),
            new Tretja.Malica(46, new Cas(6, 7), true),
            new Tretja.Malica(23, new Cas(6, 9), true),
            new Tretja.Rekreacija(11, new Cas(6, 16), true),
            new Tretja.SluzbenaPot(8, new Cas(6, 31), false),
            new Tretja.SluzbenaPot(16, new Cas(6, 53), true),
            new Tretja.Rekreacija(25, new Cas(6, 56), false),
            new Tretja.SluzbenaPot(37, new Cas(7, 3), false),
            new Tretja.Rekreacija(19, new Cas(7, 13), true),
            new Tretja.Rekreacija(27, new Cas(7, 36), true),
            new Tretja.Rekreacija(21, new Cas(8, 8), true),
            new Tretja.SluzbenaPot(29, new Cas(8, 24), true),
            new Tretja.Malica(25, new Cas(8, 32), true),
            new Tretja.Malica(2, new Cas(8, 35), true),
            new Tretja.Rekreacija(38, new Cas(8, 45), false),
            new Tretja.Rekreacija(47, new Cas(9, 14), true),
            new Tretja.SluzbenaPot(49, new Cas(9, 34), true),
            new Tretja.Rekreacija(38, new Cas(9, 51), true),
            new Tretja.SluzbenaPot(28, new Cas(10, 21), true),
            new Tretja.Malica(6, new Cas(10, 54), false),
            new Tretja.Rekreacija(47, new Cas(10, 56), false),
            new Tretja.Rekreacija(11, new Cas(10, 59), false),
            new Tretja.Malica(23, new Cas(11, 22), false),
            new Tretja.Malica(35, new Cas(11, 26), true),
            new Tretja.Malica(3, new Cas(11, 28), true),
            new Tretja.SluzbenaPot(29, new Cas(11, 35), false),
            new Tretja.Rekreacija(20, new Cas(12, 12), false),
            new Tretja.Malica(26, new Cas(12, 18), true),
            new Tretja.Rekreacija(27, new Cas(12, 38), false),
            new Tretja.SluzbenaPot(48, new Cas(12, 45), true),
            new Tretja.SluzbenaPot(31, new Cas(12, 51), false),
            new Tretja.Malica(10, new Cas(12, 52), true),
            new Tretja.SluzbenaPot(28, new Cas(12, 55), false),
            new Tretja.Malica(40, new Cas(12, 58), true),
            new Tretja.SluzbenaPot(28, new Cas(13, 7), true),
            new Tretja.Rekreacija(5, new Cas(13, 12), true),
            new Tretja.Malica(25, new Cas(13, 12), false),
            new Tretja.Malica(40, new Cas(13, 17), false),
            new Tretja.Malica(2, new Cas(13, 30), false),
            new Tretja.Rekreacija(5, new Cas(13, 44), false),
            new Tretja.Malica(15, new Cas(13, 46), false),
            new Tretja.Rekreacija(0, new Cas(13, 54), true),
            new Tretja.Malica(18, new Cas(13, 56), false),
            new Tretja.SluzbenaPot(28, new Cas(13, 57), false),
            new Tretja.Rekreacija(6, new Cas(14, 20), true),
            new Tretja.Rekreacija(14, new Cas(14, 21), true),
            new Tretja.Rekreacija(19, new Cas(15, 35), false),
            new Tretja.Malica(46, new Cas(15, 46), false),
            new Tretja.Rekreacija(11, new Cas(16, 1), true),
            new Tretja.Rekreacija(38, new Cas(16, 12), false),
            new Tretja.Rekreacija(7, new Cas(16, 21), true),
            new Tretja.Rekreacija(25, new Cas(16, 28), true),
            new Tretja.Rekreacija(29, new Cas(16, 31), true),
            new Tretja.Rekreacija(21, new Cas(16, 33), false),
            new Tretja.SluzbenaPot(32, new Cas(16, 46), true),
            new Tretja.SluzbenaPot(5, new Cas(16, 50), true),
            new Tretja.Malica(26, new Cas(16, 56), false),
            new Tretja.SluzbenaPot(15, new Cas(17, 1), true),
            new Tretja.SluzbenaPot(16, new Cas(17, 4), false),
            new Tretja.SluzbenaPot(49, new Cas(17, 28), false),
            new Tretja.SluzbenaPot(36, new Cas(17, 32), false),
            new Tretja.Rekreacija(14, new Cas(18, 3), false),
            new Tretja.SluzbenaPot(36, new Cas(18, 8), true),
            new Tretja.Rekreacija(6, new Cas(18, 14), false),
            new Tretja.Rekreacija(1, new Cas(18, 19), false),
            new Tretja.Malica(12, new Cas(18, 44), true),
            new Tretja.Malica(44, new Cas(18, 49), false),
            new Tretja.SluzbenaPot(5, new Cas(19, 12), false),
            new Tretja.Rekreacija(11, new Cas(19, 19), false),
            new Tretja.SluzbenaPot(32, new Cas(19, 24), false),
            new Tretja.Rekreacija(25, new Cas(19, 30), false),
            new Tretja.SluzbenaPot(13, new Cas(19, 32), false),
            new Tretja.Malica(41, new Cas(19, 33), true),
            new Tretja.Rekreacija(42, new Cas(20, 0), false),
            new Tretja.SluzbenaPot(26, new Cas(20, 9), true),
            new Tretja.SluzbenaPot(36, new Cas(20, 53), false),
            new Tretja.Malica(3, new Cas(21, 17), false),
            new Tretja.Malica(41, new Cas(21, 29), false),
            new Tretja.SluzbenaPot(48, new Cas(21, 41), false),
            new Tretja.Rekreacija(7, new Cas(21, 54), false),
            new Tretja.Rekreacija(29, new Cas(21, 54), false),
            new Tretja.Malica(35, new Cas(21, 58), false),
            new Tretja.Malica(45, new Cas(22, 51), false),
            new Tretja.Rekreacija(0, new Cas(22, 51), false),
            new Tretja.Malica(10, new Cas(22, 54), false),
            new Tretja.SluzbenaPot(15, new Cas(23, 10), false),
            new Tretja.Rekreacija(11, new Cas(23, 23), true),
            new Tretja.Malica(12, new Cas(23, 28), false),
            new Tretja.SluzbenaPot(26, new Cas(23, 33), false),
            new Tretja.Rekreacija(11, new Cas(23, 37), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
        System.out.println();
    }
}