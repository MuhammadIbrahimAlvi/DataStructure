package problemsolving;

/**
 * How do you check if a given string is a palindrome?
 * **/

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam"));
    }

    private static boolean isPalindrome(String word){
        String temporaryWord = "";
        for (int i = word.length()-1; i>=0 ; i--){
            temporaryWord += word.charAt(i);
        }
        if(temporaryWord.equalsIgnoreCase(word)){
            return true;
        }
        return false;
    }
}
