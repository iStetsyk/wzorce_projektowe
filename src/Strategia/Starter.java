package Strategia;

import Strategia.Kaczki.KaczkaGracz;

public class Starter {
    public static void main(String[] args) {
        KaczkaGracz kg = new KaczkaGracz();
        kg.wykonajKwakanie();
        kg.wykonajLatanie();
        System.out.println("Placimy!");
        kg.zaplacZaKwakanie();
        kg.zaplacZaLatanie();
        System.out.println("Efect: ");
        kg.wykonajKwakanie();
        kg.wykonajLatanie();
    }
}
