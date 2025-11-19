package labsanduniwork.lab21Nov.Exercise1;

public class Circle {
    int radius;
    static final double PI = 3.14;
    private static int numberOfCircles = 0;
    private static double totalSurface = 0;

    public Circle(int radius){
        this.radius = radius;
        numberOfCircles++;
        totalSurface += findSurface();
    }

    public Circle(){
        this.radius = 1;
        numberOfCircles++;
        totalSurface += findSurface();
    }

    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int newRadius){
        if (newRadius>0) {
            this.radius = newRadius;
            System.out.println("Radius was changed to: " + newRadius);
        } else {
            System.out.println("Radius can't be negative.");
        }
    }

    private double findSurface(){
        if (radius>0){
            return PI * Math.pow(radius, 2);
        }else {
            return 0;
        }
    }

    public static int getNumberOfCircles() {
        return numberOfCircles;
    }

    public static double getTotalSurface(){
        return totalSurface;
    }
}
