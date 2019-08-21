package Singleton;

public class Starter {
    public static void main(String[] args) {
        DuzyObiekt dz = DuzyObiekt.pobierzInstancje();
        dz.policzModulo(4, 2);
        DuzyObiekt dz2 = DuzyObiekt.pobierzInstancje();
        // synchronized , volatile = ustawienie w kolejke obiektow
    }
}
