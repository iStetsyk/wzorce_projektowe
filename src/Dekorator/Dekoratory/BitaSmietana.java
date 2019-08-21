package Dekorator.Dekoratory;

import Dekorator.Napoj;

public class BitaSmietana extends NapojDekorator {
    private Napoj napoj;

    public BitaSmietana(Napoj napoj){
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", z bitą śmietaną";
    }

    @Override
    public float koszt() {
        return 2f + napoj.koszt();
    }
}
