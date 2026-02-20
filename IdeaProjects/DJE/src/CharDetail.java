// https://www.w3schools.com/java/java_data_types.asp
import java.util.Scanner;

public class CharDetail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any single character: ");
        char myChar = input.next().charAt(0);

        boolean isLetter = Character.isLetter(myChar);
        boolean isDigit = Character.isDigit(myChar);

        System.out.println("Character: " + myChar);
        System.out.println("Unicode Value: " + (int) myChar);
        System.out.println("Is it a letter? " + isLetter);
        System.out.println("Is it a digit?" + isDigit);
    }
}
