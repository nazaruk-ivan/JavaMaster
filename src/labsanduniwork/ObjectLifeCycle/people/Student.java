package labsanduniwork.ObjectLifeCycle.people;

public class Student extends Person {
    String studentID;
    double gradePercent;

    public Student(String name, int age, String studentID, double gradePercent){
        super(name, age);
        this.studentID = studentID;
        this.gradePercent = gradePercent;
    }

    public void setGrade(double newGrade){
        if (newGrade > 0 && newGrade < 100) {
            this.gradePercent = newGrade;
            System.out.println("New garade for " + this.getName() + " is: " + newGrade);
        } else {
            System.out.println("your grade have to be in between of 0 and 100");
        }
    }

    public double getGradePercent(){
        return gradePercent;
    }

    @Override
    public String Introduce(){
        return "Hello, My name is" + super.getName() + " and I'm " + super.getAge()+ "  years old." + " My grade is " + gradePercent;
    }
}
