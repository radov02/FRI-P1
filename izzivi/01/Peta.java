public class Peta {
    public static void main(String[] args){
        int a = 5;
        int b = 10;

        // asistent:
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a + ", " + b);

        a = 5;
        b = 10;
        // docentka:
        // z operacijo XOR:
        /*
         *  x | y | x^y
         * -------------
         *  0 | 0 |  0
         *  1 | 0 |  1
         *  0 | 1 |  1
         *  1 | 1 |  0
         * 
         * tako lahko izvedemo XOR operacije in zamenjamo spremenljivki:
         */
        a = a ^ b;  // 0101 ^ 1010 = 1111 (15)
        b = a ^ b;  // 1111 ^ 1010 = 0101 (5)
        a = a ^ b;  // 1111 ^ 0101 = 1010 (10)
        System.out.println(a + ", " + b);

        a = 5;
        b = 10;
        // z operacijama + in -:
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + ", " + b);
    }
}
