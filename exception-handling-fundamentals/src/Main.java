import calculator.NumberCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number : ");
            double firstOperand = input.nextDouble();

            System.out.print("Enter operator (+, -, *, /) : ");
            String operatorInput = input.next().trim();
            if (operatorInput.length() != 1) {
                throw new IllegalArgumentException("Invalid operator. Use +, -, * or /.");
            }
            char operator = operatorInput.charAt(0);

            System.out.print("Enter second number : ");
            double secondOperand = input.nextDouble();

            NumberCalculator calci = new NumberCalculator();

            calci.calculate(firstOperand, operator, secondOperand);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Enter numeric values");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            input.close();
        }

    }
}
