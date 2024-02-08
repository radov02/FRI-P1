
import java.util.*;

public class Test11 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(35, new Cas(0, 1), true),
            new Tretja.Malica(27, new Cas(0, 6), true),
            new Tretja.SluzbenaPot(33, new Cas(0, 8), true),
            new Tretja.Rekreacija(22, new Cas(0, 11), true),
            new Tretja.Rekreacija(25, new Cas(0, 11), true),
            new Tretja.Rekreacija(44, new Cas(0, 12), true),
            new Tretja.Rekreacija(0, new Cas(0, 19), true),
            new Tretja.Malica(9, new Cas(0, 20), true),
            new Tretja.Malica(19, new Cas(0, 21), true),
            new Tretja.SluzbenaPot(24, new Cas(0, 30), true),
            new Tretja.Rekreacija(41, new Cas(0, 42), true),
            new Tretja.SluzbenaPot(21, new Cas(0, 56), true),
            new Tretja.Malica(11, new Cas(1, 7), true),
            new Tretja.Rekreacija(47, new Cas(1, 14), true),
            new Tretja.Rekreacija(22, new Cas(1, 15), false),
            new Tretja.Rekreacija(13, new Cas(1, 16), true),
            new Tretja.Rekreacija(32, new Cas(1, 20), true),
            new Tretja.Malica(7, new Cas(1, 26), true),
            new Tretja.Malica(2, new Cas(1, 26), true),
            new Tretja.SluzbenaPot(37, new Cas(1, 28), true),
            new Tretja.Malica(7, new Cas(1, 33), false),
            new Tretja.Rekreacija(38, new Cas(1, 34), true),
            new Tretja.SluzbenaPot(1, new Cas(1, 34), true),
            new Tretja.Rekreacija(22, new Cas(1, 35), true),
            new Tretja.Rekreacija(8, new Cas(1, 36), true),
            new Tretja.SluzbenaPot(43, new Cas(1, 39), true),
            new Tretja.SluzbenaPot(42, new Cas(1, 40), true),
            new Tretja.Rekreacija(18, new Cas(1, 41), true),
            new Tretja.SluzbenaPot(4, new Cas(1, 53), true),
            new Tretja.Rekreacija(7, new Cas(1, 53), true),
            new Tretja.SluzbenaPot(24, new Cas(2, 0), false),
            new Tretja.Malica(5, new Cas(2, 13), true),
            new Tretja.SluzbenaPot(30, new Cas(2, 24), true),
            new Tretja.Rekreacija(46, new Cas(2, 25), true),
            new Tretja.Rekreacija(12, new Cas(2, 46), true),
            new Tretja.Malica(17, new Cas(2, 47), true),
            new Tretja.SluzbenaPot(49, new Cas(2, 47), true),
            new Tretja.Rekreacija(47, new Cas(2, 54), false),
            new Tretja.Rekreacija(41, new Cas(3, 0), false),
            new Tretja.Rekreacija(3, new Cas(3, 2), true),
            new Tretja.SluzbenaPot(14, new Cas(3, 7), true),
            new Tretja.Rekreacija(28, new Cas(3, 8), true),
            new Tretja.Rekreacija(23, new Cas(3, 18), true),
            new Tretja.Rekreacija(10, new Cas(3, 25), true),
            new Tretja.Rekreacija(10, new Cas(3, 34), false),
            new Tretja.Malica(31, new Cas(3, 36), true),
            new Tretja.SluzbenaPot(34, new Cas(3, 40), true),
            new Tretja.Rekreacija(3, new Cas(3, 50), false),
            new Tretja.SluzbenaPot(40, new Cas(3, 53), true),
            new Tretja.SluzbenaPot(26, new Cas(3, 54), true),
            new Tretja.Rekreacija(29, new Cas(3, 54), true),
            new Tretja.Rekreacija(13, new Cas(4, 2), false),
            new Tretja.Malica(3, new Cas(4, 4), true),
            new Tretja.Rekreacija(6, new Cas(4, 5), true),
            new Tretja.Malica(36, new Cas(4, 8), true),
            new Tretja.Rekreacija(15, new Cas(4, 11), true),
            new Tretja.Rekreacija(12, new Cas(4, 13), false),
            new Tretja.Malica(24, new Cas(4, 20), true),
            new Tretja.SluzbenaPot(41, new Cas(4, 23), true),
            new Tretja.Malica(20, new Cas(4, 40), true),
            new Tretja.SluzbenaPot(14, new Cas(4, 41), false),
            new Tretja.Rekreacija(22, new Cas(4, 44), false),
            new Tretja.Malica(17, new Cas(4, 48), false),
            new Tretja.Rekreacija(10, new Cas(5, 4), true),
            new Tretja.Rekreacija(18, new Cas(5, 8), false),
            new Tretja.Rekreacija(38, new Cas(5, 15), false),
            new Tretja.Rekreacija(29, new Cas(5, 16), false),
            new Tretja.Rekreacija(46, new Cas(5, 20), false),
            new Tretja.Malica(39, new Cas(5, 22), true),
            new Tretja.Malica(16, new Cas(5, 23), true),
            new Tretja.Malica(29, new Cas(5, 28), true),
            new Tretja.Malica(22, new Cas(5, 36), true),
            new Tretja.Malica(47, new Cas(5, 40), true),
            new Tretja.Malica(38, new Cas(5, 46), true),
            new Tretja.SluzbenaPot(48, new Cas(5, 48), true),
            new Tretja.SluzbenaPot(18, new Cas(5, 52), true),
            new Tretja.SluzbenaPot(26, new Cas(5, 53), false),
            new Tretja.Rekreacija(12, new Cas(5, 57), true),
            new Tretja.SluzbenaPot(45, new Cas(5, 58), true),
            new Tretja.Rekreacija(13, new Cas(6, 6), true),
            new Tretja.SluzbenaPot(14, new Cas(6, 10), true),
            new Tretja.Rekreacija(17, new Cas(6, 14), true),
            new Tretja.SluzbenaPot(26, new Cas(6, 25), true),
            new Tretja.Rekreacija(32, new Cas(6, 26), false),
            new Tretja.SluzbenaPot(32, new Cas(6, 33), true),
            new Tretja.SluzbenaPot(1, new Cas(6, 40), false),
            new Tretja.SluzbenaPot(26, new Cas(6, 40), false),
            new Tretja.Malica(26, new Cas(6, 42), true),
            new Tretja.Rekreacija(12, new Cas(6, 53), false),
            new Tretja.SluzbenaPot(18, new Cas(6, 59), false),
            new Tretja.Rekreacija(46, new Cas(7, 7), true),
            new Tretja.SluzbenaPot(41, new Cas(7, 9), false),
            new Tretja.SluzbenaPot(1, new Cas(7, 21), true),
            new Tretja.Malica(26, new Cas(7, 23), false),
            new Tretja.SluzbenaPot(42, new Cas(7, 29), false),
            new Tretja.SluzbenaPot(40, new Cas(7, 32), false),
            new Tretja.Malica(40, new Cas(7, 34), true),
            new Tretja.Rekreacija(18, new Cas(7, 36), true),
            new Tretja.SluzbenaPot(43, new Cas(7, 39), false),
            new Tretja.Malica(20, new Cas(7, 40), false),
            new Tretja.Rekreacija(26, new Cas(7, 40), true),
            new Tretja.Malica(41, new Cas(7, 58), true),
            new Tretja.Malica(12, new Cas(8, 4), true),
            new Tretja.SluzbenaPot(37, new Cas(8, 5), false),
            new Tretja.Malica(27, new Cas(8, 6), false),
            new Tretja.Rekreacija(25, new Cas(8, 12), false),
            new Tretja.Rekreacija(42, new Cas(8, 13), true),
            new Tretja.Malica(25, new Cas(8, 18), true),
            new Tretja.Rekreacija(42, new Cas(8, 28), false),
            new Tretja.Rekreacija(37, new Cas(8, 28), true),
            new Tretja.Rekreacija(43, new Cas(8, 38), true),
            new Tretja.SluzbenaPot(1, new Cas(8, 43), false),
            new Tretja.Rekreacija(6, new Cas(8, 43), false),
            new Tretja.SluzbenaPot(42, new Cas(8, 45), true),
            new Tretja.SluzbenaPot(35, new Cas(8, 53), false),
            new Tretja.Malica(25, new Cas(9, 2), false),
            new Tretja.SluzbenaPot(4, new Cas(9, 2), false),
            new Tretja.Rekreacija(25, new Cas(9, 6), true),
            new Tretja.Rekreacija(20, new Cas(9, 15), true),
            new Tretja.Rekreacija(1, new Cas(9, 18), true),
            new Tretja.Rekreacija(28, new Cas(9, 28), false),
            new Tretja.Rekreacija(27, new Cas(9, 31), true),
            new Tretja.Rekreacija(37, new Cas(9, 32), false),
            new Tretja.SluzbenaPot(37, new Cas(9, 35), true),
            new Tretja.Rekreacija(44, new Cas(9, 42), false),
            new Tretja.Rekreacija(25, new Cas(9, 44), false),
            new Tretja.Malica(2, new Cas(9, 45), false),
            new Tretja.SluzbenaPot(42, new Cas(10, 1), false),
            new Tretja.SluzbenaPot(42, new Cas(10, 7), true),
            new Tretja.Rekreacija(23, new Cas(10, 8), false),
            new Tretja.SluzbenaPot(28, new Cas(10, 14), true),
            new Tretja.SluzbenaPot(4, new Cas(10, 15), true),
            new Tretja.Malica(35, new Cas(10, 21), true),
            new Tretja.SluzbenaPot(25, new Cas(10, 24), true),
            new Tretja.Rekreacija(46, new Cas(10, 29), false),
            new Tretja.Malica(44, new Cas(10, 39), true),
            new Tretja.Malica(46, new Cas(10, 44), true),
            new Tretja.SluzbenaPot(2, new Cas(10, 51), true),
            new Tretja.Rekreacija(6, new Cas(10, 56), true),
            new Tretja.Malica(41, new Cas(11, 2), false),
            new Tretja.Malica(24, new Cas(11, 3), false),
            new Tretja.Rekreacija(43, new Cas(11, 5), false),
            new Tretja.SluzbenaPot(43, new Cas(11, 11), true),
            new Tretja.Rekreacija(6, new Cas(11, 14), false),
            new Tretja.Rekreacija(15, new Cas(11, 15), false),
            new Tretja.Malica(23, new Cas(11, 29), true),
            new Tretja.Malica(38, new Cas(11, 33), false),
            new Tretja.SluzbenaPot(38, new Cas(11, 36), true),
            new Tretja.Rekreacija(13, new Cas(11, 40), false),
            new Tretja.SluzbenaPot(43, new Cas(11, 40), false),
            new Tretja.SluzbenaPot(6, new Cas(11, 55), true),
            new Tretja.Rekreacija(0, new Cas(12, 1), false),
            new Tretja.SluzbenaPot(42, new Cas(12, 2), false),
            new Tretja.SluzbenaPot(41, new Cas(12, 7), true),
            new Tretja.Rekreacija(24, new Cas(12, 11), true),
            new Tretja.Malica(15, new Cas(12, 21), true),
            new Tretja.SluzbenaPot(32, new Cas(12, 22), false),
            new Tretja.SluzbenaPot(42, new Cas(12, 26), true),
            new Tretja.Malica(43, new Cas(12, 29), true),
            new Tretja.SluzbenaPot(2, new Cas(12, 30), false),
            new Tretja.SluzbenaPot(4, new Cas(12, 35), false),
            new Tretja.Malica(39, new Cas(12, 36), false),
            new Tretja.Rekreacija(32, new Cas(12, 47), true),
            new Tretja.SluzbenaPot(33, new Cas(12, 53), false),
            new Tretja.SluzbenaPot(42, new Cas(12, 56), false),
            new Tretja.Rekreacija(2, new Cas(12, 56), true),
            new Tretja.SluzbenaPot(30, new Cas(12, 57), false),
            new Tretja.Rekreacija(42, new Cas(13, 4), true),
            new Tretja.Malica(4, new Cas(13, 8), true),
            new Tretja.Rekreacija(13, new Cas(13, 13), true),
            new Tretja.Rekreacija(30, new Cas(13, 13), true),
            new Tretja.Rekreacija(0, new Cas(13, 16), true),
            new Tretja.Rekreacija(0, new Cas(13, 21), false),
            new Tretja.Rekreacija(27, new Cas(13, 22), false),
            new Tretja.Rekreacija(0, new Cas(13, 37), true),
            new Tretja.Rekreacija(24, new Cas(13, 40), false),
            new Tretja.Rekreacija(26, new Cas(13, 42), false),
            new Tretja.Rekreacija(18, new Cas(13, 45), false),
            new Tretja.SluzbenaPot(21, new Cas(13, 53), false),
            new Tretja.SluzbenaPot(26, new Cas(14, 6), true),
            new Tretja.Rekreacija(39, new Cas(14, 9), true),
            new Tretja.SluzbenaPot(26, new Cas(14, 10), false),
            new Tretja.SluzbenaPot(27, new Cas(14, 24), true),
            new Tretja.SluzbenaPot(27, new Cas(14, 26), false),
            new Tretja.SluzbenaPot(25, new Cas(14, 33), false),
            new Tretja.Rekreacija(25, new Cas(14, 34), true),
            new Tretja.SluzbenaPot(33, new Cas(14, 35), true),
            new Tretja.Rekreacija(2, new Cas(14, 39), false),
            new Tretja.Rekreacija(30, new Cas(14, 41), false),
            new Tretja.SluzbenaPot(27, new Cas(14, 41), true),
            new Tretja.SluzbenaPot(38, new Cas(14, 41), false),
            new Tretja.Rekreacija(24, new Cas(14, 46), true),
            new Tretja.Rekreacija(21, new Cas(14, 47), true),
            new Tretja.SluzbenaPot(26, new Cas(14, 49), true),
            new Tretja.Rekreacija(7, new Cas(14, 49), false),
            new Tretja.Malica(11, new Cas(14, 50), false),
            new Tretja.SluzbenaPot(38, new Cas(14, 50), true),
            new Tretja.Rekreacija(39, new Cas(14, 52), false),
            new Tretja.Rekreacija(11, new Cas(14, 54), true),
            new Tretja.Malica(46, new Cas(15, 4), false),
            new Tretja.Malica(5, new Cas(15, 5), false),
            new Tretja.Rekreacija(18, new Cas(15, 6), true),
            new Tretja.SluzbenaPot(45, new Cas(15, 10), false),
            new Tretja.Rekreacija(5, new Cas(15, 12), true),
            new Tretja.Rekreacija(17, new Cas(15, 27), false),
            new Tretja.Rekreacija(2, new Cas(15, 27), true),
            new Tretja.Malica(40, new Cas(15, 28), false),
            new Tretja.SluzbenaPot(30, new Cas(15, 33), true),
            new Tretja.SluzbenaPot(27, new Cas(15, 35), false),
            new Tretja.Malica(3, new Cas(15, 53), false),
            new Tretja.Rekreacija(40, new Cas(15, 54), true),
            new Tretja.Malica(43, new Cas(15, 56), false),
            new Tretja.SluzbenaPot(6, new Cas(15, 59), false),
            new Tretja.SluzbenaPot(49, new Cas(16, 2), false),
            new Tretja.SluzbenaPot(49, new Cas(16, 8), true),
            new Tretja.Malica(22, new Cas(16, 8), false),
            new Tretja.Malica(47, new Cas(16, 9), false),
            new Tretja.SluzbenaPot(45, new Cas(16, 18), true),
            new Tretja.SluzbenaPot(47, new Cas(16, 21), true),
            new Tretja.SluzbenaPot(6, new Cas(16, 21), true),
            new Tretja.SluzbenaPot(28, new Cas(16, 22), false),
            new Tretja.Rekreacija(13, new Cas(16, 25), false),
            new Tretja.Rekreacija(17, new Cas(16, 31), true),
            new Tretja.SluzbenaPot(39, new Cas(16, 34), true),
            new Tretja.Rekreacija(27, new Cas(16, 35), true),
            new Tretja.Rekreacija(7, new Cas(16, 36), true),
            new Tretja.SluzbenaPot(28, new Cas(16, 47), true),
            new Tretja.Rekreacija(8, new Cas(16, 49), false),
            new Tretja.Malica(8, new Cas(16, 50), true),
            new Tretja.Malica(9, new Cas(16, 51), false),
            new Tretja.SluzbenaPot(22, new Cas(16, 54), true),
            new Tretja.Rekreacija(46, new Cas(16, 59), true),
            new Tretja.Rekreacija(25, new Cas(17, 20), false),
            new Tretja.SluzbenaPot(9, new Cas(17, 23), true),
            new Tretja.SluzbenaPot(25, new Cas(17, 36), true),
            new Tretja.Rekreacija(43, new Cas(17, 36), true),
            new Tretja.SluzbenaPot(30, new Cas(17, 39), false),
            new Tretja.SluzbenaPot(45, new Cas(17, 51), false),
            new Tretja.Malica(30, new Cas(17, 52), true),
            new Tretja.Malica(44, new Cas(17, 52), false),
            new Tretja.Rekreacija(3, new Cas(17, 54), true),
            new Tretja.Rekreacija(43, new Cas(17, 55), false),
            new Tretja.Rekreacija(27, new Cas(18, 3), false),
            new Tretja.Rekreacija(43, new Cas(18, 4), true),
            new Tretja.Rekreacija(46, new Cas(18, 7), false),
            new Tretja.SluzbenaPot(37, new Cas(18, 10), false),
            new Tretja.SluzbenaPot(27, new Cas(18, 13), true),
            new Tretja.SluzbenaPot(38, new Cas(18, 14), false),
            new Tretja.Malica(45, new Cas(18, 14), true),
            new Tretja.Malica(37, new Cas(18, 19), true),
            new Tretja.Malica(12, new Cas(18, 24), false),
            new Tretja.Rekreacija(5, new Cas(18, 27), false),
            new Tretja.SluzbenaPot(39, new Cas(18, 27), false),
            new Tretja.SluzbenaPot(25, new Cas(18, 29), false),
            new Tretja.SluzbenaPot(33, new Cas(18, 34), false),
            new Tretja.Rekreacija(32, new Cas(18, 37), false),
            new Tretja.SluzbenaPot(47, new Cas(18, 42), false),
            new Tretja.Malica(13, new Cas(18, 43), true),
            new Tretja.Malica(16, new Cas(18, 43), false),
            new Tretja.Malica(36, new Cas(18, 44), false),
            new Tretja.Rekreacija(18, new Cas(18, 44), false),
            new Tretja.Rekreacija(25, new Cas(18, 49), true),
            new Tretja.Rekreacija(46, new Cas(18, 52), true),
            new Tretja.Malica(45, new Cas(18, 54), false),
            new Tretja.SluzbenaPot(47, new Cas(18, 57), true),
            new Tretja.Rekreacija(21, new Cas(19, 5), false),
            new Tretja.SluzbenaPot(28, new Cas(19, 13), false),
            new Tretja.Rekreacija(36, new Cas(19, 18), true),
            new Tretja.Rekreacija(44, new Cas(19, 20), true),
            new Tretja.Malica(23, new Cas(19, 25), false),
            new Tretja.Rekreacija(3, new Cas(19, 25), false),
            new Tretja.SluzbenaPot(5, new Cas(19, 28), true),
            new Tretja.Malica(18, new Cas(19, 37), true),
            new Tretja.Malica(33, new Cas(19, 38), true),
            new Tretja.Malica(15, new Cas(19, 38), false),
            new Tretja.Rekreacija(40, new Cas(19, 42), false),
            new Tretja.SluzbenaPot(22, new Cas(19, 45), false),
            new Tretja.SluzbenaPot(34, new Cas(19, 48), false),
            new Tretja.Malica(8, new Cas(20, 1), false),
            new Tretja.SluzbenaPot(48, new Cas(20, 1), false),
            new Tretja.Malica(21, new Cas(20, 7), true),
            new Tretja.Rekreacija(12, new Cas(20, 9), true),
            new Tretja.Rekreacija(12, new Cas(20, 20), false),
            new Tretja.SluzbenaPot(40, new Cas(20, 21), true),
            new Tretja.Malica(4, new Cas(20, 22), false),
            new Tretja.SluzbenaPot(28, new Cas(20, 32), true),
            new Tretja.Rekreacija(24, new Cas(20, 36), false),
            new Tretja.SluzbenaPot(47, new Cas(20, 40), false),
            new Tretja.SluzbenaPot(26, new Cas(20, 49), false),
            new Tretja.Malica(21, new Cas(20, 55), false),
            new Tretja.SluzbenaPot(49, new Cas(20, 56), false),
            new Tretja.Malica(35, new Cas(20, 56), false),
            new Tretja.Rekreacija(17, new Cas(21, 8), false),
            new Tretja.SluzbenaPot(38, new Cas(21, 20), true),
            new Tretja.Rekreacija(11, new Cas(21, 22), false),
            new Tretja.Malica(37, new Cas(21, 32), false),
            new Tretja.Rekreacija(2, new Cas(21, 35), false),
            new Tretja.Rekreacija(23, new Cas(21, 36), true),
            new Tretja.SluzbenaPot(37, new Cas(21, 44), true),
            new Tretja.Malica(13, new Cas(21, 45), false),
            new Tretja.Rekreacija(7, new Cas(21, 46), false),
            new Tretja.Rekreacija(23, new Cas(21, 47), false),
            new Tretja.SluzbenaPot(37, new Cas(21, 47), false),
            new Tretja.SluzbenaPot(17, new Cas(21, 53), true),
            new Tretja.Malica(18, new Cas(22, 12), false),
            new Tretja.SluzbenaPot(6, new Cas(22, 19), false),
            new Tretja.Rekreacija(43, new Cas(22, 19), false),
            new Tretja.Rekreacija(22, new Cas(22, 23), true),
            new Tretja.Rekreacija(10, new Cas(22, 23), false),
            new Tretja.Malica(29, new Cas(22, 38), false),
            new Tretja.Rekreacija(42, new Cas(22, 48), false),
            new Tretja.SluzbenaPot(40, new Cas(22, 49), false),
            new Tretja.SluzbenaPot(38, new Cas(22, 52), false),
            new Tretja.SluzbenaPot(28, new Cas(22, 52), false),
            new Tretja.SluzbenaPot(14, new Cas(22, 53), false),
            new Tretja.Rekreacija(46, new Cas(22, 57), false),
            new Tretja.SluzbenaPot(27, new Cas(23, 8), false),
            new Tretja.Rekreacija(0, new Cas(23, 10), false),
            new Tretja.Rekreacija(1, new Cas(23, 20), false),
            new Tretja.Rekreacija(25, new Cas(23, 20), false),
            new Tretja.Malica(30, new Cas(23, 22), false),
            new Tretja.Rekreacija(44, new Cas(23, 23), false),
            new Tretja.Rekreacija(36, new Cas(23, 24), false),
            new Tretja.SluzbenaPot(5, new Cas(23, 25), false),
            new Tretja.Malica(31, new Cas(23, 28), false),
            new Tretja.SluzbenaPot(9, new Cas(23, 32), false),
            new Tretja.SluzbenaPot(41, new Cas(23, 33), false),
            new Tretja.SluzbenaPot(17, new Cas(23, 39), false),
            new Tretja.Rekreacija(20, new Cas(23, 39), false),
            new Tretja.Malica(19, new Cas(23, 44), false),
            new Tretja.Rekreacija(22, new Cas(23, 51), false),
            new Tretja.Malica(33, new Cas(23, 54), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
        System.out.println();
    }
}
