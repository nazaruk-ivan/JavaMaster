package Examples.Data_Collections.Queue;


import java.util.*;

public class MainQueue {
    public static void main(String[] args) {
        //types of queues

        // LinkedList — normal queue, keeps elements in the order they were added
        Queue<String> queue1 = new LinkedList<>();

        // ArrayDeque — fastest queue for normal FIFO operations
        Queue<String> queue2 = new ArrayDeque<>();

        // PriorityQueue — queue with priority, removes the element with the highest priority
        Queue<String> queue3 = new PriorityQueue<>();

        //TASKS
        //#1
        Queue<String> namesQueue = new ArrayDeque<>();
        namesQueue.add("Ivan");
        namesQueue.add("Denis");
        namesQueue.add("Katerina");

        namesQueue.remove();

        System.out.println(namesQueue.toString());

        //#2
        Queue<String> shopQueue = new LinkedList<>();
        shopQueue.add("Alex");
        shopQueue.add("Mia");
        shopQueue.add("Sara");
        shopQueue.add("John");

        String customerServedFirst = shopQueue.poll();
        String customerServedSecond = shopQueue.poll();

        LinkedList<String> customersServed = new LinkedList<>();
        customersServed.add(customerServedFirst);
        customersServed.add(customerServedSecond);

        System.out.println("Customers served: " + customersServed.toString());

        System.out.println("Customers left: " + shopQueue.toString());

        //#3
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Login");
        tasks.add("Load Dashboard");
        tasks.add("Send Email");
        tasks.add("Logout");

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll() + " was done!");
        }
        System.out.println("All tasks are done!");


        //#4 private hospital system
        Queue<String> patients = new LinkedList<>();
        Queue<String> VIP_patients = new LinkedList<>();

        patients.add("Max");
        patients.add("Nika");
        patients.add("Ivan");

        VIP_patients.add("Oleh");
        VIP_patients.add("Kerry");

        while (!VIP_patients.isEmpty()){
            System.out.println(VIP_patients.poll() + " served");
        }

        while (!patients.isEmpty()){
            System.out.println(patients.poll() + " served");
        }

    }
}
