package Introduction;

//import java.security.PublicKey;

public class AccessModifier {
    // There are 3 types of access modifiers:
    // Public: Can be accessible anywhere in the java world using the import package and class
    // private: Can be accessible within the same class only
    // Protected: Can be accessible in the child class (in the same package or different package) and within the same package.
    // ** No modifier: Can be accessible within the same package.

    // Package is used to store the related classes together.
    // Classes/files from a different package can be used in a different package by importing
    // the class or file in the new package.

    // for eg.
    // package P1 {
    //     Class C1
    //     Class C2
    // }

    //  Package P2{
    //  import P1.C1;
    // (syntax that is used to import the Class C1 from package P1 in package P2)

    // In order to import all classes from package P1 to package P2, use the below syntax:
    // import P1.*;
    // }

}
