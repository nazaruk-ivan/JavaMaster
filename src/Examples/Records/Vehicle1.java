package Examples.Records;

public record Vehicle1(String brand, String licensePlate){

    public Vehicle1(String brand){
        this(brand, null);
    }

    public String brandToLowerCase(){
        return brand().toLowerCase();
    }
}
