package Introduction;

import java.util.Scanner;

public class ReverseStringByAlphabets {
    
    public static void reverseString(String str){

        char[] reverse = str.toCharArray();

        for(int i= reverse.length -1; i >= 0; i--){

            System.out.print(reverse[i]);
        }

    }
    public static void main(String[] args) {
       // String str = "This is a string";

       Scanner scan = new Scanner(System.in);
       System.out.println("Please type a String: ");
       String str = scan.nextLine(); 
       scan.close();
    
        if (str.isEmpty() || str == null){

            System.out.println("Empty String");
        }
        else{
            reverseString(str);
        }
        

    }

}
