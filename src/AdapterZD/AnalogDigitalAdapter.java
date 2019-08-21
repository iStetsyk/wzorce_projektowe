package AdapterZD;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

public class AnalogDigitalAdapter implements DigitalSignal {
    private AnalogSignal analogSignal;

    public AnalogDigitalAdapter(AnalogSignal analogSignal) {
        this.analogSignal = analogSignal;
    }

    @Override
    public int[] getDigit() {
        double[] toConvert = analogSignal.getAnalog();

        int index = 0;
        int[] sum = new int[toConvert.length / 8];
        int counter = 0;

        for (int i = 0; i < toConvert.length; i++) {
            if(toConvert[i] > 1.0) {
                sum[index] += (int) Math.pow(2, counter);
            }
            counter++;
            if(counter % 8 == 0) {
                counter = 0;
                index++;
            }
        }
        return sum;
    }

    @Override
    public void setDigit(int[] digitData) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException();
    }

    @Override
    public void printDigit() {
        System.out.println(Arrays.toString(getDigit()));
    }
}
