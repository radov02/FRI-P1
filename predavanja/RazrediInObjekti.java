

public class RazrediInObjekti {
    public static void main(String[] args){

        Ulomek u = new Ulomek(2, 3);
        u.stevec = 1;

        System.out.println(u);


        Ulomek v = new Ulomek(12, 15);
        v.pokrajsaj();
        System.out.println(v);
    }
}


class Ulomek {
    /*private */ int stevec;
    /*private */ int imenovalec;

    public Ulomek(int st, int im){
        this.stevec = st;
        this.imenovalec = im;
    }

    // public void pokrajsaj(){
    //     int D = skupniDelitelj(this.stevec, this.imenovalec);
    //     this.stevec /= D;
    //     this.imenovalec /= D;
    // }
    
    // private static int skupniDelitelj(int x, int y){
    //     int a = (int)Math.max(x, y);
    //     int b = (int)Math.min(x, y);

    //     while(b > 0){
    //         int t = a;
    //         a = a / b;
    //         b = t % b;
    //     }
    //     System.out.println(a + " " + b);

    //     return a;
    // }

    public String toString(){
        return (this.stevec + " / " + this.imenovalec);
    }
}

class KompleksnoStevilo {
    double re;
    double im;
}

class Tocka3D {

}

class Datum {

}

class PostniNaslov {

}

class Predmet {

}

class Student {

}