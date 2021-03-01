import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToResult {
    public static void writeToLog(ArrayList<Result> convertList) throws IOException {
         BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Alex\\IdeaProjects\\CurrencyConverter\\src\\main\\java\\results.txt",true));
         for(Result i :convertList) {
             try {
                 writer.write((i.getValue() + " , " + i.getConvertType())+"\n");
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
                 System.out.println("An error occurred.");
             }
         }
         writer.close();
    }
}
