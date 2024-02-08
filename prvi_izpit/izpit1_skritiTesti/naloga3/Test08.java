
import java.util.*;

public class Test08 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(25, new Cas(0, 0), true),
            new Tretja.SluzbenaPot(28, new Cas(0, 1), true),
            new Tretja.Rekreacija(4, new Cas(0, 4), true),
            new Tretja.SluzbenaPot(46, new Cas(0, 9), true),
            new Tretja.SluzbenaPot(37, new Cas(0, 14), true),
            new Tretja.Rekreacija(7, new Cas(0, 18), true),
            new Tretja.Rekreacija(5, new Cas(0, 21), true),
            new Tretja.SluzbenaPot(42, new Cas(0, 21), true),
            new Tretja.SluzbenaPot(34, new Cas(0, 25), true),
            new Tretja.Malica(6, new Cas(0, 31), true),
            new Tretja.Rekreacija(1, new Cas(0, 41), true),
            new Tretja.Rekreacija(24, new Cas(0, 46), true),
            new Tretja.Rekreacija(41, new Cas(0, 49), true),
            new Tretja.Malica(44, new Cas(0, 53), true),
            new Tretja.Malica(31, new Cas(0, 54), true),
            new Tretja.Malica(32, new Cas(1, 2), true),
            new Tretja.Rekreacija(45, new Cas(1, 4), true),
            new Tretja.Rekreacija(29, new Cas(1, 5), true),
            new Tretja.Malica(9, new Cas(1, 11), true),
            new Tretja.Rekreacija(13, new Cas(1, 18), true),
            new Tretja.SluzbenaPot(18, new Cas(1, 22), true),
            new Tretja.SluzbenaPot(12, new Cas(1, 26), true),
            new Tretja.Rekreacija(8, new Cas(1, 26), true),
            new Tretja.Rekreacija(40, new Cas(1, 28), true),
            new Tretja.Malica(15, new Cas(1, 29), true),
            new Tretja.Rekreacija(17, new Cas(1, 29), true),
            new Tretja.SluzbenaPot(21, new Cas(1, 40), true),
            new Tretja.SluzbenaPot(3, new Cas(1, 42), true),
            new Tretja.Malica(15, new Cas(1, 50), false),
            new Tretja.SluzbenaPot(12, new Cas(1, 50), false),
            new Tretja.Rekreacija(10, new Cas(1, 52), true),
            new Tretja.Malica(16, new Cas(1, 56), true),
            new Tretja.Rekreacija(26, new Cas(1, 56), true),
            new Tretja.SluzbenaPot(2, new Cas(1, 57), true),
            new Tretja.Rekreacija(33, new Cas(1, 59), true),
            new Tretja.Malica(0, new Cas(2, 2), true),
            new Tretja.SluzbenaPot(47, new Cas(2, 4), true),
            new Tretja.Malica(20, new Cas(2, 10), true),
            new Tretja.Rekreacija(10, new Cas(2, 15), false),
            new Tretja.SluzbenaPot(38, new Cas(2, 19), true),
            new Tretja.Rekreacija(12, new Cas(2, 29), true),
            new Tretja.SluzbenaPot(43, new Cas(2, 34), true),
            new Tretja.SluzbenaPot(48, new Cas(2, 35), true),
            new Tretja.SluzbenaPot(34, new Cas(2, 35), false),
            new Tretja.SluzbenaPot(35, new Cas(2, 36), true),
            new Tretja.Rekreacija(34, new Cas(2, 38), true),
            new Tretja.SluzbenaPot(49, new Cas(2, 50), true),
            new Tretja.Rekreacija(30, new Cas(2, 56), true),
            new Tretja.Rekreacija(17, new Cas(2, 58), false),
            new Tretja.SluzbenaPot(47, new Cas(2, 59), false),
            new Tretja.SluzbenaPot(19, new Cas(3, 0), true),
            new Tretja.Rekreacija(14, new Cas(3, 4), true),
            new Tretja.Rekreacija(15, new Cas(3, 20), true),
            new Tretja.Rekreacija(39, new Cas(3, 23), true),
            new Tretja.Malica(10, new Cas(3, 26), true),
            new Tretja.Rekreacija(40, new Cas(3, 27), false),
            new Tretja.Rekreacija(11, new Cas(3, 29), true),
            new Tretja.Rekreacija(23, new Cas(3, 33), true),
            new Tretja.Rekreacija(25, new Cas(3, 39), false),
            new Tretja.Rekreacija(13, new Cas(3, 58), false),
            new Tretja.Rekreacija(33, new Cas(4, 4), false),
            new Tretja.Malica(40, new Cas(4, 8), true),
            new Tretja.Rekreacija(22, new Cas(4, 20), true),
            new Tretja.Rekreacija(8, new Cas(4, 22), false),
            new Tretja.Rekreacija(13, new Cas(4, 24), true),
            new Tretja.Rekreacija(29, new Cas(4, 29), false),
            new Tretja.Rekreacija(4, new Cas(4, 37), false),
            new Tretja.Malica(9, new Cas(4, 37), false),
            new Tretja.SluzbenaPot(36, new Cas(4, 50), true),
            new Tretja.Rekreacija(39, new Cas(4, 51), false),
            new Tretja.Rekreacija(7, new Cas(4, 55), false),
            new Tretja.Rekreacija(27, new Cas(4, 58), true),
            new Tretja.SluzbenaPot(47, new Cas(5, 0), true),
            new Tretja.SluzbenaPot(18, new Cas(5, 8), false),
            new Tretja.Malica(8, new Cas(5, 9), true),
            new Tretja.SluzbenaPot(39, new Cas(5, 15), true),
            new Tretja.SluzbenaPot(18, new Cas(5, 18), true),
            new Tretja.SluzbenaPot(18, new Cas(5, 20), false),
            new Tretja.Rekreacija(17, new Cas(5, 21), true),
            new Tretja.Malica(18, new Cas(5, 27), true),
            new Tretja.SluzbenaPot(9, new Cas(5, 31), true),
            new Tretja.SluzbenaPot(29, new Cas(5, 37), true),
            new Tretja.SluzbenaPot(7, new Cas(5, 37), true),
            new Tretja.SluzbenaPot(39, new Cas(5, 38), false),
            new Tretja.SluzbenaPot(33, new Cas(5, 38), true),
            new Tretja.SluzbenaPot(49, new Cas(5, 41), false),
            new Tretja.SluzbenaPot(19, new Cas(5, 41), false),
            new Tretja.Rekreacija(49, new Cas(5, 45), true),
            new Tretja.Rekreacija(25, new Cas(5, 46), true),
            new Tretja.Rekreacija(39, new Cas(6, 6), true),
            new Tretja.Malica(4, new Cas(6, 8), true),
            new Tretja.Rekreacija(14, new Cas(6, 8), false),
            new Tretja.SluzbenaPot(36, new Cas(6, 10), false),
            new Tretja.Rekreacija(36, new Cas(6, 19), true),
            new Tretja.Malica(19, new Cas(6, 23), true),
            new Tretja.SluzbenaPot(42, new Cas(6, 25), false),
            new Tretja.SluzbenaPot(38, new Cas(6, 26), false),
            new Tretja.Rekreacija(13, new Cas(6, 51), false),
            new Tretja.SluzbenaPot(21, new Cas(6, 59), false),
            new Tretja.Rekreacija(25, new Cas(7, 0), false),
            new Tretja.SluzbenaPot(14, new Cas(7, 1), true),
            new Tretja.Malica(42, new Cas(7, 2), true),
            new Tretja.Rekreacija(49, new Cas(7, 21), false),
            new Tretja.Rekreacija(36, new Cas(7, 21), false),
            new Tretja.SluzbenaPot(47, new Cas(7, 27), false),
            new Tretja.Malica(25, new Cas(7, 28), true),
            new Tretja.Rekreacija(27, new Cas(7, 29), false),
            new Tretja.SluzbenaPot(27, new Cas(7, 43), true),
            new Tretja.SluzbenaPot(7, new Cas(7, 45), false),
            new Tretja.Malica(32, new Cas(7, 52), false),
            new Tretja.SluzbenaPot(33, new Cas(7, 59), false),
            new Tretja.SluzbenaPot(13, new Cas(7, 59), true),
            new Tretja.SluzbenaPot(21, new Cas(8, 2), true),
            new Tretja.Rekreacija(38, new Cas(8, 13), true),
            new Tretja.Rekreacija(32, new Cas(8, 21), true),
            new Tretja.SluzbenaPot(2, new Cas(8, 22), false),
            new Tretja.SluzbenaPot(9, new Cas(8, 25), false),
            new Tretja.SluzbenaPot(7, new Cas(8, 48), true),
            new Tretja.Rekreacija(49, new Cas(8, 53), true),
            new Tretja.Malica(25, new Cas(8, 53), false),
            new Tretja.Malica(47, new Cas(8, 56), true),
            new Tretja.Malica(8, new Cas(9, 2), false),
            new Tretja.Rekreacija(9, new Cas(9, 3), true),
            new Tretja.Rekreacija(39, new Cas(9, 5), false),
            new Tretja.Rekreacija(15, new Cas(9, 9), false),
            new Tretja.Malica(40, new Cas(9, 12), false),
            new Tretja.Malica(42, new Cas(9, 24), false),
            new Tretja.Rekreacija(45, new Cas(9, 32), false),
            new Tretja.SluzbenaPot(8, new Cas(9, 32), true),
            new Tretja.Malica(36, new Cas(9, 33), true),
            new Tretja.Malica(33, new Cas(9, 37), true),
            new Tretja.Rekreacija(15, new Cas(9, 39), true),
            new Tretja.SluzbenaPot(45, new Cas(9, 40), true),
            new Tretja.SluzbenaPot(39, new Cas(9, 49), true),
            new Tretja.Rekreacija(42, new Cas(9, 59), true),
            new Tretja.SluzbenaPot(25, new Cas(10, 4), true),
            new Tretja.SluzbenaPot(2, new Cas(10, 12), true),
            new Tretja.Rekreacija(42, new Cas(10, 15), false),
            new Tretja.SluzbenaPot(29, new Cas(10, 15), false),
            new Tretja.SluzbenaPot(42, new Cas(10, 16), true),
            new Tretja.Malica(0, new Cas(10, 21), false),
            new Tretja.SluzbenaPot(7, new Cas(10, 28), false),
            new Tretja.Rekreacija(9, new Cas(10, 30), false),
            new Tretja.Rekreacija(15, new Cas(10, 32), false),
            new Tretja.Rekreacija(41, new Cas(10, 35), false),
            new Tretja.Rekreacija(7, new Cas(11, 0), true),
            new Tretja.Rekreacija(7, new Cas(11, 2), false),
            new Tretja.Rekreacija(15, new Cas(11, 6), true),
            new Tretja.Rekreacija(40, new Cas(11, 11), true),
            new Tretja.SluzbenaPot(9, new Cas(11, 11), true),
            new Tretja.SluzbenaPot(7, new Cas(11, 23), true),
            new Tretja.SluzbenaPot(42, new Cas(11, 23), false),
            new Tretja.SluzbenaPot(29, new Cas(11, 29), true),
            new Tretja.Rekreacija(41, new Cas(11, 36), true),
            new Tretja.SluzbenaPot(35, new Cas(11, 40), false),
            new Tretja.Rekreacija(42, new Cas(11, 42), true),
            new Tretja.Rekreacija(0, new Cas(11, 42), true),
            new Tretja.SluzbenaPot(46, new Cas(11, 43), false),
            new Tretja.Rekreacija(15, new Cas(11, 50), false),
            new Tretja.SluzbenaPot(46, new Cas(11, 58), true),
            new Tretja.Rekreacija(24, new Cas(12, 11), false),
            new Tretja.Malica(16, new Cas(12, 23), false),
            new Tretja.Rekreacija(42, new Cas(12, 24), false),
            new Tretja.Rekreacija(0, new Cas(12, 25), false),
            new Tretja.Rekreacija(41, new Cas(12, 29), false),
            new Tretja.SluzbenaPot(46, new Cas(12, 30), false),
            new Tretja.SluzbenaPot(16, new Cas(12, 30), true),
            new Tretja.SluzbenaPot(7, new Cas(12, 37), false),
            new Tretja.Rekreacija(15, new Cas(12, 37), true),
            new Tretja.SluzbenaPot(21, new Cas(12, 39), false),
            new Tretja.Rekreacija(30, new Cas(12, 47), false),
            new Tretja.Rekreacija(21, new Cas(12, 52), true),
            new Tretja.SluzbenaPot(25, new Cas(12, 54), false),
            new Tretja.SluzbenaPot(2, new Cas(13, 2), false),
            new Tretja.Rekreacija(35, new Cas(13, 7), true),
            new Tretja.Rekreacija(34, new Cas(13, 12), false),
            new Tretja.Rekreacija(35, new Cas(13, 13), false),
            new Tretja.Rekreacija(41, new Cas(13, 16), true),
            new Tretja.Rekreacija(25, new Cas(13, 27), true),
            new Tretja.SluzbenaPot(27, new Cas(13, 32), false),
            new Tretja.Rekreacija(1, new Cas(13, 44), false),
            new Tretja.Malica(6, new Cas(13, 46), false),
            new Tretja.Malica(30, new Cas(13, 57), true),
            new Tretja.SluzbenaPot(48, new Cas(14, 7), false),
            new Tretja.Malica(30, new Cas(14, 10), false),
            new Tretja.SluzbenaPot(3, new Cas(14, 18), false),
            new Tretja.Rekreacija(24, new Cas(14, 19), true),
            new Tretja.SluzbenaPot(30, new Cas(14, 22), true),
            new Tretja.Rekreacija(27, new Cas(14, 33), true),
            new Tretja.Rekreacija(32, new Cas(14, 38), false),
            new Tretja.Rekreacija(1, new Cas(14, 43), true),
            new Tretja.SluzbenaPot(45, new Cas(14, 43), false),
            new Tretja.Malica(7, new Cas(14, 50), true),
            new Tretja.Malica(3, new Cas(14, 54), true),
            new Tretja.SluzbenaPot(48, new Cas(14, 56), true),
            new Tretja.Rekreacija(6, new Cas(15, 0), true),
            new Tretja.SluzbenaPot(34, new Cas(15, 11), true),
            new Tretja.Rekreacija(42, new Cas(15, 16), true),
            new Tretja.SluzbenaPot(0, new Cas(15, 16), true),
            new Tretja.Rekreacija(38, new Cas(15, 23), false),
            new Tretja.Malica(2, new Cas(15, 23), true),
            new Tretja.Rekreacija(23, new Cas(15, 26), false),
            new Tretja.SluzbenaPot(13, new Cas(15, 29), false),
            new Tretja.Rekreacija(32, new Cas(15, 33), true),
            new Tretja.Malica(3, new Cas(15, 43), false),
            new Tretja.SluzbenaPot(38, new Cas(15, 44), true),
            new Tretja.SluzbenaPot(35, new Cas(15, 46), true),
            new Tretja.Rekreacija(45, new Cas(15, 47), true),
            new Tretja.Rekreacija(13, new Cas(15, 55), true),
            new Tretja.Rekreacija(23, new Cas(15, 58), true),
            new Tretja.Rekreacija(21, new Cas(16, 8), false),
            new Tretja.Malica(46, new Cas(16, 14), true),
            new Tretja.Rekreacija(3, new Cas(16, 16), true),
            new Tretja.Rekreacija(11, new Cas(16, 26), false),
            new Tretja.SluzbenaPot(30, new Cas(16, 33), false),
            new Tretja.Malica(11, new Cas(16, 36), true),
            new Tretja.Rekreacija(5, new Cas(16, 42), false),
            new Tretja.SluzbenaPot(30, new Cas(16, 46), true),
            new Tretja.Rekreacija(27, new Cas(16, 47), false),
            new Tretja.Rekreacija(5, new Cas(16, 56), true),
            new Tretja.SluzbenaPot(38, new Cas(17, 1), false),
            new Tretja.Rekreacija(12, new Cas(17, 4), false),
            new Tretja.Rekreacija(17, new Cas(17, 8), false),
            new Tretja.Rekreacija(1, new Cas(17, 13), false),
            new Tretja.Malica(38, new Cas(17, 17), true),
            new Tretja.Rekreacija(21, new Cas(17, 19), true),
            new Tretja.Rekreacija(32, new Cas(17, 23), false),
            new Tretja.Rekreacija(1, new Cas(17, 26), true),
            new Tretja.Malica(27, new Cas(17, 26), true),
            new Tretja.Malica(18, new Cas(17, 30), false),
            new Tretja.Rekreacija(23, new Cas(17, 36), false),
            new Tretja.SluzbenaPot(39, new Cas(17, 50), false),
            new Tretja.SluzbenaPot(0, new Cas(17, 51), false),
            new Tretja.SluzbenaPot(34, new Cas(17, 53), false),
            new Tretja.Rekreacija(18, new Cas(17, 53), true),
            new Tretja.SluzbenaPot(35, new Cas(17, 55), false),
            new Tretja.Rekreacija(22, new Cas(17, 56), false),
            new Tretja.Rekreacija(18, new Cas(17, 56), false),
            new Tretja.SluzbenaPot(29, new Cas(18, 0), false),
            new Tretja.Rekreacija(17, new Cas(18, 1), true),
            new Tretja.Malica(34, new Cas(18, 1), true),
            new Tretja.Rekreacija(25, new Cas(18, 12), false),
            new Tretja.Rekreacija(3, new Cas(18, 28), false),
            new Tretja.Rekreacija(15, new Cas(18, 29), false),
            new Tretja.Malica(47, new Cas(18, 30), false),
            new Tretja.SluzbenaPot(28, new Cas(18, 42), false),
            new Tretja.Rekreacija(6, new Cas(18, 47), false),
            new Tretja.Malica(10, new Cas(18, 48), false),
            new Tretja.Malica(11, new Cas(18, 55), false),
            new Tretja.Malica(23, new Cas(18, 56), true),
            new Tretja.SluzbenaPot(14, new Cas(18, 57), false),
            new Tretja.Rekreacija(17, new Cas(19, 1), false),
            new Tretja.SluzbenaPot(47, new Cas(19, 13), true),
            new Tretja.Rekreacija(22, new Cas(19, 13), true),
            new Tretja.Rekreacija(12, new Cas(19, 19), true),
            new Tretja.Malica(7, new Cas(19, 22), false),
            new Tretja.Rekreacija(11, new Cas(19, 24), true),
            new Tretja.Malica(27, new Cas(19, 33), false),
            new Tretja.Malica(44, new Cas(19, 34), false),
            new Tretja.Malica(36, new Cas(19, 38), false),
            new Tretja.Malica(38, new Cas(19, 47), false),
            new Tretja.Rekreacija(49, new Cas(19, 59), false),
            new Tretja.Rekreacija(15, new Cas(20, 5), true),
            new Tretja.Malica(31, new Cas(20, 6), false),
            new Tretja.SluzbenaPot(17, new Cas(20, 12), true),
            new Tretja.Rekreacija(15, new Cas(20, 19), false),
            new Tretja.Rekreacija(40, new Cas(20, 27), false),
            new Tretja.Rekreacija(26, new Cas(20, 31), false),
            new Tretja.Rekreacija(45, new Cas(20, 43), false),
            new Tretja.SluzbenaPot(7, new Cas(20, 50), true),
            new Tretja.SluzbenaPot(17, new Cas(20, 54), false),
            new Tretja.Rekreacija(1, new Cas(20, 54), false),
            new Tretja.Malica(23, new Cas(20, 56), false),
            new Tretja.Malica(46, new Cas(21, 3), false),
            new Tretja.Malica(35, new Cas(21, 10), true),
            new Tretja.Malica(39, new Cas(21, 21), true),
            new Tretja.Rekreacija(13, new Cas(21, 26), false),
            new Tretja.SluzbenaPot(13, new Cas(21, 31), true),
            new Tretja.SluzbenaPot(15, new Cas(21, 39), true),
            new Tretja.SluzbenaPot(9, new Cas(21, 45), false),
            new Tretja.Rekreacija(42, new Cas(21, 50), false),
            new Tretja.Malica(19, new Cas(21, 56), false),
            new Tretja.SluzbenaPot(13, new Cas(21, 58), false),
            new Tretja.SluzbenaPot(8, new Cas(22, 6), false),
            new Tretja.Rekreacija(21, new Cas(22, 10), false),
            new Tretja.Malica(39, new Cas(22, 15), false),
            new Tretja.Rekreacija(5, new Cas(22, 16), false),
            new Tretja.SluzbenaPot(47, new Cas(22, 25), false),
            new Tretja.Malica(4, new Cas(22, 27), false),
            new Tretja.Malica(13, new Cas(22, 28), true),
            new Tretja.Malica(29, new Cas(22, 31), true),
            new Tretja.SluzbenaPot(37, new Cas(22, 33), false),
            new Tretja.Malica(34, new Cas(22, 37), false),
            new Tretja.Rekreacija(12, new Cas(22, 37), false),
            new Tretja.Malica(13, new Cas(22, 44), false),
            new Tretja.SluzbenaPot(43, new Cas(22, 46), false),
            new Tretja.Rekreacija(44, new Cas(22, 47), true),
            new Tretja.Malica(29, new Cas(22, 50), false),
            new Tretja.SluzbenaPot(15, new Cas(22, 52), false),
            new Tretja.Rekreacija(11, new Cas(22, 52), false),
            new Tretja.SluzbenaPot(30, new Cas(22, 55), false),
            new Tretja.Malica(20, new Cas(23, 0), false),
            new Tretja.Malica(35, new Cas(23, 2), false),
            new Tretja.Rekreacija(22, new Cas(23, 2), false),
            new Tretja.Rekreacija(41, new Cas(23, 11), false),
            new Tretja.Malica(33, new Cas(23, 16), false),
            new Tretja.SluzbenaPot(16, new Cas(23, 31), false),
            new Tretja.SluzbenaPot(7, new Cas(23, 31), false),
            new Tretja.Rekreacija(24, new Cas(23, 36), false),
            new Tretja.Malica(2, new Cas(23, 37), false),
            new Tretja.SluzbenaPot(48, new Cas(23, 48), false),
            new Tretja.Rekreacija(44, new Cas(23, 51), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
        System.out.println();
    }
}
