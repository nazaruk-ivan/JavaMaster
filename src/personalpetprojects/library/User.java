package personalpetprojects.library;

public class User {
    private String name;
    private int userID;
    private static int userCount = 0;

    public User(String name) {
        this.name = name;
        this.userID = ++userCount;
    }

    public String getInfo(){
        return "Name: " + name + " | UserID: " + userID;
    }

    public static int getUserCount(){
        return userCount;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}