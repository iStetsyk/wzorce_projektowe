package Dekorator.Kawy;

import Dekorator.Napoj;

public class MocnoPalona extends Napoj {
    public MocnoPalona() {
        opis = "Kawa Mocno Palona";
    }
    @Override
    public float koszt() {
        return 10;
    }
}
