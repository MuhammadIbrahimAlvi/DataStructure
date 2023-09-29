package problemsolving;

import java.util.HashMap;
import java.util.Map;

/**
 * How do you find all pairs of an integer array whose sum is equal to a given number?
 * **/

public class SumOfPairs {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1,2,3,4,5,6};
        System.out.println(findPairs( 11, arrayOfNumbers));
    }

    public static Map<String, String> findPairs(int givenNumber, int[] arrayOfNumbers) {
        int counter = 0;
        Map<String, String> stringMap = new HashMap<>();

        while (counter < arrayOfNumbers.length) {
            for (int i = counter + 1; i < arrayOfNumbers.length; i++) {
                if (givenNumber == arrayOfNumbers[counter] + arrayOfNumbers[i]) {
                    String pairKey = "Pair On Index " + counter + " and " + i + " ";

                    // Check if the pair is not already present in the map
                    if (!stringMap.containsKey(pairKey)) {
                        stringMap.put(pairKey, arrayOfNumbers[counter] + "+" + arrayOfNumbers[i]);
                    }
                }
            }
            counter++;
        }
        return stringMap;
    }
}
