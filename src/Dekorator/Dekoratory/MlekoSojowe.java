package Dekorator.Dekoratory;

import Dekorator.Napoj;

public class MlekoSojowe extends NapojDekorator {
    private Napoj napoj;

    public MlekoSojowe(Napoj napoj){
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", z mlekiem sojowym";
    }

    @Override
    public float koszt() {
        return 3f + napoj.koszt();
    }
}
