
import java.util.ArrayList;

public class UserRequestParser {

    public UserRequest parse (String[] args){

        ArrayList<String> options = new ArrayList<>();
        // ArrayList<String> fName = new ArrayList<>();
        String fileName = null;

        for (String arg: args) {

            if (arg.startsWith("-")){
                options.add(arg.substring(1));
            }

            else {
                fileName = arg;
            }
        }

        boolean lineCounterRequired = options.contains("l");
        boolean wordCounterRequired = options.contains("w");
        boolean charCounterRequired = options.contains("m");

        return new UserRequest(fileName, lineCounterRequired, wordCounterRequired, charCounterRequired);
    }

}
