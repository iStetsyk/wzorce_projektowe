package Fasada;

public class FasadaKinaDomowego {
    private Projektor projektor;
    private Ekran ekran;
    private Glosniki glosniki;

    public FasadaKinaDomowego() {
        this.projektor = new Projektor();
        this.ekran = new Ekran();
        this.glosniki = new Glosniki();
    }
    public void rozpocznijFilm() {
        ekran.wlaczEkran();
        ekran.zwiekszJasnosc();
        projektor.przelaczNaDvD();
        glosniki.zwiekszGlosnosc();
    }

    public void zakoncFilm() {
        ekran.uspij();
        projektor.DvDWylacz();
    }
}
