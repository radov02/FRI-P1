public class Prva {
    public static void main(String[] args){
        
        boolean a = false;
        boolean b = false;
        if (a = b) {
            System.out.println("enako");
        } else {
            System.out.println("različno");
        }

        b = !b;
        if (a = b) {
            System.out.println("enako");
        } else {
            System.out.println("različno");
        }

        a = !a;
        b = !b;
        if (a = b) {
            System.out.println("enako");
        } else {
            System.out.println("različno");
        }

        b = !b;
        if (a = b) {
            System.out.println("enako");
        } else {
            System.out.println("različno");
        }

        int c = 0;
        int d = 0;
        if(c = d){
            System.out.println("enako");
        } else {
            System.out.println("različno");
        }
    }
}
