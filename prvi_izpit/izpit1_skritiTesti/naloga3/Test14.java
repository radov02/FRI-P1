
import java.util.*;

public class Test14 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(15, new Cas(0, 1), true),
            new Tretja.Rekreacija(9, new Cas(0, 2), true),
            new Tretja.Rekreacija(29, new Cas(0, 16), true),
            new Tretja.SluzbenaPot(17, new Cas(0, 18), true),
            new Tretja.SluzbenaPot(40, new Cas(0, 30), true),
            new Tretja.SluzbenaPot(12, new Cas(0, 58), true),
            new Tretja.SluzbenaPot(24, new Cas(1, 3), true),
            new Tretja.Malica(5, new Cas(1, 33), true),
            new Tretja.Rekreacija(9, new Cas(1, 36), false),
            new Tretja.Malica(10, new Cas(1, 39), true),
            new Tretja.Rekreacija(4, new Cas(1, 43), true),
            new Tretja.SluzbenaPot(16, new Cas(1, 44), true),
            new Tretja.Rekreacija(14, new Cas(1, 45), true),
            new Tretja.SluzbenaPot(36, new Cas(1, 46), true),
            new Tretja.Malica(23, new Cas(2, 4), true),
            new Tretja.Malica(21, new Cas(2, 13), true),
            new Tretja.SluzbenaPot(8, new Cas(2, 21), true),
            new Tretja.Rekreacija(34, new Cas(2, 40), true),
            new Tretja.Malica(2, new Cas(2, 43), true),
            new Tretja.Malica(25, new Cas(2, 47), true),
            new Tretja.Malica(9, new Cas(2, 50), true),
            new Tretja.SluzbenaPot(36, new Cas(3, 3), false),
            new Tretja.Rekreacija(41, new Cas(3, 8), true),
            new Tretja.Rekreacija(36, new Cas(3, 19), true),
            new Tretja.Malica(35, new Cas(3, 26), true),
            new Tretja.Rekreacija(22, new Cas(3, 31), true),
            new Tretja.Rekreacija(20, new Cas(3, 55), true),
            new Tretja.SluzbenaPot(28, new Cas(4, 0), true),
            new Tretja.Rekreacija(30, new Cas(4, 1), true),
            new Tretja.Malica(3, new Cas(4, 5), true),
            new Tretja.Rekreacija(37, new Cas(4, 8), true),
            new Tretja.Rekreacija(39, new Cas(4, 19), true),
            new Tretja.SluzbenaPot(33, new Cas(4, 26), true),
            new Tretja.Rekreacija(26, new Cas(4, 34), true),
            new Tretja.SluzbenaPot(0, new Cas(4, 48), true),
            new Tretja.Malica(11, new Cas(4, 56), true),
            new Tretja.SluzbenaPot(28, new Cas(5, 4), false),
            new Tretja.SluzbenaPot(38, new Cas(5, 5), true),
            new Tretja.Rekreacija(32, new Cas(5, 9), true),
            new Tretja.SluzbenaPot(28, new Cas(5, 28), true),
            new Tretja.SluzbenaPot(24, new Cas(5, 31), false),
            new Tretja.Rekreacija(13, new Cas(5, 57), true),
            new Tretja.Rekreacija(20, new Cas(6, 0), false),
            new Tretja.SluzbenaPot(19, new Cas(6, 2), true),
            new Tretja.Malica(5, new Cas(6, 7), false),
            new Tretja.SluzbenaPot(31, new Cas(6, 7), true),
            new Tretja.Rekreacija(22, new Cas(6, 9), false),
            new Tretja.Rekreacija(6, new Cas(6, 22), true),
            new Tretja.Rekreacija(30, new Cas(6, 35), false),
            new Tretja.SluzbenaPot(19, new Cas(6, 38), false),
            new Tretja.Malica(30, new Cas(6, 42), true),
            new Tretja.Rekreacija(7, new Cas(6, 53), true),
            new Tretja.Rekreacija(20, new Cas(6, 57), true),
            new Tretja.SluzbenaPot(22, new Cas(7, 2), true),
            new Tretja.SluzbenaPot(1, new Cas(7, 15), true),
            new Tretja.Rekreacija(18, new Cas(7, 30), true),
            new Tretja.Malica(27, new Cas(7, 32), true),
            new Tretja.Rekreacija(6, new Cas(7, 34), false),
            new Tretja.Rekreacija(7, new Cas(7, 34), false),
            new Tretja.Malica(35, new Cas(7, 54), false),
            new Tretja.Rekreacija(7, new Cas(8, 1), true),
            new Tretja.Malica(6, new Cas(8, 8), true),
            new Tretja.SluzbenaPot(17, new Cas(8, 9), false),
            new Tretja.SluzbenaPot(8, new Cas(8, 12), false),
            new Tretja.Malica(25, new Cas(8, 23), false),
            new Tretja.SluzbenaPot(0, new Cas(8, 26), false),
            new Tretja.SluzbenaPot(22, new Cas(8, 27), false),
            new Tretja.Rekreacija(34, new Cas(8, 32), false),
            new Tretja.SluzbenaPot(8, new Cas(8, 34), true),
            new Tretja.Malica(17, new Cas(8, 42), true),
            new Tretja.Rekreacija(34, new Cas(8, 48), true),
            new Tretja.Rekreacija(34, new Cas(8, 53), false),
            new Tretja.SluzbenaPot(38, new Cas(8, 59), false),
            new Tretja.SluzbenaPot(31, new Cas(9, 10), false),
            new Tretja.SluzbenaPot(35, new Cas(9, 14), true),
            new Tretja.Rekreacija(26, new Cas(9, 18), false),
            new Tretja.SluzbenaPot(31, new Cas(9, 37), true),
            new Tretja.Rekreacija(34, new Cas(9, 47), true),
            new Tretja.Rekreacija(38, new Cas(9, 51), true),
            new Tretja.SluzbenaPot(22, new Cas(9, 57), true),
            new Tretja.Rekreacija(5, new Cas(9, 57), true),
            new Tretja.SluzbenaPot(0, new Cas(9, 58), true),
            new Tretja.Rekreacija(39, new Cas(10, 0), false),
            new Tretja.Malica(39, new Cas(10, 11), true),
            new Tretja.Rekreacija(19, new Cas(10, 11), true),
            new Tretja.Rekreacija(5, new Cas(10, 26), false),
            new Tretja.Malica(26, new Cas(10, 28), true),
            new Tretja.Malica(9, new Cas(10, 29), false),
            new Tretja.SluzbenaPot(24, new Cas(10, 39), true),
            new Tretja.Rekreacija(4, new Cas(10, 59), false),
            new Tretja.SluzbenaPot(28, new Cas(11, 7), false),
            new Tretja.SluzbenaPot(24, new Cas(11, 15), false),
            new Tretja.Rekreacija(5, new Cas(11, 19), true),
            new Tretja.SluzbenaPot(35, new Cas(11, 28), false),
            new Tretja.Rekreacija(20, new Cas(11, 44), false),
            new Tretja.Rekreacija(29, new Cas(11, 57), false),
            new Tretja.Malica(29, new Cas(12, 1), true),
            new Tretja.Rekreacija(28, new Cas(12, 4), true),
            new Tretja.Rekreacija(41, new Cas(12, 10), false),
            new Tretja.Malica(21, new Cas(12, 16), false),
            new Tretja.Rekreacija(20, new Cas(12, 20), true),
            new Tretja.SluzbenaPot(9, new Cas(12, 24), true),
            new Tretja.Rekreacija(4, new Cas(12, 27), true),
            new Tretja.Rekreacija(25, new Cas(12, 30), true),
            new Tretja.Rekreacija(37, new Cas(12, 33), false),
            new Tretja.Rekreacija(37, new Cas(12, 47), true),
            new Tretja.Rekreacija(21, new Cas(12, 51), true),
            new Tretja.Rekreacija(35, new Cas(12, 54), true),
            new Tretja.SluzbenaPot(24, new Cas(13, 7), true),
            new Tretja.SluzbenaPot(0, new Cas(13, 15), false),
            new Tretja.Rekreacija(38, new Cas(13, 20), false),
            new Tretja.Rekreacija(35, new Cas(13, 26), false),
            new Tretja.SluzbenaPot(31, new Cas(13, 27), false),
            new Tretja.Rekreacija(0, new Cas(13, 33), true),
            new Tretja.Rekreacija(37, new Cas(13, 34), false),
            new Tretja.Rekreacija(5, new Cas(13, 40), false),
            new Tretja.Rekreacija(5, new Cas(13, 42), true),
            new Tretja.Rekreacija(36, new Cas(14, 10), false),
            new Tretja.SluzbenaPot(41, new Cas(14, 12), true),
            new Tretja.Rekreacija(5, new Cas(14, 24), false),
            new Tretja.Rekreacija(35, new Cas(14, 26), true),
            new Tretja.Rekreacija(38, new Cas(14, 45), true),
            new Tretja.Rekreacija(37, new Cas(14, 51), true),
            new Tretja.Rekreacija(31, new Cas(14, 51), true),
            new Tretja.Malica(39, new Cas(15, 4), false),
            new Tretja.SluzbenaPot(36, new Cas(15, 9), true),
            new Tretja.SluzbenaPot(39, new Cas(15, 15), true),
            new Tretja.Rekreacija(13, new Cas(15, 21), false),
            new Tretja.SluzbenaPot(40, new Cas(15, 23), false),
            new Tretja.Rekreacija(0, new Cas(15, 28), false),
            new Tretja.Rekreacija(5, new Cas(15, 38), true),
            new Tretja.SluzbenaPot(33, new Cas(15, 40), false),
            new Tretja.Rekreacija(14, new Cas(15, 47), false),
            new Tretja.Rekreacija(20, new Cas(15, 50), false),
            new Tretja.Rekreacija(21, new Cas(15, 52), false),
            new Tretja.SluzbenaPot(9, new Cas(16, 28), false),
            new Tretja.Malica(6, new Cas(16, 34), false),
            new Tretja.SluzbenaPot(9, new Cas(16, 52), true),
            new Tretja.Malica(17, new Cas(16, 52), false),
            new Tretja.Rekreacija(31, new Cas(17, 14), false),
            new Tretja.Rekreacija(33, new Cas(17, 20), true),
            new Tretja.SluzbenaPot(12, new Cas(17, 25), false),
            new Tretja.Rekreacija(6, new Cas(17, 30), true),
            new Tretja.Malica(23, new Cas(17, 49), false),
            new Tretja.SluzbenaPot(41, new Cas(17, 57), false),
            new Tretja.Malica(14, new Cas(17, 59), true),
            new Tretja.SluzbenaPot(39, new Cas(18, 8), false),
            new Tretja.Rekreacija(6, new Cas(18, 11), false),
            new Tretja.SluzbenaPot(9, new Cas(18, 13), false),
            new Tretja.Rekreacija(41, new Cas(18, 20), true),
            new Tretja.Malica(26, new Cas(18, 22), false),
            new Tretja.Rekreacija(23, new Cas(18, 25), true),
            new Tretja.Rekreacija(38, new Cas(18, 26), false),
            new Tretja.SluzbenaPot(22, new Cas(18, 42), false),
            new Tretja.Malica(27, new Cas(18, 44), false),
            new Tretja.Rekreacija(23, new Cas(19, 9), false),
            new Tretja.SluzbenaPot(8, new Cas(19, 13), false),
            new Tretja.Rekreacija(40, new Cas(19, 13), true),
            new Tretja.Rekreacija(40, new Cas(19, 17), false),
            new Tretja.Malica(14, new Cas(19, 18), false),
            new Tretja.Rekreacija(35, new Cas(19, 28), false),
            new Tretja.SluzbenaPot(16, new Cas(19, 40), false),
            new Tretja.SluzbenaPot(20, new Cas(19, 43), true),
            new Tretja.SluzbenaPot(35, new Cas(19, 46), true),
            new Tretja.Malica(11, new Cas(19, 49), false),
            new Tretja.SluzbenaPot(14, new Cas(19, 58), true),
            new Tretja.Rekreacija(38, new Cas(20, 2), true),
            new Tretja.Rekreacija(37, new Cas(20, 7), false),
            new Tretja.Rekreacija(18, new Cas(20, 10), false),
            new Tretja.SluzbenaPot(39, new Cas(20, 11), true),
            new Tretja.SluzbenaPot(27, new Cas(20, 19), true),
            new Tretja.Rekreacija(25, new Cas(20, 53), false),
            new Tretja.SluzbenaPot(39, new Cas(20, 59), false),
            new Tretja.Malica(30, new Cas(21, 12), false),
            new Tretja.Rekreacija(41, new Cas(21, 19), false),
            new Tretja.SluzbenaPot(27, new Cas(21, 20), false),
            new Tretja.Rekreacija(32, new Cas(21, 20), false),
            new Tretja.SluzbenaPot(15, new Cas(21, 26), false),
            new Tretja.Malica(29, new Cas(21, 48), false),
            new Tretja.Malica(10, new Cas(21, 52), false),
            new Tretja.Rekreacija(4, new Cas(22, 9), false),
            new Tretja.Rekreacija(7, new Cas(22, 10), false),
            new Tretja.Malica(3, new Cas(22, 18), false),
            new Tretja.SluzbenaPot(36, new Cas(22, 21), false),
            new Tretja.Rekreacija(5, new Cas(22, 23), false),
            new Tretja.Malica(2, new Cas(22, 24), false),
            new Tretja.Rekreacija(19, new Cas(22, 33), false),
            new Tretja.Rekreacija(34, new Cas(22, 42), false),
            new Tretja.SluzbenaPot(24, new Cas(22, 48), false),
            new Tretja.Rekreacija(38, new Cas(22, 58), false),
            new Tretja.SluzbenaPot(1, new Cas(23, 3), false),
            new Tretja.Rekreacija(28, new Cas(23, 12), false),
            new Tretja.SluzbenaPot(20, new Cas(23, 21), false),
            new Tretja.SluzbenaPot(35, new Cas(23, 27), false),
            new Tretja.Rekreacija(33, new Cas(23, 28), false),
            new Tretja.SluzbenaPot(14, new Cas(23, 28), false),
        };

        int stZaposlenih = 42;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
        System.out.println();
    }
}
