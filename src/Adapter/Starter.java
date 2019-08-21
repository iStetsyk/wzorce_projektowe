package Adapter;

import Adapter.Indykowate.*;
import Adapter.Kaczkowate.*;

public class Starter {
    public static void main(String[] args) {
        DzikaKaczka dk = new DzikaKaczka();

        DzikiIndyk di = new DzikiIndyk();
        IndykAdapter adapter = new IndykAdapter(di);

        System.out.println("Prawdziwa Kaczka");
        dk.kwacz();
        dk.lataj();

        System.out.println("Prawdziwy Indyk");
        di.gulgocz();
        di.lataj();

        System.out.println("Testowanie Kaczki");
        System.out.println("Kaczka");
        testujKaczke(dk);

        System.out.println("Adapter Indyka");
        testujKaczke(adapter);
    }

    public static void testujKaczke(Kaczka kaczka) {
        kaczka.kwacz();
        kaczka.lataj();
    }
}
