
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        Tretja.Oddajnik odd00 = new Tretja.Oddajnik();
        Tretja.Oddajnik odd01 = new Tretja.Oddajnik();
        Tretja.Oddajnik odd02 = new Tretja.Oddajnik();
        Tretja.Oddajnik odd03 = new Tretja.Oddajnik();
        Tretja.Oddajnik odd04 = new Tretja.Oddajnik();
        Tretja.Oddajnik odd05 = new Tretja.Oddajnik();
        Tretja.Sprejemnik spr00 = new Tretja.Sprejemnik(odd05);
        Tretja.Sprejemnik spr01 = new Tretja.Sprejemnik(odd02);
        Tretja.Sprejemnik spr02 = new Tretja.Sprejemnik(odd00);
        Tretja.Sprejemnik spr03 = new Tretja.Sprejemnik(odd00);
        Tretja.Sprejemnik spr04 = new Tretja.Sprejemnik(odd05);
        Tretja.Sprejemnik spr05 = new Tretja.Sprejemnik(odd01);
        Tretja.Sprejemnik spr06 = new Tretja.Sprejemnik(odd02);
        Tretja.Sprejemnik spr07 = new Tretja.Sprejemnik(odd02);
        Tretja.Sprejemnik spr08 = new Tretja.Sprejemnik(odd00);
        Tretja.Sprejemnik spr09 = new Tretja.Sprejemnik(odd03);
        Tretja.Sprejemnik spr10 = new Tretja.Sprejemnik(odd03);
        Tretja.Sprejemnik spr11 = new Tretja.Sprejemnik(odd04);
        Tretja.Sprejemnik spr12 = new Tretja.Sprejemnik(odd03);
        Tretja.Sprejemnik spr13 = new Tretja.Sprejemnik(odd05);
        Tretja.Sprejemnik spr14 = new Tretja.Sprejemnik(odd03);
        Tretja.Sprejemnik spr15 = new Tretja.Sprejemnik(odd04);
        Tretja.Sprejemnik spr16 = new Tretja.Sprejemnik(odd00);
        Tretja.Sprejemnik spr17 = new Tretja.Sprejemnik(odd05);
        Tretja.Sprejemnik spr18 = new Tretja.Sprejemnik(odd04);
        Tretja.Sprejemnik spr19 = new Tretja.Sprejemnik(odd01);

        odd02.oddaj('x');
        odd03.oddaj('c');
        odd03.oddaj('Q');
        odd03.oddaj('J');
        odd01.oddaj('F');
        odd02.oddaj('G');
        odd05.oddaj('N');
        odd03.oddaj('P');
        odd01.oddaj('d');
        odd04.oddaj('l');
        System.out.println("<" + spr13.odZadnjic() + ">");
        System.out.println("<" + spr11.odZadnjic() + ">");
        odd03.oddaj('c');
        System.out.println("<" + spr09.odZadnjic() + ">");
        odd01.oddaj('K');
        odd00.oddaj('D');
        odd05.oddaj('G');
        odd05.oddaj('X');
        odd04.oddaj('m');
        odd04.oddaj('T');
        System.out.println(spr07.koliko());
        System.out.println("<" + spr16.odZadnjic() + ">");
        odd05.oddaj('L');
        odd00.oddaj('Y');
        odd00.oddaj('i');
        odd01.oddaj('g');
        odd03.oddaj('Z');
        odd03.oddaj('Z');
        System.out.println("<" + spr10.odZadnjic() + ">");
        odd05.oddaj('j');
        odd05.oddaj('Q');
        odd03.oddaj('J');
        odd01.oddaj('u');
        odd05.oddaj('x');
        odd03.oddaj('E');
        System.out.println(spr04.koliko());
        System.out.println("<" + spr12.odZadnjic() + ">");
        System.out.println("<" + spr08.odZadnjic() + ">");
        odd01.oddaj('a');
        odd04.oddaj('w');
        odd03.oddaj('s');
        odd03.oddaj('d');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd05.oddaj('Y');
        odd02.oddaj('y');
        odd05.oddaj('O');
        System.out.println(spr14.koliko());
        odd05.oddaj('g');
        odd04.oddaj('b');
        System.out.println("<" + spr15.odZadnjic() + ">");
        odd01.oddaj('T');
        odd03.oddaj('T');
        System.out.println(spr13.koliko());
        System.out.println("<" + spr09.odZadnjic() + ">");
        System.out.println("<" + spr06.odZadnjic() + ">");
        odd02.oddaj('E');
        odd05.oddaj('v');
        System.out.println(spr03.koliko());
        System.out.println("<" + spr05.odZadnjic() + ">");
        odd05.oddaj('z');
        odd01.oddaj('C');
        odd03.oddaj('R');
        odd01.oddaj('P');
        odd02.oddaj('V');
        odd05.oddaj('K');
        odd04.oddaj('w');
        odd04.oddaj('Z');
        odd00.oddaj('J');
        odd05.oddaj('Q');
        odd03.oddaj('r');
        odd04.oddaj('O');
        odd04.oddaj('X');
        odd00.oddaj('m');
        System.out.println("<" + spr07.odZadnjic() + ">");
        odd05.oddaj('w');
        odd03.oddaj('c');
        odd05.oddaj('T');
        System.out.println(spr02.koliko());
        odd04.oddaj('D');
        odd01.oddaj('W');
        System.out.println(spr10.koliko());
        odd04.oddaj('r');
        odd04.oddaj('p');
        System.out.println(spr15.koliko());
        System.out.println(spr01.koliko());
        odd01.oddaj('I');
        odd00.oddaj('g');
        odd04.oddaj('N');
        odd01.oddaj('D');
        System.out.println(spr00.koliko());
        odd03.oddaj('l');
        System.out.println(spr15.koliko());
        odd03.oddaj('X');
        System.out.println(spr03.koliko());
        System.out.println("<" + spr17.odZadnjic() + ">");
        odd02.oddaj('O');
        System.out.println(spr02.koliko());
        odd04.oddaj('S');
        odd01.oddaj('Z');
        System.out.println("<" + spr07.odZadnjic() + ">");
        odd05.oddaj('M');
        odd02.oddaj('s');
        odd03.oddaj('f');
        System.out.println("<" + spr07.odZadnjic() + ">");
        odd03.oddaj('C');
        odd03.oddaj('k');
        odd01.oddaj('Y');
        odd04.oddaj('B');
        odd02.oddaj('u');
        odd02.oddaj('M');
        odd02.oddaj('v');
        odd00.oddaj('H');
        System.out.println(spr13.koliko());
        odd04.oddaj('j');
        System.out.println("<" + spr09.odZadnjic() + ">");
        odd04.oddaj('q');
        odd03.oddaj('y');
        odd00.oddaj('b');
        System.out.println(spr02.koliko());
        System.out.println("<" + spr06.odZadnjic() + ">");
        odd03.oddaj('y');
        System.out.println("<" + spr05.odZadnjic() + ">");
        odd03.oddaj('z');
        odd05.oddaj('h');
        odd00.oddaj('a');
        odd05.oddaj('z');
        odd01.oddaj('E');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd01.oddaj('n');
        odd02.oddaj('W');
        odd01.oddaj('f');
        odd04.oddaj('U');
        odd04.oddaj('v');
        odd05.oddaj('p');
        odd02.oddaj('k');
        odd05.oddaj('m');
        odd03.oddaj('m');
        odd03.oddaj('X');
        odd05.oddaj('u');
        odd00.oddaj('B');
        odd00.oddaj('h');
        odd03.oddaj('r');
        odd03.oddaj('w');
        odd03.oddaj('f');
        odd05.oddaj('D');
        System.out.println("<" + spr08.odZadnjic() + ">");
        System.out.println("<" + spr04.odZadnjic() + ">");
        odd04.oddaj('x');
        odd00.oddaj('h');
        System.out.println(spr05.koliko());
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd00.oddaj('Y');
        odd02.oddaj('R');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd04.oddaj('v');
        odd03.oddaj('p');
        odd03.oddaj('z');
        odd02.oddaj('O');
        odd00.oddaj('R');
        odd03.oddaj('L');
        odd03.oddaj('c');
        odd00.oddaj('o');
        odd00.oddaj('x');
        odd04.oddaj('g');
        odd01.oddaj('H');
        odd01.oddaj('a');
        System.out.println(spr01.koliko());
        System.out.println("<" + spr07.odZadnjic() + ">");
        odd03.oddaj('W');
        odd04.oddaj('d');
        odd05.oddaj('z');
        odd01.oddaj('X');
        odd05.oddaj('K');
        odd04.oddaj('g');
        odd02.oddaj('c');
        odd01.oddaj('x');
        System.out.println(spr03.koliko());
        odd04.oddaj('K');
        odd02.oddaj('o');
        odd01.oddaj('l');
        odd02.oddaj('t');
        odd02.oddaj('Z');
        odd00.oddaj('i');
        odd00.oddaj('C');
        odd01.oddaj('b');
        odd03.oddaj('v');
        odd01.oddaj('L');
        odd00.oddaj('u');
        odd05.oddaj('H');
        odd03.oddaj('J');
        odd04.oddaj('Q');
        odd02.oddaj('W');
        odd05.oddaj('e');
        System.out.println(spr09.koliko());
        odd00.oddaj('A');
        odd04.oddaj('S');
        odd04.oddaj('S');
        odd01.oddaj('P');
        odd04.oddaj('B');
        odd03.oddaj('q');
        odd00.oddaj('K');
        odd03.oddaj('P');
        System.out.println(spr10.koliko());
        odd01.oddaj('s');
        odd04.oddaj('f');
        odd04.oddaj('L');
        System.out.println(spr11.koliko());
        odd02.oddaj('v');
        odd04.oddaj('n');
        odd05.oddaj('K');
        odd01.oddaj('V');
        odd02.oddaj('S');
        System.out.println(spr04.koliko());
        odd03.oddaj('Q');
        System.out.println("<" + spr05.odZadnjic() + ">");
        odd01.oddaj('U');
        odd04.oddaj('D');
        System.out.println("<" + spr10.odZadnjic() + ">");
        odd03.oddaj('E');
        odd04.oddaj('Y');
        odd05.oddaj('U');
        System.out.println(spr06.koliko());
        odd05.oddaj('S');
        odd02.oddaj('v');
        odd05.oddaj('P');
        odd01.oddaj('e');
        odd03.oddaj('L');
        odd00.oddaj('w');
        odd04.oddaj('J');
        odd02.oddaj('q');
        odd00.oddaj('y');
        odd02.oddaj('s');
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println(spr13.koliko());
        System.out.println("<" + spr11.odZadnjic() + ">");
        odd02.oddaj('R');
        odd01.oddaj('b');
        odd04.oddaj('H');
        odd03.oddaj('m');
        System.out.println(spr07.koliko());
        odd03.oddaj('Y');
        System.out.println("<" + spr15.odZadnjic() + ">");
        System.out.println("<" + spr04.odZadnjic() + ">");
        odd01.oddaj('j');
        System.out.println("<" + spr16.odZadnjic() + ">");
        System.out.println("<" + spr10.odZadnjic() + ">");
        odd05.oddaj('S');
        odd02.oddaj('l');
        odd00.oddaj('m');
        odd05.oddaj('o');
        odd02.oddaj('g');
        odd01.oddaj('g');
        odd01.oddaj('J');
        odd03.oddaj('m');
        odd00.oddaj('V');
        odd03.oddaj('R');
        odd02.oddaj('L');
        odd04.oddaj('D');
        odd01.oddaj('U');
        odd03.oddaj('x');
        System.out.println("<" + spr11.odZadnjic() + ">");
        odd01.oddaj('W');
        odd02.oddaj('h');
        odd05.oddaj('Q');
        System.out.println("<" + spr08.odZadnjic() + ">");
        odd04.oddaj('n');
        odd01.oddaj('Z');
        System.out.println("<" + spr00.odZadnjic() + ">");
        System.out.println("<" + spr09.odZadnjic() + ">");
        odd04.oddaj('h');
        System.out.println("<" + spr13.odZadnjic() + ">");
        odd05.oddaj('j');
        odd05.oddaj('d');
        odd03.oddaj('D');
        odd00.oddaj('V');
        odd01.oddaj('U');
        System.out.println(spr06.koliko());
        odd03.oddaj('P');
        odd00.oddaj('s');
        odd03.oddaj('H');
        odd04.oddaj('z');
        System.out.println(spr15.koliko());
        System.out.println(spr00.koliko());
        odd03.oddaj('f');
        odd01.oddaj('E');
        System.out.println(spr08.koliko());
        odd00.oddaj('C');
        odd04.oddaj('V');
        odd04.oddaj('G');
        System.out.println(spr16.koliko());
        System.out.println(spr11.koliko());
        odd04.oddaj('L');
        odd02.oddaj('O');
        System.out.println(spr02.koliko());
        odd04.oddaj('h');
        odd05.oddaj('f');
        odd00.oddaj('N');
        System.out.println("<" + spr15.odZadnjic() + ">");
        odd00.oddaj('E');
        odd04.oddaj('t');
        odd02.oddaj('T');
        odd03.oddaj('w');
        System.out.println(spr08.koliko());
        odd03.oddaj('G');
        odd00.oddaj('M');
        odd03.oddaj('Q');
        odd00.oddaj('L');
        odd01.oddaj('d');
        odd01.oddaj('A');
        System.out.println(spr14.koliko());
        odd05.oddaj('L');
        odd05.oddaj('o');
        odd04.oddaj('s');
        odd05.oddaj('z');
        System.out.println(spr13.koliko());
        odd04.oddaj('o');
        odd00.oddaj('e');
        System.out.println(spr09.koliko());
        System.out.println(spr04.koliko());
        odd00.oddaj('H');
        System.out.println(spr11.koliko());
        System.out.println(spr16.koliko());
        System.out.println("<" + spr15.odZadnjic() + ">");
        odd01.oddaj('X');
        odd00.oddaj('O');
        odd00.oddaj('T');
        System.out.println("<" + spr17.odZadnjic() + ">");
        odd05.oddaj('g');
        odd05.oddaj('l');
        odd05.oddaj('A');
        System.out.println("<" + spr12.odZadnjic() + ">");
        System.out.println(spr10.koliko());
        odd02.oddaj('d');
        odd03.oddaj('w');
        odd02.oddaj('d');
        System.out.println(spr09.koliko());
        odd03.oddaj('h');
        System.out.println("<" + spr06.odZadnjic() + ">");
        odd02.oddaj('q');
        odd03.oddaj('K');
        System.out.println(spr02.koliko());
        odd04.oddaj('A');
        odd01.oddaj('C');
        System.out.println(spr08.koliko());
        odd01.oddaj('U');
        odd03.oddaj('z');
        System.out.println(spr19.koliko());
        odd04.oddaj('f');
        odd05.oddaj('b');
        odd02.oddaj('n');
        odd03.oddaj('a');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd04.oddaj('Y');
        odd02.oddaj('b');
        System.out.println("<" + spr09.odZadnjic() + ">");
        odd00.oddaj('c');
        odd00.oddaj('u');
        odd05.oddaj('P');
        System.out.println("<" + spr07.odZadnjic() + ">");
        System.out.println("<" + spr06.odZadnjic() + ">");
        odd04.oddaj('n');
        odd04.oddaj('h');
        System.out.println(spr14.koliko());
        odd01.oddaj('l');
        System.out.println(spr11.koliko());
        System.out.println("<" + spr13.odZadnjic() + ">");
        odd05.oddaj('U');
        odd01.oddaj('e');
        odd02.oddaj('I');
        odd00.oddaj('u');
        odd03.oddaj('j');
        odd02.oddaj('V');
        odd02.oddaj('A');
        odd01.oddaj('h');
        odd02.oddaj('L');
        odd01.oddaj('s');
        odd01.oddaj('S');
        odd04.oddaj('W');
        odd04.oddaj('l');
        odd02.oddaj('E');
        odd03.oddaj('G');
        odd05.oddaj('R');
        odd05.oddaj('y');
        odd00.oddaj('k');
        odd03.oddaj('L');
        odd04.oddaj('u');
        odd03.oddaj('a');
        odd05.oddaj('h');
        odd05.oddaj('D');
        System.out.println(spr19.koliko());
        odd01.oddaj('j');
        odd00.oddaj('c');
        odd00.oddaj('e');
        odd04.oddaj('K');
        odd05.oddaj('b');
        odd04.oddaj('j');
        System.out.println(spr01.koliko());
        System.out.println(spr16.koliko());
        odd01.oddaj('A');
        odd04.oddaj('B');
        System.out.println(spr19.koliko());
        odd00.oddaj('L');
        odd04.oddaj('g');
        odd00.oddaj('l');
        odd05.oddaj('B');
        odd04.oddaj('W');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd00.oddaj('B');
        odd02.oddaj('q');
        odd05.oddaj('S');
        odd04.oddaj('g');
        odd04.oddaj('X');
        odd04.oddaj('B');
        odd02.oddaj('o');
        odd02.oddaj('u');
        odd02.oddaj('C');
        odd04.oddaj('M');
        System.out.println(spr11.koliko());
        odd05.oddaj('h');
        System.out.println(spr10.koliko());
        System.out.println(spr08.koliko());
        odd02.oddaj('h');
        odd05.oddaj('b');
        odd05.oddaj('s');
        odd01.oddaj('h');
        System.out.println(spr12.koliko());
        odd01.oddaj('p');
        odd03.oddaj('k');
        odd04.oddaj('V');
        odd04.oddaj('D');
        odd05.oddaj('K');
        odd05.oddaj('E');
        System.out.println("<" + spr15.odZadnjic() + ">");
        odd01.oddaj('D');
        odd05.oddaj('y');
        odd03.oddaj('v');
        odd04.oddaj('R');
        odd02.oddaj('o');
        odd04.oddaj('w');
        odd01.oddaj('b');
        System.out.println(spr03.koliko());
        odd02.oddaj('W');
        odd01.oddaj('D');
        odd01.oddaj('M');
        odd00.oddaj('T');
        odd00.oddaj('Z');
        odd02.oddaj('L');
        System.out.println(spr05.koliko());
        System.out.println("<" + spr12.odZadnjic() + ">");
        odd05.oddaj('h');
        odd01.oddaj('U');
        System.out.println(spr19.koliko());
        System.out.println(spr10.koliko());
        System.out.println(spr16.koliko());
        odd03.oddaj('u');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd00.oddaj('A');
        odd04.oddaj('t');
        odd02.oddaj('B');
        odd02.oddaj('h');
        odd00.oddaj('M');
        odd02.oddaj('r');
        System.out.println("<" + spr10.odZadnjic() + ">");
        odd01.oddaj('y');
        System.out.println(spr05.koliko());
        odd03.oddaj('n');
        odd05.oddaj('g');
        odd05.oddaj('W');
        System.out.println("<" + spr15.odZadnjic() + ">");
        odd03.oddaj('W');
        System.out.println("<" + spr09.odZadnjic() + ">");
        odd05.oddaj('J');
        odd04.oddaj('L');
        odd00.oddaj('q');
        odd05.oddaj('R');
        odd02.oddaj('a');
        odd05.oddaj('E');
        System.out.println("<" + spr17.odZadnjic() + ">");
        odd01.oddaj('y');
        odd05.oddaj('z');
        System.out.println(spr01.koliko());
        System.out.println(spr13.koliko());
        odd02.oddaj('j');
        odd02.oddaj('j');
        System.out.println("<" + spr10.odZadnjic() + ">");
        odd03.oddaj('y');
        odd01.oddaj('V');
        odd00.oddaj('f');
        odd02.oddaj('y');
        odd05.oddaj('f');
        odd00.oddaj('K');
        odd05.oddaj('G');
        odd00.oddaj('C');
        odd02.oddaj('m');
        odd04.oddaj('I');
        System.out.println("<" + spr13.odZadnjic() + ">");
        odd03.oddaj('D');
        odd03.oddaj('F');
        System.out.println("<" + spr15.odZadnjic() + ">");
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd04.oddaj('U');
        odd04.oddaj('y');
        odd02.oddaj('v');
        odd04.oddaj('A');
        odd01.oddaj('x');
        odd02.oddaj('u');
        odd04.oddaj('E');
        odd04.oddaj('j');
        odd01.oddaj('o');
        System.out.println("<" + spr06.odZadnjic() + ">");
        System.out.println("<" + spr08.odZadnjic() + ">");
        odd00.oddaj('Y');
        odd03.oddaj('G');
        odd00.oddaj('I');
        odd04.oddaj('z');
        odd03.oddaj('W');
        odd01.oddaj('w');
        odd04.oddaj('D');
        System.out.println(spr09.koliko());
        odd04.oddaj('P');
        odd01.oddaj('t');
        System.out.println(spr02.koliko());
        System.out.println(spr07.koliko());
        odd04.oddaj('H');
        odd04.oddaj('G');
        odd04.oddaj('H');
        odd05.oddaj('n');
        odd02.oddaj('J');
        odd04.oddaj('J');
        System.out.println(spr18.koliko());
        odd01.oddaj('T');
        System.out.println(spr13.koliko());
        odd04.oddaj('N');
        odd01.oddaj('V');
        odd01.oddaj('W');
        System.out.println(spr18.koliko());
        odd01.oddaj('U');
        System.out.println(spr16.koliko());
        odd02.oddaj('K');
        odd00.oddaj('v');
        odd02.oddaj('v');
        odd05.oddaj('o');
        odd04.oddaj('K');
        odd05.oddaj('H');
        odd02.oddaj('v');
        odd05.oddaj('t');
        odd00.oddaj('S');
        odd02.oddaj('i');
        odd05.oddaj('X');
        odd02.oddaj('S');
        odd02.oddaj('K');
        odd04.oddaj('g');
        odd01.oddaj('y');
        System.out.println(spr14.koliko());
        odd02.oddaj('z');
        odd03.oddaj('T');
        System.out.println("<" + spr12.odZadnjic() + ">");
        odd01.oddaj('r');
        odd03.oddaj('b');
        odd02.oddaj('s');
        odd05.oddaj('E');
        System.out.println(spr02.koliko());
        odd04.oddaj('o');
        odd04.oddaj('B');
        odd01.oddaj('t');
        odd00.oddaj('x');
        odd05.oddaj('m');
        odd04.oddaj('F');
        odd02.oddaj('X');
        System.out.println("<" + spr13.odZadnjic() + ">");
        odd00.oddaj('y');
        odd00.oddaj('f');
        odd01.oddaj('S');
        odd04.oddaj('a');
        odd04.oddaj('t');
        odd04.oddaj('M');
        odd05.oddaj('G');
        System.out.println("<" + spr13.odZadnjic() + ">");
        odd02.oddaj('o');
        odd03.oddaj('n');
        odd04.oddaj('p');
        odd02.oddaj('s');
        odd01.oddaj('R');
        odd04.oddaj('w');
        odd02.oddaj('d');
        System.out.println("<" + spr09.odZadnjic() + ">");
        odd04.oddaj('T');
        System.out.println("<" + spr19.odZadnjic() + ">");
        odd00.oddaj('q');
        odd00.oddaj('S');
        odd05.oddaj('j');
        System.out.println("<" + spr17.odZadnjic() + ">");
        odd05.oddaj('k');
        odd02.oddaj('w');
        odd01.oddaj('A');
        System.out.println("<" + spr13.odZadnjic() + ">");
        odd03.oddaj('Y');
        odd05.oddaj('T');
        odd02.oddaj('E');
        odd05.oddaj('C');
        odd00.oddaj('C');
        System.out.println(spr12.koliko());
        System.out.println("<" + spr14.odZadnjic() + ">");
        odd00.oddaj('Q');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd03.oddaj('Y');
        odd02.oddaj('F');
        odd00.oddaj('m');
        System.out.println(spr19.koliko());
        odd05.oddaj('j');
        odd04.oddaj('p');
        odd04.oddaj('J');
        odd01.oddaj('o');
        odd00.oddaj('e');
        odd02.oddaj('X');
        System.out.println(spr04.koliko());
        System.out.println("<" + spr01.odZadnjic() + ">");
        System.out.println(spr12.koliko());
        System.out.println(spr05.koliko());
        odd00.oddaj('O');
        odd02.oddaj('Q');
        odd02.oddaj('v');
        System.out.println("<" + spr16.odZadnjic() + ">");
        odd03.oddaj('m');
        odd00.oddaj('I');
        odd01.oddaj('p');
        odd04.oddaj('m');
        System.out.println("<" + spr10.odZadnjic() + ">");
        System.out.println(spr17.koliko());
        odd05.oddaj('B');
        odd02.oddaj('q');
        odd05.oddaj('m');
        System.out.println("<" + spr07.odZadnjic() + ">");
        System.out.println("<" + spr15.odZadnjic() + ">");
        System.out.println("<" + spr18.odZadnjic() + ">");
        System.out.println(spr17.koliko());
        odd04.oddaj('R');
        System.out.println("<" + spr16.odZadnjic() + ">");
        System.out.println("<" + spr09.odZadnjic() + ">");
        odd01.oddaj('g');
        System.out.println(spr08.koliko());
        odd02.oddaj('y');
        odd04.oddaj('m');
        System.out.println("<" + spr07.odZadnjic() + ">");
        odd01.oddaj('Q');
        System.out.println(spr06.koliko());
        odd04.oddaj('g');
        odd05.oddaj('a');
        System.out.println(spr13.koliko());
        odd02.oddaj('H');
        System.out.println(spr18.koliko());
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd02.oddaj('D');
        odd01.oddaj('b');
        System.out.println("<" + spr15.odZadnjic() + ">");
        System.out.println("<" + spr17.odZadnjic() + ">");
        odd02.oddaj('N');
        odd03.oddaj('T');
        odd04.oddaj('g');
        odd05.oddaj('P');
        odd04.oddaj('u');
        odd05.oddaj('D');
        odd00.oddaj('Y');
        odd05.oddaj('G');
        odd04.oddaj('B');
        System.out.println(spr15.koliko());
        odd00.oddaj('e');
        odd04.oddaj('w');
        System.out.println("<" + spr05.odZadnjic() + ">");
        odd04.oddaj('x');
        odd02.oddaj('I');
        System.out.println("<" + spr12.odZadnjic() + ">");
        odd05.oddaj('j');
        odd00.oddaj('w');
        odd00.oddaj('u');
        odd01.oddaj('s');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd03.oddaj('W');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd04.oddaj('i');
        odd00.oddaj('m');
        odd00.oddaj('K');
        System.out.println("<" + spr14.odZadnjic() + ">");
        odd01.oddaj('F');
        odd01.oddaj('Q');
        odd00.oddaj('Y');
        odd04.oddaj('Y');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println("<" + spr17.odZadnjic() + ">");
        System.out.println("<" + spr18.odZadnjic() + ">");
        odd02.oddaj('O');
        odd02.oddaj('P');
        odd00.oddaj('f');
        odd00.oddaj('N');
        odd05.oddaj('E');
        System.out.println("<" + spr08.odZadnjic() + ">");
        odd04.oddaj('W');
        odd02.oddaj('L');
        odd05.oddaj('A');
        odd05.oddaj('D');
        odd04.oddaj('D');
        odd05.oddaj('c');
        odd05.oddaj('T');
        odd00.oddaj('d');
        odd01.oddaj('A');
        odd05.oddaj('X');
        System.out.println("<" + spr16.odZadnjic() + ">");
        odd02.oddaj('L');
        odd04.oddaj('g');
        odd00.oddaj('R');
        System.out.println(spr05.koliko());
        odd04.oddaj('q');
        odd03.oddaj('y');
        odd03.oddaj('P');
        System.out.println("<" + spr13.odZadnjic() + ">");
        odd01.oddaj('D');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println(spr19.koliko());
        odd01.oddaj('c');
        System.out.println("<" + spr08.odZadnjic() + ">");
        odd01.oddaj('M');
        System.out.println(spr17.koliko());
        odd05.oddaj('Y');
        System.out.println(spr13.koliko());
        odd04.oddaj('a');
        System.out.println("<" + spr18.odZadnjic() + ">");
        odd00.oddaj('a');
        System.out.println("<" + spr14.odZadnjic() + ">");
        odd04.oddaj('j');
        System.out.println(spr09.koliko());
        odd00.oddaj('V');
        odd00.oddaj('e');
        odd01.oddaj('q');
        odd04.oddaj('B');
        System.out.println(spr02.koliko());
        odd03.oddaj('K');
        odd03.oddaj('T');
        odd05.oddaj('B');
        System.out.println(spr05.koliko());
        odd00.oddaj('D');
        odd02.oddaj('d');
        odd01.oddaj('x');
        System.out.println("<" + spr08.odZadnjic() + ">");
        odd00.oddaj('D');
        odd04.oddaj('J');
        System.out.println(spr13.koliko());
        odd00.oddaj('z');
        odd03.oddaj('e');
        odd02.oddaj('D');
        odd04.oddaj('P');
        System.out.println(spr02.koliko());
        System.out.println("<" + spr11.odZadnjic() + ">");
    }
}