public class FileCutter {

    private Reader reader;

    public FileCutter(){
        this.reader = new Reader();
    }

    private String[] lines (String fileContent){

        String[] lines = fileContent.split("\n");
        return lines;

    }


    public void cut(UserRequest userRequest){

        String fileContent = this.reader.readFile(userRequest.fileName);
        String[] lines = lines(fileContent);
        
        for(String line: lines){

            String[] fields = line.split(userRequest.delimiter);

           for (int field: userRequest.fields){
            System.out.print(fields[field] + " ");
           }
           System.out.println("");
        }
    }

   
}