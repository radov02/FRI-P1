
import java.util.*;

public class Test47 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(47, new Cas(0, 8), true),
            new Tretja.Malica(12, new Cas(0, 10), true),
            new Tretja.Malica(1, new Cas(0, 10), true),
            new Tretja.Malica(1, new Cas(0, 11), false),
            new Tretja.Malica(33, new Cas(0, 14), true),
            new Tretja.SluzbenaPot(18, new Cas(0, 19), true),
            new Tretja.SluzbenaPot(30, new Cas(0, 19), true),
            new Tretja.SluzbenaPot(14, new Cas(0, 24), true),
            new Tretja.Malica(46, new Cas(0, 26), true),
            new Tretja.Malica(40, new Cas(0, 29), true),
            new Tretja.Rekreacija(4, new Cas(0, 34), true),
            new Tretja.SluzbenaPot(41, new Cas(0, 35), true),
            new Tretja.SluzbenaPot(41, new Cas(0, 36), false),
            new Tretja.SluzbenaPot(24, new Cas(0, 36), true),
            new Tretja.Malica(15, new Cas(0, 38), true),
            new Tretja.Rekreacija(4, new Cas(0, 42), false),
            new Tretja.SluzbenaPot(32, new Cas(0, 46), true),
            new Tretja.Malica(6, new Cas(0, 55), true),
            new Tretja.SluzbenaPot(11, new Cas(1, 3), true),
            new Tretja.SluzbenaPot(0, new Cas(1, 5), true),
            new Tretja.SluzbenaPot(3, new Cas(1, 6), true),
            new Tretja.SluzbenaPot(42, new Cas(1, 13), true),
            new Tretja.SluzbenaPot(26, new Cas(1, 13), true),
            new Tretja.SluzbenaPot(8, new Cas(1, 13), true),
            new Tretja.SluzbenaPot(9, new Cas(1, 14), true),
            new Tretja.Malica(41, new Cas(1, 16), true),
            new Tretja.SluzbenaPot(26, new Cas(1, 20), false),
            new Tretja.SluzbenaPot(28, new Cas(1, 25), true),
            new Tretja.SluzbenaPot(47, new Cas(1, 34), false),
            new Tretja.Malica(47, new Cas(1, 40), true),
            new Tretja.Rekreacija(19, new Cas(1, 42), true),
            new Tretja.SluzbenaPot(26, new Cas(2, 1), true),
            new Tretja.SluzbenaPot(8, new Cas(2, 2), false),
            new Tretja.Malica(5, new Cas(2, 9), true),
            new Tretja.Rekreacija(17, new Cas(2, 9), true),
            new Tretja.SluzbenaPot(16, new Cas(2, 14), true),
            new Tretja.Rekreacija(43, new Cas(2, 20), true),
            new Tretja.SluzbenaPot(31, new Cas(2, 33), true),
            new Tretja.Malica(35, new Cas(2, 43), true),
            new Tretja.SluzbenaPot(13, new Cas(2, 43), true),
            new Tretja.SluzbenaPot(10, new Cas(2, 48), true),
            new Tretja.Rekreacija(7, new Cas(2, 51), true),
            new Tretja.Malica(41, new Cas(2, 52), false),
            new Tretja.Malica(40, new Cas(2, 53), false),
            new Tretja.SluzbenaPot(1, new Cas(2, 57), true),
            new Tretja.Malica(15, new Cas(2, 58), false),
            new Tretja.SluzbenaPot(39, new Cas(3, 1), true),
            new Tretja.Rekreacija(45, new Cas(3, 3), true),
            new Tretja.Rekreacija(44, new Cas(3, 3), true),
            new Tretja.SluzbenaPot(2, new Cas(3, 6), true),
            new Tretja.Rekreacija(40, new Cas(3, 8), true),
            new Tretja.SluzbenaPot(21, new Cas(3, 11), true),
            new Tretja.Rekreacija(19, new Cas(3, 13), false),
            new Tretja.Malica(25, new Cas(3, 14), true),
            new Tretja.SluzbenaPot(34, new Cas(3, 15), true),
            new Tretja.SluzbenaPot(29, new Cas(3, 16), true),
            new Tretja.SluzbenaPot(11, new Cas(3, 21), false),
            new Tretja.SluzbenaPot(38, new Cas(3, 22), true),
            new Tretja.Malica(36, new Cas(3, 23), true),
            new Tretja.Malica(6, new Cas(3, 24), false),
            new Tretja.Malica(4, new Cas(3, 24), true),
            new Tretja.SluzbenaPot(42, new Cas(3, 29), false),
            new Tretja.Rekreacija(43, new Cas(3, 35), false),
            new Tretja.Rekreacija(45, new Cas(3, 36), false),
            new Tretja.Rekreacija(20, new Cas(3, 40), true),
            new Tretja.SluzbenaPot(48, new Cas(3, 46), true),
            new Tretja.Malica(22, new Cas(4, 2), true),
            new Tretja.Rekreacija(27, new Cas(4, 3), true),
            new Tretja.Rekreacija(41, new Cas(4, 4), true),
            new Tretja.Rekreacija(23, new Cas(4, 8), true),
            new Tretja.SluzbenaPot(2, new Cas(4, 23), false),
            new Tretja.SluzbenaPot(10, new Cas(4, 23), false),
            new Tretja.SluzbenaPot(24, new Cas(4, 24), false),
            new Tretja.Rekreacija(27, new Cas(4, 33), false),
            new Tretja.Malica(46, new Cas(4, 36), false),
            new Tretja.SluzbenaPot(46, new Cas(4, 43), true),
            new Tretja.Malica(25, new Cas(4, 44), false),
            new Tretja.Rekreacija(49, new Cas(4, 45), true),
            new Tretja.Malica(8, new Cas(4, 45), true),
            new Tretja.Rekreacija(37, new Cas(4, 47), true),
            new Tretja.Malica(12, new Cas(4, 53), false),
            new Tretja.Rekreacija(25, new Cas(4, 54), true),
            new Tretja.SluzbenaPot(27, new Cas(4, 55), true),
            new Tretja.SluzbenaPot(2, new Cas(5, 1), true),
            new Tretja.Malica(8, new Cas(5, 5), false),
            new Tretja.Rekreacija(24, new Cas(5, 9), true),
            new Tretja.Rekreacija(41, new Cas(5, 16), false),
            new Tretja.Rekreacija(8, new Cas(5, 21), true),
            new Tretja.SluzbenaPot(13, new Cas(5, 26), false),
            new Tretja.SluzbenaPot(39, new Cas(5, 29), false),
            new Tretja.Rekreacija(15, new Cas(5, 32), true),
            new Tretja.SluzbenaPot(10, new Cas(5, 47), true),
            new Tretja.Rekreacija(19, new Cas(5, 48), true),
            new Tretja.Malica(39, new Cas(5, 49), true),
            new Tretja.SluzbenaPot(13, new Cas(5, 49), true),
            new Tretja.SluzbenaPot(2, new Cas(6, 1), false),
            new Tretja.SluzbenaPot(26, new Cas(6, 1), false),
            new Tretja.SluzbenaPot(11, new Cas(6, 4), true),
            new Tretja.Malica(45, new Cas(6, 7), true),
            new Tretja.SluzbenaPot(0, new Cas(6, 10), false),
            new Tretja.SluzbenaPot(26, new Cas(6, 15), true),
            new Tretja.SluzbenaPot(18, new Cas(6, 29), false),
            new Tretja.SluzbenaPot(0, new Cas(6, 56), true),
            new Tretja.Malica(2, new Cas(7, 4), true),
            new Tretja.Rekreacija(12, new Cas(7, 18), true),
            new Tretja.Rekreacija(6, new Cas(7, 18), true),
            new Tretja.SluzbenaPot(21, new Cas(7, 19), false),
            new Tretja.Malica(18, new Cas(7, 19), true),
            new Tretja.Rekreacija(40, new Cas(7, 23), false),
            new Tretja.SluzbenaPot(41, new Cas(7, 27), true),
            new Tretja.Rekreacija(23, new Cas(7, 29), false),
            new Tretja.Rekreacija(43, new Cas(7, 39), true),
            new Tretja.SluzbenaPot(42, new Cas(7, 46), true),
            new Tretja.SluzbenaPot(48, new Cas(7, 49), false),
            new Tretja.SluzbenaPot(23, new Cas(7, 55), true),
            new Tretja.SluzbenaPot(48, new Cas(7, 57), true),
            new Tretja.SluzbenaPot(26, new Cas(7, 59), false),
            new Tretja.Rekreacija(21, new Cas(8, 10), true),
            new Tretja.SluzbenaPot(31, new Cas(8, 12), false),
            new Tretja.Malica(35, new Cas(8, 15), false),
            new Tretja.Rekreacija(49, new Cas(8, 16), false),
            new Tretja.SluzbenaPot(35, new Cas(8, 20), true),
            new Tretja.SluzbenaPot(31, new Cas(8, 24), true),
            new Tretja.Malica(5, new Cas(8, 26), false),
            new Tretja.Rekreacija(49, new Cas(8, 29), true),
            new Tretja.Malica(39, new Cas(8, 32), false),
            new Tretja.SluzbenaPot(38, new Cas(8, 34), false),
            new Tretja.Malica(26, new Cas(8, 51), true),
            new Tretja.SluzbenaPot(40, new Cas(8, 53), true),
            new Tretja.Malica(38, new Cas(8, 54), true),
            new Tretja.Rekreacija(39, new Cas(8, 56), true),
            new Tretja.Malica(26, new Cas(8, 56), false),
            new Tretja.Rekreacija(37, new Cas(8, 56), false),
            new Tretja.Rekreacija(19, new Cas(9, 1), false),
            new Tretja.SluzbenaPot(5, new Cas(9, 9), true),
            new Tretja.SluzbenaPot(5, new Cas(9, 16), false),
            new Tretja.SluzbenaPot(5, new Cas(9, 17), true),
            new Tretja.Rekreacija(12, new Cas(9, 18), false),
            new Tretja.Rekreacija(24, new Cas(9, 22), false),
            new Tretja.Malica(36, new Cas(9, 24), false),
            new Tretja.SluzbenaPot(37, new Cas(9, 35), true),
            new Tretja.Malica(4, new Cas(9, 40), false),
            new Tretja.SluzbenaPot(36, new Cas(9, 46), true),
            new Tretja.SluzbenaPot(48, new Cas(9, 47), false),
            new Tretja.Malica(22, new Cas(9, 47), false),
            new Tretja.SluzbenaPot(24, new Cas(9, 56), true),
            new Tretja.Malica(38, new Cas(9, 57), false),
            new Tretja.Rekreacija(38, new Cas(10, 2), true),
            new Tretja.SluzbenaPot(29, new Cas(10, 5), false),
            new Tretja.SluzbenaPot(12, new Cas(10, 9), true),
            new Tretja.Rekreacija(8, new Cas(10, 14), false),
            new Tretja.Malica(48, new Cas(10, 18), true),
            new Tretja.SluzbenaPot(10, new Cas(10, 23), false),
            new Tretja.SluzbenaPot(26, new Cas(10, 25), true),
            new Tretja.Rekreacija(49, new Cas(10, 27), false),
            new Tretja.Rekreacija(17, new Cas(10, 30), false),
            new Tretja.SluzbenaPot(22, new Cas(10, 30), true),
            new Tretja.SluzbenaPot(4, new Cas(10, 31), true),
            new Tretja.SluzbenaPot(10, new Cas(10, 33), true),
            new Tretja.Rekreacija(8, new Cas(10, 36), true),
            new Tretja.SluzbenaPot(11, new Cas(10, 39), false),
            new Tretja.SluzbenaPot(5, new Cas(10, 44), false),
            new Tretja.SluzbenaPot(1, new Cas(10, 44), false),
            new Tretja.SluzbenaPot(16, new Cas(10, 48), false),
            new Tretja.Rekreacija(19, new Cas(10, 53), true),
            new Tretja.SluzbenaPot(14, new Cas(10, 54), false),
            new Tretja.Rekreacija(49, new Cas(11, 3), true),
            new Tretja.SluzbenaPot(14, new Cas(11, 5), true),
            new Tretja.Malica(33, new Cas(11, 5), false),
            new Tretja.Rekreacija(33, new Cas(11, 12), true),
            new Tretja.SluzbenaPot(29, new Cas(11, 33), true),
            new Tretja.SluzbenaPot(28, new Cas(11, 34), false),
            new Tretja.SluzbenaPot(1, new Cas(11, 39), true),
            new Tretja.SluzbenaPot(27, new Cas(11, 42), false),
            new Tretja.SluzbenaPot(28, new Cas(11, 45), true),
            new Tretja.Rekreacija(27, new Cas(11, 46), true),
            new Tretja.SluzbenaPot(10, new Cas(11, 47), false),
            new Tretja.Rekreacija(21, new Cas(11, 47), false),
            new Tretja.SluzbenaPot(16, new Cas(11, 55), true),
            new Tretja.SluzbenaPot(23, new Cas(11, 59), false),
            new Tretja.Rekreacija(8, new Cas(12, 3), false),
            new Tretja.SluzbenaPot(40, new Cas(12, 5), false),
            new Tretja.Rekreacija(17, new Cas(12, 7), true),
            new Tretja.Malica(21, new Cas(12, 8), true),
            new Tretja.Rekreacija(27, new Cas(12, 11), false),
            new Tretja.Rekreacija(23, new Cas(12, 18), true),
            new Tretja.SluzbenaPot(40, new Cas(12, 28), true),
            new Tretja.SluzbenaPot(11, new Cas(12, 32), true),
            new Tretja.SluzbenaPot(22, new Cas(12, 50), false),
            new Tretja.Rekreacija(6, new Cas(12, 50), false),
            new Tretja.SluzbenaPot(24, new Cas(13, 1), false),
            new Tretja.Rekreacija(39, new Cas(13, 2), false),
            new Tretja.SluzbenaPot(14, new Cas(13, 5), false),
            new Tretja.SluzbenaPot(32, new Cas(13, 27), false),
            new Tretja.SluzbenaPot(6, new Cas(13, 29), true),
            new Tretja.SluzbenaPot(10, new Cas(13, 33), true),
            new Tretja.Rekreacija(15, new Cas(13, 38), false),
            new Tretja.Rekreacija(5, new Cas(13, 42), true),
            new Tretja.Malica(27, new Cas(13, 44), true),
            new Tretja.Rekreacija(43, new Cas(13, 46), false),
            new Tretja.SluzbenaPot(8, new Cas(13, 48), true),
            new Tretja.Rekreacija(24, new Cas(13, 54), true),
            new Tretja.Rekreacija(17, new Cas(14, 1), false),
            new Tretja.SluzbenaPot(31, new Cas(14, 4), false),
            new Tretja.SluzbenaPot(16, new Cas(14, 4), false),
            new Tretja.SluzbenaPot(16, new Cas(14, 11), true),
            new Tretja.Rekreacija(22, new Cas(14, 15), true),
            new Tretja.Rekreacija(15, new Cas(14, 17), true),
            new Tretja.Malica(32, new Cas(14, 19), true),
            new Tretja.Rekreacija(7, new Cas(14, 20), false),
            new Tretja.SluzbenaPot(30, new Cas(14, 20), false),
            new Tretja.Rekreacija(31, new Cas(14, 21), true),
            new Tretja.Rekreacija(5, new Cas(14, 27), false),
            new Tretja.Malica(14, new Cas(14, 29), true),
            new Tretja.SluzbenaPot(10, new Cas(14, 31), false),
            new Tretja.Rekreacija(7, new Cas(14, 45), true),
            new Tretja.Rekreacija(5, new Cas(14, 47), true),
            new Tretja.Rekreacija(19, new Cas(14, 49), false),
            new Tretja.SluzbenaPot(10, new Cas(14, 50), true),
            new Tretja.SluzbenaPot(11, new Cas(14, 51), false),
            new Tretja.Rekreacija(39, new Cas(14, 51), true),
            new Tretja.Rekreacija(17, new Cas(15, 2), true),
            new Tretja.SluzbenaPot(42, new Cas(15, 7), false),
            new Tretja.Rekreacija(11, new Cas(15, 9), true),
            new Tretja.Malica(42, new Cas(15, 10), true),
            new Tretja.Rekreacija(5, new Cas(15, 10), false),
            new Tretja.Rekreacija(15, new Cas(15, 23), false),
            new Tretja.Malica(30, new Cas(15, 31), true),
            new Tretja.Malica(42, new Cas(15, 31), false),
            new Tretja.Malica(19, new Cas(15, 33), true),
            new Tretja.Rekreacija(5, new Cas(15, 35), true),
            new Tretja.SluzbenaPot(43, new Cas(15, 35), true),
            new Tretja.SluzbenaPot(10, new Cas(15, 37), false),
            new Tretja.Malica(10, new Cas(15, 42), true),
            new Tretja.Malica(45, new Cas(15, 43), false),
            new Tretja.SluzbenaPot(6, new Cas(15, 48), false),
            new Tretja.Rekreacija(49, new Cas(15, 51), false),
            new Tretja.Rekreacija(20, new Cas(15, 51), false),
            new Tretja.Rekreacija(17, new Cas(15, 52), false),
            new Tretja.SluzbenaPot(42, new Cas(15, 52), true),
            new Tretja.SluzbenaPot(0, new Cas(15, 53), false),
            new Tretja.SluzbenaPot(20, new Cas(15, 54), true),
            new Tretja.Rekreacija(7, new Cas(16, 8), false),
            new Tretja.Malica(14, new Cas(16, 14), false),
            new Tretja.Rekreacija(0, new Cas(16, 18), true),
            new Tretja.Rekreacija(33, new Cas(16, 26), false),
            new Tretja.Malica(32, new Cas(16, 28), false),
            new Tretja.SluzbenaPot(32, new Cas(16, 37), true),
            new Tretja.Rekreacija(39, new Cas(16, 37), false),
            new Tretja.Rekreacija(17, new Cas(16, 38), true),
            new Tretja.Rekreacija(11, new Cas(16, 52), false),
            new Tretja.Rekreacija(15, new Cas(16, 57), true),
            new Tretja.Rekreacija(39, new Cas(17, 2), true),
            new Tretja.Rekreacija(0, new Cas(17, 8), false),
            new Tretja.Rekreacija(5, new Cas(17, 11), false),
            new Tretja.SluzbenaPot(28, new Cas(17, 14), false),
            new Tretja.SluzbenaPot(4, new Cas(17, 23), false),
            new Tretja.Rekreacija(45, new Cas(17, 26), true),
            new Tretja.SluzbenaPot(46, new Cas(17, 26), false),
            new Tretja.Rekreacija(5, new Cas(17, 28), true),
            new Tretja.Malica(47, new Cas(17, 28), false),
            new Tretja.SluzbenaPot(7, new Cas(17, 32), true),
            new Tretja.Rekreacija(38, new Cas(17, 43), false),
            new Tretja.SluzbenaPot(1, new Cas(17, 44), false),
            new Tretja.Rekreacija(5, new Cas(17, 44), false),
            new Tretja.Rekreacija(28, new Cas(17, 47), true),
            new Tretja.Malica(30, new Cas(17, 54), false),
            new Tretja.Rekreacija(14, new Cas(17, 54), true),
            new Tretja.Rekreacija(0, new Cas(17, 54), true),
            new Tretja.SluzbenaPot(38, new Cas(18, 6), true),
            new Tretja.Malica(11, new Cas(18, 11), true),
            new Tretja.Rekreacija(33, new Cas(18, 15), true),
            new Tretja.Rekreacija(49, new Cas(18, 19), true),
            new Tretja.Rekreacija(24, new Cas(18, 20), false),
            new Tretja.Rekreacija(0, new Cas(18, 30), false),
            new Tretja.SluzbenaPot(40, new Cas(18, 33), false),
            new Tretja.SluzbenaPot(5, new Cas(18, 46), true),
            new Tretja.Rekreacija(44, new Cas(18, 47), false),
            new Tretja.Rekreacija(22, new Cas(18, 47), false),
            new Tretja.Rekreacija(30, new Cas(18, 54), true),
            new Tretja.Rekreacija(6, new Cas(18, 55), true),
            new Tretja.Rekreacija(46, new Cas(18, 57), true),
            new Tretja.Rekreacija(45, new Cas(19, 1), false),
            new Tretja.Malica(10, new Cas(19, 3), false),
            new Tretja.Malica(21, new Cas(19, 7), false),
            new Tretja.Rekreacija(31, new Cas(19, 11), false),
            new Tretja.SluzbenaPot(35, new Cas(19, 15), false),
            new Tretja.Rekreacija(39, new Cas(19, 18), false),
            new Tretja.Rekreacija(24, new Cas(19, 21), true),
            new Tretja.SluzbenaPot(13, new Cas(19, 30), false),
            new Tretja.Rekreacija(40, new Cas(19, 31), true),
            new Tretja.Rekreacija(44, new Cas(19, 41), true),
            new Tretja.Rekreacija(24, new Cas(19, 42), false),
            new Tretja.SluzbenaPot(34, new Cas(19, 43), false),
            new Tretja.SluzbenaPot(42, new Cas(19, 50), false),
            new Tretja.SluzbenaPot(8, new Cas(19, 54), false),
            new Tretja.Malica(18, new Cas(19, 56), false),
            new Tretja.Rekreacija(40, new Cas(19, 59), false),
            new Tretja.SluzbenaPot(40, new Cas(20, 14), true),
            new Tretja.Rekreacija(1, new Cas(20, 17), true),
            new Tretja.SluzbenaPot(8, new Cas(20, 20), true),
            new Tretja.SluzbenaPot(12, new Cas(20, 21), false),
            new Tretja.SluzbenaPot(26, new Cas(20, 39), false),
            new Tretja.Rekreacija(22, new Cas(20, 41), true),
            new Tretja.Rekreacija(33, new Cas(20, 42), false),
            new Tretja.Rekreacija(25, new Cas(20, 49), false),
            new Tretja.Rekreacija(22, new Cas(20, 56), false),
            new Tretja.Rekreacija(25, new Cas(20, 58), true),
            new Tretja.Rekreacija(22, new Cas(21, 3), true),
            new Tretja.Rekreacija(25, new Cas(21, 6), false),
            new Tretja.Malica(0, new Cas(21, 6), true),
            new Tretja.SluzbenaPot(16, new Cas(21, 8), false),
            new Tretja.SluzbenaPot(5, new Cas(21, 8), false),
            new Tretja.SluzbenaPot(26, new Cas(21, 11), true),
            new Tretja.SluzbenaPot(31, new Cas(21, 20), true),
            new Tretja.Rekreacija(28, new Cas(21, 20), false),
            new Tretja.Rekreacija(14, new Cas(21, 24), false),
            new Tretja.Malica(27, new Cas(21, 25), false),
            new Tretja.SluzbenaPot(26, new Cas(21, 32), false),
            new Tretja.Rekreacija(17, new Cas(21, 34), false),
            new Tretja.SluzbenaPot(5, new Cas(21, 36), true),
            new Tretja.Rekreacija(23, new Cas(21, 36), false),
            new Tretja.SluzbenaPot(9, new Cas(21, 43), false),
            new Tretja.SluzbenaPot(20, new Cas(21, 54), false),
            new Tretja.Rekreacija(15, new Cas(22, 0), false),
            new Tretja.SluzbenaPot(32, new Cas(22, 2), false),
            new Tretja.SluzbenaPot(41, new Cas(22, 3), false),
            new Tretja.SluzbenaPot(3, new Cas(22, 6), false),
            new Tretja.SluzbenaPot(37, new Cas(22, 7), false),
            new Tretja.SluzbenaPot(31, new Cas(22, 15), false),
            new Tretja.SluzbenaPot(4, new Cas(22, 16), true),
            new Tretja.Malica(0, new Cas(22, 19), false),
            new Tretja.Rekreacija(30, new Cas(22, 31), false),
            new Tretja.SluzbenaPot(18, new Cas(22, 31), true),
            new Tretja.SluzbenaPot(43, new Cas(22, 34), false),
            new Tretja.SluzbenaPot(7, new Cas(22, 36), false),
            new Tretja.Rekreacija(49, new Cas(22, 37), false),
            new Tretja.SluzbenaPot(5, new Cas(22, 40), false),
            new Tretja.Malica(48, new Cas(22, 45), false),
            new Tretja.Rekreacija(1, new Cas(22, 48), false),
            new Tretja.SluzbenaPot(8, new Cas(22, 52), false),
            new Tretja.SluzbenaPot(18, new Cas(22, 54), false),
            new Tretja.SluzbenaPot(29, new Cas(22, 56), false),
            new Tretja.Malica(19, new Cas(23, 15), false),
            new Tretja.SluzbenaPot(40, new Cas(23, 18), false),
            new Tretja.Malica(11, new Cas(23, 31), false),
            new Tretja.Malica(2, new Cas(23, 33), false),
            new Tretja.Rekreacija(46, new Cas(23, 35), false),
            new Tretja.Rekreacija(6, new Cas(23, 36), false),
            new Tretja.SluzbenaPot(38, new Cas(23, 38), false),
            new Tretja.SluzbenaPot(4, new Cas(23, 40), false),
            new Tretja.Rekreacija(44, new Cas(23, 41), false),
            new Tretja.Rekreacija(22, new Cas(23, 46), false),
            new Tretja.SluzbenaPot(36, new Cas(23, 57), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(0, 39));
        casi.add(new Cas(0, 58));
        casi.add(new Cas(2, 5));
        casi.add(new Cas(2, 26));
        casi.add(new Cas(3, 24));
        casi.add(new Cas(3, 56));
        casi.add(new Cas(5, 22));
        casi.add(new Cas(5, 32));
        casi.add(new Cas(7, 4));
        casi.add(new Cas(9, 50));
        casi.add(new Cas(10, 40));
        casi.add(new Cas(10, 50));
        casi.add(new Cas(10, 57));
        casi.add(new Cas(12, 36));
        casi.add(new Cas(13, 28));
        casi.add(new Cas(13, 52));
        casi.add(new Cas(14, 39));
        casi.add(new Cas(16, 4));
        casi.add(new Cas(17, 38));
        casi.add(new Cas(17, 49));
        casi.add(new Cas(18, 30));
        casi.add(new Cas(19, 49));
        casi.add(new Cas(20, 26));
        casi.add(new Cas(21, 19));
        casi.add(new Cas(21, 29));
        casi.add(new Cas(22, 48));
        casi.add(new Cas(22, 52));
        casi.add(new Cas(23, 40));
        casi.add(new Cas(23, 44));
        casi.add(new Cas(23, 52));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
