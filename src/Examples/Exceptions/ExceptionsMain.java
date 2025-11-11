package Examples.Exceptions;

import java.util.Scanner;

public class ExceptionsMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //exception handling
        //Task 1

        System.out.println("Please enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Please enter number 2: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println(result);
        }
        catch ( ArithmeticException e){
            System.out.println("Can't divide by 0!");
        }
        finally {
            System.out.println("task 1 DONE!");
        }

        //Task 2
        System.out.println("Enter any number from 1 to 100: ");
        try {
            int number = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("You have to enter a number from 1 to 100 ");
            //if i want to allow user to enter number extra time I can do while loop
        }

        //Task 3
        int[] arr = {1,2,3,4,5};

        System.out.print("Please enter place(1-5) inside of array which number you want to take: ");
        int choice = scanner.nextInt();

        try {
            System.out.println(arr[choice]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Choose from 1 to 5 please!");
        }

        // Task 4
        try {
            checkAge(21);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("You have to be 18+");
        }
        System.out.println("Allowed!");
    }
}