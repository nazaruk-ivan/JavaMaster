package Examples.Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        //inheritance
        Car mini_cooper = new Car("countryman", 2015, 4);
        Car mitsubishi = new Car("mitsubishin", 2020, 5);

        Bike focus = new Bike("focus", 2012, true);
        Bike idk = new Bike("idk", 2025, false);

        mitsubishi.move();
        mitsubishi.displayInfo();

        idk.displayInfo();
        idk.move();


    }

}