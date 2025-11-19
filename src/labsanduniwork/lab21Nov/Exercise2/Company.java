package labsanduniwork.lab21Nov.Exercise2;

public class Company {
    private String name;
    private static int numberOfEmployees = 0;
    private Employee[] listOfEmployees;

    public Company(String name){
        this.name = name;
        this.listOfEmployees = new Employee[10];
    }

    public void addEmployee(Employee employeeToAdd){
        for (int i = 0; i < listOfEmployees.length; i++){
            if (listOfEmployees[i] == null){
                listOfEmployees[i] = employeeToAdd;
                numberOfEmployees++;
                System.out.println(employeeToAdd.getName() + " was added to company: " + name);
                return;
            }
        }
        System.out.println("No space left to add more employees.");
    }

    public Employee[] getListOfEmployees(){
        return listOfEmployees;
    }

    public static int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public void setName(String newName){
        this.name =  newName;
        System.out.println("New name was added.");
    }

    public String getName(){
        return this.name;
    }
}