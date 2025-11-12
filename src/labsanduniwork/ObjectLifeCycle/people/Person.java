package labsanduniwork.ObjectLifeCycle.people;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String newName){
        this.name = newName;
        System.out.println("The name of person was changed to: " + newName);
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int newAge){
        this.age = newAge;
        System.out.println("The age was changed to: " + newAge);
    }

    public int getAge(){
        return age;
    }

    public String Introduce(){
        return "Hello, My name is" + name + " and I'm " + age+ "  years old";
    }
}
