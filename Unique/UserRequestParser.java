import java.util.ArrayList;

public class UserRequestParser {

    public UserRequest parse(String[] args){

        ArrayList<String> fileName = new ArrayList<>(2);
        String inputFile;
        String outputFile;
        ArrayList<String> options = new ArrayList<>();

        for(String arg : args){

            if (arg.startsWith("-")){

                options.add(arg.substring(1));
            }
            else {
                fileName.add(arg);
            }
        }

        inputFile = fileName.get(0);

        try{
            outputFile = fileName.get(1);
        }
        catch (IndexOutOfBoundsException e){
            outputFile = null;
        }

        boolean uniqueLines = options.contains("u");
        boolean count = options.contains("c");
        boolean caseInsensitive = options.contains("i");
        boolean repeatedLines = options.contains("d");
        

        return new UserRequest(inputFile, outputFile, options, uniqueLines, count, caseInsensitive, repeatedLines);

    }
    
    
}
