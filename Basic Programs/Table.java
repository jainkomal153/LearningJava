import java.util.Scanner;

public class Table{

    public static void main(String[] args) {
        
        System.out.println("Enter the number of which you want to print the table");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i= 1; i<=10; i++ ){

            System.out.println(number + " x "+ i + " = "+ number*i);

        }
        scan.close();
        


    }
}