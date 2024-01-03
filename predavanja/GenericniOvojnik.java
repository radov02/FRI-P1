public class GenericniOvojnik<T> {
    private T a;

    public GenericniOvojnik(T a){
        this.a = a;
    }

    public T vrni(){
        return this.a;
    }

    public static void main(String[] args){
        GenericniOvojnik p1 = new GenericniOvojnik(null); // se prevede z opozorilom

        GenericniOvojnik<String> p = new GenericniOvojnik<String>("Dober dan"); // podamo tipni parameter T
        // lahko pisemo tudi: GenericniOvojnik<String> p = new GenericniOvojnik<>("Dober dan");
        String s = p.vrni();
        System.out.println(s);

        Cas c1 = p.vrni();   // ze prevajalnik vrne napako

        GenericniOvojnik<Cas> q = new GenericniOvojnik<Cas>(new Cas(10, 20));
        Cas c = q.vrni();
        System.out.println(c);

        Object o = q.vrni();    // nadtip = podtip - deluje, ne dobimo metod od razreda Cas
        o.plus(5, 20);  // o nima metod razreda Cas

        ((Cas)o).plus(5, 20);

        
        Integer[] stevila = {20, 10, 6, 16, 25, 17};
        String[] nizi = {"Ana", "Bojan", "Cvetka", "Denis"};
        Cas[] casi = {new Cas(7,0), new Cas(20, 10), new Cas(15, 50)};
        int[] stevilaInt = {20, 10, 6, 16, 25, 17};

        System.out.println(poisci(stevila, 25));
        System.out.println(poisci(nizi, "Cvetka"));
        System.out.println(poisci(casi, new Cas(20, 10)));
        System.out.println(GenericniOvojnik.<Cas>poisci(casi, new Cas(20, 10)));    // ce res hocemo podati tipni argument za metodo (ni obvezno)
        System.out.println(poisci(casi, "abc"));    // vzame Object kot tipni argument
        System.out.println(GenericniOvojnik.<Cas>poisci(casi, "abc"));
        System.out.println(poisci(stevilaInt, 16)); // T se ne more nadomestiti s primitivnim tipom (T je vedno referencni tip)


        int[][] t2 = {{1, 3}, {2, 4}, {3, 5}};
        System.out.println(poisci(t2, new int[]{7, 8}));
    }

    // Generična metoda:
    public static <T> int poisci(T[] tabela, T iskani){
        for(int i = 0; i < tabela.length; i++){
            if(tabela[i].equals(iskani)){   // ce redefiniramo sele equals primerja po atributih, sicer po defaultu isto kot ==
                return i;
            }
        }
        return -1;
    }
}
