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
        //avtobus(new Cas(zu, zm), fr, new Cas(ku, km));


        Cas obed = kosilo;
        System.out.println(kosilo.equals(obed));
        System.out.println(kosilo.equals(sestanek));

        System.out.println(kosilo.hashCode());
        System.out.println(obed.hashCode());
        System.out.println(sestanek.hashCode());

        sc.close();
    }

    // public static avtobus(Cas zacetek, int frekvencaVMin, Cas konec){
    //     // ...
    // }
}

class Cas implements Comparable<Cas>{
    private int ura;
    private int min;

    private static boolean zapis12 = false; // ni atribut objektov posebej

    public static void nastaviZapis12(boolean da){
        zapis12 = da;
    }

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

    @Override
    public String toString() {
        // return (this.ura + ":" + this.min);
        if(zapis12){
            String pripona = (this.ura < 12) ? "AM":"PM";
            int h = (this.ura + 11) % 12 + 1;
            return String.format("%d:%02d %s", h, this.min, pripona);
        }

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

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Cas)){
            return false;
        }
        Cas objCas = (Cas)obj;  // potrebno castanje (Object lahko castamo v karkoli - po prevajalniku, izvajalnik pa lahko sproži izjemo)
        return (this.ura == objCas.ura && this.min == objCas.min);
    }

    @Override
    public int hashCode(){
        return 17 * Integer.hashCode(this.ura) + 31 * Integer.hashCode(this.min);
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

    @Override   // Cas implements Comparable<Cas>{
    public int compareTo(Cas drugi){    // za naravno urejenost objektov tipa Cas
        int thisMinute = 60 * this.ura + this.min;
        int drugiMinute = 60 * drugi.ura + drugi.min;
        return thisMinute - drugiMinute;    // običajno odštevamo da vrnemo int
    }
}