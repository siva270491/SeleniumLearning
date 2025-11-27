package home_assignments;

public class RemoveDupWords {

    public static void main(String[] args) {
        String sentence = "We learn Java basics as part of java sessions in java week1";
        String uniqueSentence = removeDuplicateWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Sentence without duplicates: " + uniqueSentence);
    }

    public static String removeDuplicateWords(String text) {
        // Split the sentence into an array of words using space as a delimiter.
        String[] words = text.split("\\s+");
 
        // An array to keep track of unique words, initialized to null or a placeholder.
        String[] uniqueWords = new String[words.length];
        int uniqueCount = 0;

        // Outer loop iterates through each word in the original array
        for (int i = 0; i < words.length; i++) {
            // Flag to check if the current word is a duplicate
            boolean isDuplicate = false;

            // Inner loop iterates through the uniqueWords array to check for existing entries
            for (int j = 0; j < uniqueCount; j++) {
                // Use equalsIgnoreCase() for case-insensitive comparison
                if (words[i].equals(uniqueWords[j])) {
                    isDuplicate = true;
                    uniqueWords[j] = " "; 
                    break; // Exit inner loop once a duplicate is found
                }
            }

//             If the word is not a duplicate, add it to the uniqueWords array
            if (!isDuplicate) {
                uniqueWords[uniqueCount++] = words[i];
            }
        }

        // Reconstruct the sentence from the unique words
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < uniqueCount; i++) {
            result.append(uniqueWords[i]).append(" ");
        }

        // Trim any trailing space
        return result.toString().trim();
    }
}
