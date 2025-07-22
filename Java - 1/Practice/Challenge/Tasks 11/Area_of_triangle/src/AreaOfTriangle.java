import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome to the Area of Triangle Calculator!");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your base in cms: ");
        double base = input.nextDouble();
        System.out.print("Now, enter your perpendicular height in cms: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height; // our double area = (base * height) / 2;
        System.out.println("The Area of your triangle is: " + area + "cms2");

    }
}
