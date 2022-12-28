
public class UserRequest {

    String fileName;
    boolean lineCounterRequired;
    boolean wordCounterRequired;
    boolean charCounterRequired;
    
    public UserRequest(String fileName, boolean lineCounterRequired, boolean wordCounterRequired, boolean charCounterRequired){

        this.fileName = fileName;
        this.lineCounterRequired = lineCounterRequired;
        this.charCounterRequired = charCounterRequired;
        this.wordCounterRequired = wordCounterRequired;
    }

    @Override
    public String toString() {
        return "UserRequest [charCounterRequired=" + charCounterRequired + ", fileName=" + fileName
                + ", lineCounterRequired=" + lineCounterRequired + ", wordCounterRequired=" + wordCounterRequired + "]";
    }
    
}
