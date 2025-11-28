package Examples.Data_Collections.Maps;


import java.util.*;

public class MapsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task 1
        Map<String, Integer> studentsAges = new HashMap<>();

        studentsAges.put("Ivan", 19);
        studentsAges.put("Denis", 18);
        studentsAges.put("Rayn", 18);

        System.out.println(studentsAges.get("Ivan"));

        studentsAges.remove("Rayn");
        System.out.println("Rayn was removed from map.");

        System.out.println("Size of the map students ages is: " + studentsAges.size());

        //task 2
        Map<String, Integer> playersScores = new HashMap<>();

        playersScores.put("Michel", 7);
        playersScores.put("Tom", 4);
        playersScores.put("Jefry", 9);

        System.out.println("Next game michel did very well and get +2 points");
        playersScores.put("Michel", 9);

        for (Map.Entry<String, Integer> entry: playersScores.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //task 3
        Map<String, Integer> count = new HashMap<>();

        String[] words = {"cat", "dog", "cat", "bird", "cat", "dog"};

        for (String word: words){
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        System.out.println(count.toString());

        //task 4
        Map<String, String> loginSystem =  new HashMap<>();

        loginSystem.put("ivan12321", "login123");

        System.out.println("Please enter username to check is it exists: ");
        if (loginSystem.containsKey(scanner.nextLine())){
            System.out.println("Yes it's exists");
        } else{
            System.out.println("This username doesn't exist");
        }

        //task 5
        Map<String, Integer> productStock = new HashMap<>();
        productStock.putIfAbsent("iphone", 3);
        productStock.putIfAbsent("iphone", 4);

        System.out.println(productStock.toString());

    }
}


