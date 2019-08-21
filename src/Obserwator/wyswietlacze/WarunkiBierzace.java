package Obserwator.wyswietlacze;

import Obserwator.Obserwator;

import java.time.LocalDateTime;
import java.util.Objects;

public class WarunkiBierzace implements Wyswietlacz, Obserwator {
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WarunkiBierzace)) return false;
        WarunkiBierzace that = (WarunkiBierzace) o;
        return Float.compare(that.temperatura, temperatura) == 0 &&
                Float.compare(that.wilgotnosc, wilgotnosc) == 0 &&
                Float.compare(that.cisnienie, cisnienie) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatura, wilgotnosc, cisnienie);
    }

    @Override
    public void aktualizuj(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Data: " + LocalDateTime.now() +
                " temp: " + temperatura + " wilg: " + wilgotnosc +
                " cisn: " + cisnienie);
    }
}
