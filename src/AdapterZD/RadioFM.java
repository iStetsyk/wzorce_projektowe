package AdapterZD;

import java.util.Arrays;
import java.util.Random;

public class RadioFM implements AnalogSignal {
    private double[] signal;

    public RadioFM() {
        signal = new Random().doubles(24, 0.0, 2.0).toArray();
    }

    @Override
    public double[] getAnalog() {
        return signal;
    }

    @Override
    public void setAnalog(double[] analogData) {
        this.signal = analogData;
    }

    @Override
    public void printAnalog() {
        System.out.println(Arrays.toString(signal));
    }
}
