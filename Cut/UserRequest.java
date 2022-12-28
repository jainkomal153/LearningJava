import java.util.ArrayList;

public class UserRequest{

    String fileName;
    String delimiter;
    ArrayList<Integer> fields;
    
    public UserRequest(String fileName, String delimiter, ArrayList<Integer> fields){
        
        this.fileName = fileName;
        this.delimiter = delimiter;
        this.fields = fields;

    }
    
}
