import java.util.Scanner;

public class TestCas {
    public static void main(String[] args) {
        Cas kosilo = new Cas(12, 30);

        // kosilo.ura = 12;
        // kosilo.min = 30;

        Cas.pristejStatic(kosilo, 1, 50);
        kosilo.pristej(1, 50);

        Cas a = new Cas(20, 10);
        Cas b = a;
        a.setCas(21, 0);
        System.out.println(a);
        System.out.println(b);
        // enak izpis


        Cas sestanek = kosilo.plus(1, 50);


        System.out.println(kosilo.jeEnakKot(sestanek)); // primerjanje po vsebini (enakih vrednosti)

        Cas y = new Cas(20, 10);
        Cas x = y;
        Cas c = new Cas(20, 10);
        // primerjanje istovetnosti (ali kazalca kažeta na isti objekt)
        System.out.println(y == x); // true
        System.out.println(y == c); // false

        System.out.println(kosilo.razlikaVMin(sestanek));


        // avtobus vozni red
        Scanner sc = new Scanner(System.in);
        int zu = sc.nextInt();
        int zm = sc.nextInt();
        int ku = sc.nextInt();
        int km = sc.nextInt();
        int fr = sc.nextInt();
        avtobus(new Cas(zu, zm), fr, new Cas(ku, km));
        sc.close();
    }

    public static avtobus(Cas zacetek, int frekvencaVMin, Cas konec){
        // ...
    }
}

class Cas {
    private int ura;
    private int min;

    // konstruktor ima isto ime kot razred, nima tipa za vračanje
    // samo za inicializacijo atributov, ne ustvarjanju objekta (za to je operator
    // new - v pomnilniiku poisce prostor in ustvari objekt tako da rezervira
    // prostor za atribute, izvede autoinicializacijo, vrne kazalec na novi objekt,
    // ki se skopira v kazalec, kateremu priredimo (npr. kosilo))
    // konstruktor se zažene ko je objekt že ustvarjen in le nastavi vrednosti
    // atributov (prepiše samoinicializacijo)
    public Cas(int u, int m) {
        this.ura = u; // this je kazalec na objekt
        this.min = m;
    }

    public static void pristejStatic(Cas cas, int u, int m) {
        int noviCas = (u + cas.getUra()) * 60 + (m + cas.getMin());
        // v dnevu je 1440 min
        noviCas = (noviCas % 1440 + 1440) % 1440; // zaradi negativnih vrednosti

        cas.setUra(noviCas / 60);
        cas.setMin(noviCas % 60);
    }

    public void pristej(int u, int m) {
        int noviCas = (u + this.ura) * 60 + (m + this.min);
        // v dnevu je 1440 min
        noviCas = (noviCas % 1440 + 1440) % 1440; // zaradi negativnih vrednosti

        this.ura = noviCas / 60;
        this.min = noviCas % 60;
    }

    public void setCas(int u, int m) {
        this.ura = u;
        this.min = m;
    }

    public void setUra(int u) {
        this.ura = u;
    }

    public int getUra() {
        return this.ura;
    }

    public void setMin(int m) {
        this.min = m;
    }

    public int getMin() {
        return this.min;
    }

    public String toString() {
        // return (this.ura + ":" + this.min);
        return String.format("%d:%02d", this.ura, this.min);
    }

    // vrne kazalec na nov objekt, ki predstavlja
    // trenutek, ki je za h ur in m minut oddaljen od
    // trenutka, ki ga predstavlja objekt, na
    // katerega kaže kazalec this
    public Cas plus(int h, int m) {
        int noviCas = (h + this.ura) * 60 + (m + this.min);
        noviCas = (noviCas % 1440 + 1440) % 1440;
        int novaura = noviCas / 60;
        int novamin = noviCas % 60;
        return new Cas(novaura, novamin);
    }

    public boolean jeEnakKot(Cas drugi){
        return (this.ura == drugi.ura && this.min == drugi.min);
    }

    public int razlikaVMin(Cas drugi){
        return (60 * (this.ura - drugi.ura) + (this.min - drugi.min));
    }

    public boolean jePred(Cas drugi){
        return this.razlikaVMin(drugi) < 0;
    }

    public boolean jeManjsiAliEnakOd(Cas drugi){
        return (this.jeManjsiAliEnakOd(drugi) || this.jeEnakKot(drugi));
    }
}