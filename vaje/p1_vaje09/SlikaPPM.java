import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SlikaPPM extends BesedilnaDatoteka {
    
    public SlikaPPM(String ime){
        super(ime);
    }

    public void preberi(String potDoDatoteke) throws FileNotFoundException{
        // preberemo datoteko formata PPM
        File f = new File(potDoDatoteke);
        Scanner sc = new Scanner(f);



        sc.close();
    }

    public String (){

    }
}
