public class Task_6 {
    public static void main(String[] args) {

        String givenWord = "DEMOCRACY";
        // System.out.println(givenWord.toLowerCase());

        // To reverse
        StringBuffer newWord = new StringBuffer(givenWord);
        newWord.reverse();
        System.out.println(newWord);

        // Print out the word COME from DEMOCRACY
        System.out.println(newWord.substring(4,8));

    }
}

