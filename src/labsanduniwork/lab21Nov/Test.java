package labsanduniwork.lab21Nov;


import labsanduniwork.lab21Nov.Exercise1.Circle;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test started...");


        //usage of Circle.
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(8);

        System.out.println(Circle.getTotalSurface());
        System.out.println(Circle.getNumberOfCircles());


    }

}
