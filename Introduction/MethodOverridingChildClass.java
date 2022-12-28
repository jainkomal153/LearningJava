package Introduction;

public class MethodOverridingChildClass extends MethodOverridingParentClass {
    
    public static void main(String[] args) {
        MethodOverridingParentClass obj1 = new MethodOverridingChildClass();
        obj1.add(10, 20);
        obj1.subtraction(10, 20);
        
    }

    @Override
    public void subtraction (int num1, int num2){
        int sub = num2 - num1;
        System.out.println("This is the Child Class Subtraction");
        System.out.println(num2 + " - " + num1 + " = " + sub);
    }
}
