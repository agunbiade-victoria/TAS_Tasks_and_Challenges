public class Task_5 {
    public static void main(String[] args) {
        int numberOfCars = 450;

        if (numberOfCars % 3 != 0) {
            System.out.println("not divisible");
        } else {
            System.out.println("Fizz");
        }

        if (numberOfCars % 5 != 0) {
            System.out.println("not divisible");
        } else {
            System.out.println("Buzz");
        }

        if (numberOfCars % 3 == 0 && numberOfCars % 5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println("the number cannot be divisible by both numbers");
        }

    }
}
