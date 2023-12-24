import java.util.Scanner;
public class Task_18 {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner((System.in));
            System.out.println("How old are you?");
            int dob = userInput.nextInt();
        } catch (Exception exceptionOfAge){
            System.out.println("This field accepts numbers only");
            System.out.println(exceptionOfAge);
        }
    }
}

//Write a code that asks the user for age and that accepts the Integer value.
// Handle the error that is encountered when the users try to enter a name instead of age