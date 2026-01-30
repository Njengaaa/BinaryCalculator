package calculator;

public class Multiplication extends AbstractBinaryCalculation {

    @Override
    public String calculate(String binary1, String binary2) {
        int a = binaryToDecimal(binary1);
        int b = binaryToDecimal(binary2);
        return decimalToBinary(Math.multiplyExact(a, b));
    }
}
