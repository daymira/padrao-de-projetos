package strategy.calculadora;

public class MultOperation implements Operation{

    @Override
    public double execute(double num1, double num2) {
        return num1 * num2;
    }

}
