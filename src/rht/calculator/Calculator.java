package rht.calculator;

public class Calculator {

    String displayText = "";

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI calc = new GUI();
            }
        });
    }

    public String updateDisplay(char buttonPressed) {
        if (Character.isDigit(buttonPressed)) {
            displayText = displayText.concat(String.valueOf(buttonPressed));
        }
        if (buttonPressed == '.') {
            if (!displayText.contains(".")) {
                displayText += buttonPressed;
            }
        }
        if (buttonPressed == 'C') {
            displayText = "";
        }

        return displayText;
    }

    public double add(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public double subtract(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public double divide(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            return 0;
        }
        return numberOne / numberTwo;
    }

}
