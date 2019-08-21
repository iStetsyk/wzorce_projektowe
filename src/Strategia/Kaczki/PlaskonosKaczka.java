package Strategia.Kaczki;

import Strategia.Kaczki.Kwakanie.Kwacz;
import Strategia.Kaczki.Latanie.LatamBoMamSkrzydla;

public class PlaskonosKaczka extends Kaczka {
    public PlaskonosKaczka() {
        super(new Kwacz(), new LatamBoMamSkrzydla());
    }

    @Override
    public void wyswietl() {
        System.out.println("Pojawia sie plaskonos.");
    }
}
