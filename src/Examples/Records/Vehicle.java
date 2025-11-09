package Examples.Records;

public class Vehicle {
    private String brand;
    private String licensePlate;

    public Vehicle(String brand, String licensePlate){
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    public String getBrand(){
        return brand;
    }

    public String getVehicle(){
        return licensePlate;
    }

    public String toString(){
        return "Vehicle brand is:" + brand + ", license Plate is: " + licensePlate;
    }
}
