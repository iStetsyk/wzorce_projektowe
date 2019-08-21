package Strategia.Kaczki;

import Strategia.Kaczki.Kwakanie.KwakanieInterfejs;
import Strategia.Kaczki.Latanie.LatanieInterfejs;

public abstract class Kaczka {
    private KwakanieInterfejs kwakanie;
    private LatanieInterfejs latanie;

    Kaczka(KwakanieInterfejs kwakanie, LatanieInterfejs latanie) {
        this.kwakanie = kwakanie;
        this.latanie = latanie;
    }

    public void plywaj() {
        System.out.println("PLUM PLUM PLUM!");
    }

    public void wykonajLatanie() {
        latanie.lec();
    }

    public void wykonajKwakanie() {
        kwakanie.kwacz();
    }

    protected void setKwakanie(KwakanieInterfejs noweKwakanie) {
        kwakanie = noweKwakanie;
    }
    protected void setLatanie(LatanieInterfejs noweLatanie) {
        latanie= noweLatanie;
    }

    public abstract void wyswietl();

}
