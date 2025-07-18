import java.util.Scanner;

public class GetUserName {

    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Enter your UserName: ");
        String userName = inputUser.nextLine();
        System.out.println("Your UserName is " + userName);
    }

}
