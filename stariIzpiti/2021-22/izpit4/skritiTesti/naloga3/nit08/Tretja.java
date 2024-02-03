
/*
 * Samodejno testiranje:
 * tj.exe
 *
 * Javni testni primeri:
 * 01: primer iz besedila
 * 02..04: kli"cejo samo metodo dolzinaVrste
 * 05..07: kli"cejo samo metodo steviloDokumentov
 * 08..10: kli"cejo samo metodo natisni
 *
 * Skriti testni primeri: 
 * 01..16: kli"cejo samo metodo dolzinaVrste
 * 17..33: kli"cejo samo metodo steviloDokumentov
 * 34..50: kli"cejo samo metodo natisni
 *
 * (Vsi testni primeri kli"cejo konstruktor in metodo prejmi, a ta dva se ne to"ckujeta.)
 */

import java.util.*;

public class Tretja {

    public static abstract class Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Profesor extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Docent extends Pedagog {
        // po potrebi dopolnite ...
    }

    public static class Asistent extends Pedagog {
        // po potrebi dopolnite ...
    }



    public static class Tiskalnik {

        private List<String> dokumentiProfesorjev;
        private List<String> dokumentiDocentov;
        private List<String> dokumentiAsistentov;
        private int cakajocihDokumentov;

        public Tiskalnik() {
            this.dokumentiProfesorjev = new ArrayList<>();
            this.dokumentiDocentov = new ArrayList<>();
            this.dokumentiAsistentov = new ArrayList<>();
            this.cakajocihDokumentov = 0;
        }

        public void prejmi(Pedagog pedagog, String dokument) {
            if(pedagog instanceof Profesor){
                this.dokumentiProfesorjev.addLast(dokument);
            } else if(pedagog instanceof Docent){
                this.dokumentiDocentov.addLast(dokument);
            } else {
                this.dokumentiAsistentov.addLast(dokument);
            }
            this.cakajocihDokumentov++;
        }

        public int dolzinaVrste() {
            return this.cakajocihDokumentov;
        }

        public int steviloDokumentov(Pedagog pedagog) {
            int stevilo;
            if(pedagog instanceof Profesor){
                stevilo = this.dokumentiProfesorjev.size();
            } else if(pedagog instanceof Docent){
                stevilo = this.dokumentiDocentov.size();
            } else {
                stevilo = this.dokumentiAsistentov.size();
            }
            return stevilo;
        }

        public String natisni() {
            String doc;
            if(!this.dokumentiProfesorjev.isEmpty()){
                doc = this.dokumentiProfesorjev.getFirst();
                doc = this.dokumentiProfesorjev.removeFirst();
            } else if(!this.dokumentiDocentov.isEmpty()){
                doc = this.dokumentiDocentov.getFirst();
                doc = this.dokumentiDocentov.removeFirst();
            } else if(!this.dokumentiAsistentov.isEmpty()){
                doc = this.dokumentiAsistentov.getFirst();
                doc = this.dokumentiAsistentov.removeFirst();
            } else return null;
            this.cakajocihDokumentov--;
            return doc;
        }

        // pomo"zne metode (po potrebi) ...
    }



    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
