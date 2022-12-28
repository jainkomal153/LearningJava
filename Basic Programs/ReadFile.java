import java.io.BufferedReader;
import java.io.FileReader;


public class ReadFile{
    public static void main(String[] args) throws Exception {

        String line;
        String[] lineArray;
        int linecount = 0; // line count
        int character = 0;
        int count =0;
        
        BufferedReader fr = new BufferedReader(new FileReader("Spanish.txt"));
        String[] word;
        

        
        while ((line = fr.readLine()) != null){

            // System.out.println(line);
            character = character + line.length();
            word = line.split(" ");
            count = count + word.length;
            lineArray = line.split("\n");
            linecount = linecount + lineArray.length;
        }
        System.out.println("Word Count = " + count);
        System.out.println("Character Count = " + character);
        System.out.println("Line Count = " + linecount);

        fr.close();
       
    }
}