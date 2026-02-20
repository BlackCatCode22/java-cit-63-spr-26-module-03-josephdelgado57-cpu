// https://www.w3schools.com/java/java_variables.asp
public class VarsAndMath {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int apples = 10;
        int oranges = 5;
        double pricePerFruit = 0.50;

        // Step 2: Simple arithmetic
        int totalFruit = apples +oranges;
        double totalCost = totalFruit * pricePerFruit;

        // Step 3: String concentration (joining text and variables)
        System.out.println("Total number of fruit: " + totalFruit);
        System.out.println("The total cost is: $" + totalCost);
    }
}
