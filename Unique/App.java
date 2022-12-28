public class App {
    
    // uniq filters the unique lines. If there are repeated ones it will delimite them and keep only 1.
    // uniq command will filter out all the repeated lines.
    // -u = only unique lines
    // -c = display the count of every duplicated line 
    // -i = case insensitive
    // -d = display the repeated lines


    // either uniq or -i
    // either -u or -d
    // -c with everything
    //uniq =  -u/-d , -c
    //-i =  -u/-d , -c
    

    public static void main(String[] args) {
        UserRequestParser userRequestParser = new UserRequestParser();
        UserRequest userRequest = userRequestParser.parse(args);
        UniqueLinesFilter uniqueLinesFilter = new UniqueLinesFilter();
        uniqueLinesFilter.filter(userRequest);
    }
}
