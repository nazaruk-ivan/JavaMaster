package Examples.Records;

public class VehicleExample {
    public static void main(String[] args) {
        //java record
        // should be used for a class contains just data (like a holder of variables).
        //no need to change it later
        String brand = "Mini cooper";
        String plates = "NA 1234 ZAR UK";

        Vehicle1 vehicle1 = new Vehicle1(brand, plates);

        System.out.println(vehicle1.brand());
        System.out.println(vehicle1.licensePlate());

        Vehicle1 vehicle2 = new Vehicle1("BMW", "1234 UK BMW");
        System.out.println(vehicle2.brand().equals(vehicle1.brand()));

    }
}