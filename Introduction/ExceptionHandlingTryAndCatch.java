package Introduction;

import java.sql.SQLException;

public class ExceptionHandlingTryAndCatch {

    public static void main(String[] args) {
        ExceptionHandling obj1 = new ExceptionHandling();
        try {
            System.out.println("This is the 1st line");
            obj1.withdraw(100);  //throws an exception
            System.out.println("This is the 2nd line");
        } 
        catch (SQLException e) {
           // e.printStackTrace(); // displays the full info of the error.
           System.out.println(e.getMessage()); // displays the exception without much details.
           System.out.println("404 error");  // displays the error message without providing the error info to the user.
        }

        System.out.println("*************************************************");
        System.out.println("Runtime exception example");
        System.out.println(" ");
        
        int[] num = {1,2,3};

        try{
            for( int i=0; i<=3; i++){
                System.out.println(num[i]);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        

    }
    
}
