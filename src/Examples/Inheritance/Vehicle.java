package Examples.Inheritance;

public class Vehicle {
    String model;
    Integer year;

    public Vehicle(String model, Integer year){
        this.model = model;
        this.year = year;
    }


    public void move(){
        System.out.println("the vehicle is moving");
    }

    public void displayInfo(){
        System.out.println("Model: " + model + " | Year: " + year);
    }
}
