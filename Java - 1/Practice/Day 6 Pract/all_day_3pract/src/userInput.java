import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        System.out.println("Welcome to the online form registration!");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Your name is " + name);

    }
}
