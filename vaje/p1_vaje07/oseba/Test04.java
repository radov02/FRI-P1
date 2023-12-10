
public class Test04 {

    public static void main(String[] args) {
        Oseba1 os1 = new Oseba1("Janez", "Novak", 'M', 1953, null, null);
        Oseba1 os2 = new Oseba1("Ana", "Novak", 'Z', 1955, null, null);

        System.out.println(os1.jeStarejsaOd(os2));
        System.out.println(os2.jeStarejsaOd(os1));
        System.out.println(os1.jeStarejsaOd(os1));
    }
}
