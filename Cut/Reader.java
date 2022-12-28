import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Reader{

    public String readFile(String fileName){

        try {
            
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder lines = new StringBuilder();
            String line;
            
            while((line = br.readLine())!= null){
                
                lines.append(line);
                lines.append("\n");

            }

            lines.deleteCharAt(lines.length()-1);
            br.close();
            return lines.toString();

        } catch (Exception e) {

            throw new RuntimeException(e);
            
        }
       
        

    }
}