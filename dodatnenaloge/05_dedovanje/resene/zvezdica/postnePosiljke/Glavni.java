import java.util.Scanner;

public class Glavni{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Posiljka.Z = sc.nextInt();
        Posiljka.R = sc.nextInt();
        Posiljka.D = sc.nextInt();
        Posiljka.P = sc.nextInt();
        Posiljka.T = sc.nextInt();
        int n = sc.nextInt();
        Posiljka[] posiljke = new Posiljka[n];
        for(int i = 0; i < n; i++){
            String vrsta = sc.next();
            String naslovnik = sc.next();
            String vsebina = sc.next();
            if(vrsta.equals("navadnoPismo")){
                int razdalja = Integer.parseInt(sc.next());
                posiljke[i] = new NavadnoPismo(naslovnik, vsebina, razdalja);
            }
            else if(vrsta.equals("priporocenoPismo")){
                int razdalja = Integer.parseInt(sc.next());
                String posiljatelj = sc.next();
                posiljke[i] = new PriporocenoPismo(naslovnik, vsebina, razdalja, posiljatelj);
            }
            else{
                posiljke[i] = new Telegram(naslovnik, vsebina);
            }
        }
        int ukaz = sc.nextInt();
        sc.close();

        izvedi(ukaz, posiljke);
    }

    private static void izvedi(int ukaz, Posiljka[] pos){
        switch(ukaz){
            case 1: {
                for(int i = 0; i < pos.length; i++){
                    if(pos[i] instanceof NavadnoPismo){
                        NavadnoPismo p = (NavadnoPismo) pos[i];
                        System.out.printf("%s | %s | %s | %d | %d%n", p.getTip(), p.getNaslovnik(), p.getVsebina(), p.getRazdalja(), p.getCena());
                    }
                    else if(pos[i] instanceof PriporocenoPismo){
                        PriporocenoPismo p = (PriporocenoPismo) pos[i];
                        System.out.printf("%s | %s | %s | %d | %s | %d%n", p.getTip(), p.getNaslovnik(), p.getVsebina(), p.getRazdalja(), p.getPosiljatelj(), p.getCena());
                    }
                    else if(pos[i] instanceof Telegram){
                        Telegram p = (Telegram) pos[i];
                        System.out.printf("%s | %s | %s | %d%n", p.getTip(), p.getNaslovnik(), p.getVsebina(), p.getCena());
                    }
                }
            }; break;
            case 2: {
                int najdr = 0;
                for(int i = 1; i < pos.length; i++){
                    if(pos[i].getCena() > pos[najdr].getCena()){
                        najdr = i;
                    }
                }
                if(pos[najdr] instanceof NavadnoPismo){
                    NavadnoPismo p = (NavadnoPismo) pos[najdr];
                    System.out.printf("%s | %s | %s | %d | %d%n", p.getTip(), p.getNaslovnik(), p.getVsebina(), p.getRazdalja(), p.getCena());
                }
                else if(pos[najdr] instanceof PriporocenoPismo){
                    PriporocenoPismo p = (PriporocenoPismo) pos[najdr];
                    System.out.printf("%s | %s | %s | %d | %s | %d%n", p.getTip(), p.getNaslovnik(), p.getVsebina(), p.getRazdalja(), p.getPosiljatelj(), p.getCena());
                }
                else if(pos[najdr] instanceof Telegram){
                    Telegram p = (Telegram) pos[najdr];
                    System.out.printf("%s | %s | %s | %d%n", p.getTip(), p.getNaslovnik(), p.getVsebina(), p.getCena());
                }
            }; break;
            case 3: {
                for(int i = 0; i < pos.length; i++){
                    if(pos[i] instanceof PriporocenoPismo){
                        PriporocenoPismo p = (PriporocenoPismo) pos[i];
                        System.out.printf("%s | %s | povratnica | %d | %s | %d%n", p.getTip(), p.getPosiljatelj(), p.getRazdalja(), p.getNaslovnik(), p.getCena());
                    }
                }
            }; break;
        }
    }
}