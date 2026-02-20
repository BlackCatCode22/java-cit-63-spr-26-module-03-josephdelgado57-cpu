// https://www.w3schools.com/java/java_user_input.asp
import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        //Step 1: Create the Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user for their name
        System.out.print("What is your name? ");

        //Step 3: Read the input and store it in a variable
        String name = scanner.nextLine();

        // Step 4: Print the personalized greeting
        System.out.println("Hello, " + name + "! Welcome to CIT-63.");
    }
}
