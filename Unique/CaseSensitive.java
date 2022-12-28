import java.text.Normalizer.Form;
import java.util.ArrayList;

public class CaseSensitive {
    private Reader reader;

    public CaseSensitive(){
        this.reader = new Reader();
    }

    private String[] lines(String fileContent){
        String[] lines = fileContent.split("\n");
        return lines;
    }

    public void Filter(UserRequest userRequest){
        String fileContent = reader.readFile(userRequest.inputFile);

        if (userRequest.options.isEmpty()){
            uniqueFilter(fileContent);
        }
        if (userRequest.options.contains("c")){
            count(fileContent, uniqueFilter(fileContent));
        }

        


    }

    public void uniqueFilter(String fileContent){

        ArrayList<String> uniqueLines = new ArrayList<>();
        uniqueLines.add(lines(fileContent)[0]);
        // ArrayList<String> TestniqueLines = new ArrayList<>();
        
        for(int i=0; i<lines(fileContent).length-1 ; i++){

            if(lines(fileContent)[i].equals(lines(fileContent)[i+1])){
                continue;
            }
            else{
                uniqueLines.add(lines(fileContent)[i+1]);
            }
        }
        for(int i=0; i<uniqueLines.size(); i++){
            System.out.println(uniqueLines.get(i));
        }
    }

    public void count(String fileContent, ArrayList<String> uniqueLines){

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

        for(int i=0; i<count.size(); i++){
            
        }
    }

}
