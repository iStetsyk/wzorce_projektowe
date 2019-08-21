package Dekorator;

import Dekorator.Dekoratory.*;
import Dekorator.Kawy.Bezkofeinowa;

public class Starter {
    public static void main(String[] args) {
        Bezkofeinowa kawa = new Bezkofeinowa();
        BitaSmietana bezkofeinowaZBita = new BitaSmietana(kawa);
        Czekolada bezkofeinowaZCzekoladaIBita = new Czekolada(bezkofeinowaZBita);
        System.out.println(bezkofeinowaZBita);
        System.out.println(bezkofeinowaZBita.koszt());
    }
}
