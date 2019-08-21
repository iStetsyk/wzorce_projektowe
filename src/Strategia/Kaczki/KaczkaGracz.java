package Strategia.Kaczki;

import Strategia.Kaczki.Kwakanie.Kwacz;
import Strategia.Kaczki.Kwakanie.Piszcz;
import Strategia.Kaczki.Latanie.LatamBoMamSkrzydla;
import Strategia.Kaczki.Latanie.NieLatam;

public class KaczkaGracz extends Kaczka {
    public KaczkaGracz() {
        super(new Piszcz(), new NieLatam());
    }

    @Override
    public void wyswietl() {
        System.out.println("Pojawia sie kaczka gracz");
    }

    public void zaplacZaLatanie() {
        System.out.println("Jestes biedniejszy o 10 zl, ale Twoja kaczka umie latac!");
        setLatanie(new LatamBoMamSkrzydla());
    }

    public void zaplacZaKwakanie() {
        System.out.println("Jestes biedniejszy o 5 zl, ale Twoja kaczka umie kwakac!");
        setKwakanie(new Kwacz());
    }
}