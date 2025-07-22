import java.util.Scanner;

public class SwappingNum {

    public static void main(String[] args){

        System.out.println("Welcome to Swapping Number System!");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First No: ");
        int a = input.nextInt();

        System.out.print("Enter Second No ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Swapping Done...");

        System.out.println("Number A is " + a);
        System.out.println("Number B is " + b);
    }

}
