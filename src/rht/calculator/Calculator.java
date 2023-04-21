package rht.calculator;

public class Calculator {

    String displayText = "";
    Double numberOne;
    Character operator = null;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI calc = new GUI();
            }
        });
    }

    public String updateDisplay(char buttonPressed) {
        if (Character.isDigit(buttonPressed)) {
            if (displayText.contains("+")) {
                displayText = "";
            }
            displayText += buttonPressed;
        }

        switch (buttonPressed) {
            case '.':
                if (!displayText.contains(".")) {
                    displayText += buttonPressed;
                }
                break;
            case '+':
                if (!displayText.contains("+") || !displayText.contains("-") || !displayText.contains("*")
                        || !displayText.contains("/")) {
                    if (operator != null) {
                        numberOne += Double.parseDouble(displayText);
                        displayText = String.valueOf(numberOne) + buttonPressed;
                    } else {
                        numberOne = Double.parseDouble(displayText);
                        displayText += buttonPressed;
                    }
                    operator = buttonPressed;
                }
                break;
            case 'C':
                displayText = "";
                break;
            case '=':
                displayText = String.valueOf(numberOne + Double.parseDouble(displayText));
                break;
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
