
public class Test37 {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lev lev = new Lev();
        Medved medved = new Medved();
        Zelva zelva = new Zelva();
        Kaca kaca = new Kaca();
        Plazilec plazilec = new Plazilec();
        Macka macka = new Macka();
        Sesalec sesalec = new Sesalec();
        Zival zival = new Zival();

        macka.seHrani();
        kaca.seHrani();
        macka.seHrani();
        sesalec.seHrani();
        lev.seHrani();
        sesalec.seHrani();
        medved.seHrani();
        tiger.seHrani();
        macka.seHrani();
        plazilec.seHrani();
        tiger.seHrani();
        sesalec.seHrani();
        kaca.seHrani();
        plazilec.seHrani();
        kaca.seHrani();
        medved.seHrani();
        sesalec.seHrani();
        lev.seHrani();
        tiger.seHrani();
        plazilec.seHrani();
        sesalec.seHrani();
        sesalec.seHrani();
        kaca.seHrani();
        tiger.seHrani();
        kaca.seHrani();
        kaca.seHrani();
        zival.seHrani();
        zelva.seHrani();
        zival.seHrani();
        tiger.seHrani();
        zelva.seHrani();
        zelva.seHrani();
        medved.seHrani();
        zival.seHrani();
        medved.seHrani();
        zival.seHrani();
        sesalec.seHrani();
        lev.seHrani();
        zival.seHrani();

        System.out.println(tiger.steviloHranjenj());
        System.out.println(lev.steviloHranjenj());
        System.out.println(medved.steviloHranjenj());
        System.out.println(zelva.steviloHranjenj());
        System.out.println(kaca.steviloHranjenj());
        System.out.println(plazilec.steviloHranjenj());
        System.out.println(macka.steviloHranjenj());
        System.out.println(sesalec.steviloHranjenj());
        System.out.println(zival.steviloHranjenj());

        System.out.println("---");

        lev.preganja(tiger);
        medved.preganja(tiger);
        plazilec.preganja(tiger);
        zelva.preganja(plazilec);
        lev.preganja(tiger);
        sesalec.preganja(zelva);
        macka.preganja(medved);
        medved.preganja(sesalec);
        zelva.preganja(kaca);
        zelva.preganja(medved);
        tiger.preganja(tiger);
        lev.preganja(tiger);
        medved.preganja(sesalec);
        kaca.preganja(medved);
        lev.preganja(tiger);
        tiger.preganja(sesalec);
        zelva.preganja(zival);
        sesalec.preganja(kaca);
        tiger.preganja(zival);
        medved.preganja(zelva);
        lev.preganja(lev);
        tiger.preganja(lev);
        plazilec.preganja(zelva);
        kaca.preganja(medved);
        zival.preganja(macka);
        sesalec.preganja(plazilec);
        macka.preganja(tiger);
        medved.preganja(kaca);
        zelva.preganja(macka);
        sesalec.preganja(sesalec);
        kaca.preganja(plazilec);
        macka.preganja(sesalec);

        System.out.println(tiger.steviloPreganjanj(tiger));
        System.out.println(tiger.steviloPreganjanj(lev));
        System.out.println(tiger.steviloPreganjanj(medved));
        System.out.println(tiger.steviloPreganjanj(zelva));
        System.out.println(tiger.steviloPreganjanj(kaca));
        System.out.println(tiger.steviloPreganjanj(plazilec));
        System.out.println(tiger.steviloPreganjanj(macka));
        System.out.println(tiger.steviloPreganjanj(sesalec));
        System.out.println(tiger.steviloPreganjanj(zival));
        System.out.println(lev.steviloPreganjanj(tiger));
        System.out.println(lev.steviloPreganjanj(lev));
        System.out.println(lev.steviloPreganjanj(medved));
        System.out.println(lev.steviloPreganjanj(zelva));
        System.out.println(lev.steviloPreganjanj(kaca));
        System.out.println(lev.steviloPreganjanj(plazilec));
        System.out.println(lev.steviloPreganjanj(macka));
        System.out.println(lev.steviloPreganjanj(sesalec));
        System.out.println(lev.steviloPreganjanj(zival));
        System.out.println(medved.steviloPreganjanj(tiger));
        System.out.println(medved.steviloPreganjanj(lev));
        System.out.println(medved.steviloPreganjanj(medved));
        System.out.println(medved.steviloPreganjanj(zelva));
        System.out.println(medved.steviloPreganjanj(kaca));
        System.out.println(medved.steviloPreganjanj(plazilec));
        System.out.println(medved.steviloPreganjanj(macka));
        System.out.println(medved.steviloPreganjanj(sesalec));
        System.out.println(medved.steviloPreganjanj(zival));
        System.out.println(zelva.steviloPreganjanj(tiger));
        System.out.println(zelva.steviloPreganjanj(lev));
        System.out.println(zelva.steviloPreganjanj(medved));
        System.out.println(zelva.steviloPreganjanj(zelva));
        System.out.println(zelva.steviloPreganjanj(kaca));
        System.out.println(zelva.steviloPreganjanj(plazilec));
        System.out.println(zelva.steviloPreganjanj(macka));
        System.out.println(zelva.steviloPreganjanj(sesalec));
        System.out.println(zelva.steviloPreganjanj(zival));
        System.out.println(kaca.steviloPreganjanj(tiger));
        System.out.println(kaca.steviloPreganjanj(lev));
        System.out.println(kaca.steviloPreganjanj(medved));
        System.out.println(kaca.steviloPreganjanj(zelva));
        System.out.println(kaca.steviloPreganjanj(kaca));
        System.out.println(kaca.steviloPreganjanj(plazilec));
        System.out.println(kaca.steviloPreganjanj(macka));
        System.out.println(kaca.steviloPreganjanj(sesalec));
        System.out.println(kaca.steviloPreganjanj(zival));
        System.out.println(plazilec.steviloPreganjanj(tiger));
        System.out.println(plazilec.steviloPreganjanj(lev));
        System.out.println(plazilec.steviloPreganjanj(medved));
        System.out.println(plazilec.steviloPreganjanj(zelva));
        System.out.println(plazilec.steviloPreganjanj(kaca));
        System.out.println(plazilec.steviloPreganjanj(plazilec));
        System.out.println(plazilec.steviloPreganjanj(macka));
        System.out.println(plazilec.steviloPreganjanj(sesalec));
        System.out.println(plazilec.steviloPreganjanj(zival));
        System.out.println(macka.steviloPreganjanj(tiger));
        System.out.println(macka.steviloPreganjanj(lev));
        System.out.println(macka.steviloPreganjanj(medved));
        System.out.println(macka.steviloPreganjanj(zelva));
        System.out.println(macka.steviloPreganjanj(kaca));
        System.out.println(macka.steviloPreganjanj(plazilec));
        System.out.println(macka.steviloPreganjanj(macka));
        System.out.println(macka.steviloPreganjanj(sesalec));
        System.out.println(macka.steviloPreganjanj(zival));
        System.out.println(sesalec.steviloPreganjanj(tiger));
        System.out.println(sesalec.steviloPreganjanj(lev));
        System.out.println(sesalec.steviloPreganjanj(medved));
        System.out.println(sesalec.steviloPreganjanj(zelva));
        System.out.println(sesalec.steviloPreganjanj(kaca));
        System.out.println(sesalec.steviloPreganjanj(plazilec));
        System.out.println(sesalec.steviloPreganjanj(macka));
        System.out.println(sesalec.steviloPreganjanj(sesalec));
        System.out.println(sesalec.steviloPreganjanj(zival));
        System.out.println(zival.steviloPreganjanj(tiger));
        System.out.println(zival.steviloPreganjanj(lev));
        System.out.println(zival.steviloPreganjanj(medved));
        System.out.println(zival.steviloPreganjanj(zelva));
        System.out.println(zival.steviloPreganjanj(kaca));
        System.out.println(zival.steviloPreganjanj(plazilec));
        System.out.println(zival.steviloPreganjanj(macka));
        System.out.println(zival.steviloPreganjanj(sesalec));
        System.out.println(zival.steviloPreganjanj(zival));
    }
}