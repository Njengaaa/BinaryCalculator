package calculator;

public abstract class AbstractBinaryCalculation implements BinaryCalculations {

    protected int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    protected String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
