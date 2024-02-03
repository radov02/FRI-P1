import java.util.*;
import java.io.*;

public class ObdelajIzpit {
    public static void main(String[] args){
        // preberemo argumente ukazne vrstice
        String datUdelezenci = args[0];
        int stNalog = args.length - 3;
        String[] datNaloge = new String[stNalog];
        for(int i = 0; i < stNalog; i++){
            datNaloge[i] = args[i+1];
        }

        String datPoPriimkih = args[stNalog + 1];
        String datPoTockah = args[stNalog + 2];
        
        // preberemo udelezence in njihove tocke v dva slovarja
        Map<String, Student> vpisna2student = preberiUdelezence(datUdelezenci);
        Map<String, List<Integer>> vpisna2tocke = preberiTocke(datNaloge);

        System.out.println(vpisna2student);
    }

    private static Map<String, Student> preberiUdelezence(String datUdelezenci){
        Map<String, Student> vpisna2student = new HashMap<>();

        try(Scanner sc = new Scanner(new File(datUdelezenci))){
            sc.nextLine();  // preskocimo prvo v vrstico
            while(sc.hasNext()){
                String vrstica = sc.nextLine();
                String[] komponente = vrstica.split(";");
                String vpisna = komponente[0];
                String ime = komponente[1];
                String priimek = komponente[2];
                vpisna2student.put(vpisna, new Student(vpisna, ime, priimek));
            }

        } catch(FileNotFoundException ex){
            System.err.printf("Datoteka %s ne obstaja.%n", datUdelezenci);
            System.exit(1);
        }

        return vpisna2student;
    }

    private static Map<String, Student> preberiTocke(String datUdelezenci){
        // ...
        return null;
    }
}

class Student{
    private String vpisna;  // lahko se zacne y 0
    private String ime;
    private String priimek;

    public Student(String vpisna, String ime, String priimek){
        this.vpisna = vpisna;
        this.ime = ime;
        this.priimek = priimek;
    }

    public String csv(){
        return String.format("%s;%s;%s", this.vpisna, this.ime, this.priimek);
    }

    @Override
    public String toString(){
        return String.format("%s;%s;%s", this.vpisna, this.ime, this.priimek);
    }

    public int primerjaj(Student drugi){
        if(this.priimek.equals(drugi.priimek)){
            return this.ime.compareTo(drugi.ime);
        }
        return this.priimek.compareTo(drugi.priimek);
    }
}

