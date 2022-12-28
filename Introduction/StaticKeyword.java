package Introduction;

public class StaticKeyword {

    // Static variables doesn't change with the object. 
    // for eg.: if we are creating multiple objects for a single class then, the static variable will not change with the new object creation.
    // Those variables we don't want to change are kept static.
    // Multiple objects created for the static variable share only 1 copy that saves memory.

    /***
     * For eg.:
     * 
     * public class StaticKeyword{
     * private static num = 0;
     * }
     * 
     * public static void main(String[], args){
     * 
     * StaticKeyword object1 = new StaticKeyword();}
     *      // here num = 0;
     * 
     * StaticKeyword object2 = new StaticKeyword();}
     *     // here num = 0;
     * 
     * 
     * */ 
    
    // Static methods cannot access non-static variables or methods
    // This and super keyword cannot be used in static methods.
    

    private int make;
    private  int instance = 0;
    private static int instanceStatic = 0;

    public StaticKeyword(int make){
        this.make = make;
        instance++;
        
    }

    public static int staticMethod(){
        return instanceStatic++;
    }

    
    public int getInstance() {
        return instance;
    }

    public int getMake() {
        return make;
    }



    public static void main(String[] args) {

        // Instance without being static ie. this instance belongs to object not class.
        System.out.println("********************************");
        System.out.println("Instance without being static ie. this instance belongs to object not class.");
        System.out.println("********************************");

        StaticKeyword object1 = new StaticKeyword(10);
        System.out.println("Make of the car is: " + object1.getMake()); 
        System.out.println("Instance of the method: " + object1.getInstance()); 
        

        StaticKeyword object2 = new StaticKeyword(20);
        System.out.println("Make of the car is: " + object2.getMake()); 
        System.out.println("Instance of the method: " + object2.getInstance()); 


        // Static Instance ie. this instance belongs to class not object.
        System.out.println("********************************");       
        System.out.println("Static Instance ie. this instance belongs to class not object.");
        System.out.println("********************************");
        
        System.out.println("Static Instance of the method: " + staticMethod());
        System.out.println("Static Instance of the method: " + staticMethod());
        System.out.println("Static Instance of the method: " + staticMethod()); 
    }

    
}
