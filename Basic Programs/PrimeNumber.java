import java.util.Scanner;

public class PrimeNumber{
    static int result;
    static int isPrime(int num){

        
        for (int i=2; i<=num-1; i++){
            result = num % i;
            if (result == 0){
                System.out.println("Not a Prime Number");
                break;
            }
            
        } return result;

    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num == 0|| num==1){
            System.out.println("Not a prime number");
        } 
        else if (num == 2){
            System.out.println("Prime number");
        }
        else{
            isPrime(num);
            if (result > 0){
                System.out.println("Prime number");
            }
        }
        scan.close();
    }
}