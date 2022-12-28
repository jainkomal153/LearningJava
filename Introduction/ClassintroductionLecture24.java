package Introduction;

//mport javax.sql.rowset.spi.SyncResolver;

public class ClassintroductionLecture24 {

    /*
    classes save the attributes/ state
      for example:

     public class car{
        private String manufacturer;
        private String colour;
        private int yearOfManufacture;
        private int numberOfDoors;
      
     }

    Classes are used to create objects.
    to access the private variables outside the class we use getters and setter and this keyword.
    This keyword points the main variable.
     // private variables are more secure as compare to public to verify the value.
*/

/*
     GETTERS, SETTERS AND THIS KEYWORD:

     syntax:

     public void setManufacturer(String manufacturer) {
       This.manufacturer = manufacturer;
     }

     // Setter sets the value of a private variable.

     public String getManufacturer(){
       return this.manufacturer;
     }

     //Getter returns the value of a private variable.
    
*/

/*
 Methods save the behaviour/ functionality/ that do something
    for example:

    public void increaseSpeed{
        System.out.println("Increase the speed");
    }
*/

/*
  Objects save the behaviour of the class
   for example:

   car bmw = new car();

   here, car is the class name.
         bmw is the object name.
         new is the keyword to create and initialize the oject.
         car() is again the class name.
*/


/*
    CONSTRUCTORS:
    Constructors are the methods that are automatically called whenever an object is created.
    Constructors have the same name as the class.


*/
}
