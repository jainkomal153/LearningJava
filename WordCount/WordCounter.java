
public class WordCounter {

    private final FileRead reader;

    public WordCounter(){
        this.reader = new FileRead();
    }

    public void invoke (UserRequest userRequest){

        String fileContent = this.reader.readFile(userRequest.fileName);

        if (userRequest.lineCounterRequired) {
            System.out.println("Total lines = " + lineCounter(fileContent));
        }
        if (userRequest.wordCounterRequired) {
            System.out.println("Total words = " + wordCounter(fileContent));
        }
        if (userRequest.charCounterRequired) {
            System.out.println("Total characters = " + charCounter(fileContent));
        }
    
    }

    private int lineCounter(String fileContent){
        return fileContent.split("\n").length;
    }
    private int wordCounter(String fileContent){
        int count=0;

        for (String line : fileContent.split("\n")){
            count = count + line.split(" ").length;
        }
        return count;
        
    }
    private int charCounter(String fileContent){
        return fileContent.length();
    }
    
    public static void main(String[] args) {
        
        WordCounter wordCounter = new WordCounter();
        UserRequestParser userRequestParser = new UserRequestParser();
        UserRequest userRequest = userRequestParser.parse(args);
        wordCounter.invoke(userRequest);

    }
}
