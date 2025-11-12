package labsanduniwork.ObjectLifeCycle.people;

public class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    @Override
    public String Introduce(){
        return "Hello, I'm proffesor and my name is: " + this.getName() + " and i teach: "+ subject;
    }
}
