package Obserwator;

import Obserwator.wyswietlacze.WarunkiBierzace;

public class Starter {
    public static void main(String[] args) {
        PogodaDane pogodaDane = new PogodaDane();
        WarunkiBierzace warunkiBierzace = new WarunkiBierzace();
        pogodaDane.dodajObserwatora(warunkiBierzace);
        pogodaDane.pobierzTemperature(14.3f);
        pogodaDane.pobierzCisnienie(1000f);
        pogodaDane.pobierzWilgotnosc(34f);

        pogodaDane.pobierzTemperature(15.5f);
        pogodaDane.pobierzCisnienie(12.5f);
        pogodaDane.pobierzWilgotnosc(11.5f);

        pogodaDane.usunObserwatora(warunkiBierzace);
    }
}
