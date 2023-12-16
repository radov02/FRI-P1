import java.util.Scanner;

public class DN08_63230273 {

    private static abstract class Objava{
        protected String[] avtorji;
        public String naslov;

        public Objava(String[] avtorji, String naslov){
            this.avtorji = avtorji;
            this.naslov = naslov;
        }

        public String izpisAvtorjev(String[] seznamAvtorjev){
            String izpis = "";
            for(int i = 0; i < seznamAvtorjev.length; i++){
                if(i == seznamAvtorjev.length - 1){
                    izpis += (seznamAvtorjev[i]);
                }
                else{
                    izpis += (seznamAvtorjev[i] + ", ");
                }
            }
            return izpis;
        }

        public abstract double getStTock();

        public abstract String stringObjave();

        public String getStringTock(int tockovnaOsnova){
            
            if(Math.round((double)tockovnaOsnova / this.avtorji.length) == (double)tockovnaOsnova / this.avtorji.length){   // ce je stevilo tock celo stevilo
                return Integer.toString(tockovnaOsnova / this.avtorji.length);
            }

            int celiDel = tockovnaOsnova / this.avtorji.length;
            int stevec = tockovnaOsnova - celiDel * this.avtorji.length;
            int imenovalec = this.avtorji.length;
            int gcd = gcd(stevec, imenovalec);

            while(gcd != 1){
                stevec /= gcd;
                imenovalec /= gcd;
                gcd = gcd(stevec, imenovalec);
            }

            return String.format("%d+%d/%d", celiDel, stevec, imenovalec);
        }

        @Override
        public String toString(){
            return String.format("%s: %s. %s", this.izpisAvtorjev(avtorji), this.naslov, this.stringObjave());
        }
    }

    private static class Monografija extends Objava{

        private static final int tockovnaOsnova = 10;
        private String zalozba;
        private int letoIzdaje;
        private String ISBN;

        public Monografija(String[] avtorji, String naslov, String zalozba, int letoIzdaje, String ISBN){
            super(avtorji, naslov);
            this.zalozba = zalozba;
            this.letoIzdaje = letoIzdaje;
            this.ISBN = ISBN;
        }

        public double getStTock(){
            return (double)tockovnaOsnova / this.avtorji.length;
        }

        public String stringObjave(){
            return String.format("%s %d, ISBN %s | %s", this.zalozba, this.letoIzdaje, this.ISBN, this.getStringTock(tockovnaOsnova));
        }
    }

    private static abstract class Prispevek extends Objava{
        protected int[] intervalStrani;

        public Prispevek(String[] avtorji, String naslov, int[] intervalStrani){
            super(avtorji, naslov);
            this.intervalStrani = intervalStrani;
        }
    }

    private static class Referat extends Prispevek{
        private String nazivKonf;
        private VrstaKonference vrstaKonf;

        public Referat(String[] avtorji, String naslov, int[] intervalStrani, String nazivKonf, VrstaKonference vrstaKonf){
            super(avtorji, naslov, intervalStrani);
            this.nazivKonf = nazivKonf;
            this.vrstaKonf = vrstaKonf;
        }

        public double getStTock(){
            return (double)this.vrstaKonf.getTockovnaOsnova() / this.avtorji.length;
        }

        public String stringObjave(){
            return String.format("%s: %d-%d | %s", this.nazivKonf, this.intervalStrani[0], this.intervalStrani[1], this.getStringTock(this.vrstaKonf.getTockovnaOsnova()));
        }
    }

    private static class Clanek extends Prispevek{
        private String nazivRevije;
        private int letnikRevije;
        private int stRevije;
        private int letoIzdaje;
        private int tockovnaOsnova;

        public Clanek(String[] avtorji, String naslov, int[] intervalStrani, String nazivRevije, int letnikRevije, int stRevije, int letoIzdaje, int mestoNaLestviciPomembnihRevij, int stRevijNaLestvici){
            super(avtorji, naslov, intervalStrani);   
            this.nazivRevije = nazivRevije;
            this.letnikRevije = letnikRevije;
            this.stRevije = stRevije;
            this.letoIzdaje = letoIzdaje;

            if(mestoNaLestviciPomembnihRevij == stRevijNaLestvici + 1){
                this.tockovnaOsnova = 2;
            }
            else{
                double pomembnost = (double)mestoNaLestviciPomembnihRevij / (double)stRevijNaLestvici;

                if(pomembnost <= 0.25){
                    this.tockovnaOsnova = 10;
                }
                else if(pomembnost <= 0.5){
                    this.tockovnaOsnova = 8;
                }
                else if(pomembnost <= 0.75){
                    this.tockovnaOsnova = 6;
                }
                else if(pomembnost <= 1){
                    this.tockovnaOsnova = 4;
                }
            }
        }

        public double getStTock(){
            return (double)this.tockovnaOsnova / this.avtorji.length;
        }

        public String stringObjave(){
            return String.format("%s %d(%d): %d-%d (%d) | %s", this.nazivRevije, this.letnikRevije, this.stRevije, this.intervalStrani[0], this.intervalStrani[1], this.letoIzdaje, this.getStringTock(this.tockovnaOsnova));
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String zaposleni = sc.next();
        int stObjav = sc.nextInt();
        Objava[] objave = new Objava[stObjav];
        Objava objava = null;

        for(int i = 0; i < stObjav; i++){
            String vrstaObjave = sc.next();
            int stAvtorjev = sc.nextInt();
            String[] avtorji = new String[stAvtorjev];
            for(int j = 0; j < stAvtorjev; j++){
                String naslednji = sc.next();
                if(naslednji.equals("#")){
                    avtorji[j] = zaposleni;
                }
                else{
                    avtorji[j] = naslednji;
                }
            }
            String naslovObjave = sc.next();

            if(vrstaObjave.equals("monografija")){
                String zalozba = sc.next();
                int letoIzdaje = sc.nextInt();
                String ISBN = sc.next();
                objava = new Monografija(avtorji, naslovObjave, zalozba, letoIzdaje, ISBN);
            }
            else if(vrstaObjave.equals("referat")){
                String nazivKonf = sc.next();
                VrstaKonference v = (sc.nextBoolean() ? VrstaKonference.MEDNARODNA:VrstaKonference.DOMACA);
                int[] intervalStrani = new int[] {sc.nextInt(), sc.nextInt()};
                objava = new Referat(avtorji, naslovObjave, intervalStrani, nazivKonf, v);
            }
            else if(vrstaObjave.equals("clanek")){
                String nazivRevije = sc.next();
                int letnikRevije = sc.nextInt();
                int stRevije = sc.nextInt();
                int letoIzdaje = sc.nextInt();
                int mestoNaLestviciPomembnihRevij = sc.nextInt();
                int stRevijNaLestvici = sc.nextInt();
                int[] intervalStrani = new int[] {sc.nextInt(), sc.nextInt()};
                objava = new Clanek(avtorji, naslovObjave, intervalStrani, nazivRevije, letnikRevije, stRevije, letoIzdaje, mestoNaLestviciPomembnihRevij, stRevijNaLestvici);
            }
            objave[i] = objava;
        }

        urediPoPadajocemSteviluTock(objave);

        for(Objava obj : objave){
            System.out.println(obj.toString());
        }

        sc.close();
    }

    private static void urediPoPadajocemSteviluTock(Objava[] objave){
        // objave[i].getStTock()
        boolean menjaj = true;
        int neurejeni = 0;
        while(menjaj){
            menjaj = false;
            for(int i = objave.length - 1; i > neurejeni; i--){
                if(objave[i].getStTock() > objave[i-1].getStTock()){
                    Objava tmp = objave[i];
                    objave[i] = objave[i-1];
                    objave[i-1] = tmp;
                    menjaj = true;
                }
            }
            neurejeni++;
        }
    }

    private static int gcd(int a, int b){
        
        while(b != 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}

enum VrstaKonference{
    DOMACA("domaca", 1),
    MEDNARODNA("mednarodna", 3);

    //private final String naziv;
    private final int tockovnaOsnova;

    private VrstaKonference(String naziv, int tockovnaOsnova){
        //this.naziv = naziv;
        this.tockovnaOsnova = tockovnaOsnova;
    }

    public int getTockovnaOsnova(){
        return this.tockovnaOsnova;
    }
}