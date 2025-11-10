package Examples.Abstraction;

public class AbstractMain {
    public static void main(String[] args) {
        //Abstract

        Laptop macbook = new Laptop("M2 2022", "air", 1080);
        Phone galaxy = new Phone("galaxy", "s22", 256);


        macbook.turnOn();
        macbook.showInfo();

        galaxy.turnOn();
        galaxy.showInfo();

    }

}