import java.util.ArrayList;

public class UserRequest {

    String inputFile;
    String outputFile;
    ArrayList<String> options;
    boolean uniqueLines;
    boolean count;
    boolean caseInsensitive;
    boolean repeatedLines;

    public UserRequest(
        String inputFile,
        String outputFile,
        ArrayList<String> options,
        boolean uniqueLines, 
        boolean count, 
        boolean caseInsensitive, 
        boolean repeatedLines){

            this.inputFile = inputFile;
            this.outputFile =outputFile;
            this.options = options;
            this.uniqueLines = uniqueLines;
            this.count = count;
            this.caseInsensitive = caseInsensitive;
            this.repeatedLines = repeatedLines;
    }

    // @Override
    // public String toString() {
    //     return "UserRequest [caseInsensitive=" + caseInsensitive + ", count=" + count + ", inputFile=" + inputFile
    //             + ", outputFile=" + outputFile + ", repeatedLines=" + repeatedLines + ", uniqueLines=" + uniqueLines
    //             + "]";
    // }

    


    
}
