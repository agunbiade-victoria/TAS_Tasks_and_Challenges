package Task_12;


import Task_12.Class_A;
public class Class_B {
    public static void main(String[] args) {
        Class_B task = new Class_B();
        task.class_B();
    }
    private void class_B() {
        System.out.println("Class B");
        Class_B task = new Class_B();
        task.class_B();
    }
}
