package Introduction;

public class InheritanceMain {
    
    public static void main(String[] args) {
        
    InheritanceParentClass P1 = new InheritanceParentClass();
        P1.addition(50, 30);

    InheritanceChildClass C1 = new InheritanceChildClass();
        C1.addition(50, 30);
        C1.addition(100, 50);
        C1.subtraction(100, 50);
        C1.subtraction(20, 30);

    }
}
