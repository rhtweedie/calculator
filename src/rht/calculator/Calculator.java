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
            if (containsOperator(displayText)) {
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
                if (!containsOperator(displayText)) {
                    if (operator != null) {
                        numberOne = operate(numberOne, displayText, operator);
                        displayText = String.valueOf(numberOne) + buttonPressed;
                    } else {
                        numberOne = Double.parseDouble(displayText);
                        displayText += buttonPressed;
                    }
                } else {
                    displayText = displayText.substring(0, displayText.length() - 1) + buttonPressed;
                }
                operator = buttonPressed;
                break;
            case 'C':
                displayText = "";
                numberOne = null;
                operator = null;
                break;
            case '=':
                numberOne = operate(numberOne, displayText, operator);
                displayText = String.valueOf(numberOne);
                operator = null;
                break;
        }
        return displayText;
    }

    private static boolean containsOperator(String displayText) {
        return (displayText.contains("+") || displayText.contains("-") || displayText.contains("*")
                || displayText.contains("/"));
    }

    private static Double operate(Double number, String text, char operation) {
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
}
