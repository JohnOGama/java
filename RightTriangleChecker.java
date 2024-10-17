import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user to input three sides of the triangle
        System.out.println("Enter the three sides of the triangle:");
        
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();
        
        scanner.close();
        
        // Check if it's a right triangle
        if (isRightTriangle(side1, side2, side3)) {
            System.out.println("RIGHT");
        } else {
            System.out.println("NOT RIGHT");
        }
    }
    
    public static boolean isRightTriangle(double a, double b, double c) {
        // Sort the sides in ascending order
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        
        // Check if the Pythagorean theorem holds
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }
}