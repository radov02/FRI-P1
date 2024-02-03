
import java.util.*;

public class Tekma {

    private String domaci;
    private String gostje;
    private int goliDomacih;
    private int goliGostov;

    public Tekma(String domaci, String gostje, int goliDomacih, int goliGostov) {
        this.domaci = domaci;
        this.gostje = gostje;
        this.goliDomacih = goliDomacih;
        this.goliGostov = goliGostov;
    }

    public String getDomaci(){
        return this.domaci;
    }

    public String getGosti(){
        return this.gostje;
    }

    public int steviloTock(String klub) {
        if(!(klub.equals(domaci) || klub.equals(gostje))){
            return 0;
        }
        if(klub.equals(domaci)){
            if(goliDomacih > goliGostov){
                return 3;
            }
            else if(goliDomacih == goliGostov){
                return 1;
            }
            else return 0;
        }
        else{
            if(goliDomacih < goliGostov){
                return 3;
            }
            else if(goliDomacih == goliGostov){
                return 1;
            }
            else return 0;
        }
    }

    public int golRazlika(){
        return Math.abs(this.goliDomacih - this.goliGostov);
    }

    @Override
    public String toString() {
        return String.format("%s %d : %d %s", this.domaci, this.goliDomacih,
                this.goliGostov, this.gostje);
    }
}
