package Introduction;

public class ReverseString {

    public static void main(String[] args) {
        String str = "This is a string"; 
        System.out.println("The original string is: ");

        System.out.println(str);
       // System.out.println(str.length());
        //System.out.println(str.);

        String[] stringArray = str.split(" ");
        // Also can use, String[] stringArray = str.split("\\s");
        // "\\s" is used for space
        // "\\s+" is used if there might be more spaces than 1 space in between.
        // for eg. "This     is a string."

        // for (String a: stringArray){
        //     System.out.println(a);
        // }
        
        if (str.isEmpty() || str == null){

            System.out.println("Empty String");
        }
        else{

            //System.out.println(stringArray.length);

            System.out.println("The reverse string is: ");
            for(int i = stringArray.length-1; i >= 0;  i--){

           
            System.out.print(stringArray[i]);
            System.out.print(" ");

            }
        }

    }
    
}
