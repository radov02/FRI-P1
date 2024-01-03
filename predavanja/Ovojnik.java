public class Ovojnik {
    private Object a;

    public Ovojnik(Object a){
        this.a = a;
    }

    public Object vrni(){
        return this.a;
    }

    public static void main(String[] args){
        Ovojnik p = new Ovojnik("Dober dan");
        String s = (String) p.vrni();
        System.out.println(s);

        Ovojnik q = new Ovojnik(new Cas(10, 20));
        Cas c = (Cas) q.vrni();
        System.out.println(c);

        // String s2 = (String) q.vrni();   // prevajalnik dovoli, izvajalnik sproži izjemo
        // System.out.println(s2);
    }
}
