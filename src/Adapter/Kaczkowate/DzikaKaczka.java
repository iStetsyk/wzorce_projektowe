package Adapter.Kaczkowate;

public class DzikaKaczka implements Kaczka {
    @Override
    public void kwacz() {
        System.out.println("KWA! KWA! KWA!");
    }

    @Override
    public void lataj() {
        System.out.println("FRU! FRU! FRU!");
    }
}
