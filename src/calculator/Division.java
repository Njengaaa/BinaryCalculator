package calculator;

public class Division extends AbstractBinaryCalculation {

    @Override
    public String calculate(String binary1, String binary2) {
        int a = binaryToDecimal(binary1);
        int b = binaryToDecimal(binary2);

        if (b == 0) {
            System.err.print("Division by zero");
        }

        return decimalToBinary(a / b);
    }
}
