// https://www.w3schools.com/java/java_operators.asp
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Results for " + num1 + " and " + num2 + ":");
        System.out.println("Addition (+): " + sum);
        System.out.println("Subtraction (-): " + difference);
        System.out.println("Multiplication (*): " + product);
        System.out.println("Division (/): " + quotient);
    }
}
