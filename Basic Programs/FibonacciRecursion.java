import java.util.Scanner;

public class FibonacciRecursion{
    static int  a0 = 0, a1 = 1, a2;
    static void Fibonacci(int n){

        if (n>0) {

            a2 = a0 + a1;
            //a[n] = a[n-1] + a[n-2];
            a0 = a1;
            a1 = a2;
            System.out.print(a2 + " ");
            Fibonacci(n - 1);
        }


        //0 1 1 2 3
        

    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print(a0 + " " + a1 + " ");
        Fibonacci(n-2);
        scan.close();
    }
}