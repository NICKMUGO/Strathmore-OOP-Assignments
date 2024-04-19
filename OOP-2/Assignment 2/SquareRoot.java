import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class SquareRoot {
    public static void main(String[] args) {
        String filename = "numbers.txt";

        try{
            //creates a filereader object that reads from numbers.txt
            FileReader filereader =new FileReader(filename);
            
            BufferedReader bufferedreader= new BufferedReader(filereader);

            String line = bufferedreader.readLine();
            if (line == null){
                System.out.println("File is empty");
            }

            double number = Math.sqrt(Double.parseDouble(line));

            bufferedreader.close();

            System.out.println("The square root is " + number);
        }
        catch(NumberFormatException e){
            System.err.println("Error reading file " + e.getMessage());
        }
        catch(FileNotFoundException e){
            System.err.println("Error reading file " + e.getMessage());
        }
        catch(IOException e){
            System.err.println("Error reading file " + e.getMessage());
        }
        // catch(){

        // }
        finally{
            System.out.println("If you have a square root thats great if not please check numbers.txt for invalid input");
        }
    }
}