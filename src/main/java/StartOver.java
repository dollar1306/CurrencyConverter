import java.util.Scanner;

public class StartOver {

    static boolean startOver() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to start yet?");
        System.out.println("Y for yes");
        System.out.println("N for no");
        String choice = scan.next();
         if (choice.equalsIgnoreCase("y")) {
             return true;
         } else if(choice.equalsIgnoreCase("n")) {
             return false;
         }else
         {
             System.out.println("Wrong input try again");
             return startOver();
         }

    }
}
