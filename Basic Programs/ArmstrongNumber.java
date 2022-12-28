import java.util.Scanner;

public class ArmstrongNumber{

    public static void main(String[] args) {
        
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int res = 0;

        // 125 = (1)3 + (2)3 + (5)3
        String temp = Integer.toString(m);
        int n[] = new int[temp.length()];
        for (int i= 0; i<=temp.length()-1; i++ ){
            n[i] = Integer.parseInt(String.valueOf(temp.charAt(i))) ; 
        }
        for(int i=0; i<n.length; i++){
            res = res + (int) Math.pow(n[i], n.length);
        }

        System.out.println(res);
        if(m == res){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("not an Armstrong Number");
        }
        
        scan.close();

    }
}