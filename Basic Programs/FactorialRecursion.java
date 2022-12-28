import java.util.Scanner;

public class FactorialRecursion{
    static int fact = 1;
    static int Factorial(int n){

        if (n>0) {

            fact = fact* n;
            Factorial(n-1);
        }
        return fact;
        
            

    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n==0) {
            System.out.println("The factorial of 0 is 1");
        } else{
            Factorial(n);
            System.out.print(fact + " ");
        }   
        scan.close();
    }
}