package Introduction;

public class MethodOverridingParentClass {
    
    public void subtraction (int num1, int num2){
        int sub = num1 - num2;
        System.out.println("This is the Parent Class Subtraction");
        System.out.println(num1 + " - " + num2 + " = " + sub);
    }

    public void add (int num1, int num2){
        int add = num1 + num2;
        System.out.println("This is the Parent Class Addition");
        System.out.println(num1 + " + " + num2 + " = " + add);
    }
}
