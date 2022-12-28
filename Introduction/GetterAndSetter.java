package Introduction;

public class GetterAndSetter {

    //OBJECT CREATED IN NEW FILE: GetterAndSetterObject
    
    // This is all about the car
    
    private String manufacturer;
    private String colour;
    private int yearOfManufacture;
    private int numberOfDoors;

    int speed;
    int gear;


    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public void setYearOfManufacture(int yearOfManufacture) {
       if(yearOfManufacture >= 2015){
        this.yearOfManufacture = yearOfManufacture;
       } 
       else{ 
           System.out.println("This is an invalid year");
       }
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    

    // CONSTRUCTOR WITHOUT ARGUMENTS

    public GetterAndSetter(){
        this(20,2); // CALLING CONSTRUCTOR WITH ARGUMENTS in without argument constructor
        this.speed = 0;
        this.gear = 0;
        System.out.println("Constructor Calling without arguments");
    }

   // CONSTRUCTOR WITH ARGUMENTS

   public GetterAndSetter(int speed, int gear){
     
     this.speed = speed;
     this.gear = gear;
     System.out.println("Constructor Calling with arguments");
   }

}


    