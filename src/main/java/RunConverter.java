import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class RunConverter {

    private static boolean isValidInput(String choice) {
        return (choice.equals("1") || choice.equals("2") || choice.equals("3"));
    }

    private static String firstScreen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
        System.out.println("3. EUR to Shekels");
        String inputUser = scan.next();
        while (isValidInput(inputUser)) {
            System.out.println("Wrong input, please try again ");
            inputUser = scan.next();
        }
        return inputUser;
    }

    public static double secondScreen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount for convert");
        return scan.nextDouble();
    }


    private static boolean startOver() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to start yet?");
        System.out.println("Y for yes");
        System.out.println("N for no");
        String choice = scan.next();
        return choice.equalsIgnoreCase("y");
    }


    public static void main(String[] args){
        double input, value;
        String choice;
        ArrayList<Result> convertList = new ArrayList<>();
        System.out.println("Welcome to currency converter");
        do {
            choice = firstScreen();
            if (choice.equals("1")) {
                input = secondScreen();
                Coin usd = CoinFactory.getCoinInstance(Coins.USD);
                value = usd.calculate(input);
                System.out.println(input + " dollars equals to " + value + " shekel");
                convertList.add(new Result(value, choice));
            } else if (choice.equals("2")) {
                //shekels to dollars
                input = secondScreen();
                Coin ils = CoinFactory.getCoinInstance(Coins.ILS);
                value = ils.calculate(input);
                System.out.println(input + " shekels equals to " + value + " dollars");
                convertList.add(new Result(value, choice));
            } else if (choice.equals("3")) {
                //euro to shekels
                input = secondScreen();
                Coin eur = CoinFactory.getCoinInstance(Coins.EUR);
                value = eur.calculate(input);
                System.out.println(input + " euros equals to " + value + " shekels");
                convertList.add(new Result(value, choice));

            }
        } while (startOver());

        File resultFile = new File("C:\\Users\\Alex\\" +
                "Documents\\GitHub\\CurrencyConverter\\src\\" +
                "main\\java\\results.txt");
        System.out.println("Your convert history ");
        for (Result i : convertList) {
            System.out.println(i.getValue() + " " + i.getConvertType());
            try {
                //char[] resultsFile = new char[0];
                Files.write(Paths.get(String.valueOf(resultFile)), (i.getValue() + " , " +
                        i.getConvertType() + "\n")
                        .getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
