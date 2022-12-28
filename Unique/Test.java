import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        String line = "My My name name is is Komal Komal Jain Jain";
        String[] word = line.split(" ");
        // String[] array = {"1","1","1","1","1","2","2","2","2","2"};
        ArrayList<String> newArray = new ArrayList<>();
        newArray.add(word[0]);

        for(int i=0; i<word.length-1; i++){

            if(word[i].equals(word[i+1])){
                continue;
            }
            else{
                newArray.add(word[i+1]);
            }

                
        }
        System.out.println(newArray);
    }  
}
    

