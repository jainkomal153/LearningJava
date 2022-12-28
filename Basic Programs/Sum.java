
import java.util.Scanner;

public class Sum{

    public static void main(String[] args) throws Exception{
        int a,b, sum;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a = scan.nextInt();
        b = scan.nextInt();
        
        sum= a+b;
        System.out.println(sum);

        scan.close();
    }

}