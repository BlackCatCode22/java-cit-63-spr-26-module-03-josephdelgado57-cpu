// https://www.w3schools.com/java/java_for_loop.asp
import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word in reverse: ");
        String original = input.nextLine();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
