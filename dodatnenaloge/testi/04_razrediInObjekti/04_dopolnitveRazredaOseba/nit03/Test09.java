
public class Test09 {

    public static void main(String[] args) {
        Oseba os11 = new Oseba("Jožef", "Pogačnik", 'M', 1921, null, null);
        Oseba os12 = new Oseba("Marija", "Pogačnik", 'Z', 1928, null, null);
        Oseba os13 = new Oseba("France", "Kotnik", 'M', 1932, null, null);
        Oseba os14 = new Oseba("Ivana", "Kotnik", 'Z', 1931, null, null);
        Oseba os15 = new Oseba("Anton", "Zajc", 'M', 1922, null, null);
        Oseba os21 = new Oseba("Marjan", "Pogačnik", 'M', 1946, os11, os12);
        Oseba os22 = new Oseba("Dana", "Pogačnik", 'Z', 1950, null, null);
        Oseba os23 = new Oseba("Milan", "Smole", 'M', 1953, null, null);
        Oseba os24 = new Oseba("Metka", "Smole", 'Z', 1953, null, null);
        Oseba os25 = new Oseba("Zvone", "Kotnik", 'M', 1956, os13, os14);
        Oseba os26 = new Oseba("Tanja", "Kotnik", 'Z', 1954, null, null);
        Oseba os27 = new Oseba("Branka", "Zajc", 'Z', 1952, os15, os14);
        Oseba os31 = new Oseba("Dejan", "Pogačnik", 'M', 1973, os21, os22);
        Oseba os32 = new Oseba("Mojca", "Pogačnik", 'Z', 1977, os23, os24);
        Oseba os33 = new Oseba("Miha", "Smole", 'M', 1978, os23, os24);
        Oseba os34 = new Oseba("Neža", "Smole", 'Z', 1980, os25, os26);
        Oseba os35 = new Oseba("Aleš", "Kotnik", 'M', 1982, os25, os26);
        Oseba os36 = new Oseba("Jana", "Kotnik", 'Z', 1981, null, null);
        Oseba os41 = new Oseba("Rok", "Pogačnik", 'M', 2003, os31, os32);
        Oseba os42 = new Oseba("Eva", "Pogačnik", 'Z', 2006, os31, os32);
        Oseba os43 = new Oseba("Gal", "Smole", 'M', 2009, os33, os34);
        Oseba os44 = new Oseba("Maj", "Kotnik", 'M', 2010, os35, os36);
        Oseba os45 = new Oseba("Nika", "Kotnik", 'Z', 2012, os35, os36);

        System.out.println(os44.jeSorodnikOd(os45));
        System.out.println(os44.jeSorodnikOd(os27));
        System.out.println(os44.jeSorodnikOd(os24));
        System.out.println(os44.jeSorodnikOd(os41));
    }
}
