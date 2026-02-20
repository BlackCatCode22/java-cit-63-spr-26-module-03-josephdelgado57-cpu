// https://www.w3schools.com/java/java_operators.asp
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount (e.g. 1000): ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal, e.g. 0.05 for 5%): ");
        double rate = input.nextDouble();

        System.out.print(" Enter the time in years: ");
        double time = input.nextDouble();

        double interest = principal * rate * time;

        System.out.println("The total interest earn is: $" + interest);
        System.out.println("The total value after " + time + " years is: $" + (principal + interest));
    }
}
