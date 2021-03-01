import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToResult {

//    static void writeToLog(double input,double value ) throws IOException {
//        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Alex" +
//                "\\IdeaProjects\\CurrencyConverter\\src\\main\\java\\results.txt"));
//        writer.write(input+" = "+ value+"\n");
//        writer.close();
//    }

    public static void writeToLog(ArrayList<Result> convertList) throws IOException {
         BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Alex\\IdeaProjects\\CurrencyConverter\\src\\main\\java\\results.txt",true));
         for(Result i :convertList) {
             try {
                 //writer.write(String.valueOf(convertList)+"\n");
                 writer.write((i.getValue() + " , " + i.getConvertType())+"\n");
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         writer.close();
//        try {
//            File resultFile = new File("C:\\Users\\Alex\\IdeaProjects\\CurrencyConverter\\src\\main\\java\\results.txt");
//            Scanner myReader = new Scanner(resultFile);
//            System.out.println("Your convert history ");
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        }catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
       //ReadFile.readFile(str);
    }
}
