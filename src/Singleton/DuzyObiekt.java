package Singleton;

public class DuzyObiekt {
    // 1. statyczne pole prywatne, gdzie będzie leżeć instancja
    // tego samego typu co klasa
    private static DuzyObiekt instancja;    // nie może być NEW!

    // 2. prywatny konstruktor
    private DuzyObiekt(){}

    // 3. statyczna publiczna metoda służąca do tworzenia i zwracania instancji

    public static DuzyObiekt pobierzInstancje() {
        // 3.1 jeżeli niegdy nie istniała instancja obiektu
        if(instancja == null) {
            // 3.2 to ją tworzymy
            instancja = new DuzyObiekt();
        }
        return instancja;
    }

    public void policzModulo(int a, int b) {
        System.out.println(a%b);
    }
}
