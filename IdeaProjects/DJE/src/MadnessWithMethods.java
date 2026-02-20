// https://www.w3schools.com/java/java_methods.asp
import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int sum = addTwoNumbers(first, second);

        System.out.println("The sum calculated by our method is: " + sum);
    }

    public static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }
}
