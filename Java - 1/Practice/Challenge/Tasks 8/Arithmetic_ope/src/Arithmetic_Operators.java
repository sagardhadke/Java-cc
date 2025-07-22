import java.util.Scanner;

public class Arithmetic_Operators {

    public static void main(String[] args) {

        System.out.println("Arithmetic Operators Challenge 7");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First No: ");
        int a = input.nextInt();
        System.out.print("Enter Second No: ");
        int b = input.nextInt();

        System.out.println("A + B = " + (a+b));
        System.out.println("A - B = " + (a-b));
        System.out.println("A * B = " + (a*b));
        System.out.println("A / B = " + (a/b));
        System.out.println("A % B = " + (a%b));

    }

}
