package rht.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        CalculatorInterface calculator = new Calculator();

        double resultOne = calculator.add(0, 0);
        assertEquals(0, resultOne, 0.0000001);

        double resultTwo = calculator.add(10, 2);
        assertEquals(12, resultTwo, 0.0000001);

        double resultThree = calculator.add(1.3333, 2.2222);
        assertEquals(3.5555, resultThree, 0.0000001);
    }

    @Test
    public void subtractTest() {
        CalculatorInterface calculator = new Calculator();

        double resultOne = calculator.subtract(0, 0);
        assertEquals(0, resultOne, 0.0000001);

        double resultTwo = calculator.subtract(564, 123);
        assertEquals(441, resultTwo, 0.0000001);

        double resultThree = calculator.subtract(3, 55);
        assertEquals(-52, resultThree, 0.0000001);
    }

    @Test
    public void multiplyTest() {
        CalculatorInterface calculator = new Calculator();

        double resultOne = calculator.multiply(0, 0);
        assertEquals(0, resultOne, 0.0000001);

        double resultTwo = calculator.multiply(5, 4);
        assertEquals(20, resultTwo, 0.0000001);

        double resultThree = calculator.multiply(-55, -10);
        assertEquals(550, resultThree, 0.0000001);
    }

    @Test
    public void divideTest() {
        CalculatorInterface calculator = new Calculator();

        double resultOne = calculator.divide(0, 0);
        assertEquals(0, resultOne, 0.0000001);

        double resultTwo = calculator.divide(0, 3);
        assertEquals(0, resultTwo, 0.0000001);

        double resultThree = calculator.divide(1, 3);
        assertEquals(0.3333333333333333, resultThree, 0.0000001);

    }

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
}
