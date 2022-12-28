package Introduction;

public class GetterAndSetterObject {

    public static void main(String[] args) {

        GetterAndSetter bmw = new GetterAndSetter();

        bmw.setManufacturer("BMW");
        System.out.println("Manufacturer of BMW: " + bmw.getManufacturer());

        bmw.setColour("Black");
        System.out.println("Color of BMW: " + bmw.getColour());

        bmw.setYearOfManufacture(2012);
        System.out.println("Year of the Manufacture of BMW: " + bmw.getYearOfManufacture());
        
        bmw.setNumberOfDoors(4);
        System.out.println("Number of Doors of BMW: " + bmw.getNumberOfDoors());  
        
        System.out.println(" ");

        bmw.setYearOfManufacture(2018);
        System.out.println("Year of the Manufacture of BMW: " + bmw.getYearOfManufacture());
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("*********************************");
        System.out.println(" ");

        GetterAndSetter Audi = new GetterAndSetter();

        Audi.setManufacturer("Audi");
        System.out.println("Manufacturer of Audi: " + Audi.getManufacturer());

        Audi.setColour("White");
        System.out.println("Color of Audi: " + Audi.getColour());

        Audi.setYearOfManufacture(2020);
        System.out.println("Year of the Manufacture of Audi: " + Audi.getYearOfManufacture());

        Audi.setNumberOfDoors(2);
        System.out.println("Number of Doors of Audi: " + Audi.getNumberOfDoors());  
        

        // Constructor Objects

        System.out.println(" ");
        System.out.println("*********************************");
        System.out.println(" ");

        GetterAndSetter c1 = new GetterAndSetter(); // OBJECT FOR THE CONSTRUCTOR WITHOUT ARGUMENT


       // System.out.println("THE CONSTRUCTOR WITHOUT ARGUMENTS:");
        System.out.println("Speed: " + c1.speed);
        System.out.println("Gear: " + c1.gear);

        System.out.println(" ");
        System.out.println("*********************************");
        System.out.println(" ");

        GetterAndSetter c2 = new GetterAndSetter(10, 1); // OBJECT FOR THE CONSTRUCTOR WITH ARGUMENT
        System.out.println(" ");
       // System.out.println("THE CONSTRUCTOR WITHOUT ARGUMENTS:");
        System.out.println("Speed: " + c2.speed);
        System.out.println("Gear: " + c2.gear);


    }

    



}
