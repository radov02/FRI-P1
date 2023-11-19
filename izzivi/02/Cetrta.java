public class Cetrta {
    public static void main(String[] args){

        byte a = 0;
        byte b = 0;
        int i = 0;
        int p = 3;
        int q = 11;

        do {
            
            a += p;
            b += q;
            i++;
            System.out.println("a: " + a + ", b: " + b);

        } while(a != b);

        System.out.println("-----------");
        System.out.println("2^Byte.SIZE = " + (int)Math.pow(2, Byte.SIZE));
        System.out.println("i = " + i);
        System.out.println("a: " + a + ", b: " + b);
    }
}
