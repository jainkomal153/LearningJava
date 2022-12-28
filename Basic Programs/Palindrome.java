import java.util.Scanner;

public class Palindrome{

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();       // Komal
       // System.out.println(num.length());   // 5
       scan.close();

        char[] reverse = num.toCharArray();
         //[] rev = new char[100];
        // char rev[];
        int i;
        String revString = "";

        for (i=reverse.length-1; i>=0; i--){
            revString = revString + (String.valueOf(reverse[i])); 
            //System.out.println(revString);
        }
        System.out.println("The reverse string is " + revString);
        if (revString.equals(num)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
         
        
        
    }
}