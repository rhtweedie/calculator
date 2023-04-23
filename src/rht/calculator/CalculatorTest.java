package rht.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void inputThreeDigitsTest() {
        Calculator calc = new Calculator();

        assertEquals("3", calc.updateDisplay('3'));
        assertEquals("32", calc.updateDisplay('2'));
        assertEquals("329", calc.updateDisplay('9'));

    }

    @Test
    public void clearTest() {
        Calculator calc = new Calculator();

        assertEquals("3", calc.updateDisplay('3'));

        assertEquals("", calc.updateDisplay('C'));
    }

    @Test
    public void updateDisplayAddTest() {
        Calculator calc = new Calculator();

        assertEquals("3", calc.updateDisplay('3'));

        assertEquals("3+", calc.updateDisplay('+'));

        assertEquals("7", calc.updateDisplay('7'));

        assertEquals("10.0", calc.updateDisplay('='));
    }

    @Test
    public void multipleOperationsTest() {
        Calculator calc = new Calculator();

        assertEquals("4", calc.updateDisplay('4'));
        assertEquals("4+", calc.updateDisplay('+'));
        assertEquals("5", calc.updateDisplay('5'));
        assertEquals("9.0*", calc.updateDisplay('*'));
        assertEquals("2", calc.updateDisplay('2'));
        assertEquals("18.0", calc.updateDisplay('='));
    }

    @Test
    public void multipleAdditionsTest() {
        Calculator calc = new Calculator();

        assertEquals("4", calc.updateDisplay('4'));
        assertEquals("4+", calc.updateDisplay('+'));
        assertEquals("5", calc.updateDisplay('5'));
        assertEquals("9.0+", calc.updateDisplay('+'));
        assertEquals("2", calc.updateDisplay('2'));
        assertEquals("11.0", calc.updateDisplay('='));
    }

    @Test
    public void adjacentOperatorsTest() {
        Calculator calc = new Calculator();

        assertEquals("9", calc.updateDisplay('9'));
        assertEquals("9+", calc.updateDisplay('+'));
        assertEquals("9+", calc.updateDisplay('+'));
        assertEquals("9*", calc.updateDisplay('*'));
        assertEquals("2", calc.updateDisplay('2'));
        assertEquals("18.0", calc.updateDisplay('='));
    }

    @Test
    public void multipleDecimalPointsTest() {
        Calculator calc = new Calculator();

        assertEquals("1", calc.updateDisplay('1'));
        assertEquals("1.", calc.updateDisplay('.'));
        assertEquals("1.", calc.updateDisplay('.'));
        assertEquals("1.2", calc.updateDisplay('2'));
        assertEquals("1.2", calc.updateDisplay('.'));
    }

    @Test
    public void addClearAddTest() {
        Calculator calc = new Calculator();

        assertEquals("1", calc.updateDisplay('1'));
        assertEquals("1+", calc.updateDisplay('+'));
        assertEquals("1", calc.updateDisplay('1'));
        assertEquals("2.0", calc.updateDisplay('='));
        assertEquals("", calc.updateDisplay('C'));
        assertEquals("3", calc.updateDisplay('3'));
        assertEquals("3+", calc.updateDisplay('+'));
        assertEquals("4", calc.updateDisplay('4'));
        assertEquals("7.0", calc.updateDisplay('='));
    }

    @Test
    public void weirdBugTest() {
        Calculator calc = new Calculator();

        assertEquals("1", calc.updateDisplay('1'));
        assertEquals("12", calc.updateDisplay('2'));
        assertEquals("12/", calc.updateDisplay('/'));
        assertEquals("3", calc.updateDisplay('3'));
        assertEquals("4.0", calc.updateDisplay('='));
        assertEquals("4", calc.updateDisplay('4'));
        assertEquals("4*", calc.updateDisplay('*'));
        assertEquals("3", calc.updateDisplay('3'));
        assertEquals("12.0", calc.updateDisplay('='));
    }
}
