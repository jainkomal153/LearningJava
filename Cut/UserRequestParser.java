import java.util.ArrayList;

public class UserRequestParser{

    public UserRequest parse (String[] args) {

        ArrayList<Integer> fields = new ArrayList<>();
        String delimiter = null;
        String fileName = null;

        for (String arg : args){

            if (arg.startsWith("-d")){
                delimiter = arg.substring(2);
            }
            else if (arg.startsWith("-f")){

                String field = arg.substring(2);

                if(field.contains(",")){

                    String[] index =field.split(",");

                    for (int i=0; i< index.length; i++ ){
                        fields.add(Integer.parseInt(index[i])-1);
                    }   
                }
                else if (field.contains("-")){
                    for(int i=Character.getNumericValue(arg.charAt(2)); i<= Character.getNumericValue(arg.charAt(4)); i++){
                        fields.add(i);                 
                    }
                }
                else {
                    fields.add(Integer.parseInt(field));
                }

            }
            else{
                fileName = arg;
            }
        }

        return new UserRequest(fileName, delimiter, fields);
    }

}