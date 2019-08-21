package Obserwator;

import Obserwator.wyswietlacze.WarunkiBierzace;
import Obserwator.wyswietlacze.Wyswietlacz;

import java.util.ArrayList;
import java.util.List;

public class PogodaDane implements Podmiot{
    List<Obserwator> wyswietlacze = new ArrayList<>();

    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public PogodaDane() {

    }

    public float pobierzTemperature(float nowaTemperatura) {
        if(Math.abs(temperatura - nowaTemperatura) > 0.1f) {
            temperatura= nowaTemperatura;
            powiadomObserwatorow();
        }
        return temperatura;
    }

    public float pobierzWilgotnosc(float nowaWilgotnosc) {
        if(Math.abs(wilgotnosc - nowaWilgotnosc) > 1f) {
            wilgotnosc= nowaWilgotnosc;
            powiadomObserwatorow();
        }
        return wilgotnosc;
    }

    public float pobierzCisnienie(float noweCisnienie) {
        if(Math.abs(cisnienie - noweCisnienie) > 1f) {
            cisnienie= noweCisnienie;
            powiadomObserwatorow();
        }
        return cisnienie;
    }

    @Override
    public void dodajObserwatora(Obserwator obserwator) {
        wyswietlacze.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        wyswietlacze.remove(obserwator);
    }

    @Override
    public void powiadomObserwatorow() {
        for(Obserwator wyszwietlacz : wyswietlacze) {
            wyszwietlacz.aktualizuj(temperatura, wilgotnosc, cisnienie);
        }
    }
}