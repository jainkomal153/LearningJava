import java.util.Scanner;

public class FibonacciSeries{

    public static void Fibonacci(int n){

        int a[] = new int [10];
        
        int i;

        a[0] = 0;
        a[1] = 1;
        System.out.print(a[0] + " " + a[1] + " ");
        for (i=2; i<=n; i++){

            a[i] = a[i-1] + a[i-2];   
            System.out.print(a[i] + " ");
        }

        

        // 1, 3,6, 10, 15
        // 0,1,1,2,3,5,8,13  
        // 0,1, 1 , 2

        

    }
    public static void main(String[] args) {
        
        // n= 6
        // Xn= 6th term + 5th term
        // X5 = 0+1+1+2+3

        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Fibonacci(n);
        scan.close();
    }
}