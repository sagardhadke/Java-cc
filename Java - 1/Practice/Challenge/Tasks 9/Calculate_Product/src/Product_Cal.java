import java.util.Scanner;

public class Product_Cal {
    public static void main(String[] args){
        //Create a program to calculate product of two floating points numbers

        System.out.println("Welcome to the Product Calculator of 2 No!");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter one value : ");
        float value1 = input.nextFloat();

        System.out.print("Enter second value : ");
        float value2 = input.nextFloat();

        float product = value1*value2;

        System.out.println("Product of " + value1 + " and " + value2 + " = " + product);
    }
}
