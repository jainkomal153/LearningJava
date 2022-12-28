package Introduction;

public class InheritanceParentClass {
    // parent class inherits their variables and methods to the child class.
    // Child class can access any method or variable from the parent class using only 2 keywords.
    // 1. extends
    // 2. super

    // This is the Parent Class.

    int num1;
    int num2;

    public void addition(int num1, int num2){
        int add;
        add = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + add);
    }


}
