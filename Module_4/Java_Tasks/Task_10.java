// Create a method that verify that visitors on the Slack channel are
// coming for testify Trainings. If they write "Testify" then print out a
// welcome message if not , the user should be shown rejection message.
// After creating this method,then invoke the created method in your main method.

import java.util.Scanner;

public class Task_10 {
    public static void visitorOnSlackChannel(String visitorInput) {
        if (visitorInput.equalsIgnoreCase("Testify")) {
            System.out.println("Welcome to Testify Academy");
        } else {
            System.out.println("You don't have access to this channel");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the code to verify you");
        String visitorInput = scanner.nextLine();
        visitorOnSlackChannel(visitorInput);
    }

}



