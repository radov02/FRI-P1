
public class Test05 {

    public static void main(String[] args) {
        Ucenec.nastaviMaksObremenitev(10);

        Ucenec anja = new Ucenec("Anja", "Antolinc");

        Krozek ka = new Krozek("ka", 1, 12, 100);
        Krozek kb = new Krozek("kb", 1, 13, 100);
        Krozek kc = new Krozek("kc", 1, 14, 100);
        Krozek kd = new Krozek("kd", 1, 15, 100);
        Krozek ke = new Krozek("ke", 1, 16, 100);

        System.out.println(anja.vclani(ka));
        System.out.println(anja.vclani(kb));
        System.out.println(anja.vclani(kc));
        System.out.println(anja.vclani(kd));
        System.out.println(anja.vclani(ke));

        Ucenec[] ucenci = {anja};
        Krozek[] krozki = {ka, kb, kc, kd, ke};
        izpisiVse(ucenci, krozki);
    }

    private static void izpisiVse(Ucenec[] ucenci, Krozek[] krozki) {
        for (int i = 0;  i < ucenci.length;  i++) {
            System.out.printf("%s -> %d%n", ucenci[i].vrniIP(), ucenci[i].steviloKrozkov());
        }
        for (int i = 0;  i < krozki.length;  i++) {
            System.out.printf("%s -> %d%n", krozki[i].vrniNaziv(), krozki[i].steviloClanov());
        }
    }
}
