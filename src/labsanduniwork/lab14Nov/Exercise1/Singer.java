package labsanduniwork.lab14Nov.Exercise1;

public class Singer {
    private String name;
    private int age;
    private Boolean professional=true;

    public Singer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Boolean isProfessional(){
        return this.professional;
    }

    public void setAge(int newAge){
        if (newAge >= age){
            this.age = newAge;
            System.out.println("Age was changed.");
        } else {
            System.out.println("New age can't be lower than initial");
        }
    }

    public void reverseProfessional(){
        if (this.professional == true){
            this.professional = false;
            System.out.println("Professional boolean expression was changed to false");
        } else {
            this.professional = true;
            System.out.println("Professional boolean expression was changed to true");
        }
    }


}
