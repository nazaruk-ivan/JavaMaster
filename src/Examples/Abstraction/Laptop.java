package Examples.Abstraction;

public class Laptop extends Device {
    double screenSize;

    public Laptop(String brand, String model, double screenSize){
        super(brand, model);
        this.screenSize = screenSize;
    }

    @Override
    void turnOn(){
        System.out.println("Laptop is turning on...");
    }


}
