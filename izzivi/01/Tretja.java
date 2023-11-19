public class Tretja {
    public static void main(String[] args){
        int a = 2000000000;
        int b = 2000000000;

        // System.out.println(Integer.MAX_VALUE);

        System.out.println((Math.pow(2, 31) + a + b));  // celoten krog in čez (modra in oranžna)
        System.out.println((Math.pow(2, 31) + a + b) % Math.pow(2, 32));    // odrežemo celoten krog
        System.out.println(-Math.pow(2, 31) + ((Math.pow(2, 31) + a + b) % Math.pow(2, 32)));   // rezultat prištejemo najmanjši vrednosti int
        System.out.println(a + b);
    }
}
