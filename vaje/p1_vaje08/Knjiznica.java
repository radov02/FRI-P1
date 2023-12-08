import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;

enum VrstaTransakcije {
    NAKUP("+", "nakup"),
    PRODAJA("-", "prodaja"),
    IZPOSOJA("I", "izposoja"),
    VRACILO("V", "vracilo");

    private final String oznaka;
    private final String opis;

    private VrstaTransakcije(String oznaka, String opis){
        this.oznaka = oznaka;
        this.opis = opis;
    }

    public String getOznaka(){
        return this.oznaka;
    }

    public String getOpis(){
        return this.opis;
    }
}

enum Status {
    OK(0, "OK"),
    NEUSPESNO(1, "Neuspešno");

    private final int koda;
    private final String vrednost;

    private Status(int koda, String vrednost){
        this.koda = koda;
        this.vrednost = vrednost;
    }

    public int getKoda(){
        return this.koda;
    }

    public String getVrednost(){
        return this.vrednost;
    }
}

class ParTransakcij {
    private Transakcija a;
    private Transakcija b;

    public ParTransakcij(Transakcija a, Transakcija b){
        this.a = a;
        this.b = b;
    }

    public Transakcija getTransakcijaA(){
        return this.a;
    }
    public Transakcija getTransakcijaB(){
        return this.b;
    }
}

public class Knjiznica {

    private int stClanov;
    private int stNaslovov;
    private int stIzvodovKnjige;
    private int[] zalogaKnjig;
    private int[] stetjeVsehIzposoj;
    private boolean[][] izposoje;   // clani in katere knjige imajo izposojene
    // log:
    private static final int LOG_SIZE = 100;
    private Transakcija[] log;
    private int trenutnaVelikostLog;

    // konstruktorja:
    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov){
        this.stClanov = stClanov;
        this.stNaslovov = stNaslovov;
        this.stIzvodovKnjige = stIzvodovNaNaslov;
        this.zalogaKnjig = new int[this.stNaslovov];
        Arrays.fill(zalogaKnjig, stIzvodovNaNaslov);
        this.stetjeVsehIzposoj = new int[this.stNaslovov];
        this.izposoje = new boolean[this.stClanov][this.stNaslovov];

        this.log = new Transakcija[Knjiznica.LOG_SIZE];
        this.trenutnaVelikostLog = 0;
    }
    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov, Transakcija[] log){
        this(stClanov, stNaslovov, stIzvodovNaNaslov);
        this.log = log;
        this.trenutnaVelikostLog = this.log.length;
    }


    // clan si izposodi knjigo z naslovom "naslov":
    public boolean posodi(int clan, int naslov){
        if(this.zalogaKnjig[naslov] > 0 && !this.izposoje[clan][naslov]){
            this.zalogaKnjig[naslov]--;
            this.izposoje[clan][naslov] = true;
            this.stetjeVsehIzposoj[naslov]++;

            // zapis v log:
            zapisivLog(clan, naslov, VrstaTransakcije.IZPOSOJA, Status.OK);
            return true;
        }
        
        // zapis v log (neuspesna transakcija):
        zapisivLog(clan, naslov, VrstaTransakcije.IZPOSOJA, Status.NEUSPESNO);
        return false;
    }

    // clan vrne vse izvode knjig, ki jih ima:
    public void clanVrne(int clan){
        for(int i = 0; i < this.izposoje[clan].length; i++){
            if(this.izposoje[clan][i]){
                this.zalogaKnjig[i]++;
                this.izposoje[clan][i] = false;

                zapisivLog(clan, i, VrstaTransakcije.VRACILO, Status.OK);
            }
        }
    }

    // koliko izvodov knjige z naslovom "naslov" je trenutno izposojenih:
    public int posojeni(int naslov){
        return (this.stIzvodovKnjige - this.zalogaKnjig[naslov]);
    }

    // koliko knjig ima izposojenih clan "clan":
    public int priClanu(int clan){
        int stevilo = 0;
        for(int i = 0; i < this.izposoje[clan].length; i++){
            if(this.izposoje[clan][i]){
                stevilo++;
            }
        }
        return stevilo;
    }

    // najveckrat izposojena knjiga (stevilo naslova):
    public int najNaslov(){
        int naj = 0;
        for(int i = 1; i < this.stetjeVsehIzposoj.length; i++){
            if(this.stetjeVsehIzposoj[i] > this.stetjeVsehIzposoj[naj]){
                naj = i;
            }
        }
        return naj;
    }

    // vrne stevilo izposojenih izvodov knjige z naslovom "naslov" (bere iz tabele log):
    public int posojeniLog(int naslov){
        int stevilo = 0;
        for(int i = 0; i < this.trenutnaVelikostLog; i++) {
            if(this.log[i].getNaslov() == naslov && this.log[i].getStatus().getKoda() == 1){
                if(this.log[i].getVrstaTransakcije().getOznaka().equals("I")){
                    stevilo++;
                }
                else if(this.log[i].getVrstaTransakcije().getOznaka().equals("V")){
                    stevilo--;
                }
            }
        }
        return stevilo;
    }

    // vrne clana, ki si je zadnji izposodil knjigo, ce ga ni, vrne -1:
    public int zadnjaIzposoja(){
        for(int i = this.trenutnaVelikostLog - 1; i >= 0; i--){
            if(this.log[i].getStatus() == Status.OK && this.log[i].getVrstaTransakcije() == VrstaTransakcije.IZPOSOJA){
                return this.log[i].getClan();
            }
        }
        return -1;
    }

    // vrne status uspesnosti prve opravljene izposoje (kdo in kaj), ce se ni bilo izposoj pa null:
    public int[] prvaZakljucenaIzposoja(){
        for(int i = 0; i < this.log.length; i++){
            Transakcija t = this.log[i];
            if(t.getStatus() == Status.OK && t.getVrstaTransakcije() == VrstaTransakcije.VRACILO){
                return new int[] {t.getClan(), t.getNaslov()};
            }
        }
        return null;
    }

    // vrne pare zakljucenih izposoj v tabeli:
    public ParTransakcij[] vrniZakljuceneIzposoje(){
        // naredimo seznam in na koncu pretvorimo v tabelo (lazje dodajanje transakcij)
        List<ParTransakcij> seznamZakljucenihTransakcij = new ArrayList<>();
        boolean zePreverjenaZakljucena[] = new boolean[this.trenutnaVelikostLog];
        
        for(int i = 0; i < this.trenutnaVelikostLog; i++){
            if(zePreverjenaZakljucena[i]) continue;

            Transakcija t = this.log[i];
            if(t.getStatus() == Status.OK && t.getVrstaTransakcije() == VrstaTransakcije.IZPOSOJA){
                for(int j = i + 1; j < this.trenutnaVelikostLog; j++){
                    if(zePreverjenaZakljucena[j]) continue;

                    Transakcija t2 = this.log[j];
                    if(t2.getClan() == t.getClan() && t2.getNaslov() == t.getNaslov() && t2.getStatus() == Status.OK && t2.getVrstaTransakcije() == VrstaTransakcije.VRACILO){
                        ParTransakcij parTra = new ParTransakcij(t, t2);
                        seznamZakljucenihTransakcij.add(parTra);
                        zePreverjenaZakljucena[i] = true;
                        zePreverjenaZakljucena[j] = true;
                    }
                }
            }
        }
        return seznamZakljucenihTransakcij.toArray(new ParTransakcij[0]);
    }

    // vrne transakcije se trajajocih izposoj:
    public Transakcija[] vrniOdprteIzposoje(){
        // najprej poiscemo ze zakljucene transakcije in jih oznacimo v tabeli:
        boolean zePreverjenaZakljucena[] = new boolean[this.trenutnaVelikostLog];
        for(int i = 0; i < this.trenutnaVelikostLog; i++){
            if(zePreverjenaZakljucena[i]) continue;
            Transakcija t = this.log[i];
            if(t.getStatus() == Status.OK && t.getVrstaTransakcije() == VrstaTransakcije.IZPOSOJA){
                for(int j = i + 1; j < this.trenutnaVelikostLog; j++){
                    if(zePreverjenaZakljucena[j]) continue;
                    Transakcija t2 = this.log[j];
                    if(t2.getClan() == t.getClan() && t2.getNaslov() == t.getNaslov() && t2.getStatus() == Status.OK && t2.getVrstaTransakcije() == VrstaTransakcije.VRACILO){
                        zePreverjenaZakljucena[i] = true;
                        zePreverjenaZakljucena[j] = true;
                    }
                }
            }
        }

        // dodaj nezakljucene a uspesno izvedene izposoje:
        List<Transakcija> transakcije = new ArrayList<>();
        for(int i = 0; i < zePreverjenaZakljucena.length; i++){
            if(!zePreverjenaZakljucena[i] && this.log[i].getStatus() == Status.OK && this.log[i].getVrstaTransakcije() == VrstaTransakcije.IZPOSOJA){
                transakcije.add(this.log[i]);
            }
        }
        return transakcije.toArray(new Transakcija[0]);
    }

    // vrne podatke o najdaljsi izposoji gradiva:
    public String najdaljsaIzposoja(){
        ParTransakcij[] pariZakljucenihIzposoj = vrniZakljuceneIzposoje();

        int maxDni = -1;
        Transakcija tMaxIzposoja = null;
        Transakcija tMaxVracilo = null;

        for(int i = 0; i < pariZakljucenihIzposoj.length; i++){
            Transakcija t1 = pariZakljucenihIzposoj[i].getTransakcijaA();
            Transakcija t2 = pariZakljucenihIzposoj[i].getTransakcijaB();
            int razlikaDni = t1.razlikaDni(t2);
            if(razlikaDni > maxDni){
                maxDni = razlikaDni;
                tMaxIzposoja = t1;
                tMaxVracilo = t2;
            }
        }
        return String.format("C = %d, K = %d; %s -> %s (%d dni)", tMaxIzposoja.getClan(), tMaxIzposoja.getNaslov(), tMaxIzposoja.getDatumString(), tMaxVracilo.getDatumString(), maxDni);
    }

    // vrne oznako in stevilo izposoj najbolj strastnega bralca (ki si je izposodil najvec knjig):
    public int[] knjizniMolj(){
        ParTransakcij[] pariZakljucenihIzposoj = vrniZakljuceneIzposoje();

        int izposojeClana[] = new int[this.stClanov];
        for(ParTransakcij par : pariZakljucenihIzposoj){
            int clan = par.getTransakcijaA().getClan();
            izposojeClana[clan - 1]++;
        }

        int clanMax = 0;
        for(int i = 0; i < izposojeClana.length; i++){
            if(izposojeClana[i] > izposojeClana[clanMax]){
                clanMax = i;
            }
        }
        return new int[] {clanMax, izposojeClana[clanMax]};
    }

    // public double povprecjeIzposojDni

    // public double medianaIzposojDni

    // metode za log:
    private void zapisivLog(int clan, int naslov, VrstaTransakcije vrstaTransakcije, Status status){
        GregorianCalendar datum = new GregorianCalendar();
        Transakcija transakcija = Transakcija.ustvariTransakcijo(clan, naslov, vrstaTransakcije, datum, status);

        if(this.trenutnaVelikostLog >= this.log.length){
            this.log = Knjiznica.povecajVelikostLogTabele(log);
        }
        this.log[this.trenutnaVelikostLog++] = transakcija;
    }
    private static Transakcija[] povecajVelikostLogTabele(Transakcija[] trenutniLog){
        Transakcija[] noviLog = new Transakcija[2 * trenutniLog.length + 1];
        for(int i = 0; i < trenutniLog.length; i++){
            noviLog[i] = trenutniLog[i];
        }
        return noviLog;
    }
    private void izpisiLog(){
        GregorianCalendar datum = new GregorianCalendar();
        System.out.println("Izpis tabele transakcij:\n");
        for(int i = 0; i < this.log.length; i++){
            System.out.println(this.log[i]);
        }
        System.out.printf("Konec izpisa tabele transakcij (%d)\n", datum);
    }
}


