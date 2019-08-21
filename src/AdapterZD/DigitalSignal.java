package AdapterZD;

import java.security.InvalidAlgorithmParameterException;

public interface DigitalSignal {
    int[] getDigit();
    void setDigit(int[] digitData) throws InvalidAlgorithmParameterException;
    void printDigit();
}
