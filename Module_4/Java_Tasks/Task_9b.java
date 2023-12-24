// Write a logic that takes in input from the user.
// It keeps printing "try again "until the user enters "testify"

import java.util.Scanner;

public class Task_9b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equalsIgnoreCase("testify")) {
            System.out.println("Try again, type \"testify\" to exit this loop");
            userInput = scanner.nextLine();
        }
    }
}
