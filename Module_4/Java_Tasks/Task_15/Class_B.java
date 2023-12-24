package Task_15;

public class Class_B extends Class_A{

    public static void main(String[] args) {
        Class_A class_A = new Class_A();
        class_A.theHusband();
        class_A.theWife();
        class_A.theChildren();

        Class_B class_B = new Class_B();
        class_B.firstChild();
        class_B.secondChild();

    }

    public void firstChild() {
        System.out.println("Steve Oluwadarasimi");
    }

    public void secondChild() {
        System.out.println("Stephanie Oluwadamifunre");
    }
}