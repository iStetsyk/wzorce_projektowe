package Dekorator.Kawy;

import Dekorator.Napoj;

public class Bezkofeinowa extends Napoj {
    public Bezkofeinowa() {
        opis = "Kawa bezkofeinowa";
    }

    @Override
    public float koszt() {
        return 25f;
    }
}
