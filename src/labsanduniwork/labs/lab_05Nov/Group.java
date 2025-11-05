package labsanduniwork.labs.lab_05Nov;

public class Group {

    private Student student1;
    private Student student2;

    public Group(Student student1, Student student2){
        this.student1 = student1;
        this.student2 = student2;
    }

    public Student getFirstStudent(){
        return student1;
    }

    public Student getSecondStudent(){
        return student2;
    }
}