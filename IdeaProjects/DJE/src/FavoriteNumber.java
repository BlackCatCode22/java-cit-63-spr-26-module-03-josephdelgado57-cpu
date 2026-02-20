//https://www.w3school.com/java/java_user_input.asp
import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        // Step 1: Initialize the Scanner
        Scanner input = new Scanner(System.in);

        // Step 2: Prompt the user for a number
        System.out.print("Enter your favorite whole number: ");

        // Step 3: Use nextInt() to capture the whole number
        int favnumber = input.nextInt();

        // Step 4: Print it back with a message
        System.out.println("Wow, " + favnumber + "  is a great number!");

        // Extra Step: show you can do math with it
        System.out.println("If you double it, you get " + (favnumber * 2) + "!");
    }
}
