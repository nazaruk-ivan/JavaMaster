package Examples.Abstraction;

abstract class Device {
    String brand;
    String model;


    public Device(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    abstract void turnOn();

    public String showInfo(){
        return "Brand: " + brand + " | Model: " + model;
    }
}
