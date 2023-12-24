package Task_14;

public class Class_B {
    public static void main(String[] args) {
        Class_A square = new Class_A();
        square.setLength(12);
        int squareLength = square.getLength();
        System.out.println("Length of square: " + squareLength + "cm");

        square.setBreadth(12);
        int squareBreadth = square.getBreadth();
        System.out.println("Breadth of square: " + squareBreadth + "cm");

        int areaOfSquare = squareLength * squareBreadth;
        System.out.println("The area of a square of length " +squareLength +"cm and breadth " + squareBreadth +"cm" + " is: " + areaOfSquare + "cm2");

    }
}
