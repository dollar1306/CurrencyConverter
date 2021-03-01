import java.io.IOException;
import java.util.ArrayList;


public class RunConverter {


    public static void main(String[] args) throws IOException {
        double input, value;
        String choice;
        ArrayList<Result> convertList = new ArrayList<>();
        System.out.println("Welcome to currency converter");
        do {
            choice=FirstScreen.firstScreen();
            //1-dollars to shekels
            //2-shekels to dollars
            //3-euro to shekels
            switch (choice) {
                case ("1") -> {
                    input = SecondScreen.secondScreen();
                    Coin usd = CoinFactory.getCoinInstance(Coins.USD);
                    assert usd != null;
                    value = usd.calculate(input);
                    System.out.println(input + " dollars equals to " + value + " shekel");
                    convertList.add(new Result(input,choice));
                }
                case ("2") -> {
                    input = SecondScreen.secondScreen();
                    Coin ils = CoinFactory.getCoinInstance(Coins.ILS);
                    assert ils != null;
                    value = ils.calculate(input);
                    System.out.println(input + " shekels equals to " + value + " dollars");
                    //WriteToResult.writeToLog(input + " shekels equals to " + value + " dollars");
                    convertList.add(new Result(input,choice));
                }
                case ("3") -> {
                    input = SecondScreen.secondScreen();
                    Coin eur = CoinFactory.getCoinInstance(Coins.EUR);
                    assert eur != null;
                    value = eur.calculate(input);
                    System.out.println(input + " euros equals to " + value + " shekels");
                    //WriteToResult.writeToLog(input + " euros equals to " + value + " shekels");
                    convertList.add(new Result(input,choice));
                }
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }

        } while (StartOver.startOver());
        WriteToResult.writeToLog(convertList);
        ReadFile.readFile();
    }
}
