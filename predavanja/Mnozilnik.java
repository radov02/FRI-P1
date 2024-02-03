import java.util.function.IntUnaryOperator;

public class Mnozilnik {
    public static void main(String[] args){

        IntUnaryOperator krat5 = mnozilnik(5);
        System.out.println(krat5.applyAsInt(10));   // 50
        System.out.println(krat5.applyAsInt(-2));   // -10
    }

    public static IntUnaryOperator mnozilnik(int faktor){   // vrne objekt ki predstavlja mnozilnik s podanim faktorjem
        // return new MojOperator(faktor);
        //faktor++;   // spremenljivko lahko uporabimo v lambdi samo ce se ne spreminja, ne smemo faktor++ in potem uporabiti faktorja v lambdi ker bi povzrocilo zmedo, lambda bi namrec vzel faktor iz argumenta funkcije 
        return n -> faktor * n; // faktor (lokalni paraneter) lahko prenesemo v objekt (se skopira v objekt) brez konstruktorja; ne sme pa se spreminjati (preprečeno zaradi zmede, ker se faktor v metodi mnozilnik ne bi spremenil, ker bi se spremenila le kopija v objektu ki ga ustvarimo z lambdo)
    }


    private static class MojOperator implements IntUnaryOperator {
        private int faktor;

        public MojOperator(int faktor){
            this.faktor = faktor;
        }

        @Override
        public int applyAsInt(int n){
            return this.faktor * n;
        }
    }
}
