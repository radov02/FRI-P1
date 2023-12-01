public class Student {
    private String ip;
    private String vpisna;
    private int stroskiBivanja;

    public Student(String ip, String vpisna, int stroskiBivanja){
        this.ip = ip;
        this.vpisna = vpisna;
        this.stroskiBivanja = stroskiBivanja;
    }

    public String vrniIP(){
        return this.ip;
    }

    public int stroski(){
        return this.stroskiBivanja;
    }

    public static void main(String[] args){

        Student ana = new Student("Ana Arko", "63230001", 500);
        IzredniStudent bojan = new IzredniStudent("Bojan Ban", "63230002", 600, 300);
    
        System.out.println(ana.vrniIP());
        System.out.println(bojan.vrniIP());

    }
}

class IzredniStudent extends Student {
    private int solnina;

    public IzredniStudent(String ip, String vpisna, int stroskiBivanja, int solnina){
        // prvi stavek konstruktorja je vedno: this.(...) ali super.(...), 
        // sicer se samodejno doda super();
        super(ip, vpisna, stroskiBivanja);
        this.solnina = solnina;
    }

    @Override   // za redefiniranje metode (prevajalnik preveri da bo enako ime metode)
    public int stroski(){
        return super.stroski() + this.solnina;
        //return this.stroski() + this.solnina; KDAJ TO DELUJE?
    }
}