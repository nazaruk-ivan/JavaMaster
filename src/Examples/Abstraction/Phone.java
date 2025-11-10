package Examples.Abstraction;

public class Phone extends Device{
    Integer storage;

    public Phone(String brand, String model, Integer storage){
        super(brand, model);
        this.storage = storage;
    }

    @Override
    void turnOn(){
        System.out.println("turn on...");
    }

}
