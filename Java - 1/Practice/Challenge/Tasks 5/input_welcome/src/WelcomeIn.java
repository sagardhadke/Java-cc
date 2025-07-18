import java.util.Scanner;

public class WelcomeIn {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Java Developer Community!");
        String firstName;
        System.out.print("Enter your First name: ");
        firstName = input.nextLine();

        String lastName;
        System.out.print("Enter your Last Name: ");
        lastName = input.nextLine();

        int age;
        System.out.print("Enter your age:");
        age = input.nextInt();

        System.out.println("Welcome Back " + firstName.toUpperCase() + " " + lastName.toUpperCase() + " Your age is " + age);



    }
}
