import java.util.Scanner;

public class addToNum {
    public static void main(String[] args) {
        System.out.println("Welcome to the basic addition calculator!");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First No: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second No: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Addition is " + sum);


    }
}
