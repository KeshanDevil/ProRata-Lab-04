/////IT21047756\\\\\\
public class Lab2Q2 {
    public static void main(String[] args) {

        // Length of one side of the square
        double side = 10;

        // Perimeter of square = 4 * side
        double perimeter = 4 * side;

        // PI = 3.14
        double PI = 3.14;

        // Circumference of circle = 2 * PI * radius
        // radius = circumference / (2 * PI)
        double radius = perimeter / (2 * PI);

        // Display the radius
        System.out.println("Radius of the circular fence = " + radius);
    }
}