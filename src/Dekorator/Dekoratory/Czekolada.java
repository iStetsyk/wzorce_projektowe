package Dekorator.Dekoratory;

import Dekorator.Napoj;

public class Czekolada extends NapojDekorator {
    private Napoj napoj;

    public Czekolada(Napoj napoj){
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + ", z czekoladą";
    }

    @Override
    public float koszt() {
        return 3f + napoj.koszt();
    }
}
