package rht.calculator;

public interface CalculatorInterface {

    /**
     * Finds the sum of two numbers.
     * 
     * @param numberOne The first number to add.
     * @param numberTwo The second number to add.
     * @return The sum of the two numbers.
     */
    public double add(double numberOne, double numberTwo);

    /**
     * Subtracts one number from another.
     * 
     * @param numberOne The number from which number two will be subtracted.
     * @param numberTwo The number to subtract from number one.
     * @return numberTwo subtracted from numberOne.
     */
    public double subtract(double numberOne, double numberTwo);

    /**
     * Finds the product of two numbers.
     * 
     * @param numebrOne The first number to be multiplied.
     * @param numberTwo The second number to be multiplied.
     * @return The product of the two numbers.
     */
    public double multiply(double numebrOne, double numberTwo);

    /**
     * Divides one number by another.
     * 
     * @param numberOne The number to be divided (numerator).
     * @param numberTwo The number to divide by (denominator).
     * @return numberOne divided by numberTwo.
     */
    public double divide(double numberOne, double numberTwo);
}