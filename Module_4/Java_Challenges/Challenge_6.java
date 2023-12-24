import java.util.*;
public class Challenge_6 {
    public static void main(String[] args) {
        String inputString = "Despite commuting at the peek hour, she was able to keep to time";
        List<List<String>> anagramGroups = findAnagrams(inputString);

        // Print the anagram groups
        for (List<String> group : anagramGroups) {
            System.out.println(group);
        }
    }

    private static List<List<String>> findAnagrams(String input) {
        List<List<String>> anagramGroups = new ArrayList<>();
        String[] words = input.split("\\s+");

        Map<String, List<String>> anagramBuckets = new HashMap<>();

        for (String word : words) {
            // Normalize the word (remove non-alphabetic characters and convert to lowercase)
            String normalizedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Sort the characters of the normalized word to create a signature
            char[] charArray = normalizedWord.toCharArray();
            Arrays.sort(charArray);
            String signature = new String(charArray);

            // Add the word to the corresponding anagram bucket
            anagramBuckets.computeIfAbsent(signature, k -> new ArrayList<>()).add(word);
        }

        // Add non-empty anagram buckets to the result list
        for (List<String> bucket : anagramBuckets.values()) {
            if (bucket.size() > 1) {
                anagramGroups.add(bucket);
            }
        }

        return anagramGroups;
    }
}
