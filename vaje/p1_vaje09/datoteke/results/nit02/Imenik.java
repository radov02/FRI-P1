public class Imenik extends Datoteka{

    public static final int METADATA = 256;

    private Datoteka[] datoteke;
    
    public Imenik(String ime, Datoteka[] datoteke){
        super(ime);
        this.datoteke = datoteke;
    }

    public int steviloVecjihSlik(int prag){
        int stevec = 0;
        for(Datoteka d : datoteke){
            if(d instanceof SlikovnaDatoteka){
                SlikovnaDatoteka sd = (SlikovnaDatoteka) d;
                if(sd.jeVelikaVsaj(prag)){
                    stevec++;
                }
            }
        }
        return stevec;
    }

    public String poisci(String ime){
        return poisci(".", ime);
    }

    private String poisci(String pot, String ime){
        for(Datoteka d : datoteke){
            if(d.getIme().equals(ime)){
                return pot + "/" + d.getIme();
            }
            else if(d instanceof Imenik){
                //Imenik podimenik = (Imenik)d;
                String p = ((Imenik)d).poisci(pot + "/" + d.getIme(), ime);  // . veze mocneje kot cast
                if(p != null) return p;
            }
        }
        return null;
    }


    // public void izpisi(){
    //     return izpisi(".", , this);
    // }

    // public void izpisi(String pot, char[] , Imenik im){
    //     for(Datoteka d : this.datoteke){
    //         if(d instanceof Imenik){
    //             izpisi()
    //         }
    //     }
    // }

    @Override
    public int velikost(){
        int velikost = Imenik.METADATA;
        for(Datoteka dat : datoteke){
            velikost += dat.velikost();
        }
        return velikost;
    }

    @Override
    public String opis(){
        return String.format("i %d", this.datoteke.length);
    }

    @Override
    public String toString(){
        return String.format("%s [i %d]", getIme(), this.datoteke.length);
    }
}
