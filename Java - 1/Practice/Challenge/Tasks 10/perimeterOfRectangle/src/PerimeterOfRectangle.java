import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args){
        System.out.println("Perimeter of the rectangle!");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 No: ");
        double num1 = input.nextDouble();
        System.out.print("Enter 2 No: ");
        double num2 = input.nextDouble();
        System.out.print("Enter 3 No: ");
        double num3 = input.nextDouble();
        System.out.print("Enter 4 No: ");
        double num4 = input.nextDouble();

        double sum = num1+num2+num3+num4;
        System.out.println("The Perimeter of a Rectangle = " + sum + "cm");
    }
}
