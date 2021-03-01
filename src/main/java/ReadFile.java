import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void readFile() {
        try {
            File resultFile = new File("C:\\Users\\Alex\\IdeaProjects\\CurrencyConverter\\src\\main\\java\\results.txt");
            Scanner myReader = new Scanner(resultFile);
            System.out.println("Your convert history ");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}