import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    
    public String readFile (String fileName){

        try{

            File file = new File(fileName);            
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder lines = new StringBuilder();
            String line;

            while((line = br.readLine()) != null){
                lines.append(line);
                lines.append("\n");
            }
            br.close();

            if(lines.isEmpty()){
                return lines.toString();
            }
            else{
                lines.deleteCharAt(lines.length()-1);
                return lines.toString();
            }
            
        
        
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
