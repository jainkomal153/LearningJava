import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public String readFile() throws IOException {
        String filePath="";
        BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
        String line;
        StringBuffer file = new StringBuffer();
        while((line = reader.readLine()) !=null){
            file.append(line + "\n");
        }
        file.deleteCharAt(file.length()-1);
        reader.close();
        return file.toString();
    }
}
