package hackerrank;
/**
 There is a string of lowercase English letters, denoted by a mathematical symbol, specifically a script "a."
 This string is repeated infinitely many times.
 An integer, denoted by a mathematical symbol that resembles the letter "n," is given.
 The task is to find and print the number of letter 'a's in the first n letters of the infinite string.
 The example provided illustrates the process:
 The infinite string is represented by a specific mathematical symbol.
 The task is to find the number of letter 'a's in the first set of n letters.
 The given example shows the substring where the count of 'a's is requested.
 It uses another mathematical symbol for representation.
 **/
public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("abc", 7L));
    }
    public static long repeatedString(String s, long n) {
        String updatedString = concatenateString(s, n);
        long numberOfOccurrences = 0;
        for(int i = 0; i<updatedString.length(); i++) {
            if (updatedString.charAt(i) == 'a') {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }

    public static String concatenateString(String word, long numberOfTimes) {

        if(word.length() == numberOfTimes){
            return word;
        }

        long counter = numberOfTimes - word.length();

        for(int i = 0; i < counter ; i++){
            word += word.charAt(i);
        }

            return word;
    }

//optimised code from chatgpt
//    public static long repeatedString(String s, long n) {
//        long fullRepetitions = n / s.length();
//        long remainingChars = n % s.length();
//
//        long occurrencesInOriginal = countOccurrences(s, 'a');
//        long occurrencesInRemaining = countOccurrences(s.substring(0, (int) remainingChars), 'a');
//
//        return fullRepetitions * occurrencesInOriginal + occurrencesInRemaining;
//    }
//
//    private static long countOccurrences(String s, char target) {
//        long count = 0;
//        for (char c : s.toCharArray()) {
//            if (c == target) {
//                count++;
//            }
//        }
//        return count;
//    }

}
