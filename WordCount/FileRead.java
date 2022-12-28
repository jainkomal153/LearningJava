
import java.io.BufferedReader;
import java.io.File;
// import java.io.FileNotFoundException;
import java.io.FileReader;
// import java.io.IOException;

public class FileRead {

    public String readFile(String fileName) {

        File file = new File(fileName);

        try{

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder lines = new StringBuilder();
            while ((line = br.readLine()) != null) {

                lines.append(line);
                lines.append("\n");
            }

            lines.deleteCharAt(lines.length()-1);
            br.close();
            return lines.toString();
        
        } catch (Exception e) {
               throw new RuntimeException();
       } 
       
    }
}
