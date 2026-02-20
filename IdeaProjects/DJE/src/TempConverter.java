// https://www.w3schools.com/java/java_operators.asp
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Get Fahrenheit input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Step 2: Calculate Celsius
        // Parentheses ensure we subtract 32 BEFORE multiplying
        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

        //Step 3: Output the result
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}
