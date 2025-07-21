import java.lang.*;
import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args){
        System.out.println("Welcomee to the Celsius to Fahrenheit");

        Scanner getUserInput = new Scanner(System.in);

        System.out.print("Enter the Degree Celsius: ");
        double celsius = getUserInput.nextDouble();

        double farhrenheit = (celsius*9/5) + 32;
        System.out.println("Degree Celsius °C to Fahrenheit is " + farhrenheit + "°F");



    }

}
