package labsanduniwork.lab21Nov;


import labsanduniwork.lab21Nov.Exercise1.Circle;
import labsanduniwork.lab21Nov.Exercise2.Company;
import labsanduniwork.lab21Nov.Exercise2.Employee;
import labsanduniwork.lab21Nov.Exercise2.Job;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test started...");


        //usage of Circle.
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(8);

        System.out.println(Circle.getTotalSurface());
        System.out.println(Circle.getNumberOfCircles());

        //Usage of employee, company and job classes.
        Job backend_dev = new Job("junior Java Backend Developer", 1700);
        Job managerJob = new Job("manager", 3000);
        Company myCompany = new Company("My Company");
        Employee employee = new Employee("Ivan", backend_dev, myCompany);

        System.out.println(myCompany.getName());
        for (Employee e : myCompany.getListOfEmployees()) {
            if (e != null) {
                System.out.println(e.getName());
            }
        }

    }

}
