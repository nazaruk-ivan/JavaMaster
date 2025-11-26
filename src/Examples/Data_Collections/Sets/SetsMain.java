package Examples.Data_Collections.Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class SetsMain {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        //task 1
        Set<String> names = new HashSet<>();


        while (names.size() <= 3) {
            System.out.println("Please enter name you want to add to set: ");
            names.add(scanner.nextLine());
        }

        // task 2

        String[] items = {"apple", "orange", "banana", "apple", "kiwi", "banana"};

        Set<String> setOfItems = new HashSet<>();
        for (int x = 0; x<items.length; x++){
            setOfItems.add(items[x]);
        }

        System.out.println("The unique values of items are following:");
        System.out.println(setOfItems.toString());

        //task 3
        Set<String> footballFans =  Set.of("Ivan", "Dima", "Kostya", "Tom", "John");
        Set<String> basketballFans = Set.of("Dima", "Kostya");

        Set<String> onlyFootballFans = new HashSet<>(footballFans);
        onlyFootballFans.retainAll(basketballFans);
        System.out.println("Only football fans: " + onlyFootballFans.toString());

        Set<String> onlyBasketballFans = new HashSet<>(footballFans);
        onlyBasketballFans.retainAll(footballFans);
        System.out.println("Only basketball fans: " + onlyFootballFans.toString());

        Set<String> fansOfBoth = new HashSet<>(footballFans);
        fansOfBoth.addAll(basketballFans);
        System.out.println("Fans of both sports: " +  fansOfBoth);

        //task 4
        String textToCheck = "You are stupid and dumb and stupid again";
        Set<String> banned = Set.of("stupid", "dumb");

        String[] words = textToCheck.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (banned.contains(word.toLowerCase())) {
                result.append("*** ");
            } else {
                result.append(word).append(" ");
            }
        }

        System.out.println(result.toString().trim());







    }
}
