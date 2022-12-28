     import java.util.Scanner;

     public class Factorial{

         public static void factorial(int num) {
        
            int fact =1;

            for (int i=num; i>= 1; i-- ){
                 fact = fact*i;
                 
             }
        System.out.println(fact);
                    

         }
         public static void main(String[] args) {
            
            System.out.println("Enter a number");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            System.out.println("The factorial of " + num + " is ");
            factorial(num);
            scan.close();
        }
    }
  