package Introduction;

public class InheritanceChildClass extends InheritanceParentClass {

     // This is the Child Class.


    @Override
    public void addition(int num1, int num2) {
        super.addition(num1, num2);
    }

    // in the above code, we used the addition method from the parent class directly instead of coding it again.


    public void subtraction(int num1, int num2) {
        int subtract;
        subtract = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + subtract);
    }


}


