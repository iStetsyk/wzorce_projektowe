package AdapterZD;

import java.util.Arrays;
import java.util.Random;

public class DigitalRadio implements DigitalSignal {
    private int[] signal;

    public DigitalRadio() {
        signal = new Random().ints(5, 0, 255).toArray();
    }

    @Override
    public int[] getDigit() {
        return signal;
    }

    @Override
    public void setDigit(int[] digitData) {
        signal = digitData;
    }

    @Override
    public void printDigit() {
        System.out.println(Arrays.toString(signal));
    }
}
