// https://www.w3schools.com/java/java_math.asp
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Prompt for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        //Step 2: Caculate the area (Area = PI * r * r)
        double area = Math.PI * radius * radius;

        //Step 3: Display the result
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}
