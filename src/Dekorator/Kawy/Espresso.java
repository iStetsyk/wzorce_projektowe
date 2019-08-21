package Dekorator.Kawy;

import Dekorator.Napoj;

public class Espresso extends Napoj {
    public Espresso() {
        opis = "Kawa Espresso";
    }
    @Override
    public float koszt() {
        return 9.99f;
    }
}