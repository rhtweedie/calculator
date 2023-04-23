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
            if (displayText.contains("+") || displayText.contains("-") || displayText.contains("*")
                    || displayText.contains("/")) {
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
            case '-':
            case '/':
            case '*':
                if (!displayText.contains("+") && !displayText.contains("-") && !displayText.contains("*")
                        && !displayText.contains("/")) {
                    if (operator != null) {
                        numberOne = operate(numberOne, displayText, operator);
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
                numberOne = null;
                operator = null;
                break;
            case '=':
                numberOne = operate(numberOne, displayText, operator);
                displayText = String.valueOf(numberOne);
                break;
        }
        return displayText;
    }

    private Double operate(Double number, String text, char operation) {
        double numberTwo = Double.parseDouble(text);
        switch (operation) {
            case '+':
                return number + numberTwo;
            case '-':
                return number - numberTwo;
            case '*':
                return number * numberTwo;
            case '/':
                if (numberTwo == 0) {
                    return 0.0;
                }
                return number / numberTwo;
        }
        return null;
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
