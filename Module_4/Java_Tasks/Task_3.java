public class Task_3 {
    public static void main(String[] args) {
        // String and concatenation
        // First method
        byte age = 39;
        String FirstSentence = "I am ";
        String SecondSentence = " years old.";

        System.out.println(FirstSentence + age + SecondSentence);

        byte myAge = 26;
        String theFirstSentence = "My age is ";
        String theSecondSentence = " years old";
        String completeSentence = theFirstSentence + myAge + theSecondSentence;

        System.out.println(completeSentence);

        // String and primitive Concatenation.

        String myDaughterAge = "Daughter's Age: ";
        int number = 17;
        System.out.println(myDaughterAge + number);

        // .concat() method

        System.out.println(myDaughterAge.concat(number + ""));

    }
}

