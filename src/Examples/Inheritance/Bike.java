package Examples.Inheritance;

public class Bike extends Vehicle {
    Boolean hasEngine;

    public Bike(String model, int year, Boolean hasEngine){
        super(model, year);
        this.hasEngine = hasEngine;
    }

    @Override
    public void move(){
        if (hasEngine){
            System.out.println("The bike is riding using engine");
        } else {
            System.out.println("The bike is pedaled");
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("hasEngine? " + hasEngine);
    }
}
