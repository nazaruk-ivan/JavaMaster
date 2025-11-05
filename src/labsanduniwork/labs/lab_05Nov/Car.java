package labsanduniwork.labs.lab_05Nov;

public class Car {
    String type;
    int speed;
    double miles;

    public Car(String type, int speed, double miles){
        this.type = type;
        this.speed = speed;
        this.miles = miles;
    }

    public void updateSpeed(int newSpeed){
        this.speed = newSpeed;
        System.out.println("speed was updated to: " + newSpeed);
    }
}

