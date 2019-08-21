package Dekorator;

public abstract class Napoj {
    protected String opis = "Nieznany napoj";

    public String pobierzOpis() {
        return opis;
    }

    public abstract float koszt();
}
