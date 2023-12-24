package Task_13;
public class Class_A {
    String name;
    int price;
    boolean isAvailable;

    public Class_A(String brand) {
        name = brand;
    }
    public Class_A(String brand, int Amount) {
        price = Amount;
    }
    public Class_A(String brand, int Amount, boolean PhoneisAvailable) {
        isAvailable = PhoneisAvailable;
    }
    public void printPhone(){
        System.out.println();
    }
}

