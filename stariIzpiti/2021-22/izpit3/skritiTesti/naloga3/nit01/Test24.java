
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        Tretja.Oddajnik odd00 = new Tretja.Oddajnik();
        Tretja.Sprejemnik spr00 = new Tretja.Sprejemnik(odd00);
        Tretja.Oddajnik odd01 = new Tretja.Oddajnik();
        Tretja.Sprejemnik spr01 = new Tretja.Sprejemnik(odd01);
        Tretja.Oddajnik odd02 = new Tretja.Oddajnik();
        Tretja.Sprejemnik spr02 = new Tretja.Sprejemnik(odd02);
        Tretja.Oddajnik odd03 = new Tretja.Oddajnik();
        Tretja.Sprejemnik spr03 = new Tretja.Sprejemnik(odd03);

        odd03.oddaj('V');
        odd02.oddaj('V');
        odd01.oddaj('c');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println(spr03.koliko());
        odd03.oddaj('C');
        odd01.oddaj('Q');
        System.out.println(spr01.koliko());
        odd00.oddaj('W');
        odd03.oddaj('F');
        System.out.println(spr00.koliko());
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd00.oddaj('Q');
        odd00.oddaj('s');
        odd02.oddaj('f');
        System.out.println(spr00.koliko());
        odd03.oddaj('m');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd03.oddaj('L');
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println(spr02.koliko());
        odd01.oddaj('w');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd03.oddaj('n');
        odd02.oddaj('t');
        odd01.oddaj('N');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd00.oddaj('P');
        odd01.oddaj('w');
        odd03.oddaj('n');
        odd00.oddaj('g');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd00.oddaj('H');
        odd01.oddaj('c');
        System.out.println(spr00.koliko());
        odd03.oddaj('F');
        odd00.oddaj('t');
        System.out.println(spr01.koliko());
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd02.oddaj('n');
        odd01.oddaj('k');
        odd00.oddaj('c');
        odd03.oddaj('P');
        odd01.oddaj('d');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd03.oddaj('B');
        odd02.oddaj('j');
        odd02.oddaj('T');
        System.out.println(spr01.koliko());
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd00.oddaj('K');
        odd01.oddaj('P');
        odd01.oddaj('e');
        System.out.println(spr00.koliko());
        odd02.oddaj('r');
        odd02.oddaj('i');
        odd02.oddaj('S');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd00.oddaj('h');
        odd03.oddaj('c');
        odd00.oddaj('x');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd03.oddaj('l');
        System.out.println(spr00.koliko());
        odd02.oddaj('p');
        odd01.oddaj('q');
        odd00.oddaj('X');
        System.out.println(spr02.koliko());
        odd01.oddaj('m');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd00.oddaj('M');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd00.oddaj('j');
        odd03.oddaj('D');
        odd01.oddaj('o');
        odd03.oddaj('c');
        odd03.oddaj('A');
        odd00.oddaj('m');
        odd03.oddaj('n');
        odd00.oddaj('j');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd00.oddaj('i');
        odd01.oddaj('U');
        odd00.oddaj('c');
        odd02.oddaj('Y');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd01.oddaj('Z');
        System.out.println(spr01.koliko());
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd02.oddaj('Z');
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd03.oddaj('O');
        System.out.println(spr03.koliko());
        odd03.oddaj('v');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd02.oddaj('I');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd02.oddaj('X');
        odd03.oddaj('q');
        odd01.oddaj('w');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd00.oddaj('N');
        odd01.oddaj('K');
        odd01.oddaj('Z');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd00.oddaj('v');
        odd01.oddaj('K');
        odd03.oddaj('o');
        odd01.oddaj('s');
        odd01.oddaj('U');
        odd02.oddaj('U');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd00.oddaj('g');
        odd01.oddaj('D');
        odd01.oddaj('a');
        System.out.println(spr02.koliko());
        odd02.oddaj('d');
        odd01.oddaj('K');
        odd01.oddaj('E');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd00.oddaj('l');
        System.out.println(spr01.koliko());
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd02.oddaj('n');
        odd02.oddaj('G');
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println(spr02.koliko());
        odd03.oddaj('N');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd02.oddaj('W');
        odd03.oddaj('v');
        odd00.oddaj('r');
        odd01.oddaj('z');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd03.oddaj('n');
        odd02.oddaj('Q');
        odd02.oddaj('D');
        odd02.oddaj('O');
        odd02.oddaj('V');
        odd02.oddaj('L');
        odd00.oddaj('h');
        odd02.oddaj('U');
        System.out.println(spr01.koliko());
        System.out.println(spr02.koliko());
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd01.oddaj('w');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd01.oddaj('s');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd01.oddaj('e');
        odd00.oddaj('O');
        odd00.oddaj('B');
        odd03.oddaj('e');
        odd01.oddaj('x');
        odd03.oddaj('T');
        System.out.println(spr00.koliko());
        odd03.oddaj('V');
        odd01.oddaj('q');
        odd02.oddaj('q');
        odd00.oddaj('K');
        odd02.oddaj('u');
        odd00.oddaj('r');
        odd01.oddaj('i');
        odd03.oddaj('n');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd02.oddaj('W');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd02.oddaj('Q');
        odd00.oddaj('d');
        odd03.oddaj('u');
        odd03.oddaj('U');
        odd00.oddaj('x');
        odd00.oddaj('D');
        odd03.oddaj('k');
        odd02.oddaj('F');
        odd01.oddaj('d');
        odd02.oddaj('n');
        odd02.oddaj('h');
        odd03.oddaj('K');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println(spr03.koliko());
        odd00.oddaj('O');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd02.oddaj('d');
        odd02.oddaj('U');
        odd02.oddaj('s');
        odd02.oddaj('R');
        odd02.oddaj('m');
        odd00.oddaj('q');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd03.oddaj('Z');
        odd02.oddaj('O');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd00.oddaj('V');
        odd00.oddaj('L');
        odd01.oddaj('W');
        System.out.println(spr00.koliko());
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd00.oddaj('a');
        odd00.oddaj('N');
        odd03.oddaj('R');
        System.out.println(spr00.koliko());
        odd03.oddaj('t');
        odd01.oddaj('v');
        System.out.println(spr01.koliko());
        odd01.oddaj('F');
        System.out.println(spr01.koliko());
        odd00.oddaj('z');
        odd00.oddaj('O');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd03.oddaj('W');
        System.out.println(spr03.koliko());
        odd01.oddaj('o');
        odd00.oddaj('m');
        System.out.println("<" + spr01.odZadnjic() + ">");
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd00.oddaj('S');
        odd00.oddaj('N');
        odd03.oddaj('x');
        odd03.oddaj('j');
        odd01.oddaj('k');
        odd00.oddaj('Z');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd03.oddaj('I');
        odd02.oddaj('l');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd01.oddaj('R');
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd02.oddaj('R');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd01.oddaj('K');
        System.out.println(spr01.koliko());
        odd03.oddaj('Y');
        odd02.oddaj('c');
        odd02.oddaj('s');
        System.out.println(spr02.koliko());
        System.out.println(spr03.koliko());
        odd00.oddaj('v');
        odd02.oddaj('d');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd03.oddaj('G');
        odd01.oddaj('E');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd00.oddaj('z');
        odd01.oddaj('j');
        odd01.oddaj('Y');
        odd02.oddaj('C');
        odd02.oddaj('J');
        odd01.oddaj('V');
        odd00.oddaj('g');
        odd02.oddaj('A');
        odd00.oddaj('i');
        System.out.println(spr01.koliko());
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd02.oddaj('H');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd00.oddaj('x');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd01.oddaj('I');
        odd00.oddaj('j');
        odd01.oddaj('P');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd00.oddaj('s');
        odd01.oddaj('F');
        odd03.oddaj('W');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd00.oddaj('R');
        odd03.oddaj('c');
        odd03.oddaj('a');
        odd00.oddaj('W');
        odd01.oddaj('p');
        System.out.println("<" + spr01.odZadnjic() + ">");
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd02.oddaj('l');
        odd00.oddaj('p');
        odd02.oddaj('L');
        odd03.oddaj('x');
        odd01.oddaj('v');
        odd03.oddaj('i');
        odd02.oddaj('J');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd03.oddaj('E');
        System.out.println(spr03.koliko());
        odd02.oddaj('c');
        odd03.oddaj('k');
        odd01.oddaj('v');
        odd00.oddaj('l');
        System.out.println(spr02.koliko());
        odd03.oddaj('Z');
        odd01.oddaj('j');
        odd02.oddaj('i');
        odd01.oddaj('m');
        odd02.oddaj('e');
        odd01.oddaj('H');
        System.out.println(spr03.koliko());
        odd00.oddaj('e');
        odd01.oddaj('J');
        odd02.oddaj('L');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd03.oddaj('O');
        odd01.oddaj('C');
        odd03.oddaj('o');
        odd02.oddaj('i');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd03.oddaj('x');
        odd03.oddaj('o');
        odd03.oddaj('p');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println(spr03.koliko());
        odd03.oddaj('t');
        System.out.println(spr03.koliko());
        odd01.oddaj('g');
        odd02.oddaj('P');
        odd00.oddaj('c');
        System.out.println(spr00.koliko());
        odd00.oddaj('d');
        odd02.oddaj('V');
        System.out.println(spr01.koliko());
        odd03.oddaj('J');
        odd02.oddaj('d');
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println(spr00.koliko());
        odd01.oddaj('A');
        odd01.oddaj('W');
        odd01.oddaj('p');
        odd03.oddaj('m');
        odd03.oddaj('Q');
        odd00.oddaj('z');
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd01.oddaj('h');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd01.oddaj('M');
        odd02.oddaj('n');
        odd01.oddaj('G');
        odd01.oddaj('Q');
        System.out.println(spr02.koliko());
        odd00.oddaj('C');
        odd02.oddaj('v');
        System.out.println(spr02.koliko());
        odd02.oddaj('x');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd00.oddaj('O');
        odd03.oddaj('w');
        System.out.println(spr00.koliko());
        System.out.println(spr03.koliko());
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd03.oddaj('N');
        odd02.oddaj('w');
        System.out.println(spr03.koliko());
        odd03.oddaj('m');
        odd02.oddaj('h');
        System.out.println(spr03.koliko());
        odd00.oddaj('T');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd00.oddaj('D');
        System.out.println(spr02.koliko());
        odd01.oddaj('w');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd01.oddaj('r');
        odd01.oddaj('U');
        System.out.println(spr01.koliko());
        System.out.println(spr00.koliko());
        odd01.oddaj('e');
        odd02.oddaj('N');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println(spr01.koliko());
        odd02.oddaj('g');
        System.out.println(spr02.koliko());
        odd01.oddaj('O');
        odd00.oddaj('y');
        odd03.oddaj('u');
        odd01.oddaj('i');
        odd00.oddaj('o');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd03.oddaj('I');
        odd03.oddaj('p');
        odd02.oddaj('T');
        System.out.println(spr03.koliko());
        odd03.oddaj('Y');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd00.oddaj('a');
        odd01.oddaj('M');
        odd03.oddaj('t');
        odd03.oddaj('P');
        odd03.oddaj('f');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd03.oddaj('j');
        odd01.oddaj('G');
        odd03.oddaj('a');
        odd03.oddaj('V');
        odd00.oddaj('z');
        odd02.oddaj('M');
        odd02.oddaj('T');
        System.out.println(spr01.koliko());
        System.out.println(spr03.koliko());
        odd00.oddaj('r');
        odd02.oddaj('H');
        odd02.oddaj('w');
        odd02.oddaj('z');
        odd02.oddaj('E');
        odd02.oddaj('X');
        odd03.oddaj('k');
        odd01.oddaj('a');
        odd01.oddaj('e');
        odd01.oddaj('e');
        odd00.oddaj('T');
        odd02.oddaj('G');
        odd03.oddaj('t');
        odd03.oddaj('P');
        odd02.oddaj('x');
        odd02.oddaj('c');
        odd00.oddaj('p');
        odd02.oddaj('b');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println("<" + spr03.odZadnjic() + ">");
        System.out.println(spr01.koliko());
        odd00.oddaj('q');
        System.out.println(spr00.koliko());
        odd01.oddaj('v');
        odd01.oddaj('E');
        System.out.println(spr01.koliko());
        odd02.oddaj('p');
        odd01.oddaj('i');
        odd02.oddaj('f');
        System.out.println(spr01.koliko());
        odd01.oddaj('t');
        odd01.oddaj('v');
        odd00.oddaj('E');
        odd00.oddaj('g');
        odd02.oddaj('J');
        System.out.println(spr01.koliko());
        odd03.oddaj('O');
        odd02.oddaj('y');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd03.oddaj('W');
        odd00.oddaj('i');
        odd01.oddaj('D');
        odd03.oddaj('n');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd01.oddaj('U');
        odd03.oddaj('P');
        odd01.oddaj('j');
        odd02.oddaj('I');
        odd02.oddaj('f');
        odd00.oddaj('z');
        odd02.oddaj('h');
        odd03.oddaj('h');
        odd00.oddaj('T');
        odd02.oddaj('E');
        odd00.oddaj('M');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println(spr00.koliko());
        odd00.oddaj('c');
        System.out.println(spr03.koliko());
        System.out.println(spr01.koliko());
        odd00.oddaj('S');
        odd03.oddaj('T');
        odd02.oddaj('p');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd02.oddaj('F');
        odd02.oddaj('Z');
        odd03.oddaj('W');
        System.out.println(spr03.koliko());
        System.out.println(spr00.koliko());
        odd03.oddaj('E');
        odd00.oddaj('j');
        odd01.oddaj('c');
        odd00.oddaj('n');
        odd02.oddaj('D');
        odd02.oddaj('R');
        System.out.println(spr00.koliko());
        odd01.oddaj('y');
        odd03.oddaj('e');
        odd03.oddaj('I');
        odd02.oddaj('j');
        System.out.println("<" + spr02.odZadnjic() + ">");
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd00.oddaj('v');
        System.out.println("<" + spr01.odZadnjic() + ">");
        odd03.oddaj('J');
        odd03.oddaj('Y');
        odd02.oddaj('i');
        odd02.oddaj('S');
        odd01.oddaj('Q');
        odd03.oddaj('I');
        odd01.oddaj('R');
        odd03.oddaj('i');
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd02.oddaj('a');
        odd00.oddaj('h');
        odd02.oddaj('f');
        odd02.oddaj('Q');
        odd00.oddaj('Y');
        odd00.oddaj('w');
        odd03.oddaj('R');
        System.out.println("<" + spr02.odZadnjic() + ">");
        odd01.oddaj('t');
        System.out.println(spr01.koliko());
        System.out.println("<" + spr00.odZadnjic() + ">");
        odd01.oddaj('v');
        System.out.println("<" + spr03.odZadnjic() + ">");
        odd01.oddaj('r');
        odd03.oddaj('Y');
        System.out.println(spr03.koliko());
    }
}