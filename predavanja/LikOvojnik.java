public class LikOvojnik<T extends Lik> {
    private T a;
    
    public LikOvojnik(T a){
        this.a = a;
    }

    public T vrni(){
        return this.a;
    }

    public boolean imaVecjoPloscinoKot(LikOvojnik<T> drugi){
        return  this.a.ploscina() > drugi.a.ploscina();
    }

    public <U extends Lik> boolean imaVecjoPloscinoKot2(LikOvojnik<U> drugi){
        return  this.a.ploscina() > drugi.a.ploscina();
    }

    public static void main(String[] args){
        LikOvojnik<Lik> p = new LikOvojnik<Lik>(new Pravokotnik(3, 4));

        LikOvojnik<Pravokotnik> q = new LikOvojnik<>(new Pravokotnik(3, 4));

        LikOvojnik<Krog> r = new LikOvojnik<Krog>(new Krog(7));

        //LikOvojnik<String> s = new LikOvojnik<String>("abc");   // ne deluje ker String ni podtip tipa Lik

        System.out.println(q.imaVecjoPloscinoKot(new LikOvojnik<Pravokotnik>(new Pravokotnik(2, 5))));

        System.out.println(q.imaVecjoPloscinoKot(r));   // nista istega tipa tipna argumenta
        System.out.println(q.imaVecjoPloscinoKot2(r));

    }
}
