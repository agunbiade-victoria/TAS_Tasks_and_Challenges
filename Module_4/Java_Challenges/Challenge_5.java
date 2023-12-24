import java.util.*;
public class Challenge_5 {
    public static void main(String[] args) {
        String[] words = {"akka", "akak", "baab", "baba", "bbaa"};
        Map<String, List<String>> anagramBuckets = createAnagramBuckets(words);

        // Print the anagram buckets
        for (List<String> bucket : anagramBuckets.values()) {
            System.out.println(bucket);
        }
    }

    private static Map<String, List<String>> createAnagramBuckets(String[] words) {
        Map<String, List<String>> anagramBuckets = new HashMap<>();

        for (String word : words) {
            // Sort the characters of the word to create a signature
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String signature = new String(charArray);

            // Add the word to the corresponding anagram bucket
            anagramBuckets.computeIfAbsent(signature, k -> new ArrayList<>()).add(word);
        }

        return anagramBuckets;
    }
}
