import java.io.IOException;
import java.util.Scanner;

public class FirstScreen {
    public static String firstScreen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
        System.out.println("3. EUR to Shekels");
        String inputUser = scan.next();
        while (IsValid.isValidInput(inputUser)==false) {
            System.out.println("Wrong input, please try again ");
            inputUser = scan.next();
        }
        return inputUser;
    }

}
