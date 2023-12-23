import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome dear user, please input your principal, rate and time");
        float p, r, t, si;
        System.out.println("Enter the Principal : ");
        p = userInput.nextFloat();
        System.out.println("Enter the Rate in % : ");
        r = userInput.nextFloat();
        System.out.println("Enter the Time : ");
        t = userInput.nextFloat();
        userInput.close();

        si = (p * r * t) / 100;

        System.out.println("Simple Interest is: #" + si);



    }
}
