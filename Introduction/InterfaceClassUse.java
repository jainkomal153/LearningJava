package Introduction;

public class InterfaceClassUse implements Interface, Interface2 {

    @Override
    public void subtract(int num1, int num2) {
        int sub = num1-num2;
        System.out.println("The subtraction of "+ num1 + " and "+ num2 +" is "+ sub);
        
    }

    @Override
    public void add(int num1, int num2) {
        int add = num1 + num2;
        System.out.println("The addition of "+ num1 + " and "+ num2 +" is "+ add);
        
    }
    
}
