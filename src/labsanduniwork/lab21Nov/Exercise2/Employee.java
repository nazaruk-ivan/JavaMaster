package labsanduniwork.lab21Nov.Exercise2;

public class Employee {
    String name;
    Job job;
    Company company;

    public Employee(String name, Job job, Company company){
        this.name = name;
        this.job = job;
        this.company = company;
        company.addEmployee(this);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
        System.out.println("Name was updated");
    }
}
