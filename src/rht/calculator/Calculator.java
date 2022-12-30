package rht.calculator;

public class Calculator implements CalculatorInterface {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI calc = new GUI();
                calc.createAndShowGUI();
            }
        });
    }

    @Override
    public double add(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    @Override
    public double subtract(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    @Override
    public double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    @Override
    public double divide(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            return 0;
        }
        return numberOne / numberTwo;
    }

}
