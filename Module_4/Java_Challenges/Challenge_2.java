public class Challenge_2 {
        public static void main(String[] args) {
            String input = "I am the best Automation Tester";
            String reversed = reverseWords(input);
            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reversed);
        }

        private static String reverseWords(String input) {
            if (input == null || input.isEmpty()) {
                return input;
            }

            int lastIndex = input.lastIndexOf(' ');
            if (lastIndex == -1) {
                return input;
            }

            String lastWord = input.substring(lastIndex + 1);
            String remaining = input.substring(0, lastIndex);

            return lastWord + " " + reverseWords(remaining);
        }
    }

