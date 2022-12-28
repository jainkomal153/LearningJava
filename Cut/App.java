public class App{

    public static void main(String[] args) {
        
        FileCutter fileCutter = new FileCutter();
        UserRequestParser userRequestParser = new UserRequestParser();
        UserRequest userRequest = userRequestParser.parse(args);
        fileCutter.cut(userRequest);

    }   
}