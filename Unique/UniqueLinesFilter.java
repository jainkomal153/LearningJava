import java.util.ArrayList;

public class UniqueLinesFilter {

    private Reader reader;

    public UniqueLinesFilter(){
        this.reader = new Reader();
    }

    private String[] lines (String fileContent){
        String[] lines = fileContent.split("\n");
        return lines;        
    }
    
    public void filter(UserRequest userRequest){

        
        
        if(userRequest.caseInsensitive){
            CaseInsensitive;
        } 
        
        else{
            CaseSensitive;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        String fileContent = reader.readFile(userRequest.inputFile);
        ArrayList<String> uniqueLines = 

        uniqueFilter(fileContent);





        


        

        // count(fileContent, uniqueFilter(fileContent) + " " +

        if(userRequest.options.isEmpty()){

            for(int i=0; i<=uniqueFilter(fileContent).size()-1; i++){
                System.out.println(uniqueFilter(fileContent).get(i));
            }            
        }

        // if(userRequest.options.contains("c")){

        //     for(int i = 0; i<= )
        // }

        System.out.println(count(fileContent, caseInsensitiveFilter( fileContent)));

        if(userRequest.caseInsensitive){

            for(int i=0; i<caseInsensitiveFilter(fileContent).size(); i++){
                System.out.println(count(fileContent, caseInsensitiveFilter( fileContent)).get(i) + " " + caseInsensitiveFilter(fileContent).get(i));
            }
        }
        //     caseInsensitiveFilter(fileContent);

        //     // for(int i=0; i<caseInsensitiveFilter(fileContent).size(); i++){
        //     //     System.out.println(caseInsensitiveFilter(fileContent).get(i));
    }
        // }
        // if(userRequest.count){
        //     count(fileContent);
        // }
        // if(userRequest.uniqueLines){
        //     lineFilter(fileContent);
        // }
        // if(userRequest.repeatedLines){
        //     // onlyRepeatedLines(fileContent);
        // }
        


      


    private ArrayList<String> uniqueFilter(String fileContent){

        ArrayList<String> uniqueLines = new ArrayList<>();
        uniqueLines.add(lines(fileContent)[0]);
        
        for(int i=0; i<lines(fileContent).length-1 ; i++){

            if(lines(fileContent)[i].equals(lines(fileContent)[i+1])){
                continue;
            }
            else{
                uniqueLines.add(lines(fileContent)[i+1]);
            }
        }


        return uniqueLines;
    }

    private ArrayList<String> caseInsensitiveFilter(String fileContent){
        ArrayList<String> uniqueLines = new ArrayList<>();
        uniqueLines.add(lines(fileContent)[0]);

        for(int i=0; i<lines(fileContent).length-1 ; i++){

            if(lines(fileContent)[i].equalsIgnoreCase(lines(fileContent)[i+1])){
                continue;
            }
            else{
                uniqueLines.add(lines(fileContent)[i+1]);
            }
        }

        return uniqueLines;
        
    }

    // private void lineFilter(String fileContent){

    //     ArrayList<String> uniqueLines = new ArrayList<>();
    //     // ArrayList<String> repeatedLines = new ArrayList<>();

    //     for(int i=0; i<lines(fileContent).length-1 ; i++){

    //         if(lines(fileContent)[i].equals(lines(fileContent)[i+1])){
    //             continue;
    //         }
    //         else{
    //             uniqueLines.add(lines(fileContent)[i+1]);
    //         }
    //     }

    //     for(int i=0; i<uniqueLines.size(); i++){
    //         System.out.println(uniqueLines.get(i));
    //     }
    // }

    private ArrayList<Integer> count(String fileContent, ArrayList<String> uniqueLines){
        int linecounter =0;
        int index = 0;
        ArrayList<Integer> count = new ArrayList<>();

        for(int i=0; i<uniqueLines.size(); i++){

            for (int j=index; j<lines(fileContent).length; j++){

                if(uniqueLines.get(i).equals(lines(fileContent)[j])){
                    linecounter++;
                    index++;
                    continue;
                }
                else{
                    count.add(linecounter);
                    linecounter =0;
                    break;
                }
            }
        }
        count.add(linecounter);
        return count;
    }

}
