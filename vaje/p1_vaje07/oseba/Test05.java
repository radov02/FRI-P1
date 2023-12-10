
public class Test05 {

    public static void main(String[] args) {
        Oseba1 os1 = new Oseba1("Janez", "Novak", 'M', 1953, null, null);
        Oseba1 os2 = new Oseba1("Ana", "Novak", 'Z', 1955, null, null);
        Oseba1 os3 = new Oseba1("Mojca", "Oblak", 'Z', 1953, null, null);

        izpisiStarejso(os1, os2);
        izpisiStarejso(os2, os1);
        izpisiStarejso(os1, os1);
        izpisiStarejso(os1, os3);
        izpisiStarejso(os2, os3);
    }

    private static void izpisiStarejso(Oseba1 a, Oseba1 b) {
        Oseba1 c = Oseba1.starejsa(a, b);
        if (c == a) {
            System.out.println("prva");
        } else if (c == b) {
            System.out.println("druga");
        } else if (c == null) {
            System.out.println("nobena");
        } else {
            System.out.println("neznana");
        }
    }
}
