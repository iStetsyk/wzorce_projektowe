package Strategia.Kaczki;

import Strategia.Kaczki.Kwakanie.Kwacz;
import Strategia.Kaczki.Latanie.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {
    public DzikaKaczka() {
        super(new Kwacz(), new LatamBoMamSkrzydla());
    }

    @Override
    public void wyswietl() {
        System.out.println("Pojawia sie dzika kaczka.");
    }
}
