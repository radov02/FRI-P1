
public class Test06 {

    public static void main(String[] args) {
        Oseba1 os11 = new Oseba1("Jozhef",  "Pogachnik", 'M', 1921, null, null);
        Oseba1 os12 = new Oseba1("Marija",  "Pogachnik", 'Z', 1928, null, null);
        Oseba1 os13 = new Oseba1("France",  "Kotnik",    'M', 1932, null, null);
        Oseba1 os14 = new Oseba1("Ivana",   "Kotnik",    'Z', 1931, null, null);
        Oseba1 os15 = new Oseba1("Anton",   "Zajc",      'M', 1922, null, null);
        Oseba1 os21 = new Oseba1("Marjan",  "Pogachnik", 'M', 1946, os11, os12);
        Oseba1 os22 = new Oseba1("Dana",    "Pogachnik", 'Z', 1950, null, null);
        Oseba1 os23 = new Oseba1("Milan",   "Smole",     'M', 1953, null, null);
        Oseba1 os24 = new Oseba1("Metka",   "Smole",     'Z', 1953, null, null);
        Oseba1 os25 = new Oseba1("Zvone",   "Kotnik",    'M', 1956, os13, os14);
        Oseba1 os26 = new Oseba1("Tanja",   "Kotnik",    'Z', 1954, null, null);
        Oseba1 os27 = new Oseba1("Branka",  "Zajc",      'Z', 1952, os15, os14);
        Oseba1 os31 = new Oseba1("Dejan",   "Pogachnik", 'M', 1973, os21, os22);
        Oseba1 os32 = new Oseba1("Mojca",   "Pogachnik", 'Z', 1977, os23, os24);
        Oseba1 os33 = new Oseba1("Miha",    "Smole",     'M', 1978, os23, os24);
        Oseba1 os34 = new Oseba1("Nezha",   "Smole",     'Z', 1980, os25, os26);
        Oseba1 os35 = new Oseba1("Alesh",   "Kotnik",    'M', 1982, os25, os26);
        Oseba1 os36 = new Oseba1("Jana",    "Kotnik",    'Z', 1981, null, null);
        Oseba1 os41 = new Oseba1("Rok",     "Pogachnik", 'M', 2003, os31, os32);
        Oseba1 os42 = new Oseba1("Eva",     "Pogachnik", 'Z', 2006, os31, os32);
        Oseba1 os43 = new Oseba1("Gal",     "Smole",     'M', 2009, os33, os34);
        Oseba1 os44 = new Oseba1("Maj",     "Kotnik",    'M', 2010, os35, os36);
        Oseba1 os45 = new Oseba1("Nika",    "Kotnik",    'Z', 2012, os35, os36);

        System.out.println(os32.imeOceta());
        System.out.println(os27.imeOceta());
        System.out.println(os14.imeOceta());
    }
}
