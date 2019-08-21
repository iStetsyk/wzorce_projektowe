package Strategia.Kaczki;

import Strategia.Kaczki.Kwakanie.Piszcz;
import Strategia.Kaczki.Latanie.NieLatam;

public class GumowaKaczka extends Kaczka {
    public GumowaKaczka() {
        super(new Piszcz(), new NieLatam());
    }

    @Override
    public void wyswietl() {
        System.out.println("Pojawia sie gumowa kaczka.");
    }
}
