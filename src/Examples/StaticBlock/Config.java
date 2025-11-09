package Examples.StaticBlock;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Config {
    private String model;
    static DayOfWeek day = LocalDate.now().getDayOfWeek();

    static {

        if(day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY){
            System.out.println("Development");
        } else {
            System.out.println("Development");
        }
    }

    public Config(String model){
        this.model = model;
    }

}
