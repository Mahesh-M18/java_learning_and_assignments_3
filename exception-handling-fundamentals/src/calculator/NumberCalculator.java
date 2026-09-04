package calculator;

public class NumberCalculator {

    public void calculate(double firstOperand, char operator, double secondOperand) {

        try {
            double result;
            switch (operator) {
                case '+':
                    result = firstOperand + secondOperand;
                    break;

                case '-':
                    result = firstOperand - secondOperand;
                    break;

                case '*':
                    result = firstOperand * secondOperand;
                    break;

                case '/':
                    result = firstOperand / secondOperand;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operator. Use +, -, * or /.");
            }

            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Calculator Execution Completed");
        }
    }
}
