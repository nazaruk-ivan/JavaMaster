package Examples.Data_Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        //sets
        //Sets will be used in cases when I need to store only unique values, I don’t care about order.

        Set<String> friendNames = new HashSet<>();
        friendNames.add("Ivan");
        friendNames.add("Dima");
        friendNames.add("Kostya");
        friendNames.add("Ivan");

        System.out.println(friendNames.toString());

        if (friendNames.contains("Ivan")) {
            System.out.println("I'm in a list");
        }

        if (friendNames.contains("Kostya")){
            friendNames.remove("Kostya");
        }

        System.out.println(friendNames.toString());

        for (String name: friendNames){
            System.out.println(name);
        }

    }
}

