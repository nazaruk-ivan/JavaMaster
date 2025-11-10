package Examples.Inheritance;

public class Car extends Vehicle {
    int seats;

    public Car(String model, int year, int seats) {
        super(model, year);
        this.seats = seats;
    }

    @Override
    public void move() {
        System.out.println("The car is driving on the road");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seats);
    }
}