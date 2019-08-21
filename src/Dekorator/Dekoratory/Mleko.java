package Dekorator.Dekoratory;

import Dekorator.Napoj;

public class Mleko extends NapojDekorator {
    private Napoj napoj;

    public Mleko(Napoj napoj){
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", z mlekiem";
    }

    @Override
    public float koszt() {
        return 2f + napoj.koszt();
    }
}
