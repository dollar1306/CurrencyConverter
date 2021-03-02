import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondScreen {
    public static double secondScreen(){
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter amount for convert");
            return scan.nextDouble();
        }catch (InputMismatchException in){
            System.out.println("Your input amount not numbers, please try again");
            return SecondScreen.secondScreen();
        }
    }
}
