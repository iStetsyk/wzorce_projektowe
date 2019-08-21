package Dekorator.Kawy;

import Dekorator.Napoj;

public class StarCafeSpecial extends Napoj {
    public StarCafeSpecial() {
        opis = "Kawa Star Cafe Special";
    }
    @Override
    public float koszt() {
        return 15f;
    }
}
