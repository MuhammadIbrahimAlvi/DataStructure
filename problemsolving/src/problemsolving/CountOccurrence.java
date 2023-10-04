package problemsolving;

/**
 * How do you count the occurrence of a given character in a string?
 **/

public class CountOccurrence {
    public static void main(String[] args) {
        System.out.println(countOccurrences("Madam", 'm'));
    }

    private static int countOccurrences(String word, char character) {
        int numberOfOccurrences = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(character) == Character.toLowerCase(word.charAt(i))) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }
}
